package com.ing.zoo.util;

import java.util.Random;

public class Chimpanzee extends Animal {
    public String trick;

    public Chimpanzee()
    {
    }

    public void sayHello()
    {
        helloText = "Hoo hoo hoo ha ha!";
        super.sayHello();
    }

    public void eatLeaves()
    {
        eatText = "munch munch Ooh ooh";
        super.eatLeaves();
    }

    public void eatMeat()
    {
        meatText = "nomnomnom ooh-ooh, aah-aah, yum yum!";
        super.eatMeat();
    }

    public void performTrick()
    {
	trick1 = "swings from tree";
	trick2 = "does a flip";
	super.performTrick();
    }
}
