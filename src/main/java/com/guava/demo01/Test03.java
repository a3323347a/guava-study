package com.guava.demo01;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 新集合工具类 Lists
 *
 * @author zjx
 * @date 2022/8/9 11:28
 */
public class Test03 {

    public static void main(String[] args) {
        //创建List集合
        List<String> list1 = Lists.newArrayList();
        //创建List集合并指定大小
        List<String> list2 = Lists.newArrayListWithCapacity(10);

        //按照大小拆分大集合
        List<String> largeList = Lists.newArrayListWithCapacity(10 * 100);
        //拆分成10个，一个100
        List<List<String>> partition = Lists.partition(largeList, 100);

    }

}
