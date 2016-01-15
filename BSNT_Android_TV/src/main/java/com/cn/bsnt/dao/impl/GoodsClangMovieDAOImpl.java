package com.cn.bsnt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.Dynamic.Parameter;

import com.cn.bsnt.dao.BaseDAO;
import com.cn.bsnt.dbhelper.ConnectionManager;
import com.cn.bsnt.model.GoodsClangMovie;
import com.cn.bsnt.model.User;

public class GoodsClangMovieDAOImpl implements BaseDAO<GoodsClangMovie>{
	private Connection  conn = null;
	private PreparedStatement para=null;
	private ResultSet rs = null;
	private String sql;
	private List<GoodsClangMovie> goodsClangMovieList= new ArrayList<GoodsClangMovie>();
	public int insert(GoodsClangMovie t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsClangMovie t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public User select(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> selectList(Parameter p) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
//    public List<GoodsClangMovie> selectAll() throws SQLException{
//		sql="select * from goods_clang_movie";
//		conn=ConnectionManager.getConnection();
//		para=conn.prepareStatement(sql);
//		rs=para.executeQuery();
//		GoodsClangMovie gcm=null;
//		while(rs.next()){
//			gcm=new GoodsClangMovie();
//			gcm.setId(rs.getInt("ID"));
//			gcm.setName(rs.getString("NAME"));
//			gcm.setPrice(rs.getDouble("PRICE"));
//			gcm.setType(rs.getString("PRICE"));
//			gcm.setColor(rs.getString("COLOR"));
//			gcm.setSize(rs.getString("SIZE"));
//			gcm.setBrand(rs.getString("BRAND"));
//			gcm.setCount(rs.getString("COUNT"));
//			gcm.setMonthSales(rs.getString("MONTH_SALES"));
//			gcm.setTotalSales(rs.getString("TOTAL_SALES"));
//			gcm.setDesc(rs.getString("DESC"));
//			gcm.setPackSize(rs.getString("PACK_SIZE"));
//			gcm.setRoughWeight(rs.getString("TV_ROUGH_WEIGHT"));
//			gcm.setCondition(rs.getString("CONDITION"));
//			gcm.setBoxTexture(rs.getString("BOX_TEXTURE"));
//			gcm.setFirstCost(rs.getString("FIRST_COST"));
//			  
//			 goodsClangMovieList.add(gcm);
//		
//			
//		}
//    	
//    	return goodsClangMovieList;
//    	
//    }
    
    public List<Map<String,Object>> selectAll() throws SQLException{
    	List<Map<String,Object>> goodsClangMovieList= new ArrayList<Map<String,Object>>();
    	
    	sql="select * from goods_clang_movie";
		conn=ConnectionManager.getConnection();
		para=conn.prepareStatement(sql);
		rs=para.executeQuery();
		GoodsClangMovie gcm=null;
		while(rs.next()){
			ResultSetMetaData rsmd = rs.getMetaData();
			int column_count = rsmd.getColumnCount();//得到列的个数
			Map<String,Object> map = new HashMap<String,Object>();
			for(int i = 1 ; i <= column_count ; i++){
				String column_name = rsmd.getColumnName(i);//列的名称
				String column_value = rs.getString(i);//列的值
				map.put(column_name, column_value);
			}
			goodsClangMovieList.add(map);
		}
    	return goodsClangMovieList;
    }
    
    
}
