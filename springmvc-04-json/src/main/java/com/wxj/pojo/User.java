package com.wxj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/*
@Data：自动生成所有字段的 getter、setter 方法，toString()、equals()、hashCode() 方法。
@AllArgsConstructor：自动生成包含所有字段的构造方法。
@NoArgsConstructor：自动生成无参构造方法。
 */
public class User {
    private String name;
    private int age;
    private String sex;
}
