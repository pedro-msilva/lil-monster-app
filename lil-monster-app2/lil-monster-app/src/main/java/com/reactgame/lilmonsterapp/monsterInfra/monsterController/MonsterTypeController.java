package com.reactgame.lilmonsterapp.monsterInfra.monsterController;

import com.reactgame.lilmonsterapp.monsterInfra.monsterService.MonsterService;
import com.reactgame.lilmonsterapp.monsterInfra.monsterService.MonsterTypeService;
import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterTypeRepresentation;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/monterType")
public class MonsterTypeController {

    @Autowired
    private MonsterTypeService monsterService;
    //retorna todos os tipos
    @GetMapping(value = "/obterMonstros")
    @ApiOperation(value="Retorna todos os Monstros")
    public ResponseEntity<List<MonsterTypeRepresentation>> obterTodosTipos(){
        return new ResponseEntity<>(monsterService.obterTodosTipos(), HttpStatus.OK);
    }

    //retorna tipo especifico
    @GetMapping(value = "/obterTipo/{monsterTypeId}")
    public ResponseEntity<MonsterTypeRepresentation> obterTipo(@PathVariable Long monsterTypeId){

        return new ResponseEntity<>(monsterService.obterTipo(monsterTypeId), HttpStatus.OK) ;
    }

    //criar um tipo
    @PostMapping(value = "/criarTipo")
    public ResponseEntity<MonsterTypeRepresentation> criarTipo(@RequestBody MonsterTypeRepresentation novoTipo){

        return new ResponseEntity<>(monsterService.criarTipo(novoTipo), HttpStatus.OK);
    }

    //atualizar um tipo
    @PostMapping(value = "/atualizarTipo")
    public ResponseEntity<MonsterTypeRepresentation> atualizarTipo(@RequestBody MonsterTypeRepresentation novoTipo){
        return new ResponseEntity<>(monsterService.atualizarTipo(novoTipo),HttpStatus.OK);
    }

    //deletar monster
    @DeleteMapping(value="/deletarTipo/{monsterTypeId}")
    public  ResponseEntity<String> deletarTipo(@PathVariable Long monsterTypeId){
        return new ResponseEntity<>(monsterService.deletarTipo(monsterTypeId), HttpStatus.OK);
    }


}
