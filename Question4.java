public class Question4
{
    
    void term_deposit(double p,double r, double n)
    {
        double MA = p* Math.pow((1+r/100),n);
        System.out.println("The maturity amount is "+ MA);
    }
    void recurring_deposit(double p1,double r1,double n1)
    {
        double MA = p1*n1+(n1*(n1+1))/2*r1/100*1/12 ;
        System.out.println("The maturity amount is " + MA);
    }
    public static void main(int ch,double p2,double r2, double n2)
    {
        switch(ch)
        {
        case 1:
        Question4 obj = new Question4() ;
        obj.term_deposit(p2 ,r2,n2) ;
        break ;
        case 2 :
        Question4 ob = new Question4() ;
        ob.recurring_deposit(p2,r2,n2);
        break ;
        default :
        System.out.println("Invalid input");
    }
    }
}
        
        
        
        
    
    
        