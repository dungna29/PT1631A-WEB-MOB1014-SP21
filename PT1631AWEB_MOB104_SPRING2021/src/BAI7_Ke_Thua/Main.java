package BAI7_Ke_Thua;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DungNAPC
 */
public class Main {

    /*
    TÍNH CHẤT KẾ THỪA TRONG LẬP TRÌNH
    - Định nghĩa: Cho phép định nghĩa một lớp đối tượng dựa trên các thuộc tính có sẵn của một lớp đã có.
    Lớp con có thể kế thừa các thuộc tính và phương thức của lớp cha.
    - Sử dụng: Sử dụng từ khóa extends lớp cha
    - Lưu ý: trong JAVA và C# không có đa kế thừa chỉ có đơn kế thừa. Tức là 1 con chỉ có thể có 1 cha
    - Từ khóa this: tham chiếu đến thuộc tính và phương thức của lớp hiện tại
    - Từ khóa super: tham chiếu đến thuộc tính và phương thức của lớp cha
    + Lợi ích: 
        - Tiết kiệm thời gian lập trình
        - Các thuộc tính chung có thể tái sử dụng thì đưa lên lớp cha còn ở lớp con thì có các thuộc tính
            đặc trưng riêng để miêu tả cho đối tượng đó.
     */
    public static void main(String[] args) {
        /*
        TẠO 4 CLASS ĐỐI TƯỢNG
        1 - SinhVien1: ho,tenDem,ten,namSinh,maSv,diemJava
        2 - GiaoVien1: ho,tenDem,ten,namSinh,maGv,gioDay
        3 - KeToan1: ho,tenDem,ten,namSinh,maNv,ngayCong
        4 - BaoVe1: ho,tenDem,ten,namSinh,maBv,caLamViec
        Sau đó gọi 4 bạn random lên kiểm tra việc tạo CLASS 
        - Không tạo sẽ hủy điểm danh hôm nay
        - 14h35 kiểm tra.
         */

        //Phần 1: Gán giá trị cho đối tượng
        SinhVien1 sv1 = new SinhVien1();
        sv1.setHo("Nguyễn");
        sv1.setTenDem("Anh");
        sv1.setTen("Dũng");
        sv1.setMaSv("dungna");
        sv1.setNamSinh(2000);
        sv1.setDiemJava(3);

        //Phần 2: Gán giá trị cho đối tượng có sử dụng kế thừa
        SinhVien sv2 = new SinhVien();
        sv2.setHo("Nguyễn");
        sv2.setTenDem("Anh");
        sv2.setTen("Dũng");
        sv2.setMaSv("dungna");
        sv2.setNamSinh(2000);
        sv2.setDiemJava(3);

        //Phần 3: Nạp chồng (Overloading): Cùng tên nhưng khác tham số.
        //phuongThuc();
        //phuongThuc(1);
        //phuongThuc(1, 2);
        
        //Phần 3: Ghi đè (Overriding): Khi lớp con kế thừa lớp cha 1 phương thức thì lớp con
        // Có thể code lại nội dung bên trong phương thức đó và tên phương thức + tham số vẫn giống nhau
        Person ps = new Person();
        ps.inRaManHinhPerson();
        SinhVien sv3= new SinhVien();
        sv3.inRaManHinhPerson();
        
        //Bài 4: Viết 1 Chương trình quản lý bảo vệ đã được tạo ở trên
        //- Sử dụng kế thừa lớp Person
        //Viết 2 chức năng:
        // - Thêm mới 1 bảo vệ
        // - Thêm nhiều bảo vệ
        // Lưu ý cố gắng kế thừa phương thức inRaManHinh của lớp bảo vệ và sử dụng lại trên Class con BaoVe
    }

    static void phuongThuc() {
        System.out.println("Phương thức 1 hành động 1");
    }

    static void phuongThuc(int a) {
        System.out.println("Phương thức 1 hành động 2");
    }

    static void phuongThuc(int a, int b) {
        System.out.println("Phương thức 1 hành động 3");
    }
}
