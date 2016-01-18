package dbutil;

import java.util.List;
import java.util.Map;

public class DBConntextCan {
	//农耕机械
        public List<Map<String, Object>> goodsAgriculturesMachinery(int Id,String Type){
			String sql="select * from goods_agricultures_machinery where ID=? and TYPE=?";
			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
			return list_can;
        	
        }
    //农资用品
        public List<Map<String, Object>> goodsAgriculturesUseArticles(int Id,String Type){
			String sql="select * from goods_agricultures_use_articles where ID=? and TYPE=?";
			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
			return list_can;
        	
        }
     //农耕工具
        public List<Map<String, Object>> goodsAgriculturesUseTools(int Id,String Type){
			String sql="select * from goods_agricultures_use_tools where ID=? and TYPE=?";
			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
			return list_can;
        	
        }
        //农用三轮
        public List<Map<String, Object>> goodsAgriculturesUseTricycle(int Id,String Type){
			String sql="select * from goods_agricultures_use_tricycle where ID=? and TYPE=?";
			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
			return list_can;
        	
        }
        //汽车用品
        public List<Map<String, Object>> goodsAutoAppliance(int Id,String Type){
			String sql="select * from goods_auto_appliance where ID=? and TYPE=?";
			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
			return list_can;
        	
        }
        //床柜套件
        public List<Map<String, Object>> goodsBoxSpringSuite(int Id,String Type){
     			String sql="select * from goods_box_spring_suite where ID=? and TYPE=?";
     			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
     			return list_can;
             	
        }
        //品牌茶几
        public List<Map<String, Object>> goodsBrandEndable(int Id,String Type){
 			String sql="select * from goods_brand_end_table where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //相机
        public List<Map<String, Object>> goodsCamera(int Id,String Type){
 			String sql="select * from goods_camera where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //摄像监控
        public List<Map<String, Object>> goodsCameraMonitored(int Id,String Type){
 			String sql="select * from goods_camera_monitored where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //音响影视
        public List<Map<String, Object>> goodsClangMovie(int Id,String Type){
 			String sql="select * from goods_clang_movie where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //个人洗护清洁用具
        public List<Map<String, Object>> goodsCleaning(int Id,String Type){
 			String sql="select * from goods_cleaning where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //电脑
        public List<Map<String, Object>> goodsComputer(int Id,String Type){
 			String sql="select * from goods_computer where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //服饰
        public List<Map<String, Object>> goodsCostume(int Id,String Type){
 			String sql="select * from goods_costume where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //装潢建材
        public List<Map<String, Object>> goodsDecorateBuildingMaterials(int Id,String Type){
 			String sql="select * from goods_decorate_building_materials where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //数码配件
        public List<Map<String, Object>> goodsDigiyalAccessories(int Id,String Type){
 			String sql="select * from goods_digiyal_accessories where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //门窗装饰
        public List<Map<String, Object>> goodsDoorWindows(int Id,String Type){
 			String sql="select * from goods_door_windows where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }  
        //早教启蒙
        public List<Map<String, Object>> goodsEarlyEducationEnlightenment(int Id,String Type){
 			String sql="select * from goods_early_education_enlightenment where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }  
        //健身器材
        public List<Map<String, Object>> goodsFitnessEquipment(int Id,String Type){
 			String sql="select * from goods_fitness_equipment where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //粮油调味
        public List<Map<String, Object>> goodsGrainOilTaste(int Id,String Type){
 			String sql="select * from goods_grain_oil_taste where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //居家摆件
        public List<Map<String, Object>> goodsHomeFurnishingArticles(int Id,String Type){
 			String sql="select * from goods_home_furnishing_articles where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //家纺用品
        public List<Map<String, Object>> goodsHomeTextiles(int Id,String Type){
 			String sql="select * from goods_home_textiles where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //电冰箱
        public List<Map<String, Object>> goodsIcebox(int Id,String Type){
 			String sql="select * from goods_icebox where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //厨房用品
        public List<Map<String, Object>> goodsKitchen(int Id,String Type){
 			String sql="select * from goods_kitchen where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //箱包
        public List<Map<String, Object>> goodsLuggage(int Id,String Type){
 			String sql="select * from goods_luggage where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //医疗保健
        public List<Map<String, Object>> goodsedicaMare(int Id,String Type){
 			String sql="select * from goods_medica_care where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }  
      //微波炉  
        public List<Map<String, Object>> goodsMicrowaveOven(int Id,String Type){
 			String sql="select * from goods_microwave_oven where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //牛奶饮料
        public List<Map<String, Object>> goodsMilkDrink(int Id,String Type){
 			String sql="select * from goods_milk_drink where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //手机
        public List<Map<String, Object>> goodsMobilePhone(int Id,String Type){
 			String sql="select * from goods_mobile_phone where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //母婴食品
        public List<Map<String, Object>> goodsMotherBabyFood(int Id,String Type){
 			String sql="select * from goods_mother_baby_food where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        
       }
        //母婴用品
        public List<Map<String, Object>> goodsMotherBabyProduct(int Id,String Type){
 			String sql="select * from goods_mother_baby_product where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //滋补养生
        public List<Map<String, Object>> goodsNourishingHealth(int Id,String Type){
 			String sql="select * from goods_nourishing_health where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //办公文具
        public List<Map<String, Object>> goodsOfficeStationary(int Id,String Type){
 			String sql="select * from goods_office_stationary where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //其他电器
        public List<Map<String, Object>> goodsOtherElectricAppliance(int Id,String Type){
 			String sql="select * from goods_other_electric_appliance where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //户外用品
        public List<Map<String, Object>> goodsOutdoorGoods(int Id,String Type){
 			String sql="select * from goods_outdoor_goods where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //电饭煲
        public List<Map<String, Object>> goodsRiceCooker(int Id,String Type){
 			String sql="select * from goods_rice_cooker where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //鞋靴
        public List<Map<String, Object>> goodsShoes(int Id,String Type){
 			String sql="select * from goods_shoes where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //智能设备
        public List<Map<String, Object>> goodsSmartDevice(int Id,String Type){
 			String sql="select * from goods_smart_device where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //休闲零食
        public List<Map<String, Object>> goodsSnack(int Id,String Type){
 			String sql="select * from goods_snack where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //体育用品
        public List<Map<String, Object>> goodsSportGoods(int Id,String Type){
 			String sql="select * from goods_sport_goods where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //精品名茶
        public List<Map<String, Object>> goodsTea(int Id,String Type){
 			String sql="select * from goods_tea where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }   
        //茶酒套具
        public List<Map<String, Object>> goodsTeaWine(int Id,String Type){
 			String sql="select * from goods_tea_wine where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //电视机
        public List<Map<String, Object>> goodsTv(int Id,String Type){
 			String sql="select * from goods_tv where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //视频播放器
        public List<Map<String, Object>> goodsVideoPlayOrgan(int Id,String Type){
 			String sql="select * from goods_video_play_organ where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //洗衣机
        public List<Map<String, Object>> goodsWasher(int Id,String Type){
 			String sql="select * from goods_washer where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //饮水机
        public List<Map<String, Object>> goodsWaterFountain(int Id,String Type){
 			String sql="select * from goods_water_fountain where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //酒品佳酿
        public List<Map<String, Object>> goodsWine(int Id,String Type){
 			String sql="select * from goods_wine where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
	
		/**
		 * 类型图片
		 */
		public List<Map<String, Object>> PictureType(List<String> list) {
			String sql = "SELECT * from goods_picture where  goods_type =?";
			List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
			return list_rtn;
		}

		/**
		 * 图片
		 */
		public List<Map<String, Object>> Picture(int id,String Type) {
			String sql = "SELECT * from goods_picture where id=? and goods_type =? ";
			List<Map<String, Object>> list_rtn = dbUtil.query(sql, id, Type);
			return list_rtn;
		}

     
}
