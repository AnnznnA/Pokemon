package com.annz.pokemon.Domain;

import lombok.ToString;

@ToString
public class Characteristic {
    private int Characteristicid;//特性id
    private String Characteristicname;//特性名称
    private String Characteristicinfo;//特性信息

    public int getCharacteristicid() {
        return Characteristicid;
    }

    public void setCharacteristicid(int characteristicid) {
        Characteristicid = characteristicid;
    }

    public String getCharacteristicname() {
        return Characteristicname;
    }

    public void setCharacteristicname(String characteristicname) {
        Characteristicname = characteristicname;
    }

    public String getCharacteristicinfo() {
        return Characteristicinfo;
    }

    public void setCharacteristicinfo(String characteristicinfo) {
        Characteristicinfo = characteristicinfo;
    }

    public void info()
    {
        System.err.println("characteristic class");
    }
}