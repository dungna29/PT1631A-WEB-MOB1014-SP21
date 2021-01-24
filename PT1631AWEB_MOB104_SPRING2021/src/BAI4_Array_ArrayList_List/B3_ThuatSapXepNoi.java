/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI4_Array_ArrayList_List;

/**
 *
 * @author Dungna29
 */
public class B3_ThuatSapXepNoi {

    //Thuật toán sắp xếp nổi bọt
    public static void main(String[] args) {
        int[] arrNumber = {55, 88, 77, 99, 44, 00};
        System.out.println("Chưa sort");
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }
        System.out.println("");

//        for (int i = 0; i < arrNumber.length; i++) {
//            for (int j = i + 1; j < arrNumber.length; j++) {
//                if (arrNumber[i] > arrNumber[j]) {
//                    int temp = arrNumber[i];
//                    arrNumber[i] = arrNumber[j];
//                    arrNumber[j] = temp;
//                }
//            }
//        }
          for (int i = 0; i < arrNumber.length; i++) {
            System.out.println("Lần chạy thứ: " + i);
            for (int x : arrNumber) {
                System.out.print(x + " ");
            }
            System.out.println("");
            for (int j = i + 1; j < arrNumber.length; j++) {
                System.out.printf("Nếu %d > %d \n", arrNumber[i], arrNumber[j]);
                if (arrNumber[i] > arrNumber[j]) {
                    int temp = arrNumber[i];
                    arrNumber[i] = arrNumber[j];
                    arrNumber[j] = temp;
                    System.out.println("Sau khi hoán đổi vị trí ");
                    for (int x : arrNumber) {
                        System.out.print(x + " ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("Đã sort");
        for (int x : arrNumber) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }
}
