package java17jan2Sealed;

@SuppressWarnings("preview")
public sealed class ClassD extends ClassA implements ITest permits ClassE
{
 public void methodD()
 {
 System.out.println("====methodD()====");  }
 public void dis()
 {
 System.out.println("====ITest dis()===="); }
}
