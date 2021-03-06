package com.cn.bsnt.goodsOfficeStationary;

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

@SuppressWarnings("serial")
public class GoodsOfficeStationaryAction extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		DBConntext db = new DBConntext();
		JSONObject json = new JSONObject();
		String goodsType=request.getParameter("goodsType");//ͼƬ����
		
		List<Map<String, Object>> list_rtn =new ArrayList<Map<String,Object>>();
		List<Map<String, Object>> list_picture =new ArrayList<Map<String,Object>>();		

		List<String> list=new ArrayList<String>();
		list.add(goodsType);
		list_rtn=db.queryOfficeStationary();
		list_picture=db.PictureType(list);
		String state = "-1";
		if(list_rtn!=null && list_rtn.size()>0){
			state="1";
		}
		else {
			state="0";
		}
		json.put("state", state);
		json.put("officeStationaryList", list_rtn);
		json.put("list_picture",list_picture);

		response.getWriter().write(json.toString());
	
	}

}
