package com.company;

<<<<<<< HEAD
/**
 * Created by dev on 17/10/2015.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
=======
<<<<<<< HEAD
import com.company.ISaveable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dev on 30/09/15.
 */
public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
>>>>>>> a98d9e3d0b68b1aa64fdcb4002df7e7b5b2c81e1
    }

    public String getName() {
        return name;
    }
<<<<<<< HEAD
=======

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() >0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }














=======
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <=0){
            System.out.println("Player knocked out");

        }
    }
    public int healthRemaining(){
        return this.health;
    }
>>>>>>> 29cdb74cc1866fc209e15541b5d921e95300eab4
>>>>>>> a98d9e3d0b68b1aa64fdcb4002df7e7b5b2c81e1
}
