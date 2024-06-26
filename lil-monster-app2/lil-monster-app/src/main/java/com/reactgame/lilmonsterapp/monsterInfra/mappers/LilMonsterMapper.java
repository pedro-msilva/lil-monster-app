package com.reactgame.lilmonsterapp.monsterInfra.mappers;

import com.reactgame.lilmonsterapp.core.entity.LilMonster;
import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;
import org.springframework.stereotype.Component;

@Component
public class LilMonsterMapper {

    public static LilMonsterRepresentation toRepresentation(LilMonster lilMonsterEntity){

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
                lilMonsterEntity.getMonsterMasterId(),
                lilMonsterEntity.getMonsterTypeId()
        );

        return lilMonsterRepresentation;
    }

    public static LilMonster toEntity(LilMonsterRepresentation lilMonsterRepresentation){
        LilMonster lilMonster = new LilMonster(
                lilMonsterRepresentation.getId(),
                lilMonsterRepresentation.getName(),
                lilMonsterRepresentation.getHealthPoints(),
                lilMonsterRepresentation.getStamina(),
                lilMonsterRepresentation.getAttackPoints(),
                lilMonsterRepresentation.getDefencePoints(),
                lilMonsterRepresentation.getMonsterPicId(),
                lilMonsterRepresentation.getMonsterTypePicId(),
                lilMonsterRepresentation.getDescription(),
                lilMonsterRepresentation.getMonsterMasterId(),
                lilMonsterRepresentation.getMonsterTypeId()
        );
        return lilMonster;
    }
}
