package com.ing.zoo.util;

import java.util.Random;

public class Animal {
    public String name;
    public String helloText;
    public String eatText;
    public String meatText;
    public String trick;
    public String trick1;
    public String trick2;
    
    //sayhello superfunctie
    public void sayHello() {
        System.out.println(helloText);
    }

    //eatmeat superfunctie
    public void eatMeat(){
	if(meatText != null){System.out.println(meatText);}
    }

    //eatleaves superfunctie
    public void eatLeaves(){
	if(eatText != null){System.out.println(eatText);}
    }

    //trick superfunctie
    public void performTrick(){
	    Random random = new Random();
            int rnd = random.nextInt(2);
            if(rnd == 0){trick = trick1;}
            else{trick = trick2;}
	    if(trick != null){System.out.println(trick);}	
    }
}


