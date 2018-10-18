/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ipn.cecyt9.edusite.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


public class Info implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idInfo;
    private String nombre;
    private String apePater;
    private String apeMater;
    private String escuela;
    private String matFav;
    private String depFav;

    public Info() {
    }

    public Info(Integer idInfo) {
        this.idInfo = idInfo;
    }

    public Integer getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(Integer idInfo) {
        this.idInfo = idInfo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePater() {
        return apePater;
    }

    public void setApePater(String apePater) {
        this.apePater = apePater;
    }

    public String getApeMater() {
        return apeMater;
    }

    public void setApeMater(String apeMater) {
        this.apeMater = apeMater;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getMatFav() {
        return matFav;
    }

    public void setMatFav(String matFav) {
        this.matFav = matFav;
    }

    public String getDepFav() {
        return depFav;
    }

    public void setDepFav(String depFav) {
        this.depFav = depFav;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInfo != null ? idInfo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Info)) {
            return false;
        }
        Info other = (Info) object;
        if ((this.idInfo == null && other.idInfo != null) || (this.idInfo != null && !this.idInfo.equals(other.idInfo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.ipn.cecyt9.edusite.model.Info[ idInfo=" + idInfo + " ]";
    }
    
}
