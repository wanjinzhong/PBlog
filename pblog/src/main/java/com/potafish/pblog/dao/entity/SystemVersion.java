package com.potafish.pblog.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class SystemVersion implements Serializable {

    private static final long serialVersionUID = 5323394388193829623L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer majorVersion;

    @Column
    private Integer minorVersion;

    @Column
    private String interVersion;

    @Column
    private String content;

    @Column
    private Date pubDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(Integer majorVersion) {
        this.majorVersion = majorVersion;
    }

    public Integer getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(Integer minorVersion) {
        this.minorVersion = minorVersion;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getInterVersion() {
        return interVersion;
    }

    public void setInterVersion(String interVersion) {
        this.interVersion = interVersion;
    }

    @Override
    public String toString() {
        return "SystemVersion{" +
                "id=" + id +
                ", majorVersion=" + majorVersion +
                ", minorVersion=" + minorVersion +
                ", interVersion='" + interVersion + '\'' +
                ", content='" + content + '\'' +
                ", pubDate=" + pubDate +
                '}';
    }
}
