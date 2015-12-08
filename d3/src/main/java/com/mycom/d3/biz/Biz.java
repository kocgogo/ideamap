package com.mycom.d3.biz;

import java.util.ArrayList;


public interface Biz {
	public void register(Object obj);
	public void remove(Object obj);
	public void modify(Object obj);
	public Object get(Object obj);
	public ArrayList<Object> getAll();
	public ArrayList<Object> getCate(Object obj);
	public ArrayList<Object> getCode(Object obj);
	public Object getCorrect(Object obj);
	public ArrayList<Object> getHome(Object obj);
	public ArrayList<Object> getIdBoards(Object obj);
	public ArrayList<Object> getTitleBoards(Object obj);
	public ArrayList<Object> getContentsBoards(Object obj);
	public Object getID(Object obj);
	public Object getPWD(Object obj);
	public ArrayList<Object> getA();
	public ArrayList<Object> getD();
	public ArrayList<Object> getT();
}
