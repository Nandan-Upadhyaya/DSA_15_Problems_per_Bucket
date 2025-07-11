public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();

    
    for (int num : nums2) {
        while (!stack.isEmpty() && num > stack.peek()) {
            map.put(stack.pop(), num);  // map the popped number to current number
        }
        stack.push(num);
    }

   
    while (!stack.isEmpty()) {
        map.put(stack.pop(), -1);
    }

    
    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
        result[i] = map.get(nums1[i]);
    }

    return result;
}
