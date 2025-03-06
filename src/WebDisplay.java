public class WebDisplay implements Observer{
    public void update(WeatherStation weatherStation){
        display();
        System.out.println("Temperature in degree celsius: "+weatherStation.getTemperature());
        System.out.println("Humidity: "+weatherStation.getHumidity());
        System.out.println("Chance of rain: "+weatherStation.getPrecipitationPercentage());

    }
    public void display(){
        System.out.println("In web view");
    }
}
