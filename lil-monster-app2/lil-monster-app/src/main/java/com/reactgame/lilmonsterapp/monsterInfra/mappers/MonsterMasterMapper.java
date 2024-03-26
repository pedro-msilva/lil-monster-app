package com.reactgame.lilmonsterapp.monsterInfra.mappers;

import com.reactgame.lilmonsterapp.core.entity.MonsterMaster;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterMasterRepresentation;
import org.springframework.stereotype.Component;

@Component
public class MonsterMasterMapper {

    public static MonsterMasterRepresentation toRepresentation(MonsterMaster monsterMaster){

        MonsterMasterRepresentation monsterMasterRepresentation = new MonsterMasterRepresentation(
            monsterMaster.getMonsterMaster_Id(),monsterMaster.getName(),monsterMaster.getProfilePicId()
        );
        return monsterMasterRepresentation;

    }

    public static MonsterMaster toEntity(MonsterMasterRepresentation monsterMasterRepresentation){

        MonsterMaster monsterMaster = new MonsterMaster(
                monsterMasterRepresentation.getId(),monsterMasterRepresentation.getName(),monsterMasterRepresentation.getProfilePicId()
        );
        return monsterMaster;

    }

}
