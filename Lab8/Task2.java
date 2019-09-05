class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has n players in  "+getName());
    }
}
class Cricket extends Sports{
    String getName(){
        return "Cricket";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in  "+getName());
    }
}
class Soccer extends Sports{
    String getName(){
        return "Soccer";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has m players in  "+getName());
    }
    public static void main(String []args){
        Sports sp=new Sports();
        sp.getName();
        sp.getNumberOfTeamMembers();
        Cricket cr=new Cricket();
        cr.getName();
        cr.getNumberOfTeamMembers();
        Soccer sc=new Soccer();
        sc.getName();
        sc.getNumberOfTeamMembers();
    }
    
}