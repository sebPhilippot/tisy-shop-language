/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tisyshop.language.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author smo
 */
@Entity
@Table(name = "languages")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Languages.findAll", query = "SELECT l FROM Languages l"),
    @NamedQuery(name = "Languages.findByLanguageId", query = "SELECT l FROM Languages l WHERE l.languageId = :languageId"),
    @NamedQuery(name = "Languages.findByLanguage", query = "SELECT l FROM Languages l WHERE l.language = :language")})
public class Languages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "language_id")
    private Integer languageId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "language")
    private String language;

    public Languages() {
    }

    public Languages(Integer languageId) {
        this.languageId = languageId;
    }

    public Languages(Integer languageId, String language) {
        this.languageId = languageId;
        this.language = language;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (languageId != null ? languageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Languages)) {
            return false;
        }
        Languages other = (Languages) object;
        if ((this.languageId == null && other.languageId != null) || (this.languageId != null && !this.languageId.equals(other.languageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tisyshop.language.entity.Languages[ languageId=" + languageId + " ]";
    }
    
}
