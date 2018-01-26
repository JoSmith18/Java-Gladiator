package com.company;

public interface Gladiator {
    String getName();
    void setName(String name);
    void setLow(int Low);
    void setHigh(int High);
    void setRage(int Rage);
    Integer getLow();
    Integer getHigh();
    Integer getRage();
    Integer getHealth();
    void setHealth(int health);
    void attack(Gladiator defender);
    void skip();
    void heal();
    boolean isDead();
}
