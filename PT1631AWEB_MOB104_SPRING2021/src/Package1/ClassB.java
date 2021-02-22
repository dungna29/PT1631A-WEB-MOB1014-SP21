/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1;

/**
 *
 * @author DungNAPC
 */
public class ClassB {

    void method() {
        ClassA classA = new ClassA();
        classA.a = 1;
        classA.b = 2;
        classA.c = 3;
        //classA.d = 4;//Không gọi được thuộc tính d khi đã bị private
        
    }
}
