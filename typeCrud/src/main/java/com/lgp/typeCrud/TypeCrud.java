package com.lgp.typeCrud;


import com.lgp.typeCrud.list.TestList;
import com.lgp.typeCrud.map.TestMap;
import com.lgp.typeCrud.set.TestSet;

import java.util.*;

/**
 * @AUTHOR lgp
 * @DATE 2018/8/29 11:36
 * @DESCRIPTION
 **/
public class TypeCrud {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        testList();
        testSet();
        testMap();
    }

    public static void testList() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        TestList.test(new ArrayList());
        TestList.test(new LinkedList());
        TestList.test(new Vector());
        TestList.test(new Stack());
    }

    public static void testSet() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        TestSet.test(new HashSet());
        TestSet.test(new LinkedHashSet());
        TestSet.test(new TreeSet());
    }

    public static void testMap() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        TestMap.test(new HashMap());
        TestMap.test(new LinkedHashMap());
        TestMap.test(new Hashtable());
        TestMap.test(new TreeMap());
        TestMap.test(new WeakHashMap());
        TestMap.test(new IdentityHashMap());
    }
}
