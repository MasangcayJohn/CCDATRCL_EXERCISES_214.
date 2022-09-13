public class App {
        public static void main(String[] args) {
      
          Stack Poloshirt_stack = new Stack(5);
      
          Poloshirt_stack.push("White Poloshirt");
          Poloshirt_stack.push("Black Poloshirt");
          Poloshirt_stack.push("Purple Poloshirt");
          Poloshirt_stack.push("Grey Poloshirt");
      
          System.out.println("The size of the stack is: " + Poloshirt_stack.size());
      
          System.out.println("The top of the stack is: " + Poloshirt_stack.peek());
      
          Poloshirt_stack.pop();
      
          System.out.println("After pop");
      
          Poloshirt_stack.printStack();
      
          System.out.println("The top of the stack is: " + Poloshirt_stack.peek());
        }
      }
