package com.reactgame.lilmonsterapp.monsterInfra.monsterController;

import com.reactgame.lilmonsterapp.core.entity.MonsterType;
import com.reactgame.lilmonsterapp.monsterInfra.representation.LilMonsterRepresentation;
import com.reactgame.lilmonsterapp.monsterInfra.representation.MonsterTypeRepresentation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lilmonster")
public class MonsterController {

    //retorna todos os monstros
    @GetMapping(value = "obterMonstros")
    public List<LilMonsterRepresentation> obterTodosMonstros(){
        return null;
    }

    //retorna todos tipos de monstros
    @GetMapping(value = "obterTipos")
    public List<MonsterTypeRepresentation> obterTodosTipos(){
        return null;
    }

    //retorna monstro especifico
    @GetMapping(value = "obterMonstro/{monsterId}")
    public LilMonsterRepresentation obterMonstro(@PathVariable String monsterId){
        return null;
    }

    //criar um monstro
    @PostMapping(value = "/criarMonstro")
    public LilMonsterRepresentation criarMonstro(@RequestBody LilMonsterRepresentation novoMonstro){
        return null;
    }

    //atualizar um monstro
    @PostMapping(value = "/atualizarMonstro")
    public LilMonsterRepresentation atualizarMonstro(@RequestBody LilMonsterRepresentation novoMonstro){
        return null;
    }


}
