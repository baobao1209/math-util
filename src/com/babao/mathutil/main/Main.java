/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.babao.mathutil.main;

import com.babao.mathutil.core.MathUtil;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        long expected = 120 ;
        int n = 5 ;
        long actual = MathUtil.getFactorial(n) ;
        System.out.println("5! = 120  expected ; actural = " + actual );
    }
}
