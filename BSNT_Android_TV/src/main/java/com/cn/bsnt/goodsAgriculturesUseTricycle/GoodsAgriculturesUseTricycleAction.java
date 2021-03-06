package com.cn.bsnt.goodsAgriculturesUseTricycle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbutil.DBConntext;
import net.sf.json.JSONObject;


@SuppressWarnings("serial")
public class GoodsAgriculturesUseTricycleAction extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		DBConntext db = new DBConntext();
		JSONObject json = new JSONObject();
		List<Map<String, Object>> list_rtn = new ArrayList<Map<String,Object>>();
		List<Map<String, Object>> list_picture = new ArrayList<Map<String,Object>>();
		String goodsType=request.getParameter("goodsType");
		List<String> list= new ArrayList<String>();
		list.add(goodsType);
		list_rtn = db.queryUseTricycle();
		list_picture = db.queryPicture(list);
		String state = "-1";
		if (list_rtn != null && list_rtn.size()>0) {
			state = "1";
		}else {
			state = "0";
		}
		json.put("state", state);
		json.put("agriculturesUseTricycleList", list_rtn);
		json.put("list_picture", list_picture);
		response.getWriter().write(json.toString());
	}
}
