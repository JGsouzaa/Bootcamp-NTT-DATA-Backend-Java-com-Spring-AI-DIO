package patterns.design.Builder;

public class Builder {

    private HouseB house;

    public Builder(){
        house = new HouseB();
    }

    public Builder color(String color){
        house.setColor(color);
        return this;
    }

    public Builder area(int area){
        house.setArea(area);
        return this;
    }

    public Builder location(String location){
        house.setLocation(location);
        return this;
    }

    public HouseB build(){
        return house;
    }
}
