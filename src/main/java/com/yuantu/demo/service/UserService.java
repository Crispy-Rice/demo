package com.yuantu.demo.service;

import com.yuantu.demo.dao.dto.UserLoginDTO;
import com.yuantu.demo.dao.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserVO login(UserLoginDTO userLoginDTO);

    UserVO getUser(Long id);
}
