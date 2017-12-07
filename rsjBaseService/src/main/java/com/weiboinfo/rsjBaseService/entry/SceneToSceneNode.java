package com.weiboinfo.rsjBaseService.entry;

import java.io.Serializable;

public class SceneToSceneNode implements Serializable {
    private String id;

    private String nodeid;

    private String subnodeid;

    private String sceneid;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid;
    }

    public String getSubnodeid() {
        return subnodeid;
    }

    public void setSubnodeid(String subnodeid) {
        this.subnodeid = subnodeid;
    }

    public String getSceneid() {
        return sceneid;
    }

    public void setSceneid(String sceneid) {
        this.sceneid = sceneid;
    }
}