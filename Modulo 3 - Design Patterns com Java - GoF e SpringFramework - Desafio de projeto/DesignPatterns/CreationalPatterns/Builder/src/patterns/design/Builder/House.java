package patterns.design.Builder;

public class House {
        private String color;
        private int area;
        private String location;

    public House(String color, int area, String location) {
        this.color = color;
        this.area = area;
        this.location = location;
    }

    public String getColor(){
        return this.color;
    }

    public int getArea(){
        return this.area;
    }

    public String getLocation(){
        return this.location;
    }
}
