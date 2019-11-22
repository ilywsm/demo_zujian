package com.liuxu.dao;

import com.liuxu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserMapper extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
}
