class bank
{
private int pin;
public void setpin()
{
pin=1234;
}

public int getpin()
{
return pin;
}
}


class mainbank 
{ 
	public static void main(String args[])
	{ 
		bank b = new bank();
		b.setpin(); 
		System.out.println("pin"+b.getpin());  
		} 
	} 
	
