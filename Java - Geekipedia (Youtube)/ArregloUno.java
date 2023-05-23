public class ArregloUno {
    public static void main(String args[]) {
        int vector[] = new int[5];

        vector[0] = 8;
        vector[1] = 5;
        vector[2] = 1;
        vector[3] = 0;
        vector[4] = 6;
        
        for( int v:vector) {
            System.out.print(v);
        }

        for(int i = 0; i < vector.length; i++){
            vector[i] = i + 10;
            System.out.println(vector[i]);
        }
    }
}