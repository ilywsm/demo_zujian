package com.liuxu.service;

import com.liuxu.dao.ClasssMapper;
import com.liuxu.dao.UserMapper;
import com.liuxu.entity.Classs;
import com.liuxu.entity.User;
import com.liuxu.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ClasssMapper classsMapper;
    @Override
    public Page<User> list(Pageable pageable, UserVo userVo) {
        Specification spec = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder cd) {
                List<Predicate> list=new ArrayList<>();
                if(userVo.getSid()!=null)
                {
                    Predicate p1=cd.equal(root.get("id"),userVo.getSid());
                    list.add(p1);
                }
                if(userVo.getSname()!=null)
                {
                    Predicate p2=cd.like(root.get("name"),"%"+userVo.getSname()+"%");
                    list.add(p2);
                }
                if(userVo.getCl()!=null)
                {
                    Predicate p3=cd.equal(root.get("classs").get("id"),userVo.getCl());
                    list.add(p3);
                }
                if(userVo.getAge()!=null)
                {
                    Predicate p4=cd.equal(root.get("age"),userVo.getAge());
                    list.add(p4);
                }
                if(userVo.getStartDate()!=null)
                {
                    Predicate p5=cd.greaterThanOrEqualTo(root.get("birthday"),userVo.getStartDate());
                    list.add(p5);
                }
                if(userVo.getEndDate()!=null)
                {
                    Predicate p6=cd.lessThanOrEqualTo(root.get("birthday"),userVo.getEndDate());
                    list.add(p6);
                }
                Predicate Pr = cd.and(list.toArray(new Predicate[list.size()]));
                return Pr;
            }
        };

        return userMapper.findAll(spec, pageable);
    }

    @Override
    public void deletes(List<User> ids) {
        userMapper.deleteAll(ids);
    }

    @Override
    public void delete(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public List<Classs> findAll() {
        return classsMapper.findAll();
    }

    @Override
    public User insert(User user) {
        if(user.getId()==null) {
            return userMapper.save(user);
        }
        return  userMapper.save(user);

    }

    @Override
    public Optional<User> selectId(Integer id) {
        return userMapper.findById(id);
    }
}
