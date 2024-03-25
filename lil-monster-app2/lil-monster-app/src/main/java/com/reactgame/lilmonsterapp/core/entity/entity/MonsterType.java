package com.reactgame.lilmonsterapp.core.entity.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

//@Table(name="monsters_types")
//@Entity
@Getter
@Setter
@MappedSuperclass
//@Inheritance(strategy = InheritanceType.JOINED)
public class MonsterType {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private String type;
    private List<String> weakness;
    private List<String> strengths;

    public MonsterType(String type, List<String> weakness, List<String> strengths) {
    }

    public MonsterType() {

    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getWeakness() {
        return weakness;
    }

    public void setWeakness(List<String> weakness) {
        this.weakness = weakness;
    }

    public List<String> getStrengths() {
        return strengths;
    }

    public void setStrengths(List<String> strengths) {
        this.strengths = strengths;
    }
}
