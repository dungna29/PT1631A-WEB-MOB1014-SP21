package BAI1_LamQuenVoiJava;

import java.util.Scanner;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dungna29
 */
public class B6_XuLyTroiLenh {
    /*
        Bài 1: Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên 
        từ bàn phím và xuất ra định dạng sau: 
	“Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> 
        đến với chương trình java đầu tiên.”
    */
    public static void main(String[] args) {
        //Bước 1: Xác định số lượng số biến và sử dụng Class
        Scanner sc = new Scanner(System.in);
        String ten,msv;
        int ns;
        //Bước 2: Gán giá trị cho biến
        System.out.println("Mời bạn nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Mời bạn nhập năm sinh: ");
        //ns = sc.nextInt();
        //Bị trôi lệnh khi sử dụng next<Số>() mà đằng sau nó là nextLine();
        
        //2 Cách chống trôi lệnh:
        //Cách 1: Chèn 1 sc.nextLine(); ngay sau khi next<Số>();
       
        //sc.nextLine();
        //Cách 2: Sử dụng ép kiểu từ String về số
        ns = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập msv: ");
        msv = sc.nextLine();
        //Bước 3: Xử lý nghiệp vụ
        System.out.printf("Tên: %s | Năm sinh: %d | Msv: %s",ten,ns,msv);
    }
}
