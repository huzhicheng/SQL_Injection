package org.kite.purely.mybatis.entity;

import java.io.Serializable;

/**
 * News
 *
 * @author fengzheng
 * @date 2020/12/23
 */
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
