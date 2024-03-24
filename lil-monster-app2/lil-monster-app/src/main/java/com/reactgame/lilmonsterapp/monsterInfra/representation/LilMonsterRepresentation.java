package com.reactgame.lilmonsterapp.monsterInfra.representation;

import com.reactgame.lilmonsterapp.core.entity.LilMonster;
import com.reactgame.lilmonsterapp.core.entity.MonsterMaster;
import com.reactgame.lilmonsterapp.core.entity.MonsterType;
import com.reactgame.lilmonsterapp.monsterInfra.monstersInterfaces.LilMonsterActions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LilMonsterRepresentation implements LilMonsterActions {

    private String id;
    private String name;
    private Integer healthPoints;
    private Integer stamina;
    private Integer attackPoints;
    private Integer defencePoints;
    private String monsterPicId;
    private String monsterTypePicId;
    private String description;
    private String monsterMaster;
    private String type;
    private List<MonsterType> weakness;
    private List<MonsterType> strengths;

    public LilMonsterRepresentation(String id,String name, Integer healthPoints, Integer stamina, Integer attackPoints, Integer defencePoints, String monsterPicId, String monsterTypePicId, String description, MonsterMaster monsterMaster, String type, List<MonsterType> weakness, List<MonsterType> strengths) {
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

    public String getMonsterMaster() {
        return monsterMaster;
    }

    public void setMonsterMaster(String monsterMaster) {
        this.monsterMaster = monsterMaster;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<MonsterType> getWeakness() {
        return weakness;
    }

    public void setWeakness(List<MonsterType> weakness) {
        this.weakness = weakness;
    }

    public List<MonsterType> getStrengths() {
        return strengths;
    }

    public void setStrengths(List<MonsterType> strengths) {
        this.strengths = strengths;
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
