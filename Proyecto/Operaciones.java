/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;
/**
 *
 * @author marianam
 */
public class Operaciones {
      //Operacion suma los datos del stack con pop
  public double Suma(Stack<String> callStack){
    double a = Double.parseDouble(callStack.pop());
    double b = Double.parseDouble(callStack.pop());
    System.out.println("La solucion es:  "+(a+b));
    return(a+b);
  } 
  //Operacion resta los datos del stack con pop
  public double Resta(Stack<String> callStack){
    double a = Double.parseDouble(callStack.pop());
    double b = Double.parseDouble(callStack.pop());
    System.out.println("La solucion es: "+(a-b));
    return(a-b);
  } 
  //Operacion multiplica los datos del stack con pop
  public double Mult(Stack<String> callStack){
    double a = Double.parseDouble(callStack.pop());
    double b = Double.parseDouble(callStack.pop());
    System.out.println("La solucion es: "+(a*b));
    return(a*b);
  } 
  //Operacion divide los datos del stack con pop
  public double Div(Stack<String> callStack){
    double a = Double.parseDouble(callStack.pop());
    double b = Double.parseDouble(callStack.pop());
    //si el elemento b es 0 indica un error y termina el programa
    if(b==0){
      System.out.println("No es posible realizar la division "+a+"/"+b);
      System.exit(0);
    }
    System.out.println("La solucion es: "+(a/b));
    return(a/b);
  } 
}