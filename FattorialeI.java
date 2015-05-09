class FattorialeI
{   
        public static int getFatt(int num) {
        int i;
        int Fatt = 1;
        for(i=1;i<=num;i++){
            Fatt = Fatt*i;
        }
        return Fatt;
    }
    
    
    public static void main(String arg[]){
           int num;
        System.out.println ("il fattoriale di 5 é: "+getFatt(5));
    }
}
