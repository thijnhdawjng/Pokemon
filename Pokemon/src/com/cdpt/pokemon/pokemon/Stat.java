package com.cdpt.pokemon.pokemon;

public enum Stat {
    HP, ATTACK,  DEFENSE, SPEED;
	
	@Override
    public String toString() {
        return Character.toUpperCase(super.toString().charAt(0)) + super.toString().substring(1).toLowerCase();
    }
}
