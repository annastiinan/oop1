package main;
//valmiiksi määritellyt parametrit ja järkkä
class Vehicle 
{
    String type;
    String manufacturer;
    String model;
    int maxSpeed;
    Engine engine;

    public Vehicle(String type, String manufacturer, String model, int maxSpeed) 
    {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}