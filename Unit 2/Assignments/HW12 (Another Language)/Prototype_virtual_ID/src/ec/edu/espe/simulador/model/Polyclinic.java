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
public class Polyclinic {
    private int virtualid;
    private boolean qrcode;
    
    void attendStudent(Student student){
        
    }
    boolean verifydentification(QR qr){
        return true;
    }

    /**
     * @return the virtualid
     */
    public int getVirtualid() {
        return virtualid;
    }

    /**
     * @param virtualid the virtualid to set
     */
    public void setVirtualid(int virtualid) {
        this.virtualid = virtualid;
    }

    /**
     * @return the qrcode
     */
    public boolean isQrcode() {
        return qrcode;
    }

    /**
     * @param qrcode the qrcode to set
     */
    public void setQrcode(boolean qrcode) {
        this.qrcode = qrcode;
    }
    
}
