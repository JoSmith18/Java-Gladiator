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
    System.out.println("I am coming!!");
    defender.health -= rand.nextInt(this.high) + this.low;
    defender.health = Integer.max(defender.health, 0);
    this.rage += 15;
}

public void heal(){
    if (this.rage > 10){
        this.health += 10;
    }
}

public boolean isDead(){
    if (this.health < 1){
        return true;
    }else{
        return false;}
}
}
