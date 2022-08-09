package com.inheritancedemo;

public class Main {
    public static void main(String[] args) {
        Sbi main = new Sbi("kumbakonam","Tamilnadu",612002);
        Sbi sub1 = new Sbi("thanjore","Tamilnadu",622300);
        Sbi sub2 = new Sbi("nagapatttinam","Tamilnadu",625660);

        System.out.println(main.state);
        System.out.println();
        main.rate_of_interest();
        System.out.println(sub2.Pin_code);

    }
}
