/**
 * Copyright 2014-2025 JD.COM All Right Reserved.
 *
 * @file： Test.java   project: LeetGo
 * @creator: biguodong
 * @date: 2021/8/26
 */

package com.bigd.leetCode;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList();

        deque.push("A");
        deque.push("B");
        deque.push("C");
        System.out.println(deque.size());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());

    }

}
