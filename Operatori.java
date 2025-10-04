package operatori;

public class Operatori {

    public static void main(String[] args) {
        
        System.out.println(preInkrement(10));
        
        System.out.println(postInkrement(10));
        
    }
    
    
    /*
    Prvo ce broj1 da uveca za 1 onda ce vrednost da se upiste u broj2
    */
    public static int preInkrement(int a) {
        int broj1 = a;
        int broj2 = ++broj1;
        return broj2;
    }
    
    /*
    Prvo ce da upise vrednost iz broj1 u broj2 i tek posle toga ce povecati vrednost broj1 za 1
    */
    public static int postInkrement(int a) {
        int broj1 = a;
        int broj2 = broj1++;
        return broj2;
    }
    
    // SVE ISTO VAZI I ZA DEKREMENTE
    
}
