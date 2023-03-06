package Labs.Lab13;

public class City implements Comparable<City>, Cloneable { 
    private String cityName;
    private int temperature;

    public City(String cityName, int temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() { 
        return this.cityName; 
    } 

    public void setCityName(String cityName) { 
        this.cityName = cityName; 
    } 

    public int getTemperature() { 
        return this.temperature; 
    } 

    public void setTemperature(int temperature) { 
        this.temperature = temperature; 
    }

    @Override
    public int compareTo (City that){
        if(this.temperature > that.getTemperature()){
            return 1;
        }
        else if(this.temperature < that.getTemperature()){
            return -1;
        }
        else return 0;
    }

    public String toString(){
        return "City.name: " + getCityName() + "\n" +
        "temperature: " + getTemperature();
    }

    public boolean equals(Object that){
       if(this == that) return true;
       else return false;
    }
}

