import java.util.*;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String s){
        super(s);
    }
}
class VotingMachine{

    String names[];
    int[]count;
    int vote;
    public void addCandidates(String []names){
        this.names=names;
        count=new int[names.length];
    }
    public void castVote(int age) throws InvalidAgeException{
        if(age>=18){
            System.out.println("Select Candidate: ");
            Scanner scnr = new Scanner(System.in);
            for(int i=0; i<names.length; i++){
                System.out.println((i+1)+") "+names[i]);
            }
            vote=scnr.nextInt();
            for(int i=0; i<names.length; i++){
                if(vote==(i+1)){
                    count[i]++;
                }
            }
        }
        else{
            throw new InvalidAgeException("Invalid Age!");
        }

    }
    public void printResult(){
        for(int i=0; i<names.length; i++){
            System.out.println("Vote casted for "+names[i]+"are: "+count[i]+".");
        }
    }
    public static void main(String []args){
        InvalidAgeException e=new InvalidAgeException("Invalid Age");
        VotingMachine v=new VotingMachine();
        String []n={"waqar","AhmedAli","Usama"};
        v.addCandidates(n);
        try{
            v.castVote(18);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(18);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(16);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(27);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(30);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(33);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        try{
            v.castVote(34);
        }
        catch(InvalidAgeException i){
            System.out.println(i.getMessage());
        }
        v.printResult();
    }
}