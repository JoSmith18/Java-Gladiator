package com.company;
import java.util.Random;

public class Gladiator {
public String name;
public Integer health;
public Integer rage;
public Integer low;
public Integer high;
Random rand = new Random();

Gladiator(String name){
    this.name = name;
    this.health = 100;
    this.rage = 0;
    this.low = Integer.min(rand.nextInt(10) + 5 ,rand.nextInt(10) + 5);
    this.high = Integer.max(rand.nextInt(20) + 5 ,rand.nextInt(20) + 5);
}




public void attack(Gladiator defender){
    if (rand.nextInt(100) + 1 < this.rage){
        int attack = rand.nextInt(this.high) + this.low;
        defender.health -= 2 * attack;
    defender.health = Integer.max(defender.health, 0);
    System.out.println("That Was My Crit Hit for " + attack+ "!!");
    this.rage = 0;} else{
        int attack = rand.nextInt(this.high) + this.low;
        defender.health -= attack;
        defender.health = Integer.max(defender.health, 0);
        this.rage += 15;
        System.out.println("That Hit Landed for "+ attack + ".");
    }

}

public void heal(){
    if (this.rage > 10){
        this.health += 10;
        this.rage -= 10;
    }
}

public void skip(){
    this.rage += 15;
}

public boolean isDead(){
    if (this.health < 1){
        return true;
    }else{
        return false;}
}
}
