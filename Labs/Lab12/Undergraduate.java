package Labs.Lab12;

public class Undergraduate extends Student { 
    
    public Undergraduate(int id, double gpa) { 
        super(id, gpa);} 

    @Override 
    public String getStatus() { 
        if (getGpa() >= 3.0){
         return "Honor";} 
        else if (getGpa() >= 2.0){
        return "Good";}
        else {
        return "Probation";}
     }} 