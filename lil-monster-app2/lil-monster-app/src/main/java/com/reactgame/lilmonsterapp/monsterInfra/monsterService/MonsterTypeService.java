package com.reactgame.lilmonsterapp.monsterInfra.monsterService;

import com.reactgame.lilmonsterapp.core.entity.MonsterType;
import com.reactgame.lilmonsterapp.core.repository.MonsterTypeRepository;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterMasterRepresentation;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterTypeRepresentation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MonsterTypeService {

    public List<MonsterTypeRepresentation> obterTodosTipos();
    public MonsterTypeRepresentation obterTipo(Long monsterTypeId);
    public MonsterTypeRepresentation criarTipo(MonsterTypeRepresentation novoTipo);
    public MonsterTypeRepresentation atualizarTipo(MonsterTypeRepresentation novoTipo);
    public String deletarTipo(Long id);

}
