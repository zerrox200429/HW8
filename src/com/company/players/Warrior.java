package com.company.players;

import com.company.Ability;
import com.company.boss.Boss;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, Ability.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

        heroes[0].setDamage(boss.getDamage()+ heroes[0].getDamage() );



        }
    }

