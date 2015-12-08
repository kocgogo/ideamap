package com.mycom.d3.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

@Repository("MemberDao")
public class MemberDao implements Dao {

	@Autowired
	SqlMapClientTemplate sql;

	@Override
	public void insert(Object obj) {
		Object result = sql.insert("Member.insertMember", obj);
	}

	@Override
	public Object select(Object obj) {
		return sql.queryForObject("Member.selectMember", obj);
	}

	@Override
	public void delete(Object obj) {
		Object result = sql.delete("Member.deleteMember", obj);

	}

	@Override
	public void update(Object obj) {
		Object result = sql.update("Member.updateMember", obj);

	}

	@Override
	public List<Object> select() {
		return sql.queryForList("Member.selectMembers");
	}

	@Override
	public Object selectCorrect(Object obj) {
		return sql.queryForObject("Member.selectMemberCorrect", obj);
	}
	
	@Override
	public List<Object> selectCode(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> selectBoardHome(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> selectIdBoards(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> selectTitleBoards(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> selectContentsBoards(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> selectCate(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> selectA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> selectD() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> selectT() {
		// TODO Auto-generated method stub
		return null;
	}
}
