/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author gai
 */
public class Aeroport {
    
    private String idAeroport;
    private String nomAeroport;
    private String nomVilleDesservie;

    public String getIdAeroport() {
        return idAeroport;
    }

    public void setIdAeroport(String idAeroport) {
        this.idAeroport = idAeroport;
    }

    public String getNomAeroport() {
        return nomAeroport;
    }

    public void setNomAeroport(String nomAeroport) {
        this.nomAeroport = nomAeroport;
    }

    public String getNomVilleDesservie() {
        return nomVilleDesservie;
    }

    public void setNomVilleDesservie(String nomVilleDesservie) {
        this.nomVilleDesservie = nomVilleDesservie;
    }
   
    
}
