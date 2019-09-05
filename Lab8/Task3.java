class FinalUsage{
    final public void Data(){
        System.out.println("Data 1");
    }
}
class Task extends FinalUsage{
    public void Data(){
        System.out.println("Data 2");
    }
}
class Main{
    public static void main(String []args){
        Task obj =new Task();
        obj.Data();
    }    
}