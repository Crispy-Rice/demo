package com.yuantu.demo.service.impl;

import com.yuantu.demo.dao.dto.UserLoginDTO;
import com.yuantu.demo.dao.entity.User;
import com.yuantu.demo.dao.mapper.UserMapper;
import com.yuantu.demo.dao.vo.UserVO;
import com.yuantu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserVO login(UserLoginDTO userLoginDTO) {
        if(userMapper.getUser(userLoginDTO)!=null){
            User user=userMapper.getUser(userLoginDTO);
            return new UserVO(user.getId(),user.getName(),user.getAge(),user.getHobby());
        }
        else{
            return null;
        }
    }

    @Override
    public UserVO getUser(Long id) {
        User user=userMapper.getUserInfo(id);
        return new UserVO(user.getId(),user.getName(),user.getAge(),user.getHobby());
    }

}
