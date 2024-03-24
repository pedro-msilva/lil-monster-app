package com.reactgame.lilmonsterapp.monsterInfra;

import com.reactgame.lilmonsterapp.core.entity.MonsterMaster;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterMasterRepresentation;

public class MonsterMasterMapper {

    public MonsterMasterRepresentation toRepresentation(MonsterMaster monsterMaster){

        MonsterMasterRepresentation monsterMasterRepresentation = new MonsterMasterRepresentation(
            monsterMaster.getName(),monsterMaster.getProfilePicId(),monsterMaster.getLilMonsters()
        );
        return monsterMasterRepresentation;

    }

    public MonsterMaster toEntity(MonsterMasterRepresentation monsterMasterRepresentation){

        MonsterMaster monsterMaster = new MonsterMaster(
                monsterMasterRepresentation.getName(),monsterMasterRepresentation.getProfilePicId(),monsterMasterRepresentation.getLilMonsters()
        );
        return monsterMaster;

    }

}