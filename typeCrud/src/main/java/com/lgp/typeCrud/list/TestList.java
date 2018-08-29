package com.lgp.typeCrud.list;

import java.util.Iterator;
import java.util.List;

/**
 * @AUTHOR lgp
 * @DATE 2018/8/29 14:45
 * @DESCRIPTION
 **/
public class TestList {
    public static final int max = 100000;
    static long t1, t2;

    public static void test(List list) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String name = list.getClass().getName();
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
            list.add(i);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 插入" + max + "个,时间" + t2 + "毫秒");

        t1 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            list.get(i);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 获取" + max + "个,时间" + t2 + "毫秒");

        t1 = System.currentTimeMillis();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " Iterator遍历" + max + "个,时间" + t2 + "毫秒");

        t1 = System.currentTimeMillis();
        while (it.hasNext()) {
            it.remove();
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 删除" + max + "个,时间" + t2 + "毫秒");
        System.out.println();
    }


}
