package com.reactgame.lilmonsterapp.core.entity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="masters")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MonsterMaster{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long monsterMaster_Id;
    private String name;
    private String profilePicId;
    @OneToMany(mappedBy = "monsterMaster", cascade = CascadeType.ALL)
    private List<LilMonster> lilMonsters;

    public MonsterMaster(String name, String profilePicId, List<LilMonster> lilMonsters) {
    }

    public Long getMonsterMaster_Id() {
        return monsterMaster_Id;
    }

    public void setMonsterMaster_Id(Long monsterMaster_Id) {
        this.monsterMaster_Id = monsterMaster_Id;
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
