package Labs.Lab12;

public class Lab12{
    public static void main(String[] args){
        Student[] students = {
    new Undergraduate(2020, 3.7), 
    new Undergraduate(2021, 2.5),
    new Undergraduate(2020, 3.7),
    new Undergraduate(2019, 1.9),
    new Graduate(2017, 3.5),
    new Graduate(2018, 2.8)                               
        };  

 for (int i = 0 ; i < students.length; i++){
  System.out.println(students[i]); }
        
    }

}

