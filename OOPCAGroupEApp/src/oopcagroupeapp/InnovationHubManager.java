package oopcagroupeapp;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class InnovationHubManager {

    private ArrayList<InnovationIdea> ideasList;
    private static final String FILE_NAME = "innovationIdeas.txt";
    
    public InnovationIdea searchByTitle(String title) {
    for (InnovationIdea idea : ideasList) {
        if (idea.getTitle().equalsIgnoreCase(title)) {
            return idea;
        }
    }
    return null;
}

    public InnovationHubManager() {
        ideasList = new ArrayList<>();
        // 1ST INSTANCE OF READING : load saved ideas when the manager is created
        loadIdeasFromFile();
    }

    public ArrayList<InnovationIdea> getIdeasList() {
        return ideasList;
    }

    // ================= ADD IDEA =================

    public void addIdea(InnovationIdea idea) {
        ideasList.add(idea);
        // 1ST INSTANCE OF WRITING : append the new idea to the file
        saveIdeaToFile(idea);
    }

    private void saveIdeaToFile(InnovationIdea idea) {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true); // true = append
            PrintWriter pw = new PrintWriter(fw);

            pw.println(idea.toFileString());

            pw.close();
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error writing to file: " + ex.getMessage(),
                    "File Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    //  LOAD IDEAS 

    public void loadIdeasFromFile() {
        ideasList.clear();

        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                return; // no file yet, nothing to load
            }

            Scanner in = new Scanner(file);

            while (in.hasNextLine()) {
                String line = in.nextLine();
                InnovationIdea idea = InnovationIdea.fromFileString(line);
                if (idea != null) {
                    ideasList.add(idea);
                }
            }

            in.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error reading from file: " + ex.getMessage(),
                    "File Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    //  SEARCH 

    public InnovationIdea findIdeaByTitle(String title) {
        for (InnovationIdea idea : ideasList) {
            if (idea.getTitle().equalsIgnoreCase(title)) {
                return idea;
            }
        }
        return null;
    }

    // DELETE 

    public boolean deleteIdeaByTitle(String title) {
        InnovationIdea found = null;
        for (InnovationIdea idea : ideasList) {
            if (idea.getTitle().equalsIgnoreCase(title)) {
                found = idea;
                break;
            }
        }

        if (found != null) {
            ideasList.remove(found);
            // 2ND INSTANCE OF WRITING : rewrite the whole file without this idea
            saveAllIdeasToFile();
            return true;
        }
        return false;
    }

    private void saveAllIdeasToFile() {
        try {
            FileWriter fw = new FileWriter(FILE_NAME); // overwrite
            PrintWriter pw = new PrintWriter(fw);

            for (InnovationIdea idea : ideasList) {
                pw.println(idea.toFileString());
            }

            pw.close();
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error rewriting file: " + ex.getMessage(),
                    "File Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
