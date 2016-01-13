package com.cn.bsnt.service;

import java.util.List;

import com.cn.bsnt.model.GoodsPicture;

public interface GoodsPictureService {
	public List<GoodsPicture> selectByGoodsType(String GoodsType) throws Exception;
	public List<GoodsPicture> selectByGoodsIdAndGoodsType(int goodsId,String GoodsType) throws Exception;
	

}
