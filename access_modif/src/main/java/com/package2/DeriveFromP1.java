package com.package2;

import com.package1.BaseP1;

public class DeriveFromP1 extends BaseP1 {

    public void foo3() {
        // default -- subclass different package -- CANNOT access
        //System.out.println(this.i_am_default);

        System.out.println(this.i_am_protected);
    }
}
