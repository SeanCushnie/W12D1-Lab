public class Calculator {
    //private int volume;
    //private int amount;
    public int add(int volume, int amount){
        return volume + amount;
    }
    public int subtract(int volume, int amount){
        return volume - amount;
    }
    public double divide(int volume, int amount){
        return (double) volume / amount;
    }

    public int clear(int volume, int amount){
        volume = 0;
        amount = 0;
        return volume + amount;
    }
}
