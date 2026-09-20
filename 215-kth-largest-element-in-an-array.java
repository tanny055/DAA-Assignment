import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int n : nums) {
            if (minHeap.size() >= k && minHeap.peek() < n) {
                minHeap.poll();
                minHeap.offer(n);
            } else if (minHeap.size() < k) {
                minHeap.offer(n);
            }
        }

        return minHeap.peek();
    }
}
