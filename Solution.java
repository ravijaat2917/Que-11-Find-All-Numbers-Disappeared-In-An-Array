import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
       List <Integer> result = new ArrayList <Integer>();
        HashSet <Integer> mark = new HashSet <Integer>();
        for(int i : a)
            mark.add(i);
        for(int i = 1 ; i <= a.length ; i++)
            if(!mark.contains(i))
                result.add(i);
        return result;
    }
}