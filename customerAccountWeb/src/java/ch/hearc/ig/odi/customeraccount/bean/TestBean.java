/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author Julien Bron <julien.bron@he-arc.ch>
 */
@ManagedBean
@RequestScoped
public class TestBean implements Serializable {


    private static final long serialVersionUID = 1L;


    private String            nom;


    public String getNom() {

        return nom;

    }


    public void setNom( String nom ) {

        this.nom = nom;

    }

}