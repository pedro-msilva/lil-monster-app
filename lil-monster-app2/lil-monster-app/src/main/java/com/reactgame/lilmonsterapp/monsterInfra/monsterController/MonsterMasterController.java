package com.reactgame.lilmonsterapp.monsterInfra.monsterController;

import com.reactgame.lilmonsterapp.monsterInfra.monsterService.MonsterMasterService;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterMasterRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/api/master")
public class MonsterMasterController {

    @Autowired
    private MonsterMasterService monsterMasterService;

    //obter todos os masters
    @GetMapping(value = "/obterTodosMasters")
    public ResponseEntity<List<MonsterMasterRepresentation>> obterTodosMasters(){
        return new ResponseEntity<>(monsterMasterService.obterTodosMasters(), HttpStatus.OK);
    }

    //obter master por id
    @GetMapping(value = "/obterMaster/{monsterMasterId}")
    public  ResponseEntity<MonsterMasterRepresentation> obterMaster(@PathVariable Long monsterMasterId){
        return new ResponseEntity<>(monsterMasterService.obterMaster(monsterMasterId), HttpStatus.OK);
    }

    //criar master
    @PostMapping(value="/criarMaster")
    public  ResponseEntity<MonsterMasterRepresentation> criarMaster(@RequestBody MonsterMasterRepresentation novoMaster){
        return new ResponseEntity<>(monsterMasterService.criarMaster(novoMaster), HttpStatus.OK);
    }

    //atualizar master
    @PostMapping(value="/atualizarMaster")
    public  ResponseEntity<MonsterMasterRepresentation> atualizarMaster(@RequestBody MonsterMasterRepresentation novoMaster){
        return new ResponseEntity<>(monsterMasterService.atualizarMaster(novoMaster), HttpStatus.OK);
    }
}
