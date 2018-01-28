package com.akg.sm.dao.impl;

import com.akg.sm.dao.UserDao;
import com.akg.sm.domain.system.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public User getUser(String userName) {
        String hql = "from User where userName = '" + userName + "'";
        TypedQuery<User> from_user = entityManager.createQuery(hql, User.class);
        return (User) from_user.getSingleResult();
    }
}
