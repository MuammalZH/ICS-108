package Labs.Lab04;
public class Lab04sec {
    public static void main(String[] args) {
        int[][] q= { {0,0,0,1},{0,0,1,0}};
        int[][] s={ {4,1},{3,2}};
        int score1 = 0;
        int score2 = 0;
        

        for(int i=0;i<s.length;i++){
            for(int j=0; j<s[i].length;j++){
               int temp = s[i][j]-1;
               if(q[j][temp]==1 & i==0){
                score1 +=1;
               }
               else if (q[j][temp]==1 & i==1){
                score2 +=1;
                }
            }
        }

        System.out.println("the score of the first student is: "+ score1); 
        System.out.println("the score of the second student is: "+ score2);
        double average = (score1 + score2) /(double) s.length;
        System.out.println("The average of both students is: "+ average);
        
    }
}

