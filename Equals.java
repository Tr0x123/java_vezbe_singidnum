package equals;

public class Equals {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println(s1 == s2);       // true, isti literal u string poolu
        System.out.println(s1 == s3);       // false, razliciti objekti
        System.out.println(s1.equals(s3));  // true, sadrzaj isti

    }
    
}
