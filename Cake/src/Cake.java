
public class Cake {
    
    private String flavor;
    private double price;

    public Cake(){
        this.flavor = "vanilla";
    }
    
    public Cake(String flavor){
        this.flavor = flavor;
        this.price = 9.9;
    }
    
    public Cake(String flavor, double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
