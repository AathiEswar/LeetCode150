package LeetCode150.Stacks;

import java.util.Stack;

public class ValidParentheses {

    public static boolean validParenthesesOwn(String s){

        if(s.length()==1)return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '[' || ch == '(' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty())return false;
                char chx = stack.peek();
                if( chx=='[' && ch == ']' ||
                        chx=='{' && ch == '}' ||
                        chx=='(' && ch == ')')
                {
                    stack.pop();
                }
                else{
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(') stack.push(')');
            else if(ch == '[') stack.push(']');
            else if(ch == '{') stack.push('}');
            else if (stack.isEmpty() ||  stack.pop() != ch){
                return false;
            }

        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        validParenthesesOwn(")()");
    }
}
