package com.juaracoding;

public class Main {
    public static void main(String[] args) {
//        try {
//            int result = 100/0;
//            System.out.println(result);
//        } catch (ArithmeticException e){
//            e.printStackTrace();
//        }

        int result = 100/0;
        System.out.println(result);

        System.out.println("Lanjutkan!");

        double salary = 3000.50;

        double umr = 4000;

        // salary diatas umr

        // salary dibawah umr
        if(salary < umr){ // 3000 < 4000 (true)
            System.out.println("salary dibawah umr");
        } else {
            System.out.println("salary diatas umr");
        }
    }
}