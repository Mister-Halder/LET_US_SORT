public class InversionCountApproach1 {
    public static int getInvCount(int arr[]) {
        int n = arr.length;
        int invCount = 0;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    invCount++;
                }
            }
        }
        return invCount++;
    }
    public static void main(String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        System.out.print("Invertion Count: "+getInvCount(arr));
    }
}
