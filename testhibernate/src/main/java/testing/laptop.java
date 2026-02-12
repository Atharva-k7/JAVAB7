package testing;
import jakarta.persistence.*;

@Entity

public class laptop {
    @Id
    private int lid;
    private String brand;
    private int ram_in_GB;
    private String model;
    @ManyToOne
    private Alien alien;

    public laptop(){
        this.brand=brand;
        this.model=model;
        this.ram_in_GB=ram_in_GB;
    }

    public int getLid() {
        return lid;
    }

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam_in_GB() {
        return ram_in_GB;
    }

    public void setRam_in_GB(int ram_in_GB) {
        this.ram_in_GB = ram_in_GB;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        return "Laptop brand "+brand+" model "+model+" ram "+ram_in_GB+"LAP_ID "+lid+"machine"+ alien;
    }

    static void main(String[] args) {
        laptop l=new laptop();
        l.setModel("samsung");

        System.out.println(l);
    }
}
