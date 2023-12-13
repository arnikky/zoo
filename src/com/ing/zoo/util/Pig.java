package com.ing.zoo.util;

import java.util.Random;

public class Pig extends Animal {
    public String trick;

    public Pig()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
        super.sayHello();
    }

    public void eatLeaves()
    {
        eatText = "munch munch oink";
        super.eatLeaves();
    }

    public void eatMeat()
    {
        meatText = "nomnomnom oink thx";
        super.eatMeat();
    }

    public void performTrick()
    {
	trick1 = "rolls in the mud";
	trick2 = "runs in circles";
	super.performTrick();
    }
}
