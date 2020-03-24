package Tree;

public class BinaryTree {
    private Node root;

    public boolean add(int value){
       return add(new Node(value,null,null));
    }

  public boolean add(Node node){
      if(root==null){
          root=node;
          System.out.println("ROOT노드로 저장하였습니다.");
          return true;
      }
      else{
          Node curNode=root;
          Node preNode=curNode;
          while(curNode!=null){
              preNode=curNode;
              if(curNode.getValue()>node.getValue()){
                  curNode=curNode.getLeft();
              }
              else if(curNode.getValue()<node.getValue()) {
                  curNode =curNode.getRight();
              }
              else
              {
                  System.out.println("동일한 값이 존재하므로 저장 실패");
                  return false;
              }
          }
          if(node.getValue()<preNode.getValue()){
              preNode.setLeft(node);
              System.out.println(preNode.getValue()+"노드의 좌측 자식으로 저장하였습니다.");
          }
          else{
              preNode.setRight(node);
              System.out.println(preNode.getValue()+"노드의 우측 자식으로 저장하였습니다.");
          }
          return true;
      }
  }

  public void searchNode(Node node){
        if(node==null){
            return;
        }
        else{ //후위순회는 가지먼저 없애고 줄기없앨때 필요하다 (전위,후위는 정렬되서 안나와 그러나 필요해)
            searchNode(node.getLeft());
            System.out.print(node.getValue()+" "); //이 코드의 위치를 중간에 두면 중위 순위,getRight아래에 두면 후위순회,
            searchNode(node.getRight());
        }
  }

  public void searchStart(){
        searchNode(root);
  }
}
