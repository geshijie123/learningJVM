package com.threadDemo.ForkJoin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinAsy extends RecursiveAction {

    private List<ForkJoinAsy> subTasks=new ArrayList<>();

    private File path;// 当前任务需要搜寻的目录

    public ForkJoinAsy(File path){
        this.path=path;
    }

    @Override
    protected void compute() {
        File[] files=path.listFiles();
        if(files!=null){
            for (File file:files){
                if(file.isDirectory()){
                    subTasks.add(new ForkJoinAsy(file));
                }else {
                    //如果是文件
                    if(file.getAbsolutePath().endsWith("exe")){
                        System.out.println(Thread.currentThread().getId() +"  查询文件 "+file.getAbsolutePath());
                    }
                }
            }
            if(!subTasks.isEmpty()){
                for (ForkJoinAsy forkJoinAsy:invokeAll(subTasks)){
                    forkJoinAsy.join();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ForkJoinPool forkJoinPool=new ForkJoinPool(10);
        ForkJoinAsy forkJoinAsy = new ForkJoinAsy(new File("B:\\apps\\git"));
        forkJoinPool.execute(forkJoinAsy);

        for (int i=1;i<100;i++){
            System.out.println("main"+i);
            Thread.sleep(10);
        }

        System.out.println("主线程做任务不受影响");
        forkJoinAsy.join();

        System.out.println("over");
    }
}
