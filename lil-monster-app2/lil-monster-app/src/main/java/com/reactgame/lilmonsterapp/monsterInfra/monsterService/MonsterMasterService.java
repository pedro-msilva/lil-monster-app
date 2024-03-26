package com.reactgame.lilmonsterapp.monsterInfra.monsterService;

import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterMasterRepresentation;

import java.util.List;

public interface MonsterMasterService {

    public List<MonsterMasterRepresentation> obterTodosMasters();
    public MonsterMasterRepresentation obterMaster(Long monsterMasterId);
    public MonsterMasterRepresentation criarMaster(MonsterMasterRepresentation novoMonstro);
    public MonsterMasterRepresentation atualizarMaster(MonsterMasterRepresentation novoMonstro);

}
