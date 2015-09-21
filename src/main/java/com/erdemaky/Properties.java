package com.erdemaky;

/**
 * @author Erdem Akyıldız
 */
public class Properties {
    
    String keystorePath;
    String password;
    String sound;
    
    boolean production;
    int bagde;

    public String getKeystorePath() {
        return keystorePath;
    }

    public void setKeystorePath(String keystorePath) {
        this.keystorePath = keystorePath;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean getProduction() {
        return production;
    }

    public void setProduction(boolean porduction) {
        this.production = porduction;
    }

    public int getBagde() {
        return bagde;
    }

    public void setBagde(int bagde) {
        this.bagde = bagde;
    }
    
}
