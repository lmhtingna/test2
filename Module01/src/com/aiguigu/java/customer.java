package com.aiguigu.java;


import com.aguigu.java.HelloWorld;

import java.util.ArrayList;

public class customer {


private static final HelloWorld ff=new HelloWorld();

    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("args = " + args);
        System.out.println("customer.main");
        
            int num1=10;
            System.out.println("num1 = " + num1);

       String[] fff=new String[]{"tom","dgg","dgdg"};
        for (int i = 0; i <fff.length ; i++) {
            System.out.println(fff[i]);
        }
        for (String s : fff) {
            System.out.println(s);

            
        }
        for (int i = 0; i < fff.length; i++) {
            String s = fff[i];

        }

        ArrayList lista = new ArrayList();
        lista.add(123);
        lista.add(32);
        for (Object o : lista) {
            
        }

        for (int i = 0; i < lista.size(); i++) {
            
        }
        for (int i = lista.size() - 1; i >= 0; i--) {
            
        }

        if (lista == null) {
            
        }
}

}
