package com.cn.bsnt.model;
/**商品图片*/
public class GoodsPicture {
	/**ID*/
	private int id;
	/**商品地址*/
	private String url;
	/**商品ID*/
	private int goodsId;
	/**商品类型*/
	private String goodsType;
	/**是否主图*/
	private String booleanMainPicture;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public String getBooleanMainPicture() {
		return booleanMainPicture;
	}
	public void setBooleanMainPicture(String booleanMainPicture) {
		this.booleanMainPicture = booleanMainPicture;
	}
	public GoodsPicture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsPicture(int id, String url, int goodsId, String goodsType,
			String booleanMainPicture) {
		super();
		this.id = id;
		this.url = url;
		this.goodsId = goodsId;
		this.goodsType = goodsType;
		this.booleanMainPicture = booleanMainPicture;
	}
	
	

}
