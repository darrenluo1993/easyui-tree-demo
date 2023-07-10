package com.example.demo.model;

import java.io.Serializable;

/**
 * 树形结构数据封装类
 *
 * @CreatedBy Darren Luo
 * @CreatedTime 7/5/23 4:02 PM
 */
public class TreeData implements Serializable {

    private static final long serialVersionUID = -8885354113579072592L;
    /**
     * ID
     */
    private String id;
    /**
     * 文本
     */
    private String text;
    /**
     * 状态
     */
    private String state;
    /**
     * 父ID
     */
    private String parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}