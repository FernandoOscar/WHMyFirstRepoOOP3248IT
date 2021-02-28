/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.simulador.model;

/**
 *
 * @author JOHNY
 */
public class QR {
    private int id;
    private boolean security;

    public QR(int id, boolean security) {
        this.id = id;
        this.security = security;
    }

    @Override
    public String toString() {
        return "QR{" + "id=" + getId() + ", security=" + isSecurity() + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the security
     */
    public boolean isSecurity() {
        return security;
    }

    /**
     * @param security the security to set
     */
    public void setSecurity(boolean security) {
        this.security = security;
    }

    
}
