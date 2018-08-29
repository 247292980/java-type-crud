package com.lgp.typeCrud.map;

import java.util.Map;
import java.util.Set;

/**
 * @AUTHOR lgp
 * @DATE 2018/8/29 16:37
 * @DESCRIPTION
 **/
public class TestMap {
    public static final int max = 100000;
    static long t1, t2;

    public static void test(Map map) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String name = map.getClass().getName();
        /*根据类名得到类*/
        Class cls = Class.forName(name);
        System.out.println("Testing " + name);

        t1 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            cls.newInstance();
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 创建" + max + "个,时间" + t2 + "毫秒");

        t1 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            map.put(""+i,i);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 插入" + max + "个,时间" + t2 + "毫秒");


        t1 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            map.containsKey(""+i);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 包含key" + max + "个,时间" + t2 + "毫秒");

        t1 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            map.containsValue(i);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 包含value" + max + "个,时间" + t2 + "毫秒");

        t1 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            map.get(i);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 取出" + max + "个,时间" + t2 + "毫秒");

        t1 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            map.remove(i);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 删除" + max + "个,时间" + t2 + "毫秒");


        System.out.println();
    }
}
