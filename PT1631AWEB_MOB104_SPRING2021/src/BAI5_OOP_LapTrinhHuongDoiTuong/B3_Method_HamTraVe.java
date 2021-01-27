package BAI5_OOP_LapTrinhHuongDoiTuong;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dungna29
 */
public class B3_Method_HamTraVe {

    /*
         * Hàm không trả về công thức và định nghĩa ở bên B2
         *
         * Định nghĩa: Hàm trả về bắt buộc phải trả về 1 giá trị hoặc 1 tập giá trị, 
           đối tượng.... tương ứng với kiểu dữ liệu của hàm.
     */
    public static void main(String[] args) {
        int year = 2021;
       
        //Coi hàm trả về như là 1 giá trị hoặc đối tượng hoặc tập đối tượng...
        //Đã là giá trị thì phải in nó ra màn hình        
        System.out.println(getYear() +1 );
        int a = 5, b=6,c = 8, d= 9;
        System.out.println(a + b);
        System.out.println(tinhTongHaiSo(a, d));
        //Sử dụng ham trả về dạng tập giá trị
        for (int i = 0; i < getListYears().length; i++) {
            System.out.println(getListYears()[i]);
        }
        
        //Sử dụng hàm trả về 1 đối tượng
        System.out.println(getSinhVien().ten);
        //Phương thức getSinhVien() coi như 1 đối tượng
        //inRaManHinh() = Phương thức của đối tượng
        getSinhVien().inRaManHinh();
    }

    int a = 2021;

    //Hàm trả về không tham số - Hàm trả về kiểu dữ liệu nguyên thủy string,int,double....
    static int getYear() {
        int a = 2021;
        return 2021;
    }
    static int tinhTongHaiSo(int so1,int so2){
        return so1 + so2;
    }

    //Hàm trả về không tham số - Hàm trả về 1 tập giá trị: Array,List....
    static int[] getListYears(){
        //Có 1 danh sách năm 1900 đến 2021
        //int[] arr = {1900,1901...2021};
        int[] arr = new int[2021-1900];
        int temp = 0;
        for (int i = 1900; i < 2021; i++) {
            arr[temp] = i;
            temp++;
        }
        
        return arr;
    }
    //Hàm trả về 1 đối tượng
    static SinhVien getSinhVien(){
        //Khởi tạo 1 sinh viên
        SinhVien sv1 = new SinhVien();
        sv1.ten = "FPT";
        return sv1;
    }
    static SinhVien[] getSinhVien1(){
        //Khởi tạo 1 sinh viên
        SinhVien[] sv1 = new SinhVien[5];
        return sv1;
    }
    static List<SinhVien> getSinhVien2(){
        //Khởi tạo 1 sinh viên
        List<SinhVien> sv1 = new ArrayList<>();
        return sv1;
    }
    //int year = tham số phải có kiểu dữ liệu và tên tham số
    
     static List inMangSoNguyen(int[] arrTemp) {
       return null;
    }
    
    static ArrayList temp(int[] arrTemp,int a, double[]arr,List lst,List<String> lstString, SinhVien sv) {
        return null;
    }
    
    
}
