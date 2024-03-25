package com.reactgame.lilmonsterapp.monsterInfra.monsterService;

import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;

import java.util.List;

public interface MonsterService {

    public List<LilMonsterRepresentation> obterTodosMonstros();
    public LilMonsterRepresentation obterMonstro(Long monsterId);
    public LilMonsterRepresentation atualizarMonstro(LilMonsterRepresentation novoMonstro);
    public LilMonsterRepresentation criarMonstro (LilMonsterRepresentation novoMonstro);
}
