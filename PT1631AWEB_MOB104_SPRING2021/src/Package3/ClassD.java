/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package3;

import Package1.ClassA;

/**
 *
 * @author DungNAPC
 */
public class ClassD extends ClassA {

    void method() {
        a = 1;
        b = 2; //b muốn gọi thì lớp ClassC phải kế thừa ClassA
        //c = 3; //Không gọi được vì thuộc tính c là Default chỉ sử dụng trong package
        //d = 4;//Không gọi được thuộc tính d khi đã bị private

    }
}
