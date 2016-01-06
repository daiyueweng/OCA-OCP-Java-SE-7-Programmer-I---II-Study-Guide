package com.foo.in;
import com.foo.*;
class Hammer{
    public void hit(){
        Bleh b = new Bleh();
        System.out.print(b.a + " ");
        b.say(8);
    }
    public static void main (String[] args) {
        new Hammer().hit();
    }
}