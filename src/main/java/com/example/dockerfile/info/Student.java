package com.example.dockerfile.info;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("student")
public class Student implements Serializable {
  private long id;
  private  String name;
  private int age;

  @TableField("sClass")
  private String sClass;
}
