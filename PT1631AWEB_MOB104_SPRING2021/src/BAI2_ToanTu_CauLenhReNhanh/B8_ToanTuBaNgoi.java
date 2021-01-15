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
public class B8_ToanTuBaNgoi {

    /*
       Cách sử dụng:
        <Biểu thức> ? <Giá trị true> : <Giá trị false>;
        <Biểu thức>: Có thể có 1 hoặc nhiều biểu thức
        <Giá trị true>: Luôn nằm sau dấu ? và phụ thuộc vào kiểu dữ liệu của biến.
        <Giá trị false>: Luôn nằm sau dấu :
    
     */
    public static void main(String[] args) {
        String result = 8 > 9 ? "Đúng rồi" : "Sai rồi bạn ạ";
        System.out.println(result);
        //Viết theo kiểu if else
        if (8>9) {
            System.out.println("Đúng rồi");
        }else{
             System.out.println("Sai rồi bạn ạ");
        }
        //Các ví dụ khác về kiểu dữ liệu
        boolean result1 = 8 > 9 ? true : false;
        int result2 = 8 > 9 ? 1 : 5;
        float result3 = 8 > 9 ? 1.5f : 5.6f;
        String result4 = (8 > 9) || (1==0) ? "Tùy biến giá trị" : "1";
        
        //Viết 1 chương trình đăng nhập
        while (true) {            
            Scanner sc = new Scanner(System.in);
            final String user = "admin", pass = "123";
            String inputUser, inputPass;
            System.out.print("User: ");
            inputUser = sc.nextLine();
            System.out.print("User: ");
            inputPass = sc.nextLine();
            String kq = (inputUser.equals(user) && inputPass.equals(pass))
                    ? "Đăng nhập thành công" : "Đăng nhập thất bại";
            System.out.println(kq);
        }
    }
}
