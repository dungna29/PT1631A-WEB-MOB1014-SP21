/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2_ToanTu_CauLenhReNhanh;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class SoSanhChuoi {

    public static void main(String[] args) {
        //Chuỗi so sánh trực tiếp khi bai báo biến thì so sánh đc với toán tử ==
//        String userName = "admin";
//        String userName2 = "admin";
//        if (userName == userName2) {
//            System.out.println("Login Thành Công");
//        }

        while (true) {            
            String userName = "admin", userName2;
            Scanner sc = new Scanner(System.in);
            System.out.print("Mời bạn nhập UserName: ");
            userName2 = sc.nextLine();
            //equals: so sánh tuyệt đối
            //equalsIgnoreCase: Vẫn phải giống nhau nhưng không phân biệt chữ hoa và chữ thường
            if (userName2.equalsIgnoreCase(userName)) {//Sử dụng equals dùng để so sánh String
                System.out.println("Login Thành Công");
            }else{
                System.out.println("Thất bại");
            }
        }
    }
}
