/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author Maïlys
 */
public class Promotion {
    
    private ArrayList<Semaine>lesSemaines;
    private Promotion laPromotion;
    private int annee;
    
    public Promotion (ArrayList<Semaine>lesSemaines, Promotion promotion, int annee){
        this.lesSemaines = lesSemaines;
        this.laPromotion = laPromotion;
        this.annee = annee;
    }
    public ArrayList getLesSemaines(){
        return lesSemaines;
    }
    public void setLesSemaine (ArrayList<Semaine>lesSemaines){
        this.lesSemaines= lesSemaines;
    }
    public Promotion getLaPromotion(){
        return laPromotion;
    }
    public void laPromotion(Promotion laPromotion){
        this.laPromotion = laPromotion;
    }
    public int getAnnee (){
        return annee;
    }
    public void setAnnee(int annee){
        this.annee = annee;
    }
}
