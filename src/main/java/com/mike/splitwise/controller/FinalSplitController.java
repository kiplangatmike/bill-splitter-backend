package com.mike.splitwise.controller;

import com.mike.splitwise.entity.FinalSplit;
import com.mike.splitwise.model.FinalSplitModel;
import com.mike.splitwise.service.FinalSplitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FinalSplit")
@CrossOrigin(origins = "*")
public class FinalSplitController {
    @Autowired
    private FinalSplitService finalSplitService;

    @GetMapping("/{id}")
    public List<FinalSplitModel> getFinalSplit(@PathVariable("id") Long groupID){
        return finalSplitService.getFinalSplit(groupID);
    }


}
