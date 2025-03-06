

public class MobileDisplay implements Observer{

    public void update(WeatherStation weatherStation){
        display();
        System.out.println("Temperature: "+weatherStation.getTemperature() +" C");
        System.out.println("Humidity: "+weatherStation.getHumidity());
        System.out.println("Chance of rain: "+weatherStation.getPrecipitationPercentage());

    }

    public void display(){
        System.out.println("In mobile view");
    }

}
