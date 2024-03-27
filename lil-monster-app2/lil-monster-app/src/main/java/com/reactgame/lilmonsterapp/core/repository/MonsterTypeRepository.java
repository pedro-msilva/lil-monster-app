package com.reactgame.lilmonsterapp.core.repository;

import com.reactgame.lilmonsterapp.core.entity.MonsterType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterTypeRepository extends JpaRepository<MonsterType,Long> {
}
