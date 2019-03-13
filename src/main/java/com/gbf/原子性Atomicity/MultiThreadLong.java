package com.gbf.原子性Atomicity;

/**
 * 32位 jre 触发问题
 */
public class MultiThreadLong {
    public static long t=0L;
    public static class ChangeT implements Runnable{
        private long to;
        public ChangeT(Long to){
            this.to=to;
        }

        @Override
        public void run() {
            while (true) {
                MultiThreadLong.t=to;
                Thread.yield();
            }
        }
    }

    public static class ReadT implements Runnable {

        @Override
        public void run() {
            while (true) {
                long tmp=MultiThreadLong.t;
                if (tmp!=111L&&tmp!=-999L&&tmp!=333L&&tmp!=-444L) {
                    System.out.println(tmp);
                }
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new ChangeT(111L)).start();
        new Thread(new ChangeT(-999L)).start();
        new Thread(new ChangeT(333L)).start();
        new Thread(new ChangeT(-444L)).start();
        new Thread(new ReadT()).start();
    }
}
