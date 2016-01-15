package com.cn.bsnt.goodsTeaWine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import dbutil.DBConntext;

public class GoodsTeaWineAction extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
	// 设置编码格式
	req.setCharacterEncoding("utf-8");
	resp.setCharacterEncoding("utf-8");
//	List<String> list = new ArrayList<String>();
//	list.add("list");
	DBConntext db = new DBConntext();
	JSONObject json = new JSONObject();
	String goodsType=req.getParameter("goodsType");//接口文档
	
	List<Map<String, Object>> list_rtn =new ArrayList<Map<String,Object>>();
	List<Map<String, Object>> list_Picture =new ArrayList<Map<String,Object>>();		

	List<String> list=new ArrayList<String>();
	
	list.add(goodsType);
	list_rtn=db.goodsTeaWine();
	list_Picture=db.PictureType(list);
	String state = "-1";
	if(list_rtn!=null && list_rtn.size()>0){
		state="1";
	}
	else {
		state="0";
	}


	json.put("state", state);
	json.put("tvList", list_rtn);
	json.put("list_Picture","list_Picture");

	resp.getWriter().write(json.toString());

	}
	
	
}
