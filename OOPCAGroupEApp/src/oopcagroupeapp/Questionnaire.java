/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcagroupeapp;

/**
 *
 * @author Joseph Moiselle 24308453
 */
public class Questionnaire {
    
    private String Resp1;
    private String Resp2;
    private String Resp3;
    private String WrkStyle;
    
    public Questionnaire(){
        Resp1 = "";
        Resp2 = "";
        Resp3 = "";
        WrkStyle = "";
}

    public void setResp1(String Resp1) {
        this.Resp1 = Resp1;
    }

    public void setResp2(String Resp2) {
        this.Resp2 = Resp2;
    }

    public void setResp3(String Resp3) {
        this.Resp3 = Resp3;
    }
    
    public void work(){
           int Points = 0;
           
           if(Resp1.contains("Yes")){
               
               Points ++;
               
           } else {
           
               Points = Points;
               
           }
           
           if(Resp2.contains("Yes")){
           
               Points ++;
           
           } else{
               
               Points = Points;
               
           }
           
           if(Resp3.contains("Yes")){
               
               Points ++;
               
           } else{
           
               Points = Points;
               
           }
           
           if(Points == 3){
           
               WrkStyle = "<html><body style = \"text-align: center\">You have the resources to sustainably have all your employees come into the office!</body></html>";
               
           } else if (Points == 2){
               
               WrkStyle = "<html><body style = \"text-align: center\">You could have some of your employees in the office sustainably but you should offer remote work too.</body></html>";
               
           } else{
           
               WrkStyle = "<html><body style = \"text-align: center\">You should let your employees work remotely.</body></html>";
               
           } 
    }

    public String getWrkStyle() {
        return WrkStyle;
    }
    
    
    
    
}
