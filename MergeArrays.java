public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Move non-zero elements of X to the beginning
        int k = 0;
        for (int i = 0; i < m; i++) {
            if (X[i] != 0) {
                X[k++] = X[i];
            }
        }
        
        // Merge X and Y
        int i = k - 1; // Last non-zero element index of X
        int j = 0;     // Index of first element of Y
        int l = 0;     // Index of merged array
        while (i >= 0 && j < n) {
            if (X[i] > Y[j]) {
                X[l++] = Y[j++];
            } else {
                X[l++] = X[i--];
            }
        }
        
        // If there are remaining elements in Y, add them to X
        while (j < n) {
            X[l++] = Y[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        mergeArrays(X, Y);
        
        // Print the merged array
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}
