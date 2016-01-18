package com.cn.bsnt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.omg.Dynamic.Parameter;

import com.cn.bsnt.dao.BaseDAO;
import com.cn.bsnt.dbhelper.ConnectionManager;
import com.cn.bsnt.model.GoodsAgriculturesUseTools;
import com.cn.bsnt.model.GoodsPicture;


public class GoodsPictureDAOImpl implements BaseDAO<GoodsPicture>{
	
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;

	public int insert(GoodsPicture t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(GoodsPicture t) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	public List<GoodsPicture> selectByGoodsIdAndGoodsType(int goodsId,String GoodsType){
		List<GoodsPicture> goodsPictureList=new ArrayList<GoodsPicture>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_picture where goods_id=? and goods_type=?");
			ps.setInt(1, goodsId);
			ps.setString(2,GoodsType);
			rs=ps.executeQuery();
			GoodsPicture gp = null;
			while(rs.next()){
				
				gp = new GoodsPicture();
				gp.setId(rs.getInt("id"));
				gp.setUrl(rs.getString("url"));
				gp.setGoodsId(rs.getInt("goods_id"));
				gp.setGoodsType(rs.getString("goods_type"));
				gp.setBooleanMainPicture(rs.getString("boolean_main_picture"));
				 
				goodsPictureList.add(gp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return goodsPictureList;
	}
	
	public List<GoodsPicture> selectByGoodsType(String GoodsType){
		List<GoodsPicture> goodsPictureList=new ArrayList<GoodsPicture>();
		conn=ConnectionManager.getConnection();
		try {
			ps=conn.prepareStatement("select * from goods_picture where goods_type=?");
			
			ps.setString(1,GoodsType);
			rs=ps.executeQuery();
			GoodsPicture gp = null;
			while(rs.next()){
				
				gp = new GoodsPicture();
				gp.setId(rs.getInt("id"));
				gp.setUrl(rs.getString("url"));
				gp.setGoodsId(rs.getInt("goods_id"));
				gp.setGoodsType(rs.getString("goods_type"));
				gp.setBooleanMainPicture(rs.getString("boolean_main_picture"));
				 
				goodsPictureList.add(gp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return goodsPictureList;
	}
	
	


}
