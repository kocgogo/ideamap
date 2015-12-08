package com.mycom.d3.biz;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mycom.d3.dao.Dao;

@Service("MemberBiz")
public class MemberBiz implements Biz {
	@Autowired	
	@Qualifier("MemberDao")
	Dao dao;
	
	@Override
	public void register(Object obj) {		
		dao.insert(obj);

	}

	@Override
	public Object get(Object obj) {		
		return dao.select(obj);
	}

	@Override
	public void remove(Object obj) {
		dao.delete(obj);		
	}

	@Override
	public void modify(Object obj) {
		dao.update(obj);		
	}

	@Override
	public ArrayList<Object> getAll() {
		return (ArrayList<Object>) dao.select();
	}
	
	@Override
	public Object getCorrect(Object obj) {		
		return dao.selectCorrect(obj);
	}	

	@Override
	public ArrayList<Object> getCode(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ArrayList<Object> getHome(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getIdBoards(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getTitleBoards(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getContentsBoards(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getID(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPWD(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getCate(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getD() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getT() {
		// TODO Auto-generated method stub
		return null;
	}
}
