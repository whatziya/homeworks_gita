package lesson_12.IceCream;

public class Piece {
    private int pieceMass;
    private int iceCramPrice;

    public Piece(int pieceMass, int iceCramPrice) {
        this.pieceMass = pieceMass;
        this.iceCramPrice = iceCramPrice;
    }

    public int getPieceMass() {
        return pieceMass;
    }

    public int getIceCramPrice() {
        return iceCramPrice;
    }
}
