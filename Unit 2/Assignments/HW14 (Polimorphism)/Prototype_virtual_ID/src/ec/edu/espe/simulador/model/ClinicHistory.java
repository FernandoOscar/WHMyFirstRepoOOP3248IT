/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ClinicHistory {

    String reasonConsult;
    ArrayList<GeneralMedicine> prescription;

    public ClinicHistory(String reasonConsult, ArrayList<GeneralMedicine> prescription) {
        this.reasonConsult = reasonConsult;
        this.prescription = prescription;
    }

}
