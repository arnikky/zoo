package com.ing.zoo.util;

public class Hippo extends Animal {

    public Hippo()
    {
    }

    public void sayHello()
    {
        helloText = "splash";
    	super.sayHello();
    }

    public void eatLeaves()
    {
        eatText = "munch munch lovely";
    	super.eatLeaves();
    }
}
