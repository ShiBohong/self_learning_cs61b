public class ex3 {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int i=0;
        for(int j=0;j<m.length;j=j+1){
            if(m[i]>=m[j]){continue;}
            else{i=j;}
        }
        return m[i];
    }

    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};  
       System.err.println(forMax(numbers));    
    }
}
