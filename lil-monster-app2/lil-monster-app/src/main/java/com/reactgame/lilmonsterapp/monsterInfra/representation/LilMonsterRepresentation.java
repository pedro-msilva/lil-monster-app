package com.reactgame.lilmonsterapp.monsterInfra.representation;

import com.reactgame.lilmonsterapp.core.entity.LilMonster;
import com.reactgame.lilmonsterapp.core.entity.MonsterMaster;
import com.reactgame.lilmonsterapp.monsterInfra.monstersInterfaces.LilMonsterActions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class LilMonsterRepresentation implements LilMonsterActions {

    private Long id;
    private String name;
    private Integer healthPoints;
    private Integer stamina;
    private Integer attackPoints;
    private Integer defencePoints;
    private String monsterPicId;
    private String monsterTypePicId;
    private String description;
    private Long monsterMasterId;
    private Long monsterTypeId;

    public LilMonsterRepresentation(Long id, String name, Integer healthPoints, Integer stamina, Integer attackPoints, Integer defencePoints, String monsterPicId, String monsterTypePicId, String description, Long monsterMasterId, Long monsterTypeId) {
        this.id = id;
        this.name = name;
        this.healthPoints = healthPoints;
        this.stamina = stamina;
        this.attackPoints = attackPoints;
        this.defencePoints = defencePoints;
        this.monsterPicId = monsterPicId;
        this.monsterTypePicId = monsterTypePicId;
        this.description = description;
        this.monsterMasterId = monsterMasterId;
        this.monsterTypeId = monsterTypeId;
    }

    public LilMonsterRepresentation(){};

    public Long getMonsterTypeId() {
        return monsterTypeId;
    }

    public void setMonsterTypeId(Long monsterTypeId) {
        this.monsterTypeId = monsterTypeId;
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

    public Integer getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }

    public Integer getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(Integer attackPoints) {
        this.attackPoints = attackPoints;
    }

    public Integer getDefencePoints() {
        return defencePoints;
    }

    public void setDefencePoints(Integer defencePoints) {
        this.defencePoints = defencePoints;
    }

    public String getMonsterPicId() {
        return monsterPicId;
    }

    public void setMonsterPicId(String monsterPicId) {
        this.monsterPicId = monsterPicId;
    }

    public String getMonsterTypePicId() {
        return monsterTypePicId;
    }

    public void setMonsterTypePicId(String monsterTypePicId) {
        this.monsterTypePicId = monsterTypePicId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getMonsterMasterId() {
        return monsterMasterId;
    }

    public void setMonsterMasterId(Long monsterMasterId) {
        this.monsterMasterId = monsterMasterId;
    }

    @Override
    public Integer weakAttack(LilMonster attackingMonster, LilMonster defendingMonster) {
        return null;
    }

    @Override
    public Integer strongAttack(LilMonster attackingMonster, LilMonster defendingMonster) {
        return null;
    }

    @Override
    public Integer defence(LilMonster defendingMonster, LilMonster attackingMonster) {
        return null;
    }
}
