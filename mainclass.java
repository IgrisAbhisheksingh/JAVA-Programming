class superclass 
{
 int a,b;
 superclass(int x,int y)
 {
 a=x;
 b=y;
 
}
}
class subclass extends subclass
{
subclass(int r,int t)
{
super(r,t);
}
}
void add()
{
System.out.println("a+b");
}
}
class mainclass
{
public static void main(String args[])
{
subclass o=new subclass(2,4);
o.add();
}
}

 