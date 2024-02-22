public class Main {
    static boolean isPalindrom(String str){
        String word="";
        for(int i=str.length()-1;i>=0;i--){
            word+=str.charAt(i);
        }
        return (str.equalsIgnoreCase(word));



    }
    public static void main(String[] args) {
        System.out.println(isPalindrom("Ata"));
    }
}