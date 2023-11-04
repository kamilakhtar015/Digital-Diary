/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author user
 */
public class WriteEntry {

    private String entryTitle;
    private String entryBody;

    public WriteEntry(String addTitle, String addDescription) {
        this.entryTitle = addTitle;
        this.entryBody = addDescription;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public void setEntryTitle(String entryTitle) {
        this.entryTitle = entryTitle;
    }

    public void setEntryBody(String entryBody) {
        this.entryBody = entryBody;
    }
}
