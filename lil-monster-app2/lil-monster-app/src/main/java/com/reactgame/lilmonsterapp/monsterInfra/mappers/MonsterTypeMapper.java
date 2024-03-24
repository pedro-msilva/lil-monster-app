package com.reactgame.lilmonsterapp.monsterInfra.mappers;

import com.reactgame.lilmonsterapp.core.entity.entity.MonsterType;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterTypeRepresentation;

public class MonsterTypeMapper {

    public MonsterTypeRepresentation toRepresentation(MonsterType monsterType){

        MonsterTypeRepresentation monsterTypeRepresentation = new MonsterTypeRepresentation(
                monsterType.getId(),
                monsterType.getType(),
                monsterType.getWeakness(),
                monsterType.getStrengths()
        );

        return monsterTypeRepresentation;

    }

    public MonsterType toEntity(MonsterTypeRepresentation monsterTypeRepresentation){
        MonsterType monsterType = new MonsterType(
                monsterTypeRepresentation.getType(),
                monsterTypeRepresentation.getWeakness(),
                monsterTypeRepresentation.getStrengths()
        );

        return monsterType;
    }
}
