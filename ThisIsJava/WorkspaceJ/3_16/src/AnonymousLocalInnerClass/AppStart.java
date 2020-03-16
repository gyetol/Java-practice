package AnonymousLocalInnerClass;

public class AppStart {
    public static void main(String[] args) {
        Book book = new Book(){ //default생성자 필요하다

            private  String title="자본주의";

            @Override
            public void setTitle(String title) {
                this.title = title;
            }

            @Override
            public String getTitle() {
                return title;
            }

            public void showInfo(){
                System.out.println(title);
                System.out.println(price);
            }
        };
        //book.setTitle("권력이동");
        book.setPrice(50000);
        book.showInfo();



        (new Fightable() {
            @Override
            public void fight() {
                System.out.println("난 할수 있어...");
            }
        }).fight();

    }
}
