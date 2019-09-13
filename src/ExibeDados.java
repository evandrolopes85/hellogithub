public interface ExibeDados{
	public void exibe();

	default void dados(){
		System.out.println("Testanto!");
	}
}