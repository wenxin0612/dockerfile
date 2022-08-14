package com.example.dockerfile.contronller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dockerfile.db.MyDB;
import com.example.dockerfile.info.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xin
 */
@Service
public class MyService {

    @Autowired
    MyDB myDB;


    List<Student>  get(Long id){
        QueryWrapper<Student> wrapper=new QueryWrapper<>();
        wrapper.lambda().eq(Student::getId,id);
        List<Student> students = myDB.selectList(wrapper);
        return students;
    }

}
