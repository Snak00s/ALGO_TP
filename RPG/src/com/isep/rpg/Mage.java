package com.isep.rpg;

public class Mage extends Spellcaster {

	public Mage(String Hero, int HP, int Armor, int Mana, int WeaponDamage) {
		super(Hero, HP, Armor, Mana, WeaponDamage);
		Hero = "Veigar";
		HP = 20;
		Armor = 5;
		Mana = 50;
		WeaponDamage = 5;
	}
}
