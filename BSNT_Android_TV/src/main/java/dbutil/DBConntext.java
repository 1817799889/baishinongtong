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
	 * @data id:用户唯一标识(自动生成) username：用户名 password：密码
	 *       state：状态:判定该用户是管理员还是普通用户的状态码，如果为1则标示该用户权限为管理员用户，0为普通用户
	 *       sex：性别
	 *       phone：用户联系方式 
	 *       registerstate:状态:判断该用户是否已经通过了注册审核，0为通过注册审核，1为没有通过注册审核
	 *       companyaddress:公司地址 
	 *       companyname:公司名称 
	 *       trueuseranme:用户真实姓名
	 *       registerdate:通过注册的时间
	 *       loginleftdate：通过登陆时间
	 *       checkdate：通过审核的时间
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
		String sql = "SELECT * from goods_picture where id=? adn goods_type =? ";
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
		String sql = "SELECT * from goods_shoes";
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
}
