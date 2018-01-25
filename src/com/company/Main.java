package com.company;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void doMove(Gladiator attacker, Gladiator defender, String move){
        if (move.equals("A")){
            attacker.attack(defender);
        } else if (move.equals("H")){
            attacker.heal();
        } else if (move.equals("S")){
            attacker.skip();
        }else {System.out.println("Your Turn Has Been Skipped Because Of Your Choice!!");}
    }

public static String findName(String letter){
        if (letter.equals("J")){return "Jo";}
        else if (letter.equals("T")){return "Trey";}
        else if (letter.equals("S")){return "Shedlia";}
        else if (letter.equals("E")){return "Edgar";}
        return "The Boss";


}
public static Gladiator createFighter(String type, String name){
    if (type.equals("F")) {
        return new Fighter(name);
    } else if (type.equals("N"))
    {return new Ninja(name);}
    else if (type.equals("U")){
        return new UFCFIGHTER(name);
    }
    return new Fighter(name);
    }

public static void battle(Gladiator attacker, Gladiator defender, boolean human){
    String move = "A";
    if (human){
        Scanner moves = new Scanner(System.in);
        System.out.println("[A]ttack\n[H]eal\n[S]kip");
        move = moves.next().toUpperCase();
    } else {
        Random rand = new Random();
        String[] moves = {"A","A","A","S","A"};
        move = moves[rand.nextInt(5)];
    }
    doMove(attacker, defender, move);
    System.out.println(defender);
    try {
        Thread.sleep(750);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

}
    public static void main(String[] args) {
        Scanner mode = new Scanner(System.in);
        System.out.println("Pick The Versus:\n\t1.Human Vs Human\n\t2.Human Vs CPU");
        String versus = mode.next();
        if (versus.equals("1")){
        Scanner input = new Scanner(System.in);
        Scanner type = new Scanner(System.in);
        System.out.println("Gladiator 1 Name ->");
        String fighter1Name = input.nextLine();
        System.out.println("Gladiator Type:\n\t[F]ighter\n\t[N]inja\n\t[U]fcFighter");
        String fighterType = type.nextLine().toUpperCase();

        Gladiator fighter1 = createFighter(fighterType, fighter1Name);
        fighter1.setName(fighter1Name);
        System.out.println(fighter1.getName() + " | DamageLow: " + fighter1.getLow() + " |DamageHigh: " + fighter1.getHigh());

        Scanner input2 = new Scanner(System.in);
        Scanner type2 = new Scanner(System.in);
        System.out.println("Gladiator 2 Name ->");
        String fighter2Name = input2.nextLine();
        System.out.println("Gladiator Type:\n\t[F]ighter\n\t[N]inja\n\t[U]fcFighter");
        String fighterType2 = type2.nextLine().toUpperCase();

        Gladiator fighter2 = createFighter(fighterType2, fighter2Name);
        fighter2.setName(fighter2Name);
        System.out.println(fighter2.getName() + " | DamageLow: " + fighter2.getLow() + " |DamageHigh: " + fighter2.getHigh());

        while (true){

            if (!fighter2.isDead()){
                battle(fighter1, fighter2, true);
                if (fighter2.isDead()){System.out.println(fighter1.getName() + " WINS!!"); break;}
            }


            if (!fighter1.isDead()){
                battle(fighter2, fighter1, true);
                    if (fighter1.isDead()){System.out.println(fighter2.getName() + " WINS!!"); break;}}
        }
        }

        else if (versus.equals("2")){
            Scanner input = new Scanner(System.in);
            Scanner type = new Scanner(System.in);
            System.out.println("Gladiator 1 Name ->");
            String fighter1Name = input.nextLine();
            System.out.println("Gladiator Type:\n\t[F]ighter\n\t[N]inja\n\t[U]fcFighter");
            String fighterType = type.nextLine().toUpperCase();

            Gladiator fighter1 = createFighter(fighterType, fighter1Name);
            fighter1.setName(fighter1Name);
            System.out.println(fighter1.getName() + " | DamageLow: " + fighter1.getLow() + " |DamageHigh: " + fighter1.getHigh());

            Scanner type2 = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            System.out.println("Pick The CPU:\n\t[J]o\n\t[T]rey\n\t[S]hedlia\n\t[E]dgar");
            String fighter2Name = findName(input2.nextLine().toUpperCase());
            System.out.println("CPU Type:\n\t[F]ighter\n\t[N]inja\n\t[U]fcFighter");
            String fighterType2 = type2.nextLine().toUpperCase();

            Gladiator fighter2 = createFighter(fighterType2, fighter2Name);
            fighter2.setName(fighter2Name);
            System.out.println(fighter2.getName() + " | DamageLow: " + fighter2.getLow() + " |DamageHigh: " + fighter2.getHigh());

            while (true){

                if (!fighter2.isDead()){
                    battle(fighter1, fighter2, true);

                    if (fighter2.isDead()){System.out.println(fighter1.getName() + " WINS!!"); break;}}


                if (!fighter1.isDead()){
                    battle(fighter2, fighter1, false);
                    if (fighter1.isDead()){System.out.println(fighter2.getName() + " WINS!!"); break;}}
            }}
        }

    }

