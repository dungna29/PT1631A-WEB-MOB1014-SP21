/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_TAP_MAU;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class BAI_MAU_BAILAB4_GiaiNangCao {

    static Scanner sc = new Scanner(System.in);
    static String input;

    public static void main(String[] args) {

    }

    static String input(String cauhoi) {
        System.out.println("Mời bạn chọn " + cauhoi + " : ");
        return sc.nextLine();
    }

    static void menu() {
        int[] arrNumber;//Khai báo mảng
        List<Double> lstDiem = new ArrayList<>();
        System.out.println("Chữa bài lab 4");
        System.out.println("1. Bài 1");
        System.out.println("2. Bài 2");
        System.out.println("3. Thoát");
        switch (Integer.parseInt(input("Chức năng"))) {//Có thể sử dụng ép kiểu hoặc không
            case 1:
                //Khởi tạo mảng
                arrNumber = new int[Integer.parseInt(input("bao nhiêu số"))];
                //Gán giá trị cho mảng
                for (int i = 0; i < arrNumber.length; i++) {
                    arrNumber[i] = Integer.parseInt(input("số thứ"));
                }
                //In mảng sử dụng fore
                for (int x : arrNumber) {
                    System.out.print(x + " ");
                }
                System.out.println("");
                break;
            case 2:
                //Gán giá trị cho mảng
                for (int i = 0; i < Integer.parseInt(input("bao nhiêu điểm")); i++) {
                    lstDiem.add(Double.parseDouble(input("điểm thứ")));
                }
                //In mảng sử dụng fore
                for (var x : lstDiem) {
                    System.out.print(x + " ");
                }
                //In tất cả các điểm < 5
                for (var x : lstDiem) {
                    if (x < 5) {
                        System.out.print(x + " ");
                    }
                }
                //In ra các index lẻ
                for (int i = 0; i < lstDiem.size(); i++) {
//                    if (i%2 == 0) {
//                        continue;
//                    }
                    // System.out.println(lstDiem.get(i));
                    if (i % 2 != 0) {
                        System.out.println(lstDiem.get(i));
                    }
                }
                //Lấy giá trị min max
                double max = lstDiem.get(0);
                for (Double x : lstDiem) {
                    if (max < x) {
                        max = x;
                    }
                }
                System.out.println("Điểm max = " + max);
                System.out.println("");
                break;
            case 3:
                System.out.println("Hẹn gặp bạn lần sau");
                System.exit(0);
                break;
            default:
                System.out.println("Chức năng không tồn tại");
        }
    }
}
