abstract class CShape
{
  protected String color;
  public void setcolor(String str)
  {
    color = str;
  }
  public abstract void show();
}

class CTriangle extends CShape 
{
  protected double a;
  protected double b;
  protected double c;
  
  public CTriangle(double a ,double b)
  {
    a = a;
    b = b;
    c = c;
  }
  
  public void show()
  {
     System.out.println("color="+color+", ");
     System.out.println("area="+a*b*0.5);
   }
}

public class trigle
{
  public static void main(String args[])
  {
      CTriangle tri = new CTriangle(3,4);
      tri.setcolor("red");
      tri.show();
      System.out.println("hihi");
  }
}

