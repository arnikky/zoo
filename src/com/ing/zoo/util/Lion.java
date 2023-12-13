package com.ing.zoo.util;

public class Lion extends Animal {

    public Lion()
    {
    }

    public void sayHello()
    {
        helloText = "roooaoaaaaar";
    	super.sayHello();
    }

    public void eatMeat()
    {
        meatText = "nomnomnom thx mate";

        super.eatMeat();
    }
}
