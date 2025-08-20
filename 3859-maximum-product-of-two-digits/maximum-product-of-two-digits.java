class Solution {
    public int maxProduct(int n) {
     List<Integer> list = new ArrayList<>();

        int k = n;
        while(k>0){
            int b = k%10;
            list.add(b);
            k=k/10;
        }

        Collections.sort(list);

        int n1 = list.get(list.size()-2);
        int n2 = list.get(list.size()-1);
        return n1*n2;

    }
}