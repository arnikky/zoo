package com.ing.zoo;
import com.ing.zoo.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
import java.util.Scanner;


public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        List<Animal> animals = new ArrayList<>();

        Lion henk = new Lion();
        henk.name = "henk";
        animals.add(henk);

        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        animals.add(elsa);

        Pig dora = new Pig();
        dora.name = "dora";
        animals.add(dora);

        Tiger wally = new Tiger();
        wally.name = "wally";
        animals.add(wally);

        Zebra marty = new Zebra();
        marty.name = "marty";
        animals.add(marty);

	Chimpanzee charlie = new Chimpanzee();
	charlie.name = "charlie";
	animals.add(charlie);

	Elephant maximus = new Elephant();
	maximus.name = "maximus";
	animals.add(maximus);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");
  
	String input = scanner.nextLine();

	for (Animal animal : animals) {

	//commando 0 ----- hello
	if (input.contains(commands[0])){

		//"hello" met een naam er achter
        	if (input.contains(animal.name)) {
                	animal.sayHello();					
			break;

		//"hello" zonder argument (broadcast)
		}else if(input.equals(commands[0])){
			animal.sayHello();}	
	 
	//commando 1 ----- give leaves
	}else if(input.contains(commands[1])){
		animal.eatLeaves();
		    	
	//commando 2 ----- give meat
	}else if(input.contains(commands[2])){
		animal.eatMeat();

	//commando 3 ----- perform trick
	}else if(input.contains(commands[3])){
		animal.performTrick();
	     

        }
	}}    }
