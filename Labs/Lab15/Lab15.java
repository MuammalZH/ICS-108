package Labs.Lab15;

import java.util.Objects;
import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) throws TimeFormatException {
        String choice; int hour, minute;
        Scanner input = new Scanner(System.in);

        do{
            try{
            System.out.println("Enter the hour: ");
            hour = input.nextInt();
           System.out.println("Enter the minutes: ");
            minute = input.nextInt();
           Time t1 = new Time(hour, minute);
           String result = t1.convertTo();
           System.out.println(result);
            }

            catch (TimeFormatException e){
                System.out.println(e.getMessage());
            }

            finally {
                System.out.println("Again? (y/n)");
                choice = input.next();
            }
        }

        while (choice.equals("y"));
    }
}

class Time{
    int hour, minute;
    Time(int hour, int minute) throws TimeFormatException{
        this.hour = hour;
        this.minute = minute;
        if (hour > 24 || minute >59 || hour < 0 || minute <0){
            throw new TimeFormatException("There is no such time as: " + hour + ":" + minute);
        }
    }

 String convertTo() throws TimeFormatException{
    String period = "";
            try {
                if ((hour < 24 && hour >= 0) && (minute>=0 && minute < 60)){
                    if (hour > 12 ){
                        if (minute < 10){
                            period = "PM";
                            hour = hour - 12;
                            System.out.println(" That is the same as: \n " + hour + ":0" + minute + " " + period);
                        }

                        else {
                            hour = hour - 12;
                            period = "PM";
                            System.out.println(" That is the same as: \n " + hour + ":" + minute + " " + period);
                        }
                    }
        
                    else if (minute < 10){
                        period = "AM";
                        System.out.println(" That is the same as: \n " + hour + ":0" + minute + " " + period);
                    }

                    else{
                        period = "AM";
                        System.out.println(" That is the same as: \n " + hour + ":" + minute + " " + period);
                    }

                    if (hour == 0){
                        if (minute < 10){
                            System.out.println("that is the same as: \n" + "12" + ":0" + minute + " "+"PM");
                        }
                        else {
                            System.out.println("that is the same as: \n" + "12" + ":" + minute + " "+"PM");
                        }
                    }
                }

                else {
                    throw new TimeFormatException ("These numbers is not valid");
                }
            }

            catch (TimeFormatException e){
            System.out.println("invalid");}
            return "";
            }
        }

        class TimeFormatException extends Exception{
            TimeFormatException(){
                super("Try again");
            }

            TimeFormatException(String msg){
                super(msg);
            }
        } 
        



