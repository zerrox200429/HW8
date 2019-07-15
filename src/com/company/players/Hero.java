package com.company.players;

import com.company.Ability;
import com.company.GameEntity;
import com.company.boss.Boss;

public abstract class Hero extends GameEntity implements HavingAbility{

    private Ability ability;

    public Hero(int health, int damage , Ability ability){
        super(health, damage);
        this.ability = ability;
    }

    public Ability getAbility() {
        return ability;
    }
public  void putDamage(int damage ){
        int healthAfterDamage = super.getHealth() - damage;
        super.setHealth(super.getHealth() - damage);
    super.setHealth(super.getHealth());
}


    }

