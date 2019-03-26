/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;


/**
 *
 * @author gai
 */
public class Vol {
    private String numVol;    
    private Date hdépart;   
    private Date harrivée;   
    private Aeroport aeroportDept;   
    private Aeroport aeroportArr;

    public String getNumVol() {
        return numVol;
    }

    public void setNumVol(String numVol) {
        this.numVol = numVol;
    }

    public Date getHdépart() {
        return hdépart;
    }

    public void setHdépart(Date hdépart) {
        this.hdépart = hdépart;
    }

    public Date getHarrivée() {
        return harrivée;
    }

    public void setHarrivée(Date harrivée) {
        this.harrivée = harrivée;
    }

    public Aeroport getAeroportDept() {
        return aeroportDept;
    }

    public void setAeroportDept(Aeroport aeroportDept) {
        this.aeroportDept = aeroportDept;
    }

    public Aeroport getAeroportArr() {
        return aeroportArr;
    }

    public void setAeroportArr(Aeroport aeroportArr) {
        this.aeroportArr = aeroportArr;
    }
    
    
}
