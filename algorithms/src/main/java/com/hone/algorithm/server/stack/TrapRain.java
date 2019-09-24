package com.hone.algorithm.server.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>接雨水算法</p>
 * @author hourz
 * @since 2019-09-24
 */
public class TrapRain {
	public static Logger logger = LoggerFactory.getLogger(TrapRain.class);
	/**
	 * <p>接雨水</p>
	 * @param height
	 * @return
	 */
	public int trap(int[] height) {
		if (height == null || height.length == 0) return 0;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        int res = 0;
        for (int i = 0; i < height.length; i++){
            while ( ! stack.isEmpty() && height[stack.peek()] < height[i]) {
                int tmp = stack.pop();
                if (stack.isEmpty()) break;
                res += (Math.min(height[i],height[stack.peek()]) - height[tmp]) * (i - stack.peek() - 1);
            }
            stack.push(i);
        }
        return res;
    }
	
	public static void main(String[] args) {
		TrapRain trapRain = new TrapRain();
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int count = trapRain.trap(height);
		logger.info("接到雨滴数量：" + count);
	}
}
