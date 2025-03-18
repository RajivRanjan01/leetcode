class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        reverseChar(arr, 0, n - 1);

        int start = 0;
        int end = 0;
        StringBuilder sb = new StringBuilder();

        while (start < n) {
        
            while (start < n && arr[start] == ' ') {
                start++;
            }
            if (start >= n) {
                break;
            }

            end = start;
            while (end < n && arr[end] != ' ') {
                end++;
            }

            reverseChar(arr, start, end - 1);

            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(arr, start, end - start);

            start = end;
        }

        return sb.toString();
    }

    private void reverseChar(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}