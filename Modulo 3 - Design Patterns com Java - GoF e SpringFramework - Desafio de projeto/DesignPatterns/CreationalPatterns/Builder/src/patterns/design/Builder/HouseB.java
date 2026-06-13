package patterns.design.Builder;

public class HouseB {
    private String color;
    private int area;
    private String location;

    public String getColor(){
        return this.color;
    }

    public int getArea(){
        return this.area;
    }

    public String getLocation(){
        return this.location;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setArea(int area){
        this.area = area;
    }

    public void setLocation(String location){
        this.location = location;
    }
}
