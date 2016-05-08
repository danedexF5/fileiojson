/**
 * Created by danedexheimer on 5/2/16.
 */
public class Macbook {
    private String ram;
    private String color;
    private int year;
    private double size;
    private String display;

    public Macbook(String ram, String color, int year, double size, String display) {
        this.ram = ram;
        this.color = color;
        this.year = year;
        this.size = size;
        this.display = display;

    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

}
