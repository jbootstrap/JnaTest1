/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnatest1;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 *
 * @author root
 */
public class Main {

    public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary)Native.loadLibrary("msvcrt", CLibrary.class);
        void printf(String format, Object... args);
    }
	 
    public interface MyLibrary extends Library {
        MyLibrary INSTANCE = (MyLibrary)Native.loadLibrary("mylib", MyLibrary.class);
        int add2(int a, int b);
    }
	 
    public static void main(String[] args) {
        CLibrary.INSTANCE.printf("Hello, World: %d\n", 1234);
        int x = MyLibrary.INSTANCE.add2(11, 22);
        System.out.println(x);
    }
    
}
