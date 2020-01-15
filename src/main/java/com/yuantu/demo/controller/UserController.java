package com.yuantu.demo.controller;


import com.yuantu.demo.dao.dto.UserLoginDTO;
import com.yuantu.demo.dao.vo.UserVO;
import com.yuantu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    //@RequestMapping(value = "post",name ="/login")

    @PostMapping("/login")
    UserVO login(@RequestBody UserLoginDTO userLoginDTO){

        return userService.login(userLoginDTO);
    }

    @GetMapping("/getUser")
    UserVO getUser(@RequestParam("id") Long id){
        return  userService.getUser(id);
    }


}
