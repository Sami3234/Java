public class student extends person{
    private String rollNo;
    private int marks;

    public student(){
        super();
        rollNo = "FA24-BSE-127";

    }
    public student(String a, String b,int c, String d, int e){
        super(a,b,c);
        rollNo = d;
        marks = e;
    }
    public void setRollNo(String a){
        rollNo =a;
    }
      public String getRollNo(){
        return rollNo;
    }
    public void setMarks(int a){
        marks = a;
    }
    public int getMarks(){
        return marks;
    }
    public void display(){
        super.display();
        System.out.println("Roll #:"+rollNo+"\nMarks : "+marks);
    }
  
}
