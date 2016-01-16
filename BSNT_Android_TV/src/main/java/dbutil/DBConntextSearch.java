package dbutil;

import java.util.List;
import java.util.Map;

public class DBConntextSearch {
	// 特价商品和搜索功能
	// 搜索农耕机械
	public List<Map<String, Object>> searchGoodsAgriculturesMachinery(
			List<String> list) {
		String sql = "select * from goods_agricultures_machinery WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索农资用品
	public List<Map<String, Object>> searchGoodsAgriculturesUseArticles(
			List<String> list) {
		String sql = "select * from goods_agricultures_use_articles WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索农用工具
	public List<Map<String, Object>> searchGoodsAgriculturesUseTools(
			List<String> list) {
		String sql = "select * from goods_agricultures_use_tools WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索农用三轮
	public List<Map<String, Object>> searchGoodsAgriculturesUseTricycle(
			List<String> list) {
		String sql = "select * from goods_agricultures_use_tricycle WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索汽车用品
	public List<Map<String, Object>> searchGoodsAutoAppliance(List<String> list) {
		String sql = "select * from goods_auto_appliance WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索床柜套件
	public List<Map<String, Object>> searchGoodsBoxSpringSuite(List<String> list) {
		String sql = "select * from goods_box_spring_suite WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索品牌茶几
	public List<Map<String, Object>> searchGoodsBrandEndTable(List<String> list) {
		String sql = "select * from goods_brand_end_table WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索相机
	public List<Map<String, Object>> searchGoodsCamera(List<String> list) {
		String sql = "select * from goods_camera WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索摄像监控
	public List<Map<String, Object>> searchGoodsCameraMonitored(
			List<String> list) {
		String sql = "select * from goods_camera_monitored WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索音响影视
	public List<Map<String, Object>> searchGoodsClangMovie(List<String> list) {
		String sql = "select * from goods_clang_movie WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索个人洗护清洁用具
	public List<Map<String, Object>> searchGoodsCleaning(List<String> list) {
		String sql = "select * from goods_cleaning WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索电脑
	public List<Map<String, Object>> searchGoodsComputer(List<String> list) {
		String sql = "select * from goods_computer WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索服饰
	public List<Map<String, Object>> searchGoodsCostume(List<String> list) {
		String sql = "select * from goods_costume WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索装潢建材
	public List<Map<String, Object>> searchGoodsDecorateBuildingmaterials(
			List<String> list) {
		String sql = "select * from goods_decorate_building_materials WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索数码配件
	public List<Map<String, Object>> searchGoodsDigiyalAccessories(
			List<String> list) {
		String sql = "select * from goods_digiyal_accessories WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索门窗装饰
	public List<Map<String, Object>> searchGoodsDoorWindows(List<String> list) {
		String sql = "select * from goods_door_windows WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索早教启蒙
	public List<Map<String, Object>> searchGoodsEarlyEductionEnlightenment(
			List<String> list) {
		String sql = "select * from goods_early_education_enlightenment WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索健身器材
	public List<Map<String, Object>> searchGoodsFitnessEquipment(
			List<String> list) {
		String sql = "select * from goods_fitness_equipment WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索粮油调味
	public List<Map<String, Object>> searchGoodsGrainOilTaste(List<String> list) {
		String sql = "select * from goods_grain_oil_taste WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索居家摆件
	public List<Map<String, Object>> searchGoodsHomeFurnishingArticles(
			List<String> list) {
		String sql = "select * from goods_home_furnishing_articles WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索家纺用品
	public List<Map<String, Object>> searchGoodsHomeTextiles(List<String> list) {
		String sql = "select * from goods_home_textiles WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索冰箱
	public List<Map<String, Object>> searchGoodsIcebox(List<String> list) {
		String sql = "select * from goods_icebox WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索厨房用品
	public List<Map<String, Object>> searchGoodsKitchen(List<String> list) {
		String sql = "select * from goods_kitchen WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索箱包
	public List<Map<String, Object>> searchGoodsLuggage(List<String> list) {
		String sql = "select * from goods_luggage WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索医疗保健
	public List<Map<String, Object>> searchGoodsMedicacare(List<String> list) {
		String sql = "select * from goods_medica_care WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索微波炉
	public List<Map<String, Object>> searchGoodsMicrowaveOven(List<String> list) {
		String sql = "select * from goods_microwave_oven WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索牛奶饮料
	public List<Map<String, Object>> searchGoodsMilkDrink(List<String> list) {
		String sql = "select * from goods_milk_drink WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索手机
	public List<Map<String, Object>> searchGoodsMobilePhone(List<String> list) {
		String sql = "select * from goods_mobile_phone WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索母婴食品
	public List<Map<String, Object>> searchGoodsMotherBabyFood(List<String> list) {
		String sql = "select * from goods_mother_baby_food WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索母婴用品
	public List<Map<String, Object>> searchGoodsMotherBabyProduct(
			List<String> list) {
		String sql = "select * from goods_mother_baby_product WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索滋补养生
	public List<Map<String, Object>> searchGoodsNourishingHealth(
			List<String> list) {
		String sql = "select * from goods_nourishing_health WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索办公文具
	public List<Map<String, Object>> searchGoodsOfficeStationary(
			List<String> list) {
		String sql = "select * from goods_office_stationary WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索其他电器
	public List<Map<String, Object>> searchGoodsOtherElectricAppliance(
			List<String> list) {
		String sql = "select * from goods_other_electric_appliance WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索户外用品
	public List<Map<String, Object>> searchGoodsOutdoorGoods(List<String> list) {
		String sql = "select * from goods_outdoor_goods WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索电饭煲
	public List<Map<String, Object>> searchGoodsRiceCooker(List<String> list) {
		String sql = "select * from goods_rice_cooker WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索鞋靴
	public List<Map<String, Object>> searchGoodsShoes(List<String> list) {
		String sql = "select * from goods_shoes WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索智能设备
	public List<Map<String, Object>> searchGoodsSmartDevice(List<String> list) {
		String sql = "select * from goods_smart_device WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索休闲零食
	public List<Map<String, Object>> searchGoodsSnack(List<String> list) {
		String sql = "select * from goods_snack WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索体育用品
	public List<Map<String, Object>> searchGoodsSportGoods(List<String> list) {
		String sql = "select * from goods_sport_goods WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索精品茗茶
	public List<Map<String, Object>> searchGoodsTea(List<String> list) {
		String sql = "select * from goods_tea WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索茶酒套具
	public List<Map<String, Object>> searchGoodsTeaWine(List<String> list) {
		String sql = "select * from goods_tea_wine WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索电视
	public List<Map<String, Object>> searchGoodsTv(List<String> list) {
		String sql = "select * from goods_tv WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索视频播放
	public List<Map<String, Object>> searchGoodsVideoPlayOrgan(List<String> list) {
		String sql = "select * from goods_video_play_organ WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索洗衣机
	public List<Map<String, Object>> searchGoodsWasher(List<String> list) {
		String sql = "select * from goods_washer WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索饮水机
	public List<Map<String, Object>> searchGoodsWaterFountain(List<String> list) {
		String sql = "select * from goods_water_fountain WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 搜索酒品佳酿
	public List<Map<String, Object>> searchGoodsWine(List<String> list) {
		String sql = "select * from goods_wine WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}
	
	/**
	 * 类型图片
	 */
	public List<Map<String, Object>> PictureType(List<String> list) {
		String sql = "SELECT * from goods_picture where  goods_type =?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

}
