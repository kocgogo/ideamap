package com.mycom.d3.dao;

import java.util.List;

public interface Dao {
	public void insert(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public Object select(Object obj);
	public List<Object> select();
	public List<Object> selectCate(Object obj);
	public List<Object> selectCode(Object obj);
	public Object selectCorrect(Object obj);
	public List<Object> selectBoardHome(Object obj);
	public List<Object> selectIdBoards(Object obj);
	public List<Object> selectTitleBoards(Object obj);
	public List<Object> selectContentsBoards(Object obj);
	public List<Object> selectA();
	public List<Object> selectD();
	public List<Object> selectT();
	
}
