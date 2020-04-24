package com.annz.pokemon.Domain;

import lombok.ToString;
import org.springframework.context.annotation.Configuration;


@ToString
public class pokemon {
    private int id;
    //全国编号
    private String name;
    //名字
    private int attack;
    private int ap_attack;
    private int HP;
    private int def;
    private int ap_def;
    private int speed;
    private String attribute;//属性
    private String attribute2;//属性
    //种族值
    private double malerate;//雄性比例
    private int exppan;//经验比例
    private int Characteristicid;//特性id

    private String info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAp_attack() {
        return ap_attack;
    }

    public void setAp_attack(int ap_attack) {
        this.ap_attack = ap_attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAp_def() {
        return ap_def;
    }

    public void setAp_def(int ap_def) {
        this.ap_def = ap_def;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getMalerate() {
        return malerate;
    }

    public void setMalerate(double malerate) {
        this.malerate = malerate;
    }

    public int getExppan() {
        return exppan;
    }

    public void setExppan(int exppan) {
        this.exppan = exppan;
    }

    public int getCharacteristicid() {
        return Characteristicid;
    }

    public void setCharacteristicid(int characteristicid) {
        Characteristicid = characteristicid;
    }


    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    public String toString()
    {
        return "The id"+this.id+"named"+this.name;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void info()
    {
        System.err.println("pokemon class");
    }
}
