package org.example.model;

public class Sector {
    private String sector;

    public Sector(String sector){
        this.sector = sector;
    }

    public Sector(){
        // constructor por defecto
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

   /* @Override
    public String toString() {
        return "Sector{" +
                "sector='" + sector + '\'' +
                '}';
    }
    Es realmente necesario el metodo toString?
    */
}
