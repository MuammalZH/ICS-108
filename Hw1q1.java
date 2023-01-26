public class Hw1q1 {
    public static void main(String[] args) {
        System.out.println("The numbers divisible by 3 or 4, but not both, are: ");

        for(int i=100;i<=200;i++){
            if((i%3==0 || i%4==0) && (!(i%3==0 && i%4==0))){
                System.out.print(i + ",");
            }
        }
    }
}
