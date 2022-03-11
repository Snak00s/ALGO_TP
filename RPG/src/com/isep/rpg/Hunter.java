package com.isep.rpg;

public class Hunter extends Hero {
	public int Arrow;
	public Hunter(String Hero, int HP, int Armor, int Arrow, int WeaponDamage) {
		super(Hero, HP, Armor, WeaponDamage);
		Hero = "Les godasses";
		HP = 20;
		Armor = 15;
		Arrow = 5;
		WeaponDamage = 20;
	}
}



