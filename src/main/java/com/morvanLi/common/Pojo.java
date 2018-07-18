package com.morvanLi.common;


/**
 * 简单的类，实现序列化、覆盖toString，作为所有存储数据的父类
 */
public class Pojo {

    @Override
    public String toString() {
        return Jackson.asString(this);
    }
}
