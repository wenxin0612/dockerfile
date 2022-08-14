package com.example.dockerfile.db;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dockerfile.info.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xin
 */
@Mapper
public interface MyDB extends BaseMapper<Student> {



}
