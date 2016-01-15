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
 * @note �������ݿ�Ĺ�����
 */
public class dbUtil {
	/**
	 * �õ����ݿ�����
	 */
	public static Connection getConnection(){
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.0.6:3306/billmanage";
		String username = "root";
		String password = "123456";
		Connection con = null;
		//�õ����ݿ�����
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
	 * �ͷ�ռ�õ���Դ
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
	 * ���ݴ������ռλ��SQL���õ����ֵ</br>
	 * ����:SELECT ID,USERNAME FROM USER;</br>
	 * ���:[{id=1, username=test1}, {id=2, username=test2}, {id=3, username=test3}]
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
				int column_count = rsmd.getColumnCount();//�õ��еĸ���
				Map<String,Object> map = new HashMap<String,Object>();
				for(int i = 1 ; i <= column_count ; i++){
					String column_name = rsmd.getColumnName(i);//�е�����
					String column_value = rs.getString(i);//�е�ֵ
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
	 * ���ݴ����SQL���õ����ֵ</br>
	 * ����:SELECT ID,USERNAME FROM USER;</br>
	 * ���:[{id=1, username=test1}, {id=2, username=test2}, {id=3, username=test3}]
	 * @param sql
	 * @param params ����ռλ���еĲ���
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
				int column_count = rsmd.getColumnCount();//�õ��еĸ���
				Map<String,Object> map = new HashMap<String,Object>();
				for(int i = 1 ; i <= column_count ; i++){
					String column_name = rsmd.getColumnName(i);//�е�����
					String column_value = rs.getString(i);//�е�ֵ
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
	//��������
	public static int insert(String sql,List<String> params){
		int result = 0;
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//��������
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			for(int i = 0 ;i < params.size() ;i++){
				ps.setObject(i+1,params.get(i));
			}
			result = ps.executeUpdate();
			//�ύ����
			con.commit();
		} catch (SQLException e) {
			try {
                //.��catch������ӻع����񣬱�ʾ���������쳣����������
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
                e.printStackTrace();
        }finally{
            try {
               //���������ύ��ʽΪ�Զ��ύ��
               con.setAutoCommit(true);
            } catch (SQLException e) {
               e.printStackTrace();
            }
            close(con,ps,rs);
        }
		return result;
	}
	//�޸�
	public static int update(String sql,List<String> params){
		int result = 0;
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//��������
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			for(int i = 0 ;i < params.size() ;i++){
				ps.setObject(i+1,params.get(i));
			}
			result = ps.executeUpdate();
			//�ύ����
			con.commit();
		} catch (SQLException e) {
			try {
                //.��catch������ӻع����񣬱�ʾ���������쳣����������
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
                e.printStackTrace();
        }finally{
            try {
               //���������ύ��ʽΪ�Զ��ύ��
               con.setAutoCommit(true);
            } catch (SQLException e) {
               e.printStackTrace();
            }
            close(con,ps,rs);
        }
		return result;
	}
	//ɾ��
	public static int delete(String sql,List<String> params){
		int result = 0;
		
		Connection con = getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			//��������
			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			for(int i = 0 ;i < params.size() ;i++){
				ps.setObject(i+1,params.get(i));
			}
			result = ps.executeUpdate();
			//�ύ����
			con.commit();
		} catch (SQLException e) {
			try {
                //.��catch������ӻع����񣬱�ʾ���������쳣����������
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
                e.printStackTrace();
        }finally{
            try {
               //���������ύ��ʽΪ�Զ��ύ��
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
			//��������
			con.setAutoCommit(false);
			sta = con.createStatement();
			result = sta.executeUpdate(sql);
			//�ύ����
			con.commit();
		} catch (SQLException e) {
			try {
                //.��catch������ӻع����񣬱�ʾ���������쳣����������
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
                e.printStackTrace();
        }finally{
            try {
               //���������ύ��ʽΪ�Զ��ύ��
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
			//��������
			con.setAutoCommit(false);
			sta = con.createStatement();
			for(int i = 0;i<sql.length;i++){
				sta.addBatch(sql[i]);
			}
			sta.executeBatch();
			//�ύ����
			con.commit();
			result = true;
		} catch (SQLException e) {
			try {
                //.��catch������ӻع����񣬱�ʾ���������쳣����������
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
                e.printStackTrace();
        }finally{
            try {
               //���������ύ��ʽΪ�Զ��ύ��
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
