package com.guava.demo01;

import com.google.common.collect.ImmutableSet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 创建不可变的集合
 *
 * @author zjx
 * @date 2022/8/9 11:12
 */
public class Test02 {

    /**
     * 一般用作常量集合，因为不能修改，多线程并发也没问题
     * @param args
     */
    public static void main(String[] args) {
        //方式一
        ImmutableSet<String> immutableSet = ImmutableSet.of("a", "b", "c");
        immutableSet.forEach(System.out::println);

        //方式二 builder
        ImmutableSet<String> immutableSet2 = ImmutableSet.<String>builder()
                .add("hello")
                .add("未读代码")
                .build();
        immutableSet2.forEach(System.out::println);

        //方式三 从其他集合中拷贝创建
        List<String> list = new ArrayList<>();
        list.add("123");
        ImmutableSet<String> immutableSet3 = ImmutableSet.copyOf(list);
        immutableSet3.forEach(System.out::println);
    }

}
