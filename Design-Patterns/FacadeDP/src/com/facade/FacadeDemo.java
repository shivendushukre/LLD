package com.facade;

/**
 * Structural DP
 * A refactoring pattern
 * makes the code clean
 * */

public class FacadeDemo {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.start();
    }
}