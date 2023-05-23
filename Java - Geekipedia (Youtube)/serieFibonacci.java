public class serieFibonacci {
    public static void main(String args[]) {
        int a = 0, b = 1, c = 0;
        for(int i = 0; i < 20; i++){
            if(i < 19) {
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
                c = a + b;
                a = b;
                b = c;
            }
        }
        
    }    
}