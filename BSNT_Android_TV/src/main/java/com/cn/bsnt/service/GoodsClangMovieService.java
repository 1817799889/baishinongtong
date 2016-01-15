package com.cn.bsnt.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.cn.bsnt.model.GoodsClangMovie;

public interface GoodsClangMovieService {
      public List<Map<String,Object>> selectAll() throws SQLException;
}
