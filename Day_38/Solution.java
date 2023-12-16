class Solution {
    void rearrange(int arr[], int n) {
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        ArrayList<Integer> negativeNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positiveNumbers.add(arr[i]);
            } else {
                negativeNumbers.add(arr[i]);
            }
        }
    
        // Merge positive and negative numbers alternately
        int i = 0, j = 0, k = 0;
        while (i < positiveNumbers.size() && j < negativeNumbers.size()) {
            arr[k++] = positiveNumbers.get(i++);
            arr[k++] = negativeNumbers.get(j++);
        }
    
        // If there are remaining positive numbers, add them to the result
        while (i < positiveNumbers.size()) {
            arr[k++] = positiveNumbers.get(i++);
        }
    
        // If there are remaining negative numbers, add them to the result
        while (j < negativeNumbers.size()) {
            arr[k++] = negativeNumbers.get(j++);
        }
    }
}