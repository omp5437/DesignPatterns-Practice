public class TelevisionDisplay implements Observer{
    private WeatherStation weatherStation;

    public TelevisionDisplay(WeatherStation weatherStation){
        this.weatherStation=weatherStation;

    }
    @Override
    public void update(WeatherStation weatherStation) {
        display();
        System.out.println("Temperature in degree celsius: "+weatherStation.getTemperature()+" Humidity: "+
                weatherStation.getHumidity()+" the chances of rain is: "+
                weatherStation.getPrecipitationPercentage()+"%");
    }
    public void display(){
        System.out.print("Displaying the content in television");
    }
    public void subScribe(WeatherStation ws){
        ws.addObserver(this);
    }
    public void unsubScribe(WeatherStation ws){
        ws.removeObserver(this);
    }
}
