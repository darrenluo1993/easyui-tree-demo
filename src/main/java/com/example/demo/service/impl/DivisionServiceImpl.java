package com.example.demo.service.impl;

import com.example.demo.mapper.DivisionMapper;
import com.example.demo.model.TreeData;
import com.example.demo.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {

    @Autowired
    private DivisionMapper divisionMapper;

    @Override
    public List<TreeData> listRootNode() {
        return this.divisionMapper.listRootNode();
    }

    @Override
    public List<TreeData> listSubNodeBySupNodeId(String supNodeId) {
        return this.divisionMapper.listSubNodeBySupNodeId(supNodeId);
    }

    @Override
    public List<String> listCheckedNodeSupNodeId() {
        return this.divisionMapper.listCheckedNodeSupNodeId();
    }

    @Override
    public List<String> listCheckedNodeId() {
        return this.divisionMapper.listCheckedNodeId();
    }

    @Override
    public void saveCheckedNodes(List<String> checkedNodeIds) {
        this.divisionMapper.removeCheckedNodes();
        if (checkedNodeIds != null && !checkedNodeIds.isEmpty()) {
            this.divisionMapper.saveCheckedNodes(checkedNodeIds);
        }
    }
}
