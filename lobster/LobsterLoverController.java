package com.interview.lobster;
/*
@Author Albert Cai
@Date 2022/04/07
 */

import com.interview.lobster.domain.LobsterLovers;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LobsterLoverController {
    /**
     * @PostMapping only take post request
     * @Param lobsterLovers
     * @return
     *
     * */


    @PostMapping("/lobsterLover")
    public LobsterLovers insertLobsterLovers(LobsterLovers lobsterLovers){
        System.out.println("lobsterLovers add...");
        return lobsterLovers;
    }

    //@GetMapping("/user") only accept get request
    //@return
    @GetMapping("/lobsterLover")
    public List<LobsterLovers> findAllLobsterLovers(){
        System.out.println("find all ...");
        LobsterLovers lobsterLovers1 =new LobsterLovers(1001, "anthony", "123456");
        LobsterLovers lobsterLovers2 =new LobsterLovers(1002,"robert","654321");
        List<LobsterLovers> list=new ArrayList<>();
        list.add(lobsterLovers1);
        list.add(lobsterLovers2);
        return list;
    }

    @DeleteMapping("/lobsterLover/{uid}")
    public LobsterLovers deleteLobsterLovers(@PathVariable Integer uid){
        System.out.println("delete lobsterLovers ..."+uid);
        LobsterLovers lobsterLovers =new LobsterLovers(1001,"anthony", "123456");
        return lobsterLovers;
    }

    @PutMapping("/lobsterLover")
    public LobsterLovers updateLobsterLovers(LobsterLovers lobsterLovers){
        System.out.println("update lobsterLovers ...");
        return lobsterLovers;
    }
}
