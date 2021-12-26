/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author Youcef
 */
public class Module {
    private int codem;
    private String libelle, speciality;

    public Module(int codem, String libelle, String speciality) {
        this.codem = codem;
        this.libelle = libelle;
        this.speciality = speciality;
    }

    public int getCodem() {
        return codem;
    }

    public void setCodem(int codem) {
        this.codem = codem;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}
