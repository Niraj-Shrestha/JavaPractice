package Practice;

interface  Bank{
      int getInterestRate();
}
//concrete class
class Citi implements Bank{
    public int getInterestRate(){return 7;}
}
//concrete class
class HSBC implements Bank{
    public int getInterestRate(){return 6;}
}

class CLass{
    public static void main(String args[]){
        Bank b;
        b = new Citi ();      // concrete class object
        System.out.println("Citi Rate of Interest is: "+b.getInterestRate()+"%");
        b = new HSBC ();        // concrete class object
        System.out.println("HSBC Rate of Interest is: "+b.getInterestRate()+"%");
    }
}
