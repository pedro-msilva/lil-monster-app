package com.reactgame.lilmonsterapp.entity;

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
    private String Id;
    private String name;
    private Integer healthPoints;
    private Integer stamina;
    private Integer attackPoints;
    private Integer defencePoints;
    private String monsterPicId;
    private String monsterTypePicId;
    @ManyToOne
    @JoinColumn(name="monsterMaster_id")
    private MonsterMaster monsterMaster;
}
