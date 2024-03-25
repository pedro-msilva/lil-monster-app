package com.reactgame.lilmonsterapp.monsterInfra.monsterService;

import com.reactgame.lilmonsterapp.core.entity.entity.LilMonster;
import com.reactgame.lilmonsterapp.core.entity.repository.LilMonsterRepository;
import com.reactgame.lilmonsterapp.exception.MonstroExceptions;
import com.reactgame.lilmonsterapp.monsterInfra.mappers.LilMonsterMapper;
import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MonsterServiceImpl implements MonsterService{

    @Autowired
    private LilMonsterRepository monsterRepository;
    @Autowired
    private LilMonsterMapper monsterMapper;

    @Override
    public List<LilMonsterRepresentation> obterTodosMonstros() {

        var listaTodosMonstrosEntity = monsterRepository.findAll();

        var listaTodosMonstrosRepresentation = new ArrayList<LilMonsterRepresentation>();

        for (LilMonster lilMonster:listaTodosMonstrosEntity){

            var lilMonsterRepresentation = monsterMapper.toRepresentation(lilMonster);
            listaTodosMonstrosRepresentation.add(lilMonsterRepresentation);

        }

        return listaTodosMonstrosRepresentation ;
    }


    @Override
    public LilMonsterRepresentation obterMonstro(Long monsterId) {

        Optional<LilMonster> lilMonsterOptional = monsterRepository.findById(monsterId);

        if(lilMonsterOptional.isPresent()){
            return monsterMapper.toRepresentation(lilMonsterOptional.get());
        }else{
            throw new MonstroExceptions("Monstro Nao Foi Possivel Encontrar Este Monstro");
        }
    }

    @Override
    public LilMonsterRepresentation atualizarMonstro(LilMonsterRepresentation novoMonstro) {

        LilMonster lilMonsterExistente = monsterRepository.findById(novoMonstro.getId()).orElseThrow(() -> new MonstroExceptions("Monstro Nao Encontrado"));

        var lilMonsterAtualizado = monsterMapper.toEntity(novoMonstro);

        return monsterMapper.toRepresentation(monsterRepository.save(lilMonsterAtualizado));

    }

    @Override
    public LilMonsterRepresentation criarMonstro(LilMonsterRepresentation novoMonstro) {

        var monstroSalvo = monsterRepository.save(monsterMapper.toEntity(novoMonstro));
        return monsterMapper.toRepresentation(monstroSalvo);
    }
}
