package java17jan2Sealed;

@SuppressWarnings("preview")
public sealed interface ITest permits ClassB,ClassC,ClassD{
	public abstract void dis();
}