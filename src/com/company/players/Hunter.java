package com.company.players;

import com.company.Ability;
import com.company.boss.Boss;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int health, int damage) {
        super(health, damage, Ability.CRIRICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random r = new Random();
        int randomNum = r.nextInt(4-2) + 1;
        heroes[3].setDamage(  heroes[3].getDamage() * randomNum );


            }



        }


