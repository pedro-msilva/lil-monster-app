package com.reactgame.lilmonsterapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name="monsters_types")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class MonsterType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String type;
    private List<MonsterType> weakness;
    private List<MonsterType> strengths;

}
