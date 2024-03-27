package com.reactgame.lilmonsterapp.monsterInfra.mappers;

import com.reactgame.lilmonsterapp.core.entity.MonsterType;
import com.reactgame.lilmonsterapp.core.repository.MonsterTypeRepository;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterTypeRepresentation;
import org.springframework.stereotype.Component;

@Component
public class MonsterTypeMapper {

    public MonsterTypeRepresentation toRepresentation(MonsterType monsterTypeEntity){

        return new MonsterTypeRepresentation(
                monsterTypeEntity.getMonsterTypeId(),
                monsterTypeEntity.getType(),
                monsterTypeEntity.getWeakness(),
                monsterTypeEntity.getStrengths()
        );

    };

    public MonsterType toEntity(MonsterTypeRepresentation monsterTypeRepresentation){

        return new MonsterType(
                monsterTypeRepresentation.getMonsterTypeId(),
                monsterTypeRepresentation.getType(),
                monsterTypeRepresentation.getWeakness(),
                monsterTypeRepresentation.getStrengths()
        );

    }


}
