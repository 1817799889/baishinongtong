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
	 * @data id:�û�Ψһ��ʶ(�Զ�����) username���û��� password������
	 *       state��״̬:�ж����û��ǹ���Ա������ͨ�û���״̬�룬���Ϊ1���ʾ���û�Ȩ��Ϊ����Ա�û���0Ϊ��ͨ�û�
	 *       sex���Ա�
	 *       phone���û���ϵ��ʽ 
	 *       registerstate:״̬:�жϸ��û��Ƿ��Ѿ�ͨ����ע����ˣ�0Ϊͨ��ע����ˣ�1Ϊû��ͨ��ע�����
	 *       companyaddress:��˾��ַ 
	 *       companyname:��˾���� 
	 *       trueuseranme:�û���ʵ����
	 *       registerdate:ͨ��ע���ʱ��
	 *       loginleftdate��ͨ����½ʱ��
	 *       checkdate��ͨ����˵�ʱ��
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
		String sql = "SELECT * from goods_picture where id=? adn goods_type =? ";
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
		String sql = "SELECT * from goods_shoes";
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
}
