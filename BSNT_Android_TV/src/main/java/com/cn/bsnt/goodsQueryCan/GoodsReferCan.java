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
	  
	    	if (Type=="���ӻ�") {
	    		list_goods=zpl.goodsTv(id,Type);
			}
	    	else if (Type=="ϴ�»�") {
				list_goods=zpl.goodsWasher(id, Type);
			}
	    	else if(Type=="�����"){
	    		list_goods=zpl.goodsIcebox(id, Type);
	    	}
	    	else if(Type=="�緹��"){
	    		list_goods=zpl. goodsRiceCooker(id, Type);
	    	}
	    	else if(Type=="��ˮ��"){
	    		list_goods=zpl.goodsWaterFountain(id, Type);
	    	}
	    	else if(Type=="΢��¯"){
	    		list_goods=zpl. goodsMicrowaveOven(id, Type);
	    	}
	    	else if(Type=="����Ӱ��"){
	    		list_goods=zpl.goodsClangMovie(id, Type);
	    	}
	    	else if(Type=="��������"){
	    		list_goods=zpl. goodsOtherElectricAppliance(id, Type);
	    	}
	        else if(Type=="��ů����"){
	    	   list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="���з���"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="�������"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="��װȹװ"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="�����ڿ�"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="��ͯ����"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="������Ʒ"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="����Ьѥ"){
	        	list_goods=zpl.goodsShoes(id, Type);
	        }
	        else if(Type=="ƤЬƤѥ"){
	        	list_goods=zpl.goodsShoes(id, Type);
	        }
	        else if(Type=="�߸�Ьѥ"){
	        	list_goods=zpl.goodsShoes(id, Type);
	        }
	        else if(Type=="�˶���Ь"){
	        	list_goods=zpl.goodsShoes(id, Type);
	        }
	        else if(Type=="�������"){
	        	list_goods=zpl. goodsLuggage(id, Type);
	        }
	        else if(Type=="�˶����"){
	        	list_goods=zpl. goodsLuggage(id, Type);
	        }
	        else if(Type=="�������"){
	        	list_goods=zpl. goodsLuggage(id, Type);
	        }
	        else if(Type=="��ͯ����"){
	        	list_goods=zpl. goodsLuggage(id, Type);
	        }
	        else if(Type=="����ϴ��"){
	        	list_goods=zpl.goodsCleaning(id, Type);
	        }
	        else if(Type=="����þ�"){
	        	list_goods=zpl.goodsCleaning(id, Type);
	        }
	        else if(Type=="�����;�"){
	        	list_goods=zpl.goodsKitchen(id, Type);
	        }
	        else if(Type=="�ҷ���Ʒ"){
	        	list_goods=zpl.goodsHomeTextiles(id, Type);
	        }
	        else if(Type=="������Ʒ"){
	        	list_goods=zpl.goodsHomeTextiles(id, Type);
	        }
	        else if(Type=="������Ʒ"){
	        	list_goods=zpl.goodsKitchen(id, Type);
	        }
	        else if(Type=="������Ʒ"){
	        	list_goods=zpl.goodsAutoAppliance(id, Type);
	        }
	        else if(Type=="�ӼҰ���"){
	        	list_goods=zpl.goodsHomeFurnishingArticles(id, Type);
	        }
	        else if(Type=="ƽ�����"){
	        	list_goods=zpl.goodsComputer(id, Type);
	        }
	        else if(Type=="�ֻ�IPAD"){
	        	list_goods=zpl.goodsMobilePhone(id, Type);
	        }
	        else if(Type=="���DV"){
	        	list_goods=zpl.goodsCamera(id, Type);
	        }
	        else if(Type=="�������"){
	        	list_goods=zpl.goodsDigiyalAccessories(id, Type);
	        }
	        else if(Type=="�ֻ����"){
	        	list_goods=zpl.goodsDigiyalAccessories(id, Type);
	        }
	        else if(Type=="��Ƶ����"){
	        	list_goods=zpl.goodsVideoPlayOrgan(id, Type);
	        }
	        else if(Type=="������"){
	        	list_goods=zpl.goodsCameraMonitored(id, Type);
	        }
	        else if(Type=="�����豸"){
	        	list_goods=zpl.goodsSmartDevice(id, Type);
	        }
	        else if(Type=="ĸӤ����"){
	        	list_goods=zpl.goodsCostume(id, Type);
	        }
	        else if(Type=="ĸӤ��Ʒ"){
	        	list_goods=zpl.goodsMotherBabyProduct(id, Type);
	        }
	        else if(Type=="ĸӤʳƷ"){
	        	list_goods=zpl.goodsMotherBabyFood(id, Type);
	        }
	        else if(Type=="�������"){
	        	list_goods=zpl.goodsEarlyEducationEnlightenment(id, Type);
	        }
	        else if(Type=="��Ʒ����"){
	        	list_goods=zpl.goodsTea(id, Type);
	        }
	        else if(Type=="��Ʒ����"){
	        	list_goods=zpl.goodsWine(id, Type);
	        }
	        else if(Type=="����׾�"){
	        	list_goods=zpl.goodsTeaWine(id, Type);
	        }
	        else if(Type=="������ʳ"){
	        	list_goods=zpl.goodsSnack(id, Type);
	        }
	        else if(Type=="���͵�ζ"){
	        	list_goods=zpl.goodsGrainOilTaste(id, Type);
	        }
	        else if(Type=="�̲�����"){
	        	list_goods=zpl.goodsNourishingHealth(id, Type);
	        }
	        else if(Type=="ţ������"){
	        	list_goods=zpl.goodsMilkDrink(id, Type);
	        }
	        else if(Type=="����ɳ��"){
	        	list_goods=zpl.goodsBoxSpringSuite(id, Type);
	        }
	        else if(Type=="���β輸"){
	        	list_goods=zpl.goodsBrandEndable(id, Type);
	        }
	        else if(Type=="�Ŵ�װ��"){
	        	list_goods=zpl.goodsDoorWindows(id, Type);
	        }
	        else if(Type=="װ�꽨��"){
	        	list_goods=zpl.goodsDecorateBuildingMaterials(id, Type);
	        }
	        else if(Type=="ũ������"){
	        	list_goods=zpl.goodsAgriculturesUseTricycle(id, Type);
	        }
	        else if(Type=="ũ�ʻ�е"){
	        	list_goods=zpl.goodsAgriculturesUseArticles(id, Type);
	        }
	        else if(Type=="ũ������"){
	        	list_goods=zpl.goodsAgriculturesUseTools(id, Type);
	        }
	        else if(Type=="���ӻ���"){
	        	list_goods=zpl.goodsAgriculturesUseArticles(id, Type);
	        }
	        else if(Type=="��������"){
	        	list_goods=zpl.goodsFitnessEquipment(id, Type);
	        }
	        else if(Type=="������Ʒ"){
	        	list_goods=zpl.goodsSportGoods(id, Type);
	        }
	        else if(Type=="������Ʒ"){
	        	list_goods=zpl.goodsOutdoorGoods(id, Type);
	        }
	        else if(Type=="�칫�ľ�"){
	        	list_goods=zpl.goodsOfficeStationary(id, Type);
	        }
	        else if(Type=="ҽ�Ʊ���"){
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
