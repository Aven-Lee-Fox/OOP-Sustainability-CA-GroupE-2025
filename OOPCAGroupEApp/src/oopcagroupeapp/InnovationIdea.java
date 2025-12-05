/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopcagroupeapp;

/**
 *
 * @author AHMED MAHAT SHIRE - 25131923
 */

public class InnovationIdea {
    private String title;
    private String category;
    private String status;
    private int impact;
    private String description;

    public InnovationIdea(String title, String category, String status, int impact, String description) {
        this.title = title;
        this.category = category;
        this.status = status;
        this.impact = impact;
        this.description = description;
    }

    
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getStatus() { return status; }
    public int getImpact() { return impact; }
    public String getDescription() { return description; }

    // FILE HELPERS
    
    public String toFileString() {
        return title + ";" + category + ";" + status + ";" + impact + ";" + description;
    }
    
    public static InnovationIdea fromFileString(String line) {
        String[] parts = line.split(";");
                if (parts.length < 5) {
                    return null;
                }
                
                String title =parts[0];
                String category =parts[1];
                String status =parts[2];
                
                int impact;
                try {
                    impact = Integer.parseInt(parts[3]);
                } catch (NumberFormatException e) {
                    //if the file has something out f order, will fall back to 0
                    impact =0;
                }
                
                String description = parts[4];
                
                return new InnovationIdea(title, category, status, impact, description);
                        
    }
}






