package com.reactgame.lilmonsterapp.monsterInfra.mappers;

import com.reactgame.lilmonsterapp.core.entity.LilMonster;
import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;

public class LilMonsterMapper {

    public LilMonsterRepresentation toRepresentation(LilMonster lilMonsterEntity){

        LilMonsterRepresentation lilMonsterRepresentation = new LilMonsterRepresentation(
                lilMonsterEntity.getLilMonster_Id(),
                lilMonsterEntity.getName(),
                lilMonsterEntity.getHealthPoints(),
                lilMonsterEntity.getStamina(),
                lilMonsterEntity.getAttackPoints(),
                lilMonsterEntity.getDefencePoints(),
                lilMonsterEntity.getMonsterPicId(),
                lilMonsterEntity.getMonsterTypePicId(),
                lilMonsterEntity.getDescription(),
                lilMonsterEntity.getMonsterMaster(),
                lilMonsterEntity.getType(),
                lilMonsterEntity.getWeakness(),
                lilMonsterEntity.getStrengths()
        );

        return lilMonsterRepresentation;
    }

    public LilMonster toEntity(LilMonsterRepresentation lilMonsterRepresentation){
        LilMonster lilMonster = new LilMonster(
                lilMonsterRepresentation.getName(),
                lilMonsterRepresentation.getHealthPoints(),
                lilMonsterRepresentation.getStamina(),
                lilMonsterRepresentation.getAttackPoints(),
                lilMonsterRepresentation.getDefencePoints(),
                lilMonsterRepresentation.getMonsterPicId(),
                lilMonsterRepresentation.getMonsterTypePicId(),
                lilMonsterRepresentation.getDescription(),
                lilMonsterRepresentation.getMonsterMaster()
        );
        return lilMonster;
    }
}
