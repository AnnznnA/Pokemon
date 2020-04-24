package com.annz.pokemon.Domain;

import lombok.ToString;


@ToString
public class Skill {
    private int skillID;//技能id
    private int power;//威力
    private int HitRate;//命中率
    private String describe;//描述
    private int usinglevel;//先制度
    private String attribute;//属性
    private int type;//0变化1物理2特殊
    private int range;//0自身 1敌单 2敌群 3自身以外 4随机 5全体

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHitRate() {
        return HitRate;
    }

    public void setHitRate(int hitRate) {
        HitRate = hitRate;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getUsinglevel() {
        return usinglevel;
    }

    public void setUsinglevel(int usinglevel) {
        this.usinglevel = usinglevel;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void info()
    {
        System.err.println("skill class");
    }
}