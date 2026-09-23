class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> list = new ArrayList();
        boolean is3, is5;

        for(int i = 1 ; i<=n ; i++){
            is3 = i%3 == 0;
            is5 = i%5 == 0;

            if(is3 && is5){
                list.add("FizzBuzz");
            }
            else if(is3){
                list.add("Fizz");
            }
            else if(is5){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}