package dbutil;

import java.util.List;
import java.util.Map;

public class DBConntextCan {
	//ũ����е
        public List<Map<String, Object>> goodsAgriculturesMachinery(int Id,String Type){
			String sql="select * from goods_agricultures_machinery where ID=? and TYPE=?";
			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
			return list_can;
        	
        }
    //ũ����Ʒ
        public List<Map<String, Object>> goodsAgriculturesUseArticles(int Id,String Type){
			String sql="select * from goods_agricultures_use_articles where ID=? and TYPE=?";
			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
			return list_can;
        	
        }
     //ũ������
        public List<Map<String, Object>> goodsAgriculturesUseTools(int Id,String Type){
			String sql="select * from goods_agricultures_use_tools where ID=? and TYPE=?";
			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
			return list_can;
        	
        }
        //ũ������
        public List<Map<String, Object>> goodsAgriculturesUseTricycle(int Id,String Type){
			String sql="select * from goods_agricultures_use_tricycle where ID=? and TYPE=?";
			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
			return list_can;
        	
        }
        //������Ʒ
        public List<Map<String, Object>> goodsAutoAppliance(int Id,String Type){
			String sql="select * from goods_auto_appliance where ID=? and TYPE=?";
			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
			return list_can;
        	
        }
        //�����׼�
        public List<Map<String, Object>> goodsBoxSpringSuite(int Id,String Type){
     			String sql="select * from goods_box_spring_suite where ID=? and TYPE=?";
     			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
     			return list_can;
             	
        }
        //Ʒ�Ʋ輸
        public List<Map<String, Object>> goodsBrandEndable(int Id,String Type){
 			String sql="select * from goods_brand_end_table where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //���
        public List<Map<String, Object>> goodsCamera(int Id,String Type){
 			String sql="select * from goods_camera where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //������
        public List<Map<String, Object>> goodsCameraMonitored(int Id,String Type){
 			String sql="select * from goods_camera_monitored where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //����Ӱ��
        public List<Map<String, Object>> goodsClangMovie(int Id,String Type){
 			String sql="select * from goods_clang_movie where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //����ϴ������þ�
        public List<Map<String, Object>> goodsCleaning(int Id,String Type){
 			String sql="select * from goods_cleaning where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //����
        public List<Map<String, Object>> goodsComputer(int Id,String Type){
 			String sql="select * from goods_computer where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //����
        public List<Map<String, Object>> goodsCostume(int Id,String Type){
 			String sql="select * from goods_costume where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //װ�꽨��
        public List<Map<String, Object>> goodsDecorateBuildingMaterials(int Id,String Type){
 			String sql="select * from goods_decorate_building_materials where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //�������
        public List<Map<String, Object>> goodsDigiyalAccessories(int Id,String Type){
 			String sql="select * from goods_digiyal_accessories where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //�Ŵ�װ��
        public List<Map<String, Object>> goodsDoorWindows(int Id,String Type){
 			String sql="select * from goods_door_windows where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }  
        //�������
        public List<Map<String, Object>> goodsEarlyEducationEnlightenment(int Id,String Type){
 			String sql="select * from goods_early_education_enlightenment where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }  
        //��������
        public List<Map<String, Object>> goodsFitnessEquipment(int Id,String Type){
 			String sql="select * from goods_fitness_equipment where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //���͵�ζ
        public List<Map<String, Object>> goodsGrainOilTaste(int Id,String Type){
 			String sql="select * from goods_grain_oil_taste where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //�ӼҰڼ�
        public List<Map<String, Object>> goodsHomeFurnishingArticles(int Id,String Type){
 			String sql="select * from goods_home_furnishing_articles where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //�ҷ���Ʒ
        public List<Map<String, Object>> goodsHomeTextiles(int Id,String Type){
 			String sql="select * from goods_home_textiles where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //�����
        public List<Map<String, Object>> goodsIcebox(int Id,String Type){
 			String sql="select * from goods_icebox where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //������Ʒ
        public List<Map<String, Object>> goodsKitchen(int Id,String Type){
 			String sql="select * from goods_kitchen where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //���
        public List<Map<String, Object>> goodsLuggage(int Id,String Type){
 			String sql="select * from goods_luggage where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //ҽ�Ʊ���
        public List<Map<String, Object>> goodsedicaMare(int Id,String Type){
 			String sql="select * from goods_medica_care where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }  
      //΢��¯  
        public List<Map<String, Object>> goodsMicrowaveOven(int Id,String Type){
 			String sql="select * from goods_microwave_oven where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //ţ������
        public List<Map<String, Object>> goodsMilkDrink(int Id,String Type){
 			String sql="select * from goods_milk_drink where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //�ֻ�
        public List<Map<String, Object>> goodsMobilePhone(int Id,String Type){
 			String sql="select * from goods_mobile_phone where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //ĸӤʳƷ
        public List<Map<String, Object>> goodsMotherBabyFood(int Id,String Type){
 			String sql="select * from goods_mother_baby_food where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        
       }
        //ĸӤ��Ʒ
        public List<Map<String, Object>> goodsMotherBabyProduct(int Id,String Type){
 			String sql="select * from goods_mother_baby_product where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //�̲�����
        public List<Map<String, Object>> goodsNourishingHealth(int Id,String Type){
 			String sql="select * from goods_nourishing_health where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
        //�칫�ľ�
        public List<Map<String, Object>> goodsOfficeStationary(int Id,String Type){
 			String sql="select * from goods_office_stationary where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //��������
        public List<Map<String, Object>> goodsOtherElectricAppliance(int Id,String Type){
 			String sql="select * from goods_other_electric_appliance where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //������Ʒ
        public List<Map<String, Object>> goodsOutdoorGoods(int Id,String Type){
 			String sql="select * from goods_outdoor_goods where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //�緹��
        public List<Map<String, Object>> goodsRiceCooker(int Id,String Type){
 			String sql="select * from goods_rice_cooker where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //Ьѥ
        public List<Map<String, Object>> goodsShoes(int Id,String Type){
 			String sql="select * from goods_shoes where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //�����豸
        public List<Map<String, Object>> goodsSmartDevice(int Id,String Type){
 			String sql="select * from goods_smart_device where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //������ʳ
        public List<Map<String, Object>> goodsSnack(int Id,String Type){
 			String sql="select * from goods_snack where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //������Ʒ
        public List<Map<String, Object>> goodsSportGoods(int Id,String Type){
 			String sql="select * from goods_sport_goods where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //��Ʒ����
        public List<Map<String, Object>> goodsTea(int Id,String Type){
 			String sql="select * from goods_tea where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }   
        //����׾�
        public List<Map<String, Object>> goodsTeaWine(int Id,String Type){
 			String sql="select * from goods_tea_wine where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //���ӻ�
        public List<Map<String, Object>> goodsTv(int Id,String Type){
 			String sql="select * from goods_tv where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //��Ƶ������
        public List<Map<String, Object>> goodsVideoPlayOrgan(int Id,String Type){
 			String sql="select * from goods_video_play_organ where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //ϴ�»�
        public List<Map<String, Object>> goodsWasher(int Id,String Type){
 			String sql="select * from goods_washer where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //��ˮ��
        public List<Map<String, Object>> goodsWaterFountain(int Id,String Type){
 			String sql="select * from goods_water_fountain where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        } 
        //��Ʒ����
        public List<Map<String, Object>> goodsWine(int Id,String Type){
 			String sql="select * from goods_wine where ID=? and TYPE=?";
 			List<Map<String, Object>> list_can = dbUtil.query(sql,Id,Type);
 			return list_can;
        }
	
		/**
		 * ����ͼƬ
		 */
		public List<Map<String, Object>> PictureType(List<String> list) {
			String sql = "SELECT * from goods_picture where  goods_type =?";
			List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
			return list_rtn;
		}

		/**
		 * ͼƬ
		 */
		public List<Map<String, Object>> Picture(int id,String Type) {
			String sql = "SELECT * from goods_picture where id=? and goods_type =? ";
			List<Map<String, Object>> list_rtn = dbUtil.query(sql, id, Type);
			return list_rtn;
		}

     
}
