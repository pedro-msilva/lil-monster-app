package com.reactgame.lilmonsterapp.monsterInfra.monsterController;

import com.reactgame.lilmonsterapp.monsterInfra.monsterService.MonsterService;
import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/lilmonster")
public class MonsterController {

    @Autowired
    private MonsterService monsterService;
    //retorna todos os monstros
    @GetMapping(value = "/obterMonstros")
    @ApiOperation(value="Retorna todos os Monstros")
    public ResponseEntity<List<LilMonsterRepresentation>> obterTodosMonstros(){
        return new ResponseEntity<>(monsterService.obterTodosMonstros(), HttpStatus.OK);
    }

    //retorna monstro especifico
    @GetMapping(value = "/obterMonstro/{monsterId}")
    public ResponseEntity<LilMonsterRepresentation> obterMonstro(@PathVariable Long monsterId){

        return new ResponseEntity<>(monsterService.obterMonstro(monsterId), HttpStatus.OK) ;
    }

    //criar um monstro
    @PostMapping(value = "/criarMonstro")
    public ResponseEntity<LilMonsterRepresentation> criarMonstro(@RequestBody LilMonsterRepresentation novoMonstro){

        return new ResponseEntity<>(monsterService.criarMonstro(novoMonstro), HttpStatus.OK);
    }

    //atualizar um monstro
    @PostMapping(value = "/atualizarMonstro")
    public ResponseEntity<LilMonsterRepresentation> atualizarMonstro(@RequestBody LilMonsterRepresentation novoMonstro){
            return new ResponseEntity<>(monsterService.atualizarMonstro(novoMonstro),HttpStatus.OK);
    }


}
