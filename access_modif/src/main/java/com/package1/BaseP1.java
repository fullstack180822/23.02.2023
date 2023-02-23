package com.package1;

public class BaseP1 {

    // only this class
    private int i_am_private = 0;

    // default
    String i_am_default = "name1";

    // protected
    protected int i_am_protected = 3;

    public void func1() {
        System.out.println(i_am_private);
        System.out.println(i_am_default);
    }

}
