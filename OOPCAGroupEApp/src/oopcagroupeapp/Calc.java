/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcagroupeapp;

/**
 *
 * @author Joseph Moiselle 24308453
 */
public class Calc {
    
    private double MornUnits;
    private double PeakUnits;
    private double EveUnits;
    private double MornRate;
    private double PeakRate;
    private double EveRate;
    private double Total;
    private double MornTotal;
    private double PeakTotal;
    private double EveTotal;
    private double SolarSave;
    
    public Calc(){
        
        MornUnits = 0;
        MornRate = 0;
        PeakUnits = 0;
        PeakRate = 0;
        EveUnits = 0;
        EveRate = 0;
        
    }

    public void setMornUnits(double MornUnits) {
        this.MornUnits = MornUnits;
    }

    public void setPeakUnits(double PeakUnits) {
        this.PeakUnits = PeakUnits;
    }

    public void setEveUnits(double EveUnits) {
        this.EveUnits = EveUnits;
    }

    public void setMornRate(double MornRate) {
        this.MornRate = MornRate;
    }

    public void setPeakRate(double PeakRate) {
        this.PeakRate = PeakRate;
    }

    public void setEveRate(double EveRate) {
        this.EveRate = EveRate;
    }
    
    public void calc(){
    
    MornTotal = MornUnits * MornRate;
    PeakTotal = PeakUnits * PeakRate;
    EveTotal = EveUnits * EveRate;
    
    Total = MornTotal + PeakTotal + EveTotal;
}

    public double getTotal() {
        return Total;
    }
    
    
    
}

