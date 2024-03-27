package com.reactgame.lilmonsterapp.monsterInfra.monsterService;

import com.reactgame.lilmonsterapp.core.entity.MonsterType;
import com.reactgame.lilmonsterapp.core.repository.MonsterTypeRepository;
import com.reactgame.lilmonsterapp.exception.MonstroExceptions;
import com.reactgame.lilmonsterapp.monsterInfra.mappers.MonsterTypeMapper;
import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterTypeRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MonsterTypeImpl implements MonsterTypeService {

    @Autowired
    private MonsterTypeRepository monsterTypeRepository;
    @Autowired
    private MonsterTypeMapper monsterTypeMapper;


    @Override
    public List<MonsterTypeRepresentation> obterTodosTipos() {

        var listaMonsterTypeEntity = monsterTypeRepository.findAll();

        List<MonsterTypeRepresentation> listaMonsterTypeRepresentation = new ArrayList<>();

        for(MonsterType monsterTypeEntity:listaMonsterTypeEntity){
            var monsterTypeRepresentation = monsterTypeMapper.toRepresentation(monsterTypeEntity);
            listaMonsterTypeRepresentation.add(monsterTypeRepresentation);
        }

        return listaMonsterTypeRepresentation;
    }

    @Override
    public MonsterTypeRepresentation obterTipo(Long monsterTypeId) {

        Optional<MonsterType> monsterTypeOptional = monsterTypeRepository.findById(monsterTypeId);

        if(monsterTypeOptional.isPresent()){
            return monsterTypeMapper.toRepresentation(monsterTypeOptional.get());
        }else{
            throw new MonstroExceptions("Tipo de monster não encontrado");
        }
    }

    @Override
    public MonsterTypeRepresentation criarTipo(MonsterTypeRepresentation novoTipo) {

        MonsterType monsterTypeSalvo = monsterTypeRepository.save(monsterTypeMapper.toEntity(novoTipo));

        return monsterTypeMapper.toRepresentation(monsterTypeSalvo);
    }

    @Override
    public MonsterTypeRepresentation atualizarTipo(MonsterTypeRepresentation novoTipo) {
        var monsterTypeExistente = monsterTypeRepository.findById(novoTipo.getMonsterTypeId()).orElseThrow(() -> new MonstroExceptions("Tipo não Encontrado"));

        var monsterTypeAtualizado = monsterTypeMapper.toEntity(novoTipo);

        return monsterTypeMapper.toRepresentation(monsterTypeRepository.save(monsterTypeAtualizado));
    }

    @Override
    public String deletarTipo(Long monsterTypeId) {

        try {
            monsterTypeRepository.deleteById(monsterTypeId);
            return "Tipo de Monstro Deletado com sucesso";
        }
        catch (EmptyResultDataAccessException e) {
            throw new MonstroExceptions("Nenhum Tipo de Monstro com esse ID foi encontrado.");
        }
    }
}
