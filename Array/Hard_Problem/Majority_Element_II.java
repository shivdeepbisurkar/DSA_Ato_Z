class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<Integer>();
       /*
       //Time complexity:O(n)
       //Space complexity: O(n)
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            
        }
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()){
        Integer key = mapElement.getKey();
        if(mapElement.getValue()>nums.length/3)
                li.add(key);
        }
        return li;
        //Time complexity: O(nlog(n))
        //Space compexity: O(1)
        Arrays.sort(nums);
        int cnt=1;
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1 && nums[i]==nums[i+1]){
                cnt++;
            }
            else{
                if(cnt>nums.length/3)
                    li.add(nums[i]);
                cnt=1;
            }
        }
        return li;
        */
        //Time complexity: O(n)
        //Space complexity: O(1)
        int cnt1=0,cnt2=0;
        int e1=Integer.MIN_VALUE,e2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=e2){
                e1=nums[i];cnt1=1;
            }
            else if(cnt2==0 && nums[i]!=e1){
                e2=nums[i];cnt2=1;
            }
            else if(nums[i]==e1){
                cnt1++;
            }
            else if(nums[i]==e2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==e1) cnt1++;
            if(nums[i]==e2) cnt2++;
        }
        if(cnt1>nums.length/3) li.add(e1);
        if(cnt2>nums.length/3) li.add(e2);
        return li;
    }
}