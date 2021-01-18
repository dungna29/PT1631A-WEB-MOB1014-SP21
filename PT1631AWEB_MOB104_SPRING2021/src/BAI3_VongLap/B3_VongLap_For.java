/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI3_VongLap;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B3_VongLap_For {

    /*
        Cách gõ: for + tab
        Công thức:
         for (int i = 0; i < 10; i++) {

            }
    int i = 0: Điểm bắt đầu của vòng lặp có kiểu số nguyên
    i < 10: Điều kiện để ngắt vòng
    i++: Tăng bước nhẩy lên 1
     */
    public static void main(String[] args) {
       //In 3 lần
        for (int j = 0; j < 3; j++) {
            System.out.println(j);            
        }
        
        //1 Bảng cửu chương với for
        int input = 5;
        for (int i = 1; i < 9; i++) {
            System.out.printf("%d x %d = %d \n",input,i,input*i);
        }
        
        //Cửu chương với While
        int i = 1;
        while (i < 9) {
            System.out.printf("%d x %d = %d \n",input,i,input*i);
            i++;
        }
        System.out.println("------------------");
        //Viết full bảng cửu chương sử dụng do While
        int a =1, b = 1;
        do {
            do {
                System.out.printf("%d x %d = %d \n",a,b,a*b);
                b++;
            } while (b < 10);
            b = 1;//Reset b về 1 để chạy sang bảng tiếp theo
            a++;
        } while (a <=10);
        
    }
}
