package com.facade;

public class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Memory: loading at position " + position);
    }
}
