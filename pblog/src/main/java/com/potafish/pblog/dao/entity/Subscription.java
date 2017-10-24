package com.potafish.pblog.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class Subscription implements Serializable{

    private static final long serialVersionUID = -7653018773088361463L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pub_id")
    private User pubisher;

    @ManyToOne
    @JoinColumn(name = "sub_id")
    private User subscriber;

    @Column
    private Date entryDatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getPubisher() {
        return pubisher;
    }

    public void setPubisher(User pubisher) {
        this.pubisher = pubisher;
    }

    public User getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(User subscriber) {
        this.subscriber = subscriber;
    }

    public Date getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(Date entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", pubisher=" + pubisher +
                ", subscriber=" + subscriber +
                ", entryDatetime=" + entryDatetime +
                '}';
    }
}
