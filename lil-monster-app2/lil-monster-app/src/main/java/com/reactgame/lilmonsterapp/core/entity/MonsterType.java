package com.reactgame.lilmonsterapp.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name="monster_type")
@Entity
@Getter
@Setter
public class MonsterType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long monsterTypeId;
    private String type;
    private List<String> weakness;
    private List<String> strengths;
    @OneToMany(mappedBy = "monsterTypeId", cascade = CascadeType.ALL)
    private List<LilMonster> lilMonsters = new ArrayList<>();

    public MonsterType(String type, List<String> weakness, List<String> strengths) {
        this.type = type;
        this.weakness = weakness;
        this.strengths = strengths;
    }

    public MonsterType(Long monsterTypeId,String type, List<String> weakness, List<String> strengths) {
        this.monsterTypeId = monsterTypeId;
        this.type = type;
        this.weakness = weakness;
        this.strengths = strengths;
    }

    public MonsterType() {

    }

    public Long getMonsterTypeId() {
        return monsterTypeId;
    }

    public void setMonsterTypeId(Long monsterTypeId) {
        this.monsterTypeId = monsterTypeId;
    }

    public List<LilMonster> getLilMonsters() {
        return lilMonsters;
    }

    public void setLilMonsters(List<LilMonster> lilMonsters) {
        this.lilMonsters = lilMonsters;
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
