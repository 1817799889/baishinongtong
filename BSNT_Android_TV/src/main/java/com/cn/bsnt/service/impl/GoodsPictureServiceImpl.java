package com.cn.bsnt.service.impl;

import java.util.List;

import com.cn.bsnt.dao.impl.GoodsPictureDAOImpl;
import com.cn.bsnt.model.GoodsPicture;
import com.cn.bsnt.service.GoodsPictureService;

public class GoodsPictureServiceImpl implements GoodsPictureService{
	GoodsPictureDAOImpl gpdi = new GoodsPictureDAOImpl();

	public List<GoodsPicture> selectByGoodsType(String GoodsType)
			throws Exception {
		// TODO Auto-generated method stub
		return gpdi.selectByGoodsType(GoodsType);
	}

	public List<GoodsPicture> selectByGoodsIdAndGoodsType(int goodsId,
			String GoodsType) throws Exception {
		// TODO Auto-generated method stub
		return gpdi.selectByGoodsIdAndGoodsType(goodsId, GoodsType);
	}

}
