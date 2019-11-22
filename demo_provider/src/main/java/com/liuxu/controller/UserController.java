package com.liuxu.controller;

import com.liuxu.entity.Classs;
import com.liuxu.entity.User;
import com.liuxu.service.UserService;
import com.liuxu.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    public Page<User> list(@RequestParam(defaultValue = "1")Integer pageNo, UserVo userVo){
        return userService.list(PageRequest.of(pageNo-1,3),userVo);
    }
    @RequestMapping("/deletes")
    public void deletes(@RequestBody List<User> ids){
        userService.deletes(ids);
    }
    @RequestMapping("/delete")
    public void delete(Integer id){
        userService.delete(id);
    }
    @RequestMapping("classList")
    public List<Classs> list(){
        return userService.findAll();
    }
    @RequestMapping("insert")
    public User insert(@RequestBody User user){
        System.out.println(";llllllllllllllllllllll"+user);
        return userService.insert(user);
    }
    @RequestMapping("selectByid")
    public Optional<User> selectid(Integer id){
        return userService.selectId(id);
    }
}
