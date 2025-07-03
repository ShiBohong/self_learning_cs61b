public class whatILearned {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int i=0,j=0;
        while(j<m.length){
            if(m[i]>=m[j]) {j=j+1;}
            else {i=j;}
        }
        return m[i];
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 

        System.out.println(max(numbers));
    }
}
