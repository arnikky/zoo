package com.ing.zoo.util;

import java.util.Random;

public class Tiger extends Animal {
    public String trick;

    public Tiger()
    {
    }
    
    public void sayHello()
    {
        helloText = "rraaarww";
    	super.sayHello();
    }

    public void eatMeat()
    {
        meatText = "nomnomnom oink wubalubadubdub";
    	super.eatMeat();
    }

    public void performTrick()
    {
	trick1 = "jumps in tree";
        trick2 = "scratches ears";
	super.performTrick();
    }
}
