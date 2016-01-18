package com.cn.bsnt.goodsQueryCan;

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
import dbutil.DBConntextCan;

public class GoodsReferCan extends HttpServlet {
      
	     @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	    		throws ServletException, IOException {
	    	// TODO Auto-generated method stub
	    	this.doPost(req, resp);
	    }
	     
	     @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException {
	        req.setCharacterEncoding("UTF-8");
	        resp.setCharacterEncoding("UTF_8");
	        DBConntextCan  zpl=new DBConntextCan();
	        JSONObject json=new JSONObject();
	        String Id=req.getParameter("id");
	        int id=Integer.parseInt(Id);
	        String Type=req.getParameter("goodsType");
	        List<Map<String,Object>> list_goods=new ArrayList<Map<String,Object>>();
	  
	    	if (Type=="电视机") {
	    		list_goods=zpl.goodsTv(id,Type);
			}
	    	else if (Type=="洗衣机") {
				list_goods=zpl.goodsWasher(id, Type);
			}
	    	else if(Type=="电冰箱"){
	    		list_goods=zpl.goodsIcebox(id, Type);
	    	}
	    	else if(Type=="电饭煲"){
	    		list_goods=zpl. goodsRiceCooker(id, Type);
	    	}
	    	else if(Type=="饮水机"){
	    		list_goods=zpl.goodsWaterFountain(id, Type);
	    	}
	    	else if(Type=="微波炉"){
	    		list_goods=zpl. goodsMicrowaveOven(id, Type);
	    	}
	    	else if(Type=="音响影视"){
	    		list_goods=zpl.goodsClangMovie(id, Type);
	    	}
	    	else if(Type=="其他电器"){
	    		list_goods=zpl. goodsOtherElectricAppliance(id, Type);
	    	}
	        else if(Type=="保暖服饰"){
	    	   list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="休闲服饰"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="中老年服"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="正装裙装"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="内衣内裤"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="儿童服饰"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="服饰饰品"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="休闲鞋靴"){
	        	list_goods=zpl.goodsShoes(id, Type);
	        }
	        else if(Type=="皮鞋皮靴"){
	        	list_goods=zpl.goodsShoes(id, Type);
	        }
	        else if(Type=="高跟鞋靴"){
	        	list_goods=zpl.goodsShoes(id, Type);
	        }
	        else if(Type=="运动潮鞋"){
	        	list_goods=zpl.goodsShoes(id, Type);
	        }
	        else if(Type=="休闲箱包"){
	        	list_goods=zpl. goodsLuggage(id, Type);
	        }
	        else if(Type=="运动箱包"){
	        	list_goods=zpl. goodsLuggage(id, Type);
	        }
	        else if(Type=="旅行箱包"){
	        	list_goods=zpl. goodsLuggage(id, Type);
	        }
	        else if(Type=="儿童包类"){
	        	list_goods=zpl. goodsLuggage(id, Type);
	        }
	        else if(Type=="个人洗护"){
	        	list_goods=zpl.goodsCleaning(id, Type);
	        }
	        else if(Type=="清洁用具"){
	        	list_goods=zpl.goodsCleaning(id, Type);
	        }
	        else if(Type=="厨房餐具"){
	        	list_goods=zpl.goodsKitchen(id, Type);
	        }
	        else if(Type=="家纺用品"){
	        	list_goods=zpl.goodsHomeTextiles(id, Type);
	        }
	        else if(Type=="床上用品"){
	        	list_goods=zpl.goodsHomeTextiles(id, Type);
	        }
	        else if(Type=="厨房用品"){
	        	list_goods=zpl.goodsKitchen(id, Type);
	        }
	        else if(Type=="汽车用品"){
	        	list_goods=zpl.goodsAutoAppliance(id, Type);
	        }
	        else if(Type=="居家摆设"){
	        	list_goods=zpl.goodsHomeFurnishingArticles(id, Type);
	        }
	        else if(Type=="平板电脑"){
	        	list_goods=zpl.goodsComputer(id, Type);
	        }
	        else if(Type=="手机IPAD"){
	        	list_goods=zpl.goodsMobilePhone(id, Type);
	        }
	        else if(Type=="相机DV"){
	        	list_goods=zpl.goodsCamera(id, Type);
	        }
	        else if(Type=="电脑配件"){
	        	list_goods=zpl.goodsDigiyalAccessories(id, Type);
	        }
	        else if(Type=="手机配件"){
	        	list_goods=zpl.goodsDigiyalAccessories(id, Type);
	        }
	        else if(Type=="视频播放"){
	        	list_goods=zpl.goodsVideoPlayOrgan(id, Type);
	        }
	        else if(Type=="摄像监控"){
	        	list_goods=zpl.goodsCameraMonitored(id, Type);
	        }
	        else if(Type=="智能设备"){
	        	list_goods=zpl.goodsSmartDevice(id, Type);
	        }
	        else if(Type=="母婴服饰"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="母婴用品"){
	        	list_goods=zpl.goodsMotherBabyProduct(id, Type);
	        }
	        else if(Type=="母婴食品"){
	        	list_goods=zpl.goodsMotherBabyFood(id, Type);
	        }
	        else if(Type=="早教启蒙"){
	        	list_goods=zpl.goodsEarlyEducationEnlightenment(id, Type);
	        }
	        else if(Type=="精品名茶"){
	        	list_goods=zpl.goodsTea(id, Type);
	        }
	        else if(Type=="酒品佳酿"){
	        	list_goods=zpl.goodsWine(id, Type);
	        }
	        else if(Type=="茶酒套具"){
	        	list_goods=zpl.goodsTeaWine(id, Type);
	        }
	        else if(Type=="休闲零食"){
	        	list_goods=zpl.goodsSnack(id, Type);
	        }
	        else if(Type=="粮油调味"){
	        	list_goods=zpl.goodsGrainOilTaste(id, Type);
	        }
	        else if(Type=="滋补养生"){
	        	list_goods=zpl.goodsNourishingHealth(id, Type);
	        }
	        else if(Type=="牛奶饮料"){
	        	list_goods=zpl.goodsMilkDrink(id, Type);
	        }
	        else if(Type=="床柜沙发"){
	        	list_goods=zpl.goodsBoxSpringSuite(id, Type);
	        }
	        else if(Type=="桌椅茶几"){
	        	list_goods=zpl.goodsBrandEndable(id, Type);
	        }
	        else if(Type=="门窗装饰"){
	        	list_goods=zpl.goodsDoorWindows(id, Type);
	        }
	        else if(Type=="装潢建材"){
	        	list_goods=zpl.goodsDecorateBuildingMaterials(id, Type);
	        }
	        else if(Type=="农用三轮"){
	        	list_goods=zpl.goodsAgriculturesUseTricycle(id, Type);
	        }
	        else if(Type=="农资机械"){
	        	list_goods=zpl.goodsAgriculturesUseArticles(id, Type);
	        }
	        else if(Type=="农耕工具"){
	        	list_goods=zpl.goodsAgriculturesUseTools(id, Type);
	        }
	        else if(Type=="种子化肥"){
	        	list_goods=zpl.goodsAgriculturesUseArticles(id, Type);
	        }
	        else if(Type=="健身器材"){
	        	list_goods=zpl.goodsFitnessEquipment(id, Type);
	        }
	        else if(Type=="体育用品"){
	        	list_goods=zpl.goodsSportGoods(id, Type);
	        }
	        else if(Type=="户外用品"){
	        	list_goods=zpl.goodsOutdoorGoods(id, Type);
	        }
	        else if(Type=="办公文具"){
	        	list_goods=zpl.goodsOfficeStationary(id, Type);
	        }
	        else if(Type=="医疗保健"){
	        	list_goods=zpl.goodsedicaMare(id, Type);
	        }
	    	
	    	
	    	List<Map<String, Object>> list_picture = new ArrayList<Map<String,Object>>();
	    	list_picture=zpl.Picture(id, Type);
	    	String state="-1";
	    	if (list_goods != null && list_goods.size()>0) {
	    		state = "1";
			}else {
				state = "0";
			}	
	    	
	     json.put("state", state);
	     json.put("list_type", list_goods);
	     json.put("list_picture", list_picture);
	     resp.getWriter().write(json.toString());		
	    		
		

	    		
	    }
}
