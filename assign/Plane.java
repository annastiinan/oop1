package main;
class Plane extends Vehicle 
{
    public Plane(String manufacturer, String model, int maxSpeed) 
    {
        super("Lentokone", manufacturer, model, maxSpeed);
        this.engine = new Engine("Suihkumoottori", 500);
    }

     public void fly() 
    {
        //no time
    }
}
