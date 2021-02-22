/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author DungNAPC
 */
public class GiaoVien {

    //Phần 1: Khai báo các thuộc tính phải có của đối tượng và phải private tất cả các thuộc tính
    private String tengv;
    private String magv;
    private long sdt;
    private int tuoi;
    private String email;
    private String Truong = "FPT POLY";
       
    
    /*Phần 2: Hàm Tạo || Contructor
        + Tên Contructor giống với Class
        + Để tạo sử dụng phím ALT + INSERT chọn Contructor Hoặc chuột phải vào Class chọn Insert Code
    */
    //Tạo Contructor không tham số
    public GiaoVien() {
        //System.out.println("Đây là text in ra từ COntructor không tham số của GV");
    }
    
    //Tạo Contructor có tham số
    // ALT + INSERT ->Contructor -> Select All

    public GiaoVien(String tengv, String magv1, long sdt, int tuoi, String email) {
        this.tengv = tengv;//Sử dụng từ khóa this là vì tên thuộc tính và tên tham số bị giống nhau
        magv = magv1;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.email = email;
    }
    //Từ khóa this dùng để tham chiếu đến thuộc tính và hàm của lớp hiện tại
    
    //Phần 3: Vì các thuộc tính bị Private nên sẽ phải sử dụng Getter và Setter
    //Khi private các thuộc tính nhằm che dấu (Tính đóng gói)(Encapsulation) trong hướng đối tượng là 1 trong 4 tính chất của OOP
    //Alt + Insert hoặc chuột phải chọn Insert Code chọn Getter và Setter ->Select All

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public long getSdt() {
        return sdt;
    }

    public void setSdt(long sdt) {
        this.sdt = sdt;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTruong() {
        return Truong;
    }

    //Phần 4: Phương thức của đối tượng
    
    //Alt + Insert -> toString() - Phương thức trả về 1 chuỗi dùng để in giá trị của các thuộc tính ra

    @Override
    public String toString() {
        return "GiaoVien{" + "tengv=" + tengv + ", magv=" + magv + ", sdt=" + sdt + ", tuoi=" + tuoi + ", email=" + email + ", Truong=" + Truong + '}';
    }
    
    //Hoặc có thể tự viết 1 phương in ra màn hình
    void inRaManHinh(){
        System.out.printf("Têm GV: %s | Mã GV: %s \n",getTengv(),magv);
    }
    
}
