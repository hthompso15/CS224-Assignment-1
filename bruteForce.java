import java.util.Arrays;

public class bruteForce {
    
    public static void main(String[] args) {

        int weights[] = new int[]{5,3,7,3,4,12,9,4,5,2,6,7,1};
        int values[] = new int[]{2,1,1,8,1,5,4,5,4,3,4,2,6};
        int limit = 15;

        optimize(weights,values,limit);
        System.out.print("Finished");

    }

    public static void optimize(int[] weights, int values[], int limit) {
        
        int N = values.length;
        boolean choose[] = new boolean[N];
        boolean[] best = new boolean[N];
        int valueMax = 0;
        int weightMax = 0;

        // For i to 2^(size of the set -1) 
        for(int i = 0 ; i < Math.pow(2,N-1);i++) { 
            int weight = 0;
            int value = 0;
            // Goes through and sets choose[j] to false
            for(int j = 0; j < (N-1); j++) {
                    choose[j] = false;                       
            }

            // if the index is greater than zero and val is greater than zero
            for(int j = 0; j < (N-1); j++) {
                double val = Math.pow(2,(i-1));
                if(j > 0 && val > 0) {
                    choose[j] = true;
                }
            }
            
            // build ith subsets
            
            for(int j = 0; j < (N); j++) {
                if (choose[j]) {    
                    weight += weights[j];
                    value += values[j];
                    System.out.println(weight+ "," + value);

                }
                
                
                if (weight <= limit) {

                    if(value >= valueMax) {
                        valueMax = value;
                        weightMax = weight;
                        best = Arrays.copyOf(choose, choose.length);
                    }       
                } 
            }            
        }
        System.out.println(valueMax);
        System.out.println(weightMax);
        System.out.println(best);

        System.out.println("Finished");      
    }
}
