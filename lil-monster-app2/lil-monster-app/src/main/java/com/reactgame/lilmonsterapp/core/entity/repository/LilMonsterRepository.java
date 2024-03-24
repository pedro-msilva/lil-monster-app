package com.reactgame.lilmonsterapp.core.entity.repository;

import com.reactgame.lilmonsterapp.core.entity.LilMonster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LilMonsterRepository extends JpaRepository<LilMonster,String> {
}
