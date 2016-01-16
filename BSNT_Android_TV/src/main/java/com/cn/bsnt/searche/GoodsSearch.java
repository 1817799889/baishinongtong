package com.cn.bsnt.searche;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import dbutil.DBConntextSearch;

public class GoodsSearch extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		DBConntextSearch db = new DBConntextSearch();
		JSONObject json = new JSONObject();
		
		String name=req.getParameter("name");
		//存放商品名称或特价商品的数组
		List<String> list = new ArrayList<String>();
		list.add(name);
		//定义存放数据的list数组
		List<Map<String, Object>> list_rtn = new ArrayList<Map<String,Object>>();
		List<Map<String, Object>> list_picture = new ArrayList<Map<String,Object>>();
		//调用方法取数据
		list_rtn.addAll(db.searchGoodsAgriculturesMachinery(list));
		list_rtn.addAll(db.searchGoodsAgriculturesUseArticles(list));
		list_rtn.addAll(db.searchGoodsAgriculturesUseTools(list));
		list_rtn.addAll(db.searchGoodsAgriculturesUseTricycle(list));
		list_rtn.addAll(db.searchGoodsAutoAppliance(list));
		list_rtn.addAll(db.searchGoodsBoxSpringSuite(list));
		list_rtn.addAll(db.searchGoodsBrandEndTable(list));
		list_rtn.addAll(db.searchGoodsCamera(list));
		list_rtn.addAll(db.searchGoodsCameraMonitored(list));
		list_rtn.addAll(db.searchGoodsClangMovie(list));
		list_rtn.addAll(db.searchGoodsCleaning(list));
		list_rtn.addAll(db.searchGoodsComputer(list));
		list_rtn.addAll(db.searchGoodsCostume(list));
		list_rtn.addAll(db.searchGoodsDecorateBuildingmaterials(list));
		list_rtn.addAll(db.searchGoodsDigiyalAccessories(list));
		list_rtn.addAll(db.searchGoodsDoorWindows(list));
		list_rtn.addAll(db.searchGoodsEarlyEductionEnlightenment(list));
		list_rtn.addAll(db.searchGoodsFitnessEquipment(list));
		list_rtn.addAll(db.searchGoodsGrainOilTaste(list));
		list_rtn.addAll(db.searchGoodsHomeFurnishingArticles(list));
		list_rtn.addAll(db.searchGoodsHomeTextiles(list));
		list_rtn.addAll(db.searchGoodsIcebox(list));
		list_rtn.addAll(db.searchGoodsKitchen(list));
		list_rtn.addAll(db.searchGoodsLuggage(list));
		list_rtn.addAll(db.searchGoodsMedicacare(list));
		list_rtn.addAll(db.searchGoodsMicrowaveOven(list));
		list_rtn.addAll(db.searchGoodsMilkDrink(list));
		list_rtn.addAll(db.searchGoodsMobilePhone(list));
		list_rtn.addAll(db.searchGoodsMotherBabyFood(list));
		list_rtn.addAll(db.searchGoodsMotherBabyProduct(list));
		list_rtn.addAll(db.searchGoodsNourishingHealth(list));
		list_rtn.addAll(db.searchGoodsOfficeStationary(list));
		list_rtn.addAll(db.searchGoodsOtherElectricAppliance(list));
		list_rtn.addAll(db.searchGoodsOutdoorGoods(list));
		list_rtn.addAll(db.searchGoodsRiceCooker(list));
		list_rtn.addAll(db.searchGoodsShoes(list));
		list_rtn.addAll(db.searchGoodsSmartDevice(list));
		list_rtn.addAll(db.searchGoodsSnack(list));
		list_rtn.addAll(db.searchGoodsSportGoods(list));
		list_rtn.addAll(db.searchGoodsTea(list));
		list_rtn.addAll(db.searchGoodsTeaWine(list));
		list_rtn.addAll(db.searchGoodsTv(list));
		list_rtn.addAll(db.searchGoodsVideoPlayOrgan(list));
		list_rtn.addAll(db.searchGoodsWasher(list));
		list_rtn.addAll(db.searchGoodsWaterFountain(list));
		list_rtn.addAll(db.searchGoodsWine(list));
		
		List<String> goodsType = new ArrayList<String>();
		

		//从list_rtn中取出包含的商品类型
		for(int i=0;i<list_rtn.size();i++){
			if(list_rtn.get(i).get("type")!=null){
				String a = (String) list_rtn.get(i).get("3");
				goodsType.add(a);
			
				
			}
		}
		//取出goodsType中的重复项
		for (int i = 0; i < goodsType.size(); i++)  //外循环是循环的次数
        {
            for (int j = goodsType.size() - 1 ; j > i; j--)  //内循环是 外循环一次比较的次数
            {

                if (goodsType.get(i)== goodsType.get(j))
                {
                	goodsType.remove(j);
                }

            }
        }
		
		for(int i = 0;i<goodsType.size();i++){
			List<String> a = new ArrayList<String>();
			a.add(goodsType.get(i));
			list_picture.addAll(db.PictureType(a));
		}
		
		
		
		
		
		String state = "-1";
		if (list_rtn != null && list_rtn.size()>0) {
			state = "1";
		}else {
			state = "0";
		}
		json.put("state", state);
		json.put("searchList", list_rtn);
		json.put("list_picture", list_picture);
		resp.getWriter().write(json.toString());
	}
	
	

}
