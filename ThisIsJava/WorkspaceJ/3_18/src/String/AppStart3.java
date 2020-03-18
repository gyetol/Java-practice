package String;

public class AppStart3 {
    public static boolean func(String[] words,String str){
        if(str.length()==0){
            return true;
        }
        else{
            for(int i=0;i<words.length;i++){
                if(str.startsWith(words[i])){
                    return func(words,str.substring(words[i].length()));
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        String[] words= {"World","Java","Hello"};
        String str1="HelloJavaWorld"; //Good!
        String str2="GoodJavaWorld"; //NotGood!
        if(func(words,str1)){
            System.out.println("Good");
        }
        else{
            System.out.println("Notgood");
        }
        if(func(words,str2)){
            System.out.println("Good");
        }
        else{
            System.out.println("Notgood");
        }
    }
}
