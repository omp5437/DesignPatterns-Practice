public class TelevisionDisplay implements Observer{
    @Override
    public void update(WeatherStation weatherStation) {
        display();
        System.out.println("Temperature in degree celsius: "+weatherStation.getTemperature()+" Humidity: "+
                weatherStation.getHumidity()+" the chances of rain is: "+
                weatherStation.getPrecipitationPercentage()+"%");
    }
    public void display() {
        System.out.print("Displaying the content in television");
    }
}
