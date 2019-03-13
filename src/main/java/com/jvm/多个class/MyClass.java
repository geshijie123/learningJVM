package com.jvm.多个class;

/**
 * 编译后的 class  为多个， 但是idea 编辑器目录里面不显示 需要去文件夹管理器去复制
 */
public class MyClass {

    private MyInterface myInterface = new MyInterface() {
        @Override
        public void onTaskClick() {

        }
    };

    public interface MyInterface {
        void onTaskClick();
    }

    public static void main(String[] args) {
        System.out.println(1);
    }

}