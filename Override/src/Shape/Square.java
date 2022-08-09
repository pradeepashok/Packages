package Shape;

public class Square {
    public String Length;
    public String breath;

    void All_sides_equal(){
        System.out.println("square");
    }

    public Square(String length, String breath) {
        Length = length;
        this.breath = breath;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String length) {
        Length = length;
    }

    public String getBreath() {
        return breath;
    }

    public void setBreath(String breath) {
        this.breath = breath;
    }
}
