package com.isep.rpg;

public abstract class Hero extends Game {
	public String Hero;
	public int HP;
	public int Armor;
	public int WeaponDamage;
	public Hero(String Hero, int HP, int Armor, int WeaponDamage){
		this.Hero = Hero;
		this.HP = HP;
		this.Armor = Armor;
		this.WeaponDamage = WeaponDamage;
	}
	
	
}
