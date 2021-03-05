/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI9_SapXepDoiTuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DungNAPC
 */
public class Main {

    static Scanner _sc = new Scanner(System.in);
    static String _input;
    static List<Student> _lstStudents = new ArrayList<>();
    static Student _student;

    public static void main(String[] args) {
        themNamSV();
        //Cách 1: Sắp xếp 

        for (Student x : _lstStudents) {
            x.inRaManHinh();
        }
        System.out.println("------------------------------------");          
//        Collections.sort(_lstStudents, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //Chỉ cần thay đổi -1 hoặc 1 sẽ thay đổi cách sắp xếp
//                //Sắp xếp theo string
//                return -o1.getTen().compareTo(o2.getTen());
//                //Sắp xếp số                
////                if (o1.getDiemCsharp() > o2.getDiemCsharp()) {
////                    return 1;
////                }else if(o1.getDiemCsharp() < o2.getDiemCsharp()){
////                    return -1;
////                }
////                return 0;
//            }
//        });
        
        //Khi class bên Sinh viên kế thừa comparable
        Collections.sort(_lstStudents);
        for (Student x : _lstStudents) {
            x.inRaManHinh();
        }
    }

    static void themNamSV() {
        Student st1 = new Student("Nguyễn", "Sơn", "Văn", "PH00001", 2000, 5, "Nam", "Hà Nội");
        Student st2 = new Student("Tân", "Minh", "Hoàng", "PH00002", 2001, 6, "Nam", "Hà Nội");
        Student st3 = new Student("Nguyễn", "Tiến", "Bá", "PH00003", 2003, 1, "Nam", "Hà Nội");
        Student st4 = new Student("Lê", "Mai", "Tuyết", "PH00004", 2004, 8, "Nữ", "Quảng Ninh");
        Student st5 = new Student();
        st5.setTen("Dũng");
        st5.setHo("Nguyễn");
        st5.setTenDem("Anh");
        st5.setMaSv("PH00532");
        st5.setNamSinh(1989);
        st5.setDiemCsharp(-5.5);
        st5.setGioiTinh("Nam");
        st5.setQueQuan("Bắc Ninh");
        _lstStudents.add(st1);
        _lstStudents.add(st2);
        _lstStudents.add(st3);
        _lstStudents.add(st4);
        _lstStudents.add(st5);
    }
}
