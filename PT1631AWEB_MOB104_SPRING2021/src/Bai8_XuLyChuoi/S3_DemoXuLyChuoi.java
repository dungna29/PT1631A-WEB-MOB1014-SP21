/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai8_XuLyChuoi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LegendNguyen
 */
public class S3_DemoXuLyChuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("Mời bạn nhập email: ");
            input = sc.nextLine();
        } while (!checkEmail(input));

    }

    static boolean checkSo(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Bạn đã nhập đúng số nguyên");
            return true;
        }
        return false;
    }

    static boolean checkChu(String input) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Bạn đã nhập đúng chữ cái");
            return true;
        }
        return false;
    }

    static boolean checkEmail(String input) {
        Pattern pattern = Pattern.compile("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Bạn đã nhập email đúng");
            return true;
        }
        return false;
    }

}
