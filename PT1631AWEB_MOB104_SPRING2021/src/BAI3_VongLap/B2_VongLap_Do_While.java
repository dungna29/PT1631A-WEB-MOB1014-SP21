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
public class B2_VongLap_Do_While {

    /*
     Vòng lặp Do..While: Thực hiện hành động ít nhất là 1 lần. Điều kiện đề vòng lặp chạy giống như While(True).
    
    Cách gõ: do + tab
    Công thức: 
    do {
            //Thực hiện hành động ít nhất là 1 lần.
        } while (true);
     */
    public static void main(String[] args) {
        do {
            System.out.println("In ra 1 lần khi While False");
        } while (false);

        //In ra 3 lần
        int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a <= 3);

        //Viết 1 chương trình nhập số chẵn thì ngắt chương trình
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.print("Mời bạn nhập số chẵn: ");
            input = sc.nextInt();
            System.out.println("");
        } while (!(input % 2 == 0));

    }
}
