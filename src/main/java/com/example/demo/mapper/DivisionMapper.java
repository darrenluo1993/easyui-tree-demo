package com.example.demo.mapper;

import com.example.demo.model.TreeData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DivisionMapper {

    List<TreeData> listRootNode();

    List<TreeData> listSubNodeBySupNodeId(String supNodeId);

    List<String> listCheckedNodeSupNodeId();

    List<String> listCheckedNodeId();

    int removeCheckedNodes();

    int saveCheckedNodes(List<String> checkedNodeIds);
}
