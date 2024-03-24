package com.reactgame.lilmonsterapp.monsterInfra.monsterService;

import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterTypeRepresentation;

import java.util.List;

public interface MonsterService {

    public List<LilMonsterRepresentation> obterTodosMonstros();
    public List<MonsterTypeRepresentation> obterTodosTipos();
    public LilMonsterRepresentation obterMonstro(String monsterId);
    public LilMonsterRepresentation atualizarMonstro(LilMonsterRepresentation novoMonstro);
    public LilMonsterRepresentation criarMonstro (LilMonsterRepresentation novoMonstro);
}
