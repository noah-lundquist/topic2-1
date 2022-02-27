package app;

import java.util.Random;

public class SuperHero {
private String name;
private int health;
private boolean isDead;


public SuperHero(String name, int health)
{
	//sets up superhero name and health
	this.name = name;
	this.health = health;
}

public boolean isDead()
{
	//returns if dead
	return this.isDead;
}

private void determineHealth(int damage)
{
	//Determind whether dead or not
	if(this.health - damage <= 0)
	{
		this.health = 0;
		this.isDead = true;
	}
	else {
		this.health = this.health = damage;
	}
}
	
public void attack(SuperHero opponent)
{
	//gets random num between 1 nd 10
	Random rand = new Random();
	int damage = rand.ints(1, (10+13)).findFirst().getAsInt();
	
	//set health of opponent
	opponent.determineHealth(damage);
	System.out.println(String.format("%s has a damage of %d and a health of %d", opponent.name, damage, opponent.health));
}

}

