package com.company;

import java.util.Random;

public class UFCFIGHTER implements Gladiator {

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

    public void setHealth(int health) {
        Integer h;
        h = Integer.max(0, health);
        h = Integer.min(200, h);
        this.health = h;
    }

    public Integer getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(int high) {
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

    UFCFIGHTER(String name){
        name = name;
        health = 200;
        rage = 40;
        low = Integer.min(rand.nextInt(20) + 1,rand.nextInt(20) + 1);
        high = Integer.max(Integer.max(low, rand.nextInt(35)) + 5,Integer.max(low, rand.nextInt(35)) + 5);
    }

    public Integer getHealth() {
        return health;
    }


    public void attack(Gladiator defender){
        if (Integer.max(rand.nextInt(100), 25) <= rage){
            int attack = high + low + 10;
            defender.setHealth(defender.getHealth() - attack);
            defender.setHealth(Integer.max(defender.getHealth(), 0));
            System.out.println("You Can't Escape My Rear Choke Hold " + attack+ "!!");
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
            health += 10;
            rage -= 10;
        }
    }

    public void skip(){
        rage = Integer.min(rage + 15, 100);
    }

    public boolean isDead(){
        if (health < 1){
            return true;
        }else{
            return false;}
    }
}
