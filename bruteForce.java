public class bruteForce {
    public static void main(String[] args) {

        for index = 0 to 2^N-1 {    
            for j = 0 to N-1 {
            choose[j] = false
        
            }   
            for j = 0 to N-1 {
                if bit j+1 of index is set {
                choose[j] = true
                }
            }
    // now, build the ith subset of the items:
    // for j in 0 to N-1, include item j if choose[j] is true
    // if the total weight of the objects in the subset is not greater than the weight limit
    // then compute the total value of the objects in the subset
    // keep track of the best subset seen
        }
    }
}