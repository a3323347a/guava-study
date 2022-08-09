package com.guava.demo01;

import com.google.common.base.Preconditions;

/**
 * 非空判断，直接抛出异常
 *
 * @author zjx
 * @date 2022/8/9 11:01
 */
public class Test01 {

    /**
     * 非空判断，直接抛出异常
     * @param args
     */
    public static void main(String[] args) {
        boolean param1 = false;
        Preconditions.checkArgument(param1,"param1 is false");

        String param2 = null;
        Preconditions.checkNotNull(param2,"param2 is null");
    }

}
