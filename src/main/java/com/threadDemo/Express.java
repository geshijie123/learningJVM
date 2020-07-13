package com.threadDemo;

public class Express {
    private final String city="上海";
    private int km=0;
    private String site;

    Express(int km,String site){
        this.km=km;
        this.site=site;
    };

    public  synchronized void changeKm(){
        km=150;
//        notify();
        notifyAll();
    }

    public synchronized void changeSite(){
        site="北京";
//        notify();
        notifyAll();
    }

    public synchronized void waitKm(){
        if(km<100){
            try {
                wait();
                System.out.println(Thread.currentThread().getId()+" 快递位移不够100 不作操作");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getId()+" 快递到"+km+"公里   数据库保存");
    }
    public synchronized void waitSite(){
        if(!"北京".equals(site)){
            try {
                wait();
                System.out.println(Thread.currentThread().getId()+" 快递还没有到！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getId()+" 快递到"+site+"了   需要通知用户注意签收 ！！！");
    }
}
