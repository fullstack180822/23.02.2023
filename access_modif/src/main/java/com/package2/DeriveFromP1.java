package com.package2;

import com.package1.BaseP1;

public class DeriveFromP1 extends BaseP1 {

    public DeriveFromP1() {
        super();
    }

    public void foo3() {
        // default -- subclass different package -- CANNOT access
        //System.out.println(this.i_am_default);

        System.out.println(this.i_am_protected);

        this.func1();
        func1();
        super.func1();
    }

    @Override
    public void func1() {

    }
}
