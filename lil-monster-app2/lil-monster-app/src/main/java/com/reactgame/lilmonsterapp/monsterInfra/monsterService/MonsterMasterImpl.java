package com.reactgame.lilmonsterapp.monsterInfra.monsterService;

import com.reactgame.lilmonsterapp.core.entity.MonsterMaster;
import com.reactgame.lilmonsterapp.core.repository.MonsterMasterRepository;
import com.reactgame.lilmonsterapp.exception.MonstroExceptions;
import com.reactgame.lilmonsterapp.monsterInfra.mappers.MonsterMasterMapper;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterMasterRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MonsterMasterImpl implements MonsterMasterService {

    @Autowired
    MonsterMasterMapper monsterMasterMapper;
    @Autowired
    MonsterMasterRepository monsterMasterRepository;
    @Override
    public List<MonsterMasterRepresentation> obterTodosMasters() {
        List<MonsterMaster> listaMonsterMasterEntity =  monsterMasterRepository.findAll();
        List<MonsterMasterRepresentation> listaMonsterMasterRepresentation = new ArrayList<>();

        for(MonsterMaster monsterMaster:listaMonsterMasterEntity){
            var monsterMasterRepresentation = monsterMasterMapper.toRepresentation(monsterMaster);
            listaMonsterMasterRepresentation.add(monsterMasterRepresentation);
        }

        return listaMonsterMasterRepresentation;
    }

    @Override
    public MonsterMasterRepresentation obterMaster(Long monsterMasterId) {

        Optional<MonsterMaster> monsterMasterOptional = monsterMasterRepository.findById(monsterMasterId);
        if(monsterMasterOptional.isPresent()){
            return monsterMasterMapper.toRepresentation(monsterMasterOptional.get());
        }else{
            throw new  MonstroExceptions("Master não encontrado");
        }
    }

    @Override
    public MonsterMasterRepresentation criarMaster(MonsterMasterRepresentation novoMaster) {

        var monstroParaSerSalvo = monsterMasterMapper.toEntity(novoMaster);

        return monsterMasterMapper.toRepresentation(monsterMasterRepository.save(monstroParaSerSalvo));
    }

    @Override
    public MonsterMasterRepresentation atualizarMaster(MonsterMasterRepresentation novoMaster) {

        var monsterMasterExistente = monsterMasterRepository.findById(novoMaster.getId()).orElseThrow(() -> new MonstroExceptions("Master não Encontrado"));

        var masterAtualizado = monsterMasterMapper.toEntity(novoMaster);

        return monsterMasterMapper.toRepresentation(monsterMasterRepository.save(masterAtualizado));
    }
}
