package com.reactgame.lilmonsterapp.core.entity.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="monsters")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class LilMonster extends MonsterType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String lilMonster_Id;
    private String name;
    private Integer healthPoints;
    private Integer stamina;
    private Integer attackPoints;
    private Integer defencePoints;
    private String monsterPicId;
    private String monsterTypePicId;
    private String description;
    @ManyToOne
    @JoinColumn(name="monsterMaster_id")
    private MonsterMaster monsterMaster;

    public LilMonster(String name, Integer healthPoints, Integer stamina, Integer attackPoints, Integer defencePoints, String monsterPicId, String monsterTypePicId, String description, String monsterMaster) {
        super();
    }

    public String getLilMonster_Id() {
        return lilMonster_Id;
    }

    public void setLilMonster_Id(String lilMonster_Id) {
        this.lilMonster_Id = lilMonster_Id;
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

    public MonsterMaster getMonsterMaster() {
        return monsterMaster;
    }

    public void setMonsterMaster(MonsterMaster monsterMaster) {
        this.monsterMaster = monsterMaster;
    }
}
