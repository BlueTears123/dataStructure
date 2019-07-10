package fanyongquan.CheckString;

import fanyongquan.DataStructure.stack.Stack;

/*
* 检查括号是否符合规格
* 测试如下
* ()
* {[}]这是不符合的
* {[(  )]}
* */
public class CheckParenthesis {

    public boolean check(String str){
        char[] c = str.toCharArray();
        Stack stack = new Stack();
        if(checkType(c[0]) != 1){
            return false;
        }
        for (int i = 0 ; i < c.length ; i++){
            if(checkType(c[i]) == 1){
                stack.push(c[i]);
            } else {
                while (checkMapping(stack.pop() , c[i++]) && !stack.isEmpty()){
                    i--;
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        return false;
    }

    public boolean checkMapping(Object left , char right){
        if(left.toString() == "{" && right == '}'){
            return true;
        }
        if(left.toString() == "[" && right == ']'){
            return true;
        }
        if(left.toString() == "(" && right == ')'){
            return true;
        }
        return false;
    }

    public int checkType(char c){
        switch (c){
            case '{':
            case '[':
            case '(':{
                return 1;
            }
            case '}':
            case ']':
            case ')':{
                return 0;
            }
        }
        return 3;
    }

    public static void main(String[] args) {
        String str  = "()";
        String str2 = "{[}]";
        String str3 = "{[()]}";
        CheckParenthesis cp = new CheckParenthesis();
        System.out.println(cp.check(str));
        System.out.println(cp.check(str2));
        System.out.println(cp.check(str3));

    }
}
