package com.hone.algorithm.server.stack;

import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <P>括号有效性验证</P>
 * @author hourz
 * @since 2019-09-23
 */
public class ParenthesesVerify {
	public static Logger logger = LoggerFactory.getLogger(ParenthesesVerify.class);
	
	/**
	 * 验证方法
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(char aChar :chars) {
        	if(stack.size() == 0) {
        		stack.push(aChar);
        	} else if(validIsEnd(stack.peek(), aChar)) {
        		stack.pop();
        	} else {
        		stack.push(aChar);
        	}
        }
		return stack.size()==0;
        
    }
	
    /**
     * 验证括号是否有结束
     * @param peek
     * @param aChar
     * @return
     */
    private boolean validIsEnd(Character peek, char aChar) {
		return (peek == '(' && aChar == ')') || (peek == '[' && aChar == ']') || (peek == '{' && aChar == '}');
	}
    
	public static void main(String[] args) {
		ParenthesesVerify verify = new ParenthesesVerify();
		boolean status = verify.isValid("{([])}");
		logger.info("验证括号结果：" + status);
	}
}
