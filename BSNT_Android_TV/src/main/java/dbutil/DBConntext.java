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
	 * 登陆
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
	 * 注册
	 * 
	 * @data id:用户唯一标识(自动生成) username：用户名 password：密码
	 *       state：状态:判定该用户是管理员还是普通用户的状态码，如果为1则标示该用户权限为管理员用户，0为普通用户 sex：性别
	 *       phone：用户联系方式 registerstate:状态:判断该用户是否已经通过了注册审核，0为通过注册审核，1为没有通过注册审核
	 *       companyaddress:公司地址 companyname:公司名称 trueuseranme:用户真实姓名
	 *       registerdate:通过注册的时间 loginleftdate：通过登陆时间 checkdate：通过审核的时间
	 *       operationdate： 最后操作时间
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
	 * 修改登录时间
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
	 * 注册判定用户名是否重复
	 */
	public List<Map<String, Object>> RegisterJudge(String name) {
		String sql = "SELECT USERNAME FROM TAB_USER WHERE USERNAME =?";
		List<String> params = new ArrayList<String>();
		params.add(name);
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, params);
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

	/**
	 * 图片
	 */
	public List<Map<String, Object>> Picture(List<String> list) {
		String sql = "SELECT * from goods_picture where id=? and goods_type =? ";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	/**
	 * 酒品佳酿（查询）
	 */
	public List<Map<String, Object>> goodsWine() {
		String sql = "SELECT * from goods_wine";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 饮水机（查询）
	 */
	public List<Map<String, Object>> goodsWaterFountain() {
		String sql = "SELECT * from goods_water_fountain";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 洗衣机（查询）
	 */
	public List<Map<String, Object>> goodsWasher() {
		String sql = "SELECT * from goods_washer";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;

	}

	/**
	 * 视频（查询）
	 */
	public List<Map<String, Object>> goodsVideoPlayOrgan() {
		String sql = "SELECT * from goods_video_play_organ";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 电视（查询）
	 */
	public List<Map<String, Object>> goodsTv() {
		String sql = "SELECT * from goods_tv";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 茶酒套具（查询）
	 */
	public List<Map<String, Object>> goodsTeaWine() {
		String sql = "SELECT * from goods_tea_wine";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 精品名茶（查询）
	 */
	public List<Map<String, Object>> goodsTea() {
		String sql = "SELECT * from goods_tea";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 体育用品（查询）
	 */

	public List<Map<String, Object>> goodsSportGoods() {
		String sql = "SELECT * from goods_sport_goods";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 零食（查询）
	 */
	public List<Map<String, Object>> goodsSnack() {
		String sql = "SELECT * from goods_snack";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 智能设备（查询）
	 */
	public List<Map<String, Object>> goodsSmartDevice() {
		String sql = "SELECT * from goods_smart_device";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 鞋靴（查询）
	 */
	public List<Map<String, Object>> goodsShoes() {
		String sql = "SELECT * from goods_shoes";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 电饭煲（查询）
	 */
	public List<Map<String, Object>> goodsRiceCooker() {
		String sql = "SELECT * from goods_rice_cooker";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 户外用品（查询）
	 */
	public List<Map<String, Object>> goodsOutdoorGoods() {
		String sql = "SELECT * from goods_outdoor_goods";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 其他电器（查询）
	 */
	public List<Map<String, Object>> goodsOtherElectricAppliance() {
		String sql = "SELECT * from goods_other_electric_appliance";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	/**
	 * 其他电器（查询）
	 */
	public List<Map<String, Object>> goodsOfficeStationary() {
		String sql = "SELECT * from goods_office_stationary";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 查询农资机械
	public List<Map<String, Object>> queryMachinery() {
		String sql = "select * from goods_agricultures_machinery";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 查询所有图片
	public List<Map<String, Object>> queryPicture(List<String> list) {
		String sql = "select * from goods_picture where goods_type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 种子化肥
	public List<Map<String, Object>> queryUseArticles() {
		String sql = "select * from goods_agricultures_use_articles";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 农耕用具
	public List<Map<String, Object>> queryUseTools() {
		String sql = "select * from goods_agricultures_use_tools";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 农用三轮
	public List<Map<String, Object>> queryUseTricycle() {
		String sql = "select * from goods_agricultures_use_tricycle";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 汽车用品
	public List<Map<String, Object>> queryAutoAppliance() {
		String sql = "select * from goods_auto_appliance";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 床柜沙发
	public List<Map<String, Object>> queryBoxSpringSuite() {
		String sql = "select * from goods_box_spring_suite";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 桌椅茶几
	public List<Map<String, Object>> queryBrandEndTable() {
		String sql = "select * from goods_brand_end_table";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 相机DV
	public List<Map<String, Object>> queryCamera() {
		String sql = "select * from goods_camera";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 摄像监控
	public List<Map<String, Object>> queryCameraMonitored() {
		String sql = "select * from goods_camera_monitored";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 音响影视
	public List<Map<String, Object>> queryClangMovie() {
		String sql = "select * from goods_clang_movie";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 个人洗护
	public List<Map<String, Object>> queryCleaning(List<String> list) {
		String sql = "select * from goods_cleaning where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 电脑平板
	public List<Map<String, Object>> queryComputer() {
		String sql = "select * from goods_computer";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 母婴服饰
	public List<Map<String, Object>> queryCostume(List<String> list) {
		String sql = "select * from goods_costume where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 装潢建材
	public List<Map<String, Object>> queryBuildingMaterials() {
		String sql = "select * from goods_decorate_building_materials";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 电脑配件
	public List<Map<String, Object>> queryDigiyalAccessories(List<String> list) {
		String sql = "select * from goods_digiyal_accessories where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 门窗装饰
	public List<Map<String, Object>> queryDoorWindows() {
		String sql = "select * from goods_door_windows";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 早教启蒙
	public List<Map<String, Object>> queryEducationEnlightenment() {
		String sql = "select * from goods_early_education_enlightenment";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 健身器材
	public List<Map<String, Object>> queryFitnessEquipment() {
		String sql = "select * from goods_fitness_equipment";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 粮油调味
	public List<Map<String, Object>> queryGrainOilTaste() {
		String sql = "select * from goods_grain_oil_taste";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 居家摆设
	public List<Map<String, Object>> queryHomeFurnishingArticles() {
		String sql = "select * from goods_home_furnishing_articles";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 家纺用品
	public List<Map<String, Object>> queryHomeTextiles(List<String> list) {
		String sql = "select * from goods_home_textiles where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 冰箱冰柜
	public List<Map<String, Object>> queryIcebox() {
		String sql = "select * from goods_icebox";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 厨房餐具
	public List<Map<String, Object>> queryKitchen(List<String> list) {
		String sql = "select * from goods_kitchen where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 休闲箱包
	public List<Map<String, Object>> queryLuggage(List<String> list) {
		String sql = "select * from goods_luggage where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 血压仪器
	public List<Map<String, Object>> queryMedicacare(List<String> list) {
		String sql = "select * from goods_medica_care where type=?";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql, list);
		return list_rtn;
	}

	// 微波炉具
	public List<Map<String, Object>> queryMicrowaveOven() {
		String sql = "select * from goods_microwave_oven";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 牛奶饮品
	public List<Map<String, Object>> queryMilkDrink() {
		String sql = "select * from goods_milk_drink";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 母婴用品
	public List<Map<String, Object>> goodsMotherBabyProduct() {
		String sql = "select * from goods_mother_baby_product";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}
	
	// 母婴食品
	public List<Map<String, Object>> goodsMotherBabyFood() {
		String sql = "select * from goods_mother_baby_food";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 滋补养生
	public List<Map<String, Object>> goodsNourishingHealth() {
		String sql = "select * from goods_nourishing_health";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 办公文具
	public List<Map<String, Object>> queryOfficeStationary() {
		String sql = "select * from goods_office_stationary";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}

	// 手机IPAD
	public List<Map<String, Object>> goodsMobilePhone() {
		String sql = "select * from goods_mobile_phone";
		List<Map<String, Object>> list_rtn = dbUtil.query(sql);
		return list_rtn;
	}
	
	//特价商品和搜索功能
	// 手机IPAD
		public List<Map<String, Object>> selectGoodsMobilePhone(List<String> list) {
			String sql = "select * from goods_mobile_phone WHERE NAME LIKE'%?%'";
			List<Map<String, Object>> list_rtn = dbUtil.query(sql,list);
			return list_rtn;
		}
	
}
