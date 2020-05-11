public class Question2
{
    String name;double bSalary;double tSalary;
    void init(String nam1,double sal1)
    {
        name =nam1;
        bSalary =sal1;
    }
    void calc()
    {
       tSalary=50.0/100*bSalary+bSalary;
    }
    void display()
    {
        System.out.println("The employees name is "+ name);
        System.out.println("The salary with 50% HRA is "+ tSalary);
    }
    public static void main()
    {
    Question2 obj = new Question2() ;
    obj.init("Ivan", 54000) ;
    obj.calc();
    obj.display();
}
}
    
    
    
    
 
    
        
       
        
        
        
        
        
        

        
        
        
    