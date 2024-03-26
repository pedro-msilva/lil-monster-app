package com.reactgame.lilmonsterapp.monsterInfra.monsterService;

import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterMasterRepresentation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MonsterMasterService {

    public List<MonsterMasterRepresentation> obterTodosMasters();
    public MonsterMasterRepresentation obterMaster(Long monsterMasterId);
    public MonsterMasterRepresentation criarMaster(MonsterMasterRepresentation novoMonstro);
    public MonsterMasterRepresentation atualizarMaster(MonsterMasterRepresentation novoMonstro);

}
