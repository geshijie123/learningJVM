package com.jvm.对象自我拯救;

public class FinalizeEscapeGC {

    public static  FinalizeEscapeGC save_hook=null;
    public void isAlive(){
        System.out.println("yes, alive~~");
    }

    @Override
    protected void finalize()throws Throwable{
        super.finalize();
        System.out.println("finalize is run ~ ");
        FinalizeEscapeGC.save_hook=this;
    }

    public static void main(String[] args) throws InterruptedException {
        save_hook=new FinalizeEscapeGC();


        //对象第一次可以成功拯救自己
        save_hook=null;
        System.gc();
        //因为finalize执行方法优先级低 暂停1秒
        Thread.sleep(1000);
        if(save_hook!=null){
            save_hook.isAlive();
        }else{
            System.out.println("FK he is died ~");
        }

        //与上面完全一致，但是却无法自救
        save_hook=null;
        System.gc();
        //因为finalize执行方法优先级低 暂停1秒
        Thread.sleep(1000);
        if(save_hook!=null){
            save_hook.isAlive();
        }else{
            System.out.println("FK he is died ~");
        }
    }
}
