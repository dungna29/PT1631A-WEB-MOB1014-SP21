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
public class Main {
    public static void main(String[] args) {
        //P1: Gọi đối tượng ra để sử dụng thì cần phải biết tên của đối tượng
        //GiaoVien gv1 = new GiaoVien();//Khởi tạo ra 1 đối tượng giáo viên
        //Gán giá trị cho thuộc tính của đối tượng
        //gv1.tengv ="Thiện";
        //gv1.magv = "ThienTH";
        //In ra giá trị của thuộc tính ra màn hình
        //System.out.println(gv1.tengv + gv1.magv);
        
        //P2: Contructor không tham số
        //Trong trường hợp Class đối tượng chưa khởi tạo Contructor thì java sẽ khởi tạo ngầm 1 contructor không tham số
         GiaoVien gv2 = new GiaoVien();
         //Gán giá trị cho từng thuộc tính
//         gv2.tengv ="Nguyễn Anh Dũng";
//         gv2.magv = "Dungna29";
//         gv2.sdt = 01234;
//         gv2.email = "dungna@gmail.com";
//         System.out.println(gv2.magv);
         
         //P3: Contructor có tham số
         //Phải gán giá trị cho đối tượng ngay khi dùng contructor có tham số
         //Các vị trí của giá trị gán vào phải tương ứng với vị trí của tham số
         GiaoVien gv3 = new GiaoVien("Minh", "Minhdq", 1234, 30, "Minhdq@fpt");        
         //System.out.println(gv3);
         System.out.println(gv3.getTengv());
         
         //P4: Cách gán giá trị khi thuộc tính bị Private
          GiaoVien gv4 = new GiaoVien();
          //Sử dụng phương thức Set để gán giá trị cho các thuộc tính của đối tượng
          gv4.setTengv("Thiện");
          gv4.setMagv("ThienTH");
          gv4.setTuoi(29);          
          
          
          //Sử dụng phương thức Get để lấy giá trị 
          System.out.println(gv4.getTengv() + " " + gv4.getTuoi() +" "+gv4.getTruong());
          
          //P5: Sử dụng phương thức in màn hình toString
          System.out.println(gv3.toString());
          System.out.println(gv4.toString());
          
          //Sử dụng phương thức trong Class
          gv4.inRaManHinh();
          gv3.inRaManHinh();
    }
}
