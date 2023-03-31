package problemtry;
class A 
{
    int i;
    void display() 
    {
        System.out.println(i);
    }
}    
class B extends A 
{
    int j;
    void display() 
    {
        System.out.println(j);
    }
}   
public class inhert {public static void main(String args[])
{   
   // A obj = new A();
    B obj = new B();//B int object create create cheyyune so B int function avumm
    obj.i=1;
    obj.j=2;   
    obj.display();     
}

}
