/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author Youcef
 */
public class exam {
    private String note, matricule;
    private int codem;

    public exam(String note, String matricule, int codem) {
        this.note = note;
        this.matricule = matricule;
        this.codem = codem;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getCodem() {
        return codem;
    }

    public void setCodem(int codem) {
        this.codem = codem;
    }
    
    
}
