package dbutil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author pc
 * @date 2015.8.20
 */
public class DBConntext {
	/**
	 * ��½
	 * 
	 * @param name
	 * @return
	 */
	public List<Map<String, Object>> login(String name) {
		String sql = "SELECT USERNAME,PASSWORD FROM TAB_USER WHERE USERNAME =?";
		List<String> params = new ArrayList<String>();
		params.add(name);
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, params);
		System.out.println(list_rtn);
		return list_rtn;
	}

	/***
	 * ע��
	 * 
	 * @data id:�û�Ψһ��ʶ(�Զ�����) username���û��� password������
	 *       state��״̬:�ж����û��ǹ���Ա������ͨ�û���״̬�룬���Ϊ1���ʾ���û�Ȩ��Ϊ����Ա�û���0Ϊ��ͨ�û� sex���Ա�
	 *       phone���û���ϵ��ʽ registerstate:״̬:�жϸ��û��Ƿ��Ѿ�ͨ����ע����ˣ�0Ϊͨ��ע����ˣ�1Ϊû��ͨ��ע�����
	 *       companyaddress:��˾��ַ companyname:��˾���� trueuseranme:�û���ʵ����
	 *       registerdate:ͨ��ע���ʱ�� loginleftdate��ͨ����½ʱ�� checkdate��ͨ����˵�ʱ��
	 *       operationdate�� ������ʱ��
	 */
	public int Register(String id, String username, String password,
			String state, String sex, String phone, String registerstate,
			String Companyaddress, String Companyname, String Trueusername,
			String registerdate, String loginleftdate, String checkdate,
			String operationdate) {
		String sql = "INSERT INTO TAB_USER(ID,USERNAME,PASSWORD,STATE,SEX,PHONE,REGISTERSTATE,COMPANYADDRESS,COMPANYNAME,TRUEUSERNAME,REGISTERDATE,LOGINLEFTDATE,CHECKDATE,OPERATIONDATE) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		List<String> list = new ArrayList<String>();

		list.add(0, id);
		list.add(1, username);
		list.add(2, password);
		list.add(3, state);
		list.add(4, sex);
		list.add(5, phone);
		list.add(6, registerstate);
		list.add(7, Companyaddress);
		list.add(8, Companyname);
		list.add(9, Trueusername);
		list.add(10, registerdate);
		list.add(11, loginleftdate);
		list.add(12, checkdate);
		list.add(13, operationdate);

		int result = dbUtil.insert(sql, list);
		return result;
	}

	/**
	 * �޸ĵ�¼ʱ��
	 */
	public int update(String loginleftdata, String username) {
		String sql = "UPDATE TAB_USER SET LOGINLEFTDATE=? WHERE USERNAME=?";
		List<String> list = new ArrayList<String>();
		list.add(0, loginleftdata);
		list.add(1, username);
		int result = dbUtil.update(sql, list);
		return result;
	}

	/**
	 * ע���ж��û����Ƿ��ظ�
	 */
	public List<Map<String, Object>> RegisterJudge(String name) {
		String sql = "SELECT USERNAME FROM TAB_USER WHERE USERNAME =?";
		List<String> params = new ArrayList<String>();
		params.add(name);
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, params);
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

	/**
	 * ͼƬ
	 */
	public List<Map<String, Object>> Picture(List<String> list) {
		String sql = "SELECT * from goods_picture where id=? and goods_type =? ";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	/**
	 * ��Ʒ���𣨲�ѯ��
	 */
	public List<Map<String, Object>> goodsWine() {
		String sql = "SELECT * from goods_wine";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * ��ˮ������ѯ��
	 */
	public List<Map<String, Object>> goodsWaterFountain() {
		String sql = "SELECT * from goods_water_fountain";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * ϴ�»�����ѯ��
	 */
	public List<Map<String, Object>> goodsWasher() {
		String sql = "SELECT * from goods_washer";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;

	}

	/**
	 * ��Ƶ����ѯ��
	 */
	public List<Map<String, Object>> goodsVideoPlayOrgan() {
		String sql = "SELECT * from goods_video_play_organ";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * ���ӣ���ѯ��
	 */
	public List<Map<String, Object>> goodsTv() {
		String sql = "SELECT * from goods_tv";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * ����׾ߣ���ѯ��
	 */
	public List<Map<String, Object>> goodsTeaWine() {
		String sql = "SELECT * from goods_tea_wine";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * ��Ʒ���裨��ѯ��
	 */
	public List<Map<String, Object>> goodsTea() {
		String sql = "SELECT * from goods_tea";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * ������Ʒ����ѯ��
	 */

	public List<Map<String, Object>> goodsSportGoods() {
		String sql = "SELECT * from goods_sport_goods";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * ��ʳ����ѯ��
	 */
	public List<Map<String, Object>> goodsSnack() {
		String sql = "SELECT * from goods_snack";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * �����豸����ѯ��
	 */
	public List<Map<String, Object>> goodsSmartDevice() {
		String sql = "SELECT * from goods_smart_device";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * Ьѥ����ѯ��
	 */
	public List<Map<String, Object>> goodsShoes() {
		String sql = "SELECT * from goods_shoes";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * �緹�ң���ѯ��
	 */
	public List<Map<String, Object>> goodsRiceCooker() {
		String sql = "SELECT * from goods_rice_cooker";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * ������Ʒ����ѯ��
	 */
	public List<Map<String, Object>> goodsOutdoorGoods() {
		String sql = "SELECT * from goods_outdoor_goods";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * ������������ѯ��
	 */
	public List<Map<String, Object>> goodsOtherElectricAppliance() {
		String sql = "SELECT * from goods_other_electric_appliance";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * ������������ѯ��
	 */
	public List<Map<String, Object>> goodsOfficeStationary() {
		String sql = "SELECT * from goods_office_stationary";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ��ѯũ�ʻ�е
	public List<Map<String, Object>> queryMachinery() {
		String sql = "select * from goods_agricultures_machinery";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ��ѯ����ͼƬ
	public List<Map<String, Object>> queryPicture(List<String> list) {
		String sql = "select * from goods_picture where goods_type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ���ӻ���
	public List<Map<String, Object>> queryUseArticles() {
		String sql = "select * from goods_agricultures_use_articles";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ũ���þ�
	public List<Map<String, Object>> queryUseTools() {
		String sql = "select * from goods_agricultures_use_tools";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ũ������
	public List<Map<String, Object>> queryUseTricycle() {
		String sql = "select * from goods_agricultures_use_tricycle";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ������Ʒ
	public List<Map<String, Object>> queryAutoAppliance() {
		String sql = "select * from goods_auto_appliance";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ����ɳ��
	public List<Map<String, Object>> queryBoxSpringSuite() {
		String sql = "select * from goods_box_spring_suite";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ���β輸
	public List<Map<String, Object>> queryBrandEndTable() {
		String sql = "select * from goods_brand_end_table";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ���DV
	public List<Map<String, Object>> queryCamera() {
		String sql = "select * from goods_camera";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ������
	public List<Map<String, Object>> queryCameraMonitored() {
		String sql = "select * from goods_camera_monitored";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ����Ӱ��
	public List<Map<String, Object>> queryClangMovie() {
		String sql = "select * from goods_clang_movie";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ����ϴ��
	public List<Map<String, Object>> queryCleaning(List<String> list) {
		String sql = "select * from goods_cleaning where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ����ƽ��
	public List<Map<String, Object>> queryComputer() {
		String sql = "select * from goods_computer";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ĸӤ����
	public List<Map<String, Object>> queryCostume(List<String> list) {
		String sql = "select * from goods_costume where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// װ�꽨��
	public List<Map<String, Object>> queryBuildingMaterials() {
		String sql = "select * from goods_decorate_building_materials";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// �������
	public List<Map<String, Object>> queryDigiyalAccessories(List<String> list) {
		String sql = "select * from goods_digiyal_accessories where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �Ŵ�װ��
	public List<Map<String, Object>> queryDoorWindows() {
		String sql = "select * from goods_door_windows";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// �������
	public List<Map<String, Object>> queryEducationEnlightenment() {
		String sql = "select * from goods_early_education_enlightenment";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ��������
	public List<Map<String, Object>> queryFitnessEquipment() {
		String sql = "select * from goods_fitness_equipment";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ���͵�ζ
	public List<Map<String, Object>> queryGrainOilTaste() {
		String sql = "select * from goods_grain_oil_taste";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// �ӼҰ���
	public List<Map<String, Object>> queryHomeFurnishingArticles() {
		String sql = "select * from goods_home_furnishing_articles";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// �ҷ���Ʒ
	public List<Map<String, Object>> queryHomeTextiles(List<String> list) {
		String sql = "select * from goods_home_textiles where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �������
	public List<Map<String, Object>> queryIcebox() {
		String sql = "select * from goods_icebox";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// �����;�
	public List<Map<String, Object>> queryKitchen(List<String> list) {
		String sql = "select * from goods_kitchen where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// �������
	public List<Map<String, Object>> queryLuggage(List<String> list) {
		String sql = "select * from goods_luggage where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// Ѫѹ����
	public List<Map<String, Object>> queryMedicacare(List<String> list) {
		String sql = "select * from goods_medica_care where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// ΢��¯��
	public List<Map<String, Object>> queryMicrowaveOven() {
		String sql = "select * from goods_microwave_oven";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ţ����Ʒ
	public List<Map<String, Object>> queryMilkDrink() {
		String sql = "select * from goods_milk_drink";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// ĸӤ��Ʒ
	public List<Map<String, Object>> goodsMotherBabyProduct() {
		String sql = "select * from goods_mother_baby_product";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}
	
	// ĸӤʳƷ
	public List<Map<String, Object>> goodsMotherBabyFood() {
		String sql = "select * from goods_mother_baby_food";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// �̲�����
	public List<Map<String, Object>> goodsNourishingHealth() {
		String sql = "select * from goods_nourishing_health";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// �칫�ľ�
	public List<Map<String, Object>> queryOfficeStationary() {
		String sql = "select * from goods_office_stationary";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// �ֻ�IPAD
	public List<Map<String, Object>> goodsMobilePhone() {
		String sql = "select * from goods_mobile_phone";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}
	
	//�ؼ���Ʒ����������
	// �ֻ�IPAD
		public List<Map<String, Object>> selectGoodsMobilePhone(List<String> list) {
			String sql = "select * from goods_mobile_phone WHERE NAME LIKE'%?%'";
			List<Map<String, Object>> list_rtn = dbUtil.query(sql,list);
			return list_rtn;
		}
	
}
