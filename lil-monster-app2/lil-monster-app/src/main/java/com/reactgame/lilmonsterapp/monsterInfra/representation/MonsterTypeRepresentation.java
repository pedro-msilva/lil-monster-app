package com.reactgame.lilmonsterapp.monsterInfra.representation;

import com.reactgame.lilmonsterapp.core.entity.LilMonster;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class MonsterTypeRepresentation {

    private Long monsterTypeId;
    private String type;
    private List<String> weakness;
    private List<String> strengths;
    private List<LilMonster> lilMonsters;

    public MonsterTypeRepresentation(Long monsterTypeId, String type, List<String> weakness, List<String> strengths) {
        this.monsterTypeId = monsterTypeId;
        this.type = type;
        this.weakness = weakness;
        this.strengths = strengths;
    }

    public MonsterTypeRepresentation(){}

    public Long getMonsterTypeId() {
        return monsterTypeId;
    }

    public void setMonsterTypeId(Long monsterTypeId) {
        this.monsterTypeId = monsterTypeId;
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

    public List<LilMonster> getLilMonsters() {
        return lilMonsters;
    }

    public void setLilMonsters(List<LilMonster> lilMonsters) {
        this.lilMonsters = lilMonsters;
    }
}

