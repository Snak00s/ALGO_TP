package com.isep.rpg;

public class Warrior extends Hero{
	public Warrior(String Hero, int HP, int Armor, int WeaponDamage) {
		super(Hero, HP, Armor, WeaponDamage);
		Hero = "Guts";
		HP = 20;
		Armor = 20;
		WeaponDamage = 10;
	}
	
}
