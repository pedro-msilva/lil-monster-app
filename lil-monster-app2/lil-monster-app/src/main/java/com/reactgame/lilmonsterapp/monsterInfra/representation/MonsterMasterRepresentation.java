package com.reactgame.lilmonsterapp.monsterInfra.representation;

import com.reactgame.lilmonsterapp.core.entity.LilMonster;
import com.reactgame.lilmonsterapp.monsterInfra.monstersInterfaces.MonsterMasterActions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MonsterMasterRepresentation implements MonsterMasterActions {

    private Long id;
    private String name;
    private String profilePicId;
    private List<LilMonster> lilMonsters;

    public MonsterMasterRepresentation(Long id, String name, String profilePicId) {
        this.id = id;
        this.name = name;
        this.profilePicId = profilePicId;
    }

    @Override
    public String lvlUpMonster(LilMonster lilMonster) {
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePicId() {
        return profilePicId;
    }

    public void setProfilePicId(String profilePicId) {
        this.profilePicId = profilePicId;
    }

    public List<LilMonster> getLilMonsters() {
        return lilMonsters;
    }

    public void setLilMonsters(List<LilMonster> lilMonsters) {
        this.lilMonsters = lilMonsters;
    }
}
