package com.lgp.typeCrud.set;

import java.util.Iterator;
import java.util.Set;

/**
 * @AUTHOR lgp
 * @DATE 2018/8/29 15:29
 * @DESCRIPTION
 **/
public class TestSet {
    public static final int max = 100000;
    static long t1, t2;

    public static void test(Set set) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String name = set.getClass().getName();
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
            set.add(i);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 插入" + max + "个,时间" + t2 + "毫秒");

        t1 = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            set.contains(i);
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " 包含" + max + "个,时间" + t2 + "毫秒");

        t1 = System.currentTimeMillis();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            it.next();
        }
        t2 = System.currentTimeMillis() - t1;
        System.out.println(name + " Iterator遍历" + max + "个,时间" + t2 + "毫秒");

        System.out.println();
    }

}
