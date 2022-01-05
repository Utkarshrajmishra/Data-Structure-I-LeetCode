class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> outer = new ArrayList<>();
        if(numRows==1){
            List<Integer> inner1 = new ArrayList<>();
            inner1.add(1);
            outer.add(inner1);
            return outer;
        }
        if(numRows==2){
            List<Integer> inner1 = new ArrayList<>();
            inner1.add(1);
            List<Integer> inner2 = new ArrayList<>();
            inner2.add(1);
            inner2.add(1);
            outer.add(inner1);
            outer.add(inner2);
            return outer;
        }
        List<Integer> inner1 = new ArrayList<>();
        inner1.add(1);
        List<Integer> inner2 = new ArrayList<>();
        inner2.add(1);
        inner2.add(1);
        outer.add(inner1);
        outer.add(inner2);

        for(int i=3;i<=numRows;i++){
            List<Integer> inner = new ArrayList<>();
            inner.add(outer.get(i-2).get(0));
            for(int j=1;j<outer.get(i-2).size();j++){
                inner.add(outer.get(i-2).get(j)+outer.get(i-2).get(j-1));
            }
            inner.add(outer.get(i-2).get(outer.get(i-2).size()-1));
            outer.add(inner);
        }
        return outer;

        
    }
}
