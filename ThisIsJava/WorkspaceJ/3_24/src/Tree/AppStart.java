package Tree;

public class AppStart {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(100);
        bt.add(50);
        bt.add(120);
        bt.add(30);
        bt.add(40);
        bt.add(50);
        bt.add(20);

        bt.searchStart();

        //전위 : 부모먼저-좌-우 , 중위: 좌-부모-우 , 후위: 좌-우-부모
    }
}
