package com.business.verce.vercia.controller;


import com.business.verce.vercia.model.Batacchi;
import com.business.verce.vercia.model.BatacchiRepo;
import com.business.verce.vercia.model.Verce;
import com.business.verce.vercia.model.VerceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class VerController {

    @Autowired
    private VerceRepo verceRepo;

    @Autowired
    private BatacchiRepo batacchiRepo;


    @GetMapping("/aliasverce")
    public List<Verce> getAllBattone(){

        return verceRepo.findAll();
    }

    @PostMapping("/aliasverce")
    public void addBattone(@RequestBody Verce vercc){

        verceRepo.save(vercc);
    }

    @GetMapping("/batacchi")
    public List<Batacchi> getAllBatacchi(){

        return batacchiRepo.findAll();
    }

    @PostMapping("/batacchi")
    public void addBatacchio(@RequestBody Batacchi batacchio){
        batacchiRepo.save(batacchio);
    }




}
