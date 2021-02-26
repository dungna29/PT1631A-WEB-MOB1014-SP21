package Bai8_XuLyChuoi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DungNAPC
 */
public class Main {

    public static void main(String[] args) {
        String name1 = "Tiến Độ Xe";
        String name2 = "Tiến";
        if (name1.equals(name2)) {
            System.out.println("equals 2 Chuỗi bằng nhau");
        }
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("equalsIgnoreCase 2 Chuỗi bằng nhau");
        }
        if (name1.contains(name2)) {
            System.out.println("contains 2 Chuỗi bằng nhau");
        }
        System.out.println(name1.charAt(0));
        System.out.println(name1.toUpperCase());
        System.out.println(name1.toLowerCase());
        System.out.println(name2.length());
        
        
    }
}
