package com.copy;

import lombok.Data;
import org.springframework.beans.BeanUtils;

public class copy {
    public static void main(String[] args) {

        u1 uu1 = new u1();
        uu1.setA(1);
        uu1.setB("233");
        u2 uu2 = new u2();

        BeanUtils.copyProperties(uu1,uu2);

        System.out.println(uu2.getB());
        System.out.println(uu2.getC());
    }
}
@Data
class u1 {
    private int a;
    private String b;
}

@Data
class u2 {
    private int a;
    private String b;
    private long c;
}
