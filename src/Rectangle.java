public class Rectangle {
    private double length;
    private double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area () {
        return
                this.getLength() * this.getWidth();
    }
    public double getDiagonal () {
        Math.sqrt(9);

        return Math.sqrt((getWidth() * getWidth()) + (getLength() * getLength()));
    }

    public String isSquare () {
        if(length == width ){
            return  "Yes, this is a square.";
        } else {
            return "No, this is not a square.";
        }
    }
}
