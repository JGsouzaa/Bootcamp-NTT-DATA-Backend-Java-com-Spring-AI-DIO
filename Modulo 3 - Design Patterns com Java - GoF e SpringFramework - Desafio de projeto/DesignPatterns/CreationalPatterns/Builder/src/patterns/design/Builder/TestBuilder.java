package patterns.design.Builder;

public class TestBuilder {

    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea of builder is to be able to construct the object without need to pass the entire set of parameters at
        //once, so you can set first the parameters then construct the object

        String color = "White";
        int area = 60;
        String location = "Curitiba";

        //without builder
        House house = new House(color, area, location);

        //with builder
        HouseB builder_house = new Builder().color(color).location(location).area(area).build();


        if ((builder_house.getColor() == house.getColor()) && (builder_house.getArea() == house.getArea()) && (builder_house.getLocation() == house.getLocation())) {
            return "OK";
        } else {
            return "FAILED!";
        }
    }
}