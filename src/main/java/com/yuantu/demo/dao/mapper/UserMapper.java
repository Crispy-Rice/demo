package com.yuantu.demo.dao.mapper;

import com.yuantu.demo.dao.dto.UserLoginDTO;
import com.yuantu.demo.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name} and password=#{password}")
    User getUser(UserLoginDTO userLoginDTO);

    @Select("select * from user where id =#{id}")
    User getUserInfo(@Param("id") Long userId);
}
