public class Lab04sec {
    public static void main(String[] args) {
        int[][] q= { {0,0,0,1},{0,0,1,0}};
        int[][] s={ {4,1},{3,2}};
        int score = 0;
        

        for(int i=0;i<s.length;i++){
            for(int j=0; j<s[i].length;j++){
               int temp = s[i][j]-1;
               if(q[j][temp]==1){
                score+=1;
               }
            }
        }
        System.out.println(score); 
        double average = score/(double) s.length;
        System.out.println(average);
        }
    }

