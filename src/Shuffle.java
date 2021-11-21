public class Shuffle {
    public Integer cardNumber;

    public Integer Shuffle(){
        this.cardNumber =  (int)(Math.random() * 100 + 1);
        return this.cardNumber;
    }
}
