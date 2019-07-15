package com.company.players;

import com.company.Ability;
import com.company.boss.Boss;

import java.util.Random;

public class Magical extends Hero {

    public Magical(int health, int damage) {
        super(health, damage, Ability.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (int i = 1; i <heroes.length; i++){
        heroes[i].setDamage(  heroes[i].getDamage()  + 20 );
        }
    }
}



