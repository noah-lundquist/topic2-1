package app;

import java.util.Random;

public class Game {
	
	public static void main(String[] args)
	{
	Random rand = new Random();
	//generates random starting health
	int health1 = rand.ints(1,(1000 + 1)).findFirst().getAsInt();

	int health2 = rand.ints(1,(1000 + 1)).findFirst().getAsInt();
	
	//create superman and batman
	
	System.out.println("Creating our superheros...");
	Superman superman = new Superman(health1);
	Batman batman = new Batman(health2);
	System.out.println("Superheros created");
	
	
	System.out.println("running our game...");
	
	while(!superman.isDead() && !batman.isDead())
	{
		superman.attack(batman);
		batman.attack(superman);
	}
	if(superman.isDead())
	{
		System.out.println("Batman defeated superman");
		
	}
	if(superman.isDead())
	{
		System.out.println("Superman deafested batman");
	}

}
	}
