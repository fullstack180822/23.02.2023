package com.package1;

public class Main {

    public static void main(String[] args) {
        BaseP1 bp1 = new BaseP1();

        // same package can access default field
        System.out.println(bp1.name);
    }
}
