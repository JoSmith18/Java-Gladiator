package com.company;

import java.util.Random;

public class Ninja implements Gladiator {
    public String name;
    public Integer health;
    public Integer rage;
    public Integer low;
    public Integer high;
    Random rand = new Random();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getRage() {
        return rage;
    }

    public void setRage(Integer rage) {
        this.rage = rage;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return
                "'" + name + '\'' + " | Health= " +
                        health +
                        " | Rage= " + rage +
                        " | Low= " + low +
                        " | High= " + high
                ;

    }

    Ninja(String name){
        name = name;
        health = 200;
        rage = 15;
        low = Integer.min(rand.nextInt(15) + 1,rand.nextInt(15) + 1);
        high = Integer.max(rand.nextInt(30) + 5 ,rand.nextInt(30) + 5);
    }



    public Integer getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public void attack(Gladiator defender){
        if (rand.nextInt(100) + 1 < rage){
            int attack = high + low;
            defender.setHealth(defender.getHealth() - attack);
            defender.setHealth(Integer.max(defender.getHealth(), 0));
            System.out.println("I Sneaked You For " + attack+ "!!");
            rage = 0;} else{
            int attack = rand.nextInt(high) + low;
            defender.setHealth(defender.getHealth() - attack);
            defender.setHealth(Integer.max(defender.getHealth(), 0));
            rage += 15;
            System.out.println("That Hit Landed for "+ attack + ".");
        }

    }

    public void heal(){
        if (rage > 10){
            health += 15;
            rage -= 10;
        }
    }

    public void skip(){
        rage += 15;
    }

    public boolean isDead(){
        if (health < 1){
            return true;
        }else{
            return false;}
    }
}
