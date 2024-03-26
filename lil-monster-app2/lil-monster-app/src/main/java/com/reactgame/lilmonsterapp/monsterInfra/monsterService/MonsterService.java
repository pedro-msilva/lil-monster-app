package com.reactgame.lilmonsterapp.monsterInfra.monsterService;

import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MonsterService {

    public List<LilMonsterRepresentation> obterTodosMonstros();
    public LilMonsterRepresentation obterMonstro(Long monsterId);
    public LilMonsterRepresentation atualizarMonstro(LilMonsterRepresentation novoMonstro);
    public LilMonsterRepresentation criarMonstro (LilMonsterRepresentation novoMonstro);
    public String deletarMonster(Long monsterId);
}
