package com.责任链模式;

public abstract class Man {

    public Man father;

    public void setMan(Man man) {
        this.father = man;
    }


    public void hendleRequest(int money){
        if(money<limit()){
            hendle(money);
        }else {
            if(father!=null){
                father.hendleRequest(money);
            }
        }
    }

    protected abstract int limit();

    protected abstract void hendle(int money);


}
