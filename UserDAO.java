package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.bookstore.entity.Users;

public class UserDAO extends JpaDAO<Users> implements GenericDAO<Users> {

	public UserDAO(EntityManager entityManger) {
		super(entityManger);
	}
	public Users create(Users user) {
		return super.create(user);
	}

	public Users update(Users user) {
		return super.update(user);
	}
	
	@Override
	public Users get(Object userid) {
		return super.find(Users.class, userid);
	}

	@Override
	public void delete(Object userId) {
		super.delete(Users.class , userId);
		
	}

	@Override
	public List<Users> listAll() {
		
		return super.findWithNamedQuery("Users.findAll");
	}

	@Override
	public long count() {
		
		return super.countWithNamedQuery("Users.countAll");
	}

	
}
