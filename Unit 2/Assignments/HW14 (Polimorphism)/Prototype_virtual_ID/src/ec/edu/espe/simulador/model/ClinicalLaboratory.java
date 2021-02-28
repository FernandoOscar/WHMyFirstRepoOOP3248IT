/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

/**
 *
 * @author LENOVO
 */
public class ClinicalLaboratory {
    private String sample;

    public ClinicalLaboratory() {
    }
    

    @Override
    public String toString() {
        return "ClinicalLaboratory{" + "sample=" + sample + '}';
    }

    public ClinicalLaboratory(String sample) {
        this.sample = sample;
    }

    /**
     * @return the sample
     */
    public String getSample() {
        return sample;
    }

    /**
     * @param sample the sample to set
     */
    public void setSample(String sample) {
        this.sample = sample;
    }
    
}
