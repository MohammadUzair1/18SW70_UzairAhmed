class MyCalculator{
    long power=1;
    public long power(int n, int p) throws Exception{
        if(n>0 && p>0){
            for(int i=1; i<=p; i++){
                power*=n;
            }
        }
        else{
            throw new Exception("n and p can not be negative or zero");
        }
        return power;
    }
    public static void main(String []args){
        MyCalculator x = new MyCalculator();
        try{
            long y=x.power(2,3);
            System.out.println(y);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}