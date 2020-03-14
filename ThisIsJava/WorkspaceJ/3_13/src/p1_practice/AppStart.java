package p1_practice;

public class AppStart {
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        while(!st.isEmpty()) {
            System.out.println(st.pop());
        }

    }
}
