package com.company;

import java.util.Scanner;

public class Main {

    public static void doMove(Gladiator attacker, Gladiator defender, String move){
        if (move.equals("A")){
            attacker.attack(defender);
        } else if (move.equals("H")){
            attacker.heal();
        } else if (move.equals("S")){
            attacker.skip();
        } else {System.out.println("Your Turn Has Been Skipped Because Of Your Choice!!");}
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Gladiator 1 Name ->");
        String fighter1Name = input.nextLine();
        Gladiator fighter1 = new Gladiator(fighter1Name);
        System.out.println(fighter1.name + " | DamageLow: " + fighter1.low + " |DamageHigh: " + fighter1.high);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Gladiator 2 Name ->");
        String fighter2Name = input2.nextLine();
        Gladiator fighter2 = new Gladiator(fighter2Name);
        System.out.println(fighter2.name + " | DamageLow: " + fighter2.low + " |DamageHigh: " + fighter2.high);

        while (true){

            if (!fighter2.isDead()){
            Scanner moves = new Scanner(System.in);
            System.out.println("[A]ttack\n[H]eal\n[S]kip");
            String move = moves.next().toUpperCase();
            doMove(fighter1, fighter2, move);
                System.out.println(fighter2.name + " | Health: " + fighter2.health + " | Rage: " + fighter2.rage);
            if (fighter2.isDead()){System.out.println(fighter1.name + " WINS!!"); break;}}


            if (!fighter1.isDead()){
            Scanner moves2 = new Scanner(System.in);
            System.out.println("[A]ttack\n[H]eal\n[S]kip");
            String move2 = moves2.nextLine().toUpperCase();
            doMove(fighter2, fighter1, move2);
                System.out.println(fighter1.name + " | Health: " + fighter1.health + " | Rage: " + fighter1.rage);
                if (fighter1.isDead()){System.out.println(fighter2.name + " WINS!!"); break;}}
        }

    }
}
