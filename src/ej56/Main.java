package ej56;


public class Main {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(8, 8);
        Rectangle oblong = new Rectangle(12, 8);
        Rectangle myRectangle = new Rectangle(6, 66);
        Rectangle[] rectArr = {square, oblong, myRectangle};

        for (Rectangle r : rectArr) {
            System.out.println(r.toString());
        }

    }
}
