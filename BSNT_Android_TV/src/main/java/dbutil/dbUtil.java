package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * @author pc
 * @note 连接数据库的工具类
 */
public class dbUtil {
	/**
	 * 得到数据库连接
	 */
	public static Connection getConnection(){
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.0.6:3306/billmanage";
		String username = "root";
		String password = "123456";
		Connection con = null;
		//得到数据库连接
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	/**
	 * 释放占用的资源
	 * @param con
	 * @param state
	 * @param rs
	 */
	public static void close(Connection con,Statement state,ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(state!=null){
					try {
						state.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}finally{
						if(con!=null){
							try {
								con.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}
	/**
	 * 根据传入的无占位符SQL，得到结果值</br>
	 * 例如:SELECT ID,USERNAME FROM USER;</br>
	 * 结果:[{id=1, username=test1}, {id=2, username=test2}, {id=3, username=test3}]
	 * @param sql
	 * @return
	 */
	public static List<Map<String,Object>> query(String sql){
		List<Map<String,Object>> list_rtn = new ArrayList<Map<String,Object>>();
		
		Connection con = getConnection();
		Statement sta = null;
		ResultSet rs = null;
		try {
			sta = con.createStatement();
			rs = sta.executeQuery(sql);
			while(rs.next()){
				ResultSetMetaData rsmd = rs.getMetaData();
				int column_count = rsmd.getColumnCount();//得到列的个数
				Map<String,Object> map = new HashMap<String,Object>();
				for(int i = 1 ; i <= column_count ; i++){
					String column_name = rsmd.getColumnName(i);//列的名称
					String column_value = rs.getString(i);//列的值
					map.put(column_name, column_value);
				}
				list_rtn.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(con,sta,rs);
		return list_rtn;
	}
	/**
	 * 根据传入的SQL，得到结果值</br>
	 * 例如:SELECT ID,USERNAME FROM USER;</br>
	 * 结果:[{id=1, username=test1}, {id=2, username=test2}, {id=3, username=test3}]
	 * @param sql
	 * @param params 放在占位符中的参数
	 * @return
	 */
	public static List<Map<String,Object>> query(String sql,List<String> params){
		List<Map<String,Object>> list_rtn = new ArrayList<Map<String,Object>>();
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			for(int i = 0 ; i < params.size();i++){
				ps.setString(i+1, params.get(i));
			}
			rs = ps.executeQuery();
			while(rs.next()){
				ResultSetMetaData rsmd = rs.getMetaData();
				int column_count = rsmd.getColumnCount();//得到列的个数
				Map<String,Object> map = new HashMap<String,Object>();
				for(int i = 1 ; i <= column_count ; i++){
					String column_name = rsmd.getColumnName(i);//列的名称
					String column_value = rs.getString(i);//列的值
					map.put(column_name, column_value);
				}
				list_rtn.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(con,ps,rs);
		return list_rtn;
	}
	//插入数据
	public static int insert(String sql,List<String> params){
		int result = 0;
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//开启事务
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			for(int i = 0 ;i < params.size() ;i++){
				ps.setObject(i+1,params.get(i));
			}
			result = ps.executeUpdate();
			//提交事务
			con.commit();
		} catch (SQLException e) {
			try {
                //.在catch块内添加回滚事务，表示操作出现异常，撤销事务：
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
                e.printStackTrace();
        }finally{
            try {
               //设置事务提交方式为自动提交：
               con.setAutoCommit(true);
            } catch (SQLException e) {
               e.printStackTrace();
            }
            close(con,ps,rs);
        }
		return result;
	}
	//修改
	public static int update(String sql,List<String> params){
		int result = 0;
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//开启事务
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			for(int i = 0 ;i < params.size() ;i++){
				ps.setObject(i+1,params.get(i));
			}
			result = ps.executeUpdate();
			//提交事务
			con.commit();
		} catch (SQLException e) {
			try {
                //.在catch块内添加回滚事务，表示操作出现异常，撤销事务：
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
                e.printStackTrace();
        }finally{
            try {
               //设置事务提交方式为自动提交：
               con.setAutoCommit(true);
            } catch (SQLException e) {
               e.printStackTrace();
            }
            close(con,ps,rs);
        }
		return result;
	}
	//删除
	public static int delete(String sql,List<String> params){
		int result = 0;
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//开启事务
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			for(int i = 0 ;i < params.size() ;i++){
				ps.setObject(i+1,params.get(i));
			}
			result = ps.executeUpdate();
			//提交事务
			con.commit();
		} catch (SQLException e) {
			try {
                //.在catch块内添加回滚事务，表示操作出现异常，撤销事务：
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
                e.printStackTrace();
        }finally{
            try {
               //设置事务提交方式为自动提交：
               con.setAutoCommit(true);
            } catch (SQLException e) {
               e.printStackTrace();
            }
            close(con,ps,rs);
        }
		return result;
	}
	public static int delete(String sql){
		int result = 0;
		
		Connection con = getConnection();
		Statement sta = null;
		ResultSet rs = null;
		try {
			//开启事务
			con.setAutoCommit(false);
			sta = con.createStatement();
			result = sta.executeUpdate(sql);
			//提交事务
			con.commit();
		} catch (SQLException e) {
			try {
                //.在catch块内添加回滚事务，表示操作出现异常，撤销事务：
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
                e.printStackTrace();
        }finally{
            try {
               //设置事务提交方式为自动提交：
               con.setAutoCommit(true);
            } catch (SQLException e) {
               e.printStackTrace();
            }
            close(con,sta,rs);
        }
		return result;
	}
	public static boolean execBatch(String[] sql){
		boolean result = false;
		
		Connection con = getConnection();
		Statement sta = null;
		ResultSet rs = null;
		try {
			//开启事务
			con.setAutoCommit(false);
			sta = con.createStatement();
			for(int i = 0;i<sql.length;i++){
				sta.addBatch(sql[i]);
			}
			sta.executeBatch();
			//提交事务
			con.commit();
			result = true;
		} catch (SQLException e) {
			try {
                //.在catch块内添加回滚事务，表示操作出现异常，撤销事务：
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
                e.printStackTrace();
        }finally{
            try {
               //设置事务提交方式为自动提交：
               con.setAutoCommit(true);
            } catch (SQLException e) {
               e.printStackTrace();
            }
            close(con,sta,rs);
        }
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
