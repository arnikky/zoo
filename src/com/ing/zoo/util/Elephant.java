package com.ing.zoo.util;

public class Elephant extends Animal {

    public Elephant()
    {
    }

    public void sayHello()
    {
        helloText = "Toot-toot";
    	super.sayHello();
    }

    public void eatLeaves()
    {
        eatText = "munch munch great";
    	super.eatLeaves();
    }
}
