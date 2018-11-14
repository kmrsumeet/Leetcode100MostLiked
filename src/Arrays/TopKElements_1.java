package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKElements_1 {
	
	 /*public static Map<Integer, Integer> sortByValue(final Map<Integer, Integer> hmap) {
	        return hmap.entrySet()
	                .stream()
	                .sorted((Map.Entry.<Integer, Integer>comparingByValue().reversed()))
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	    }*/
	 
	 public static Map<Integer, Integer> sortByValue(final Map<Integer, Integer> hmap) {
		 return hmap.entrySet().stream().sorted((Map.Entry.<Integer, Integer>comparingByValue().reversed()))
				 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2) -> e1, LinkedHashMap::new));
	 }
	
	public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
        	if(hmap.containsKey(nums[i])){
        		hmap.put(nums[i], hmap.get(nums[i]) + 1);
        	}
        	else
        	{
        		hmap.put(nums[i],1);
        	}
        }
      final Map<Integer, Integer> sortedByCount = sortByValue(hmap);
        List<Integer> list = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry:  sortedByCount.entrySet()){
        	if(list.size()==k)
        		break;
        		list.add(entry.getKey());
    
        }
        
        
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
