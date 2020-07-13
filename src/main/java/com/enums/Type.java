package com.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum Type {
    aa(1,"233"),
    bb(2,"666"),
    cc(3,"111");
    private int number;
    private String str;
    Type(Integer number,String str){
        this.number=number;
        this.str=str;
    }
}
