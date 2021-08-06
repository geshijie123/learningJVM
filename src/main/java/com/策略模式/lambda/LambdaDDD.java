package com.策略模式.lambda;

public class LambdaDDD {
    public static void main(String[] args) {
        Person p = PersonFactory.initPerson("张三",Person.MAN);
        Person p2 = PersonFactory.initPerson("张三他老婆",Person.WOMAN);
        p.goToWC();
        p2.goToWC();
    }
}
