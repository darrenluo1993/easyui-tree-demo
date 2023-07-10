package com.example.demo.controller;

import com.example.demo.model.TreeData;
import com.example.demo.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.alibaba.fastjson2.JSON.parseArray;

@RestController
@RequestMapping("/division")
public class DivisionController {

    @Autowired
    private DivisionService divisionService;

    @PostMapping("/listRootNode")
    public List<TreeData> listRootNode() {
        return this.divisionService.listRootNode();
    }

    @PostMapping("/listSubNodeBySupNodeId")
    public List<TreeData> listSubNodeBySupNodeId(String supNodeId) {
        return this.divisionService.listSubNodeBySupNodeId(supNodeId);
    }

    @PostMapping("/listCheckedNodeSupNodeId")
    public List<String> listCheckedNodeSupNodeId() {
        return this.divisionService.listCheckedNodeSupNodeId();
    }

    @PostMapping("/listCheckedNodeId")
    public List<String> listCheckedNodeId() {
        return this.divisionService.listCheckedNodeId();
    }

    @PostMapping("/saveCheckedNodes")
    public String saveCheckedNodes(String checkedNodeIds) {
        this.divisionService.saveCheckedNodes(parseArray(checkedNodeIds, String.class));
        return "success";
    }
}
