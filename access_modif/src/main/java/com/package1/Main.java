package com.package1;

import com.package2.DeriveFromP1;

public class Main {

    public static void main(String[] args) {
        BaseP1 bp1 = new BaseP1();

        // same package can access default field
        System.out.println(bp1.i_am_protected);
        System.out.println(bp1.i_am_default);

        DeriveFromP1 d1 = new DeriveFromP1();
        System.out.println("==================");
        d1.func1();

        BaseP1 d2 = new DeriveFromP1();
        System.out.println("=======papa glasses===========");
        d2.func1();

    }
}
