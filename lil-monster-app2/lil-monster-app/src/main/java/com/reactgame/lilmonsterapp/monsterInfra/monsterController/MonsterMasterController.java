package com.reactgame.lilmonsterapp.monsterInfra.monsterController;

import com.reactgame.lilmonsterapp.monsterInfra.monsterService.MonsterMasterService;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterMasterRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController(value = "/master")
public class MonsterMasterController {

    @Autowired
    MonsterMasterService monsterMasterService;

    //obter todos os masters
    @GetMapping(value = "/obterTodosMasters")
    public @ResponseBody List<MonsterMasterRepresentation> obterTodosMasters(){
        return monsterMasterService.obterTodosMasters();
    }

    //obter master por id
    @GetMapping(value = "/obterMaster/{monsterMasterId}")
    public @ResponseBody MonsterMasterRepresentation obterMaster(@PathVariable Long monsterMasterId){
        return monsterMasterService.obterMaster(monsterMasterId);
    }

    //criar master
    @PostMapping(value="/criarMaster")
    public @ResponseBody MonsterMasterRepresentation criarMaster(@RequestBody MonsterMasterRepresentation novoMaster){
        return monsterMasterService.criarMaster(novoMaster);
    }

    //atualizar master
    @PostMapping(value="/atualizarMaster")
    public @ResponseBody MonsterMasterRepresentation atualizarMaster(@RequestBody MonsterMasterRepresentation novoMaster){
        return monsterMasterService.atualizarMaster(novoMaster);
    }
}
