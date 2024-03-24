package com.reactgame.lilmonsterapp.monsterInfra;


import com.reactgame.lilmonsterapp.core.entity.LilMonster;

public interface LilMonsterActions {

    public Integer weakAttack(LilMonster attackingMonster, LilMonster defendingMonster );
    public Integer strongAttack(LilMonster attackingMonster, LilMonster defendingMonster);
    public Integer defence(LilMonster defendingMonster, LilMonster attackingMonster);

}
