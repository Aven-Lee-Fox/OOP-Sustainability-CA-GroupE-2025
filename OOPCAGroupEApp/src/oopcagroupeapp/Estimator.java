/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcagroupeapp;

import java.util.Arrays;

/**
 *
 * @author Joseph Moiselle 24308453
 */
public class Estimator {
    
    String[] Industries;
    String[] Continents;
    int[][] Pollution;
    String SelectedInd;
    String SelectedCont;
    String Response;
    int x;
    int y;
    
    public Estimator(){
    
    Industries = new String[6];
    
    Industries[0] = "Manufacturing";
    Industries[1] = "Construction";
    Industries[2] = "Hospitality";
    Industries[3] = "Fashion";
    Industries[4] = "Advertising";
    Industries[5] = "IT";
    
    Continents = new String[6];
    
    Continents[0] = "Africa";
    Continents[1] = "Asia";
    Continents[2] = "Australia";
    Continents[3] = "Europe";
    Continents[4] = "North America";
    Continents[5] = "South America";
    
    Pollution = new int [6][6];
    
    Pollution[0][0] = 20;
    Pollution[0][1] = 20;
    Pollution[0][2] = 15;
    Pollution[0][3] = 30;
    Pollution[0][4] = 5;
    Pollution[0][5] = 10;
    Pollution[1][0] = 30;
    Pollution[1][1] = 20;
    Pollution[1][2] = 10;
    Pollution[1][3] = 20;
    Pollution[1][4] = 10;
    Pollution[1][5] = 10;
    Pollution[2][0] = 25;
    Pollution[2][1] = 30;
    Pollution[2][2] = 5;
    Pollution[2][3] = 15;
    Pollution[2][4] = 15;
    Pollution[2][5] = 10;
    Pollution[3][0] = 15;
    Pollution[3][1] = 15;
    Pollution[3][2] = 20;
    Pollution[3][3] = 20;
    Pollution[3][4] = 10;
    Pollution[3][5] = 20;
    Pollution[4][0] =  20;
    Pollution[4][1] = 10;
    Pollution[4][2] = 30;
    Pollution[4][3] = 30;
    Pollution[4][4] = 5;
    Pollution[4][5] = 5;
    Pollution[5][0] = 25;
    Pollution[5][1] = 15;
    Pollution[5][2] = 10;
    Pollution[5][3] = 20;
    Pollution[5][4] = 20;
    Pollution[5][5] = 10;
    }

    public void setSelectedInd(String SelectedInd) {
        this.SelectedInd= SelectedInd;
    }
    
    public void setSelectedCont(String SelectedCont){
    
        this.SelectedCont = SelectedCont;
        
    }
    
    public void Estimate(){
    
        y = Arrays.asList(Industries).indexOf(SelectedInd);
        
        x = Arrays.asList(Continents).indexOf(SelectedCont);
        
        Response = "<html><body style = \"text-align: center\"> The " + SelectedInd + " industry in " + SelectedCont + " contributes to roughly " + Pollution[x][y] + "% of the pollution in the continent on average per year. </body></html>";
        
        
    }
    
    public String getResponse(){
    
        return Response;
    
    }
    
    
    
}
