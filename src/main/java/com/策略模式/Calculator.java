package com.策略模式;


// 计算器
public class Calculator {
    private Util util;

  Calculator(Util util){
      this.util=util;
  }

  public  int money(){
     return util.money();
  }

}
