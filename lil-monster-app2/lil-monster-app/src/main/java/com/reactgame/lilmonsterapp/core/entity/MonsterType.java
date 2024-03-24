package com.reactgame.lilmonsterapp.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="monsters_types")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MonsterType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String type;
    private List<MonsterType> weakness;
    private List<MonsterType> strengths;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<MonsterType> getWeakness() {
        return weakness;
    }

    public void setWeakness(List<MonsterType> weakness) {
        this.weakness = weakness;
    }

    public List<MonsterType> getStrengths() {
        return strengths;
    }

    public void setStrengths(List<MonsterType> strengths) {
        this.strengths = strengths;
    }
}
