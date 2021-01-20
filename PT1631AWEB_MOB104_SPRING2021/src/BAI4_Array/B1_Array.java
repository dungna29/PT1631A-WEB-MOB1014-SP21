/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array;

import java.util.Scanner;

/**
 *
 * @author Dungna29
 */
public class B1_Array {

    /*
         * Phần 1: Mảng 1 chiều
         
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
         
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,value};//Khởi tạo mảng kiểu tường minh.
                    
                    - Cách 4: 
                 <Kiểu dữ liệu>[] arr<Tên Mảng> = {value1,value2..,value};
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
     */
    public static void main(String[] args) {
        //1. Khai báo mảng:
        int[] arrNumber1;
        arrNumber1 = new int[5];//Khởi tạo mảng gồm 5 phần tử

        double arrDiemJava1[] = new double[5];

        String arrName[] = new String[]{"JAVA1", "JAVA2", "JAVA3"};
        String arrName1[] = {"JAVA1", "JAVA2", "JAVA3"};

        var arrName2 = new String[]{"JAVA1", "JAVA2", "JAVA3"};
        var arrName3 = new int[]{5, 8, 6, 9, 8, 7, 75, 6};
        var arrName4 = new int[5];

        //2. Gán giá trị cho mảng
        //arrNubmer = 5; Sai vì không xác định giá trị được gán vào index nào
        arrNumber1[0] = 5;
        arrNumber1[1] = 9;
        arrNumber1[0] = 8;//Ghi đè giá trị tại vị trí số 0

        //3. Lấy giá trị 
        System.out.println(arrNumber1[0]);
        //4. Sử dụng vòng lặp để in các giá trị của mảng ra màn hình

        //For
        for (int i = 0; i < arrNumber1.length; i++) {
            System.out.print(arrNumber1[i] + " ");
        }
        System.out.println("");
        //Foreach
        for (int x : arrNumber1) {
            System.out.print(x + " ");
        }

        //Ví dụ tổng hợp về mảng:
        //Viết 1 chương trình cho người dùng nhập vào 1 dãy số theo ý người dùng
        Scanner sc = new Scanner(System.in);
        int[] arrNumberInput;//Khai bao báo mảng
        int inputNumber;
        System.out.print("Bạn muốn nhập vào bao nhiêu số? ");
        inputNumber = sc.nextInt();
        //Sau khi lấy giá trị số lượng số mà người dùng muốn
        //Khởi tạo mảng theo kích thước người dùng nhập vào
        arrNumberInput = new int[inputNumber];
        
        //Nhập dữ liệu vào mảng
        for (int i = 0; i < arrNumberInput.length; i++) {
            System.out.printf("Mời bạn nhập số thứ %d :",i);
            arrNumberInput[i] = sc.nextInt();            
        }
        
        //Lấy giá trị 
        for (int x : arrNumberInput) {
            System.out.print(x + " ");
        }

    }
}
