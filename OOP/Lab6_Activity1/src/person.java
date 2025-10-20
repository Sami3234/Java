public class person {
    protected String name ;
    protected String id;
    protected int phone;

    public person(){
        name ="Sami Khan";
        id = "FA24-BSE-080";
        phone = 12345678;
    }
    public person(String a, String b,int c){
        name =a;
        id = b;
        phone= c;
    }
    public void setName(String a){
        name=a;
    }
    public void setId (String j){
        id =j;
    }
    public void setPhone(int a){
        phone = a;
    }
    public String getName(){
        return name;
    }
    public String getid(){
        return id;
    }
    public int getPhone(){
        return  phone;
    }
    public void display(){
        System.out.println("Name: "+name+ "ID: "+id+"Phone: "+phone);
    }
}