public class triangle {
    public static void main(String[] args) {
        char steluta = '*';
        char punct = '.';
        int i = 0;
        int j = 0;
        while (i<4){
            while (j<4){
                System.out.print(steluta);
                j = j+1;    //++j
            }
            System.out.println();++i; j=0;
        }

    }

}
