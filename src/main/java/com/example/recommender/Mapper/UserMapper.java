package com.example.recommender.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.recommender.Bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
