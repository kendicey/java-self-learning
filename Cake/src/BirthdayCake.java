
public class BirthdayCake extends Cake{
    
    private int candles;

    public BirthdayCake() {
        // use super() to call the parent class constructor 
        // the arguments passed determines which constructor from parent class to call
        // public Cake(String flavor){
        //      this.flavor = flavor;
        //      this.price = 9.9;
        // }
        super("chocolate");
        // public Cake (String flavor, double price){} is called for the below statement
        // super("chocolate", 100);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
    
}
