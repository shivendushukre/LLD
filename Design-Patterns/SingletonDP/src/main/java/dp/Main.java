package main.java.dp;

/**
 * Problem solved by Singleton DP - When only one instance of the class is needed (shared resource)
 * Singleton class never accepts a parameter
 * If it accepts a parameter, then it becomes a factory. So avoid it
 * Eager Loading - The instance is already initialized as soon as the application is up.
 * Lazy Loading - The instance is initialized only when any App module calls for it.
 * */

/**
 * Pros:
 * 1. Neat way to handle access to shared global resource.
 * 2. Easy to implement
 * 3. Guarantees 1 instance
 * 4. Solves a well-defined problem
 * Cons:
 * 1. Sometimes abused
 * 2. Used with parameters and confused with Factory
 * */

/*
 * 1. constructor private - need to create object only once, if public we can have multiple objects
 *
 * 2. object creation with the help of method
 *
 * 3. create field to store object is private
 *
 * 4. If your program uses multiple threads, then the object will get created
 *    multiple times which we do not want. Need to use synchronized way of
 *    creating the object.
 * */

/*
 * How to break singleton class?
 *
 * 1. Using Reflection API
 * solution:
 *   1-> if obj is there, then throw exception from inside the constructor
 *   2-> use enum
 *
 * 2. Deserialization:
 * solution: implement readResolve method
 *
 * 3. cloning
 *
 * */


public class Main {
    public static void main(String[] args) throws Exception {
        LoggerSingleton singleton = LoggerSingleton.getInstance();
        System.out.println(singleton.hashCode());

        LoggerSingleton singleton1 = LoggerSingleton.getInstance();
        System.out.println(singleton1.hashCode());

    }
}