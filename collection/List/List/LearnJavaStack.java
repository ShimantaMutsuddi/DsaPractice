package collection.List.List;


import java.util.Stack;

public class LearnJavaStack {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();

        // Add elements to Stack
        animals.push("Cat");
        animals.push("Cow");
        animals.push("Goat");
        System.out.println(animals);

        //Remove elements from stack

        String element=animals.pop();
        System.out.println(element);

        //access the element from top
        String top= animals.peek();
        System.out.println(top);

        // Search an element

        int position = animals.search("Cow");
        System.out.println(position);

        //check if stack is empty
        boolean result = animals.empty();

        System.out.println("Is the stack empty? "+result );




    }
}
