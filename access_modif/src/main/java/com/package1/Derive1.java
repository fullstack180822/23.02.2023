package com.package1;

public class Derive1 extends BaseP1 {

    public void foo2() {

        // cann access same package -- subclass
        System.out.println(i_am_default);
        System.out.println(i_am_protected);
    }
}
