package com.reactgame.lilmonsterapp.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@MappedSuperclass
public class MonsterType {

    private String type;
    private List<String> weakness;
    private List<String> strengths;

    public MonsterType(String type, List<String> weakness, List<String> strengths) {
        this.type = type;
        this.weakness = weakness;
        this.strengths = strengths;
    }

    public MonsterType() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getWeakness() {
        return weakness;
    }

    public void setWeakness(List<String> weakness) {
        this.weakness = weakness;
    }

    public List<String> getStrengths() {
        return strengths;
    }

    public void setStrengths(List<String> strengths) {
        this.strengths = strengths;
    }
}
