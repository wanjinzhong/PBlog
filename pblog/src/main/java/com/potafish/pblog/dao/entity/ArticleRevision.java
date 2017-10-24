package com.potafish.pblog.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class ArticleRevision implements Serializable {

    private static final long serialVersionUID = -6915852523145580473L;

    @Id
    private ArticleRevisionId id;

    @Column
    private String coverPic;

    @Column
    private String content;

    @Column
    private Date entryDatetime;

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(Date entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

    public ArticleRevisionId getId() {
        return id;
    }

    public void setId(ArticleRevisionId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ArticleRevision{" +
                "id=" + id +
                ", coverPic='" + coverPic + '\'' +
                ", content='" + content + '\'' +
                ", entryDatetime=" + entryDatetime +
                '}';
    }
}
