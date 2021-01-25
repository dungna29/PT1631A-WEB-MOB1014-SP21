/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna29
 */
public class SinhVien {//Tên đối tượng phải là danh từ và viết hoa chữ cái đầu của từ
   
    //Phần 1: Liệt kê tất cả các thuộc tính của đối tượng
    String ten;
    String sdt;
    String email;
    String diachi;
    int namsinh;
    
    //Phần 2: Hàm tạo Contructor
    
    //Phần 3: Getter và Setter
    
    //Phần 4: Phương thức của đối tượng
    void inRaManHinh(){
        System.out.printf("Chúc mừng %s + %s \n",ten,sdt);
    }

}
