package com.ing.zoo.util;

import java.util.Random;

public class Zebra extends Animal {
    public String trick;

    public Zebra()
    {
    }
    public void sayHello()
    {
        helloText = "zebra zebra";
	super.sayHello();
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        super.eatLeaves();
    }
}
