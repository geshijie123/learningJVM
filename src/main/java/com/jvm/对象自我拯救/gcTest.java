package com.jvm.对象自我拯救;

public class gcTest {
    public static gcTest gctest;

    @Override
    protected void finalize()throws Throwable{
        super.finalize();
        System.out.println("finalize is run ~ ");
        gcTest.gctest=this;
    }

    public static void main(String[] args) throws InterruptedException {
        gctest=new gcTest();
        gctest=null;
        System.out.println(gctest==null);
        System.gc();
        Thread.sleep(1000);
        System.out.println(gctest==null);
    }
}
