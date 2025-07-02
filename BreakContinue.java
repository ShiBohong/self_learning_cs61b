public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
    /** your code here */ 
    for(int j=0;j<a.length;j=j+1){
        if(a[j]<0){continue;}
        for(int i=1;i<=n;i=i+1){
            if(j+i>=a.length){break;}
            a[j]=a[j]+a[j+i];
        }
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}
