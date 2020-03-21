

import java.util.Stack;

public class InterpreteLisp {

  Stack<String> stack;
  Operaciones operacion = new Operaciones();
  
  public InterpreteLisp(){
    String[] tokens = new String[]{"(","/","2","(","-","3","3",")",")"};
    stack = new Stack<String>();
    for (int i=0;i<tokens.length;i++){
      stack.push(tokens[i]);
      if(tokens[i].equals(")")) Interprete(); 
    }
  }
  
  public void Interprete(){
    String tok;
    Stack<String> callStack = new Stack<String>();
    tok = stack.pop(); /* This is the ) character */
    while(!(tok=stack.pop()).equals("(")){
      callStack.push(tok);
    }
    Operar(callStack);
  }
  //La funcion Oerar busca las operaciones y con if llama a la funcion indicada
  public void Operar(Stack<String> callStack){
    String func = callStack.pop(); 
    //Para cada operacion se devuelve el resultado de la funcion y con push lo devuelve al stack
    if(func.equals("+")) {
      double result = operacion.Suma(callStack);
      stack.push(String.valueOf(result));
    }
    if(func.equals("-")) {
      double result = operacion.Resta(callStack);
      stack.push(String.valueOf(result));
    }
    if(func.equals("*")) {
      double result = operacion.Mult(callStack);
      stack.push(String.valueOf(result));
    }
    if(func.equals("/")) {
      double result = operacion.Div(callStack);
      stack.push(String.valueOf(result));
    }
  }
  public static void main(String[] args) {
    new InterpreteLisp();
  }
}