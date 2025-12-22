package com.tnsif.interfacedemo;

interface Greeting {
  void Hello();
}

public class GreetingExecutor {
  public static void main(String[] args) {
    Greeting g = () -> System.out.println("Hello from lambda");
    g.Hello();
  }
}