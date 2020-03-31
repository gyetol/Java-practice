package stack;

public class AppStart {
    public static void main(String[] args) {
        Stack st= new Stack(5);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        st.pop();
        st.pop();

        System.out.println(st.getCount());
    }
}
