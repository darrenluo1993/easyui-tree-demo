package com.example.demo.service;

import com.example.demo.model.TreeData;

import java.util.List;

public interface DivisionService {

    List<TreeData> listRootNode();

    List<TreeData> listSubNodeBySupNodeId(String supNodeId);

    List<String> listCheckedNodeSupNodeId();

    List<String> listCheckedNodeId();

    void saveCheckedNodes(List<String> checkedNodeIds);
}
