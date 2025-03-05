public interface Observer {
    void update(WeatherStation weatherStation);
    void display();
    void subScribe(WeatherStation weatherStation);
    void unsubScribe(WeatherStation weatherStation);
}
