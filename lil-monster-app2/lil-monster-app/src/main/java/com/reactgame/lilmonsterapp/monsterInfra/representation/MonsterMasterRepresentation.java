package com.reactgame.lilmonsterapp.monsterInfra.representation;

import com.reactgame.lilmonsterapp.core.entity.entity.LilMonster;
import com.reactgame.lilmonsterapp.monsterInfra.monstersInterfaces.MonsterMasterActions;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MonsterMasterRepresentation implements MonsterMasterActions {

    private String id;
    private String name;
    private String profilePicId;
    private List<LilMonster> lilMonsters;

    public MonsterMasterRepresentation(String id,String name, String profilePicId, List<LilMonster> lilMonsters) {
    }

    @Override
    public String lvlUpMonster(LilMonster lilMonster) {
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
