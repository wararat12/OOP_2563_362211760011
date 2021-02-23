package LAB8;

public class Rectangle extends Object2D {
    //constant
    private static final double FI =0.5;

    //attribute
    private double width;
    private double lenght;

    //constructor

    public Rectangle(double width, double height) {
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public void calArea() {
        //Rectangle area = FI * (width * lenght)
        double area = width * lenght;
        super.setArea(area);
    }
}
