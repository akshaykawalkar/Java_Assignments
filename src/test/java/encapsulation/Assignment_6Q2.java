package encapsulation;

class Assignment_6Q2 {

}
class Area{
    private double circle_area;

    public double getCircle_area() {
        return circle_area;
    }

    public void setCircle_area(double radius) {
        this.circle_area = 3.16*2*radius;
    }

    @Override
    public String toString() {
        return "area{" +
                "circle_area=" + circle_area +
                '}';
    }
}

class circle
{
    public static void main(String[] args) {
        Area area=new Area();
        area.setCircle_area(34);
        System.out.println(area);
    }
}