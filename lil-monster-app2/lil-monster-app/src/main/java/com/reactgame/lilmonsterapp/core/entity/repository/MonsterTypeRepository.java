package com.reactgame.lilmonsterapp.core.entity.repository;

import com.reactgame.lilmonsterapp.core.entity.entity.MonsterType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterTypeRepository extends JpaRepository<MonsterType,String> {
}
