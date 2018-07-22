package org.zk.vo;

import java.util.List;

/**
 * Created by Administrator on 7/22/2018.
 */
public class PermVo {
    private Integer id;
    private String text;
    private List<PermVo> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<PermVo> getChildren() {
        return children;
    }

    public void setChildren(List<PermVo> children) {
        this.children = children;
    }
}
