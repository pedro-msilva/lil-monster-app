package com.reactgame.lilmonsterapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="masters")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class MonsterMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String profilePicId;
    @OneToMany(mappedBy = "monsterMaster", cascade = CascadeType.ALL)
    private List<LilMonster> lilMonsters;
}
