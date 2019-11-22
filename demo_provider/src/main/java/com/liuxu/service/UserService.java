package com.liuxu.service;

import com.liuxu.entity.Classs;
import com.liuxu.entity.User;
import com.liuxu.vo.UserVo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {
        Page<User> list(Pageable pageable, UserVo userVo);
        void  deletes(List<User> ids);
        void delete(Integer id);
        List<Classs> findAll();
        User insert(User user);
        Optional<User> selectId(Integer id);
}
