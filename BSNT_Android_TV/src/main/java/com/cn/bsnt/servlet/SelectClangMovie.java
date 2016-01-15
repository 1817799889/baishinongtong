package com.cn.bsnt.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.cn.bsnt.model.GoodsClangMovie;
import com.cn.bsnt.service.GoodsClangMovieService;
import com.cn.bsnt.service.impl.GoodsClangMovieServiceImpl;



public class SelectClangMovie extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
        @SuppressWarnings("unused")
		@Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        		throws ServletException, IOException {
        	req.setCharacterEncoding("utf-8");
    		resp.setCharacterEncoding("utf-8");
    		System.out.println("``````````````````````````");
//    		JSONObject json = new JSONObject();
    		List<Map<String,Object>> goodsClangMovieList = new ArrayList<Map<String,Object>>();
    		int i = -1;
    		String result =null;
//    		List<Map<String, Object>> res = null;
//			try {
//				String sql = "select type,bank,money,duedate,linkman,issuetime from tab_source";
//				res = dbUtil.query(sql);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//    		try {
//    			GoodsClangMovieService gws = new GoodsClangMovieServiceImpl();
//    			
//    			goodsClangMovieList = gws.selectAll();
//    			
//    			if(goodsClangMovieList!=null){
//    				i=1;
//    				json.put("state", i);
//    				//result = "{\"state\":\"i\",\"clangMovieList\":" + GoodsClangMovieList + "}";
//    			}else{
//    				i=0;
//    				//result = "{\"state\":\"0\",\"clangMovieList\":" + GoodsClangMovieList + "}";
//    				json.put("state", i);
//    			}
//    			
//    		} catch (Exception e) {
//    			i=-1;
//    			json.put("state", i);
//    			//result = "{\"state\":\"-1\"}";
//    		}
//    			JSONArray jsonArr = new JSONArray(goodsClangMovieList);
//
//    		
//    		
//    		json.put("clangMovieList", goodsClangMovieList);
//    		resp.getWriter().write(json.toString());
//    		JSONArray json = new JSONArray(result);
//    		
//    		Writer writer = resp.getWriter();
//    		writer.write(result);
//    		writer.close();
        }
}
