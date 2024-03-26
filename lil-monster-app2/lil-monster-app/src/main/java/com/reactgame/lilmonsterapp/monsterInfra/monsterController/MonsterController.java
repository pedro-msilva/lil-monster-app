package com.reactgame.lilmonsterapp.monsterInfra.monsterController;

import com.reactgame.lilmonsterapp.exception.MonstroExceptions;
import com.reactgame.lilmonsterapp.monsterInfra.monsterService.MonsterService;
import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lilmonster")
public class MonsterController {

    @Autowired
    MonsterService monsterService;
    //retorna todos os monstros
    @GetMapping(value = "obterMonstros")
    public @ResponseBody List<LilMonsterRepresentation> obterTodosMonstros(){
        return monsterService.obterTodosMonstros();
    }

    //retorna monstro especifico
    @GetMapping(value = "obterMonstro/{monsterId}")
    public @ResponseBody LilMonsterRepresentation obterMonstro(@PathVariable Long monsterId){

        return monsterService.obterMonstro(monsterId);
    }

    //criar um monstro
    @PostMapping(value = "/criarMonstro")
    public @ResponseBody LilMonsterRepresentation criarMonstro(@RequestBody LilMonsterRepresentation novoMonstro){

        return monsterService.criarMonstro(novoMonstro);
    }

    //atualizar um monstro
    @PostMapping(value = "/atualizarMonstro")
    public @ResponseBody LilMonsterRepresentation atualizarMonstro(@RequestBody LilMonsterRepresentation novoMonstro){
            return monsterService.atualizarMonstro(novoMonstro);
    }


}
