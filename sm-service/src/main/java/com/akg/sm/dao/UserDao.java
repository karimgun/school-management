package com.akg.sm.dao;

import com.akg.sm.domain.system.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao  {

    User getUser(String userName);
}
