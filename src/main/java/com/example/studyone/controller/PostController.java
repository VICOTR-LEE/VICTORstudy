package com.example.studyone.controller;

import com.example.studyone.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){

        return searchParam;
    }

    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }
}
