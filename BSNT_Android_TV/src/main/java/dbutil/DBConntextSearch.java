package dbutil;

import java.util.List;
import java.util.Map;

public class DBConntextSearch {
	// �ؼ���Ʒ����������
	// ����ũ����е
	public List<Map<String, Object>> searchGoodsAgriculturesMachinery(
			List<String> list) {
		String sql = "select * from goods_agricultures_machinery WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����ũ����Ʒ
	public List<Map<String, Object>> searchGoodsAgriculturesUseArticles(
			List<String> list) {
		String sql = "select * from goods_agricultures_use_articles WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����ũ�ù���
	public List<Map<String, Object>> searchGoodsAgriculturesUseTools(
			List<String> list) {
		String sql = "select * from goods_agricultures_use_tools WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����ũ������
	public List<Map<String, Object>> searchGoodsAgriculturesUseTricycle(
			List<String> list) {
		String sql = "select * from goods_agricultures_use_tricycle WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����������Ʒ
	public List<Map<String, Object>> searchGoodsAutoAppliance(List<String> list) {
		String sql = "select * from goods_auto_appliance WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ���������׼�
	public List<Map<String, Object>> searchGoodsBoxSpringSuite(List<String> list) {
		String sql = "select * from goods_box_spring_suite WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����Ʒ�Ʋ輸
	public List<Map<String, Object>> searchGoodsBrandEndTable(List<String> list) {
		String sql = "select * from goods_brand_end_table WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �������
	public List<Map<String, Object>> searchGoodsCamera(List<String> list) {
		String sql = "select * from goods_camera WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����������
	public List<Map<String, Object>> searchGoodsCameraMonitored(
			List<String> list) {
		String sql = "select * from goods_camera_monitored WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ��������Ӱ��
	public List<Map<String, Object>> searchGoodsClangMovie(List<String> list) {
		String sql = "select * from goods_clang_movie WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ��������ϴ������þ�
	public List<Map<String, Object>> searchGoodsCleaning(List<String> list) {
		String sql = "select * from goods_cleaning WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ��������
	public List<Map<String, Object>> searchGoodsComputer(List<String> list) {
		String sql = "select * from goods_computer WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ��������
	public List<Map<String, Object>> searchGoodsCostume(List<String> list) {
		String sql = "select * from goods_costume WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����װ�꽨��
	public List<Map<String, Object>> searchGoodsDecorateBuildingmaterials(
			List<String> list) {
		String sql = "select * from goods_decorate_building_materials WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �����������
	public List<Map<String, Object>> searchGoodsDigiyalAccessories(
			List<String> list) {
		String sql = "select * from goods_digiyal_accessories WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �����Ŵ�װ��
	public List<Map<String, Object>> searchGoodsDoorWindows(List<String> list) {
		String sql = "select * from goods_door_windows WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �����������
	public List<Map<String, Object>> searchGoodsEarlyEductionEnlightenment(
			List<String> list) {
		String sql = "select * from goods_early_education_enlightenment WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ������������
	public List<Map<String, Object>> searchGoodsFitnessEquipment(
			List<String> list) {
		String sql = "select * from goods_fitness_equipment WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �������͵�ζ
	public List<Map<String, Object>> searchGoodsGrainOilTaste(List<String> list) {
		String sql = "select * from goods_grain_oil_taste WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �����ӼҰڼ�
	public List<Map<String, Object>> searchGoodsHomeFurnishingArticles(
			List<String> list) {
		String sql = "select * from goods_home_furnishing_articles WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �����ҷ���Ʒ
	public List<Map<String, Object>> searchGoodsHomeTextiles(List<String> list) {
		String sql = "select * from goods_home_textiles WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ��������
	public List<Map<String, Object>> searchGoodsIcebox(List<String> list) {
		String sql = "select * from goods_icebox WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����������Ʒ
	public List<Map<String, Object>> searchGoodsKitchen(List<String> list) {
		String sql = "select * from goods_kitchen WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �������
	public List<Map<String, Object>> searchGoodsLuggage(List<String> list) {
		String sql = "select * from goods_luggage WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����ҽ�Ʊ���
	public List<Map<String, Object>> searchGoodsMedicacare(List<String> list) {
		String sql = "select * from goods_medica_care WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����΢��¯
	public List<Map<String, Object>> searchGoodsMicrowaveOven(List<String> list) {
		String sql = "select * from goods_microwave_oven WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����ţ������
	public List<Map<String, Object>> searchGoodsMilkDrink(List<String> list) {
		String sql = "select * from goods_milk_drink WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �����ֻ�
	public List<Map<String, Object>> searchGoodsMobilePhone(List<String> list) {
		String sql = "select * from goods_mobile_phone WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����ĸӤʳƷ
	public List<Map<String, Object>> searchGoodsMotherBabyFood(List<String> list) {
		String sql = "select * from goods_mother_baby_food WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����ĸӤ��Ʒ
	public List<Map<String, Object>> searchGoodsMotherBabyProduct(
			List<String> list) {
		String sql = "select * from goods_mother_baby_product WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �����̲�����
	public List<Map<String, Object>> searchGoodsNourishingHealth(
			List<String> list) {
		String sql = "select * from goods_nourishing_health WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �����칫�ľ�
	public List<Map<String, Object>> searchGoodsOfficeStationary(
			List<String> list) {
		String sql = "select * from goods_office_stationary WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ������������
	public List<Map<String, Object>> searchGoodsOtherElectricAppliance(
			List<String> list) {
		String sql = "select * from goods_other_electric_appliance WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����������Ʒ
	public List<Map<String, Object>> searchGoodsOutdoorGoods(List<String> list) {
		String sql = "select * from goods_outdoor_goods WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �����緹��
	public List<Map<String, Object>> searchGoodsRiceCooker(List<String> list) {
		String sql = "select * from goods_rice_cooker WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����Ьѥ
	public List<Map<String, Object>> searchGoodsShoes(List<String> list) {
		String sql = "select * from goods_shoes WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ���������豸
	public List<Map<String, Object>> searchGoodsSmartDevice(List<String> list) {
		String sql = "select * from goods_smart_device WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����������ʳ
	public List<Map<String, Object>> searchGoodsSnack(List<String> list) {
		String sql = "select * from goods_snack WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����������Ʒ
	public List<Map<String, Object>> searchGoodsSportGoods(List<String> list) {
		String sql = "select * from goods_sport_goods WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ������Ʒ����
	public List<Map<String, Object>> searchGoodsTea(List<String> list) {
		String sql = "select * from goods_tea WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ��������׾�
	public List<Map<String, Object>> searchGoodsTeaWine(List<String> list) {
		String sql = "select * from goods_tea_wine WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ��������
	public List<Map<String, Object>> searchGoodsTv(List<String> list) {
		String sql = "select * from goods_tv WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ������Ƶ����
	public List<Map<String, Object>> searchGoodsVideoPlayOrgan(List<String> list) {
		String sql = "select * from goods_video_play_organ WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����ϴ�»�
	public List<Map<String, Object>> searchGoodsWasher(List<String> list) {
		String sql = "select * from goods_washer WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ������ˮ��
	public List<Map<String, Object>> searchGoodsWaterFountain(List<String> list) {
		String sql = "select * from goods_water_fountain WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ������Ʒ����
	public List<Map<String, Object>> searchGoodsWine(List<String> list) {
		String sql = "select * from goods_wine WHERE NAME LIKE'%?%'";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}
	
	/**
	 * ����ͼƬ
	 */
	public List<Map<String, Object>> PictureType(List<String> list) {
		String sql = "SELECT * from goods_picture where  goods_type =?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

}
