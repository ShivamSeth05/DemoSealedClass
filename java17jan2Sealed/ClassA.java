package java17jan2Sealed;

public sealed class ClassA permits ClassB,ClassC,ClassD{
	 public void methodA()
	 {
	 System.out.println("===PClass methodA()===="); }

}
