package com.java.test;


import java.io.IOException;

public class Dream {

    public  static void dream()throws IOException{
        try{
            throw Exception(); //use new keyword
        }catch (RuntimeException runtimeException){

        }
    }

        public static void main(String args[]) throws Exception{
            dream();
        }
    }
}
