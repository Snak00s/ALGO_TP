package com.isep.rpg;

public class Healer extends Spellcaster {

	public Healer(String Hero, int HP, int Armor, int Mana, int WeaponDamage) {
		super(Hero, HP, Armor, Mana, WeaponDamage);
		Hero = "Sona";
		HP = 20;
		Armor = 5;
		Mana = 50;
		WeaponDamage = 2;
	}
}
