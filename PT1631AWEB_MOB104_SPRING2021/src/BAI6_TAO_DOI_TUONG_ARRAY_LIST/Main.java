/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_TAO_DOI_TUONG_ARRAY_LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DungNAPC
 */
public class Main {

    Scanner _sc = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        //m.tao2DoiTuong();
        //m.tao1Doituong();
        //m.tao1MangDoiTuong();
        m.tao1ListDoiTuong();
    }

    //1. Tao 2 đối tượng bằng contructor có tham số và không tham số
    void tao2DoiTuong() {
        //Contructor không tham số
        SinhVien sv1 = new SinhVien();
        sv1.setTenSv("Sơn");
        sv1.setMaSv("SơnTV");
        sv1.setTuoi(23);
        sv1.setDiemJava(5);
        sv1 = new SinhVien();
        System.out.println(sv1.toString());

        //Contructor có tham số
        SinhVien sv2 = new SinhVien("Dũng", "Dungna", 30, 4);
        System.out.println(sv2.toString());
    }

    //2. Tạo 1 đối tượng do người dùng nhập vào
    void tao1Doituong() {
        SinhVien sv1 = new SinhVien();//Khởi tạo 1 đối tượng
        System.out.println("Mời bạn nhập tên: ");
        sv1.setTenSv(_sc.nextLine());
        System.out.println("Mời bạn nhập mã: ");
        sv1.setMaSv(_sc.nextLine());
        System.out.println("Mời bạn nhập tuổi: ");
        sv1.setTuoi(Integer.parseInt(_sc.nextLine()));
        System.out.println("Mời bạn nhập điểm: ");
        sv1.setDiemJava(Double.parseDouble(_sc.nextLine()));

        System.out.println(sv1.toString());
    }

    //3. Tạo 1 mảng đối tượng do người dùng nhập vào
    void tao1MangDoiTuong() {
        //Bước 1: Khởi tạo
        //<kiểu dữ liệu> [] tên mảng; int[] arrNumber;
        SinhVien[] arrSinhvien;
        int size;
        //Bước 2: Triển khai
        System.out.println("Số lượng SV muốn thêm: ");
        size = Integer.parseInt(_sc.nextLine());
        arrSinhvien = new SinhVien[size];//Khởi tạo mảng có kích thước do người dùng nhập vào
        for (int i = 0; i < size; i++) {
            arrSinhvien[i] = new SinhVien();
            System.out.println("Mời bạn nhập tên: ");
            arrSinhvien[i].setTenSv(_sc.nextLine());
            System.out.println("Mời bạn nhập mã: ");
            arrSinhvien[i].setMaSv(_sc.nextLine());
            System.out.println("Mời bạn nhập tuổi: ");
            arrSinhvien[i].setTuoi(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập điểm: ");
            arrSinhvien[i].setDiemJava(Double.parseDouble(_sc.nextLine()));
            
        }

        for (SinhVien x : arrSinhvien) {
            System.out.println(x.toString());
        }
    }

    //4. Tạo 1 List đối tượng do người dùng
    void tao1ListDoiTuong() {
        List<SinhVien> lstSinhVien = new ArrayList<>();
        SinhVien sv1;
        int size;

        System.out.println("Số lượng SV muốn thêm: ");
        size = Integer.parseInt(_sc.nextLine());
        for (int i = 0; i < size; i++) {
            sv1 = new SinhVien();
            System.out.println("Mời bạn nhập tên: ");
            sv1.setTenSv(_sc.nextLine());
            System.out.println("Mời bạn nhập mã: ");
            sv1.setMaSv(_sc.nextLine()) ;
            System.out.println("Mời bạn nhập tuổi: ");
            sv1.setTuoi(Integer.parseInt(_sc.nextLine()));
            System.out.println("Mời bạn nhập điểm: ");
            sv1.setDiemJava(Double.parseDouble(_sc.nextLine()));
            lstSinhVien.add(sv1);//Thêm đối tượng vào trong danh sách đối tượng           
        }
        
        for (SinhVien x : lstSinhVien) {
            System.out.println(x.toString());
        }
        
        /*
        Viết 1 chương trình thêm mới Động Vật - Có các thuộc tính: MaDV,NamSinh,CanNang
        - Tạo Class đối tượng
        - Có Class Main để triển khai bên trong main
        */
    }
}
