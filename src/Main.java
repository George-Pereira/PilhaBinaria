import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) throws EmptyStackException
	{
		int quociente;
		int resto;
		DynamicStack pilha = new DynamicStack();
		JLinkedList lista = new JLinkedList();
		int N = Integer.parseInt(JOptionPane.showInputDialog("Insira um Nº para conversão:"));
		while(N >= 1) 
		{
			quociente = N/2;
			resto = (N%2);
			N = N/2;
			pilha.push(resto);
		}
		try 
		{
			while(!pilha.isEmpty()) 
			{
				lista.InserirUltimo(new STNode(pilha.pop()));
			}
			lista.mostra();
		}
		catch(EmptyStackException e1) 
		{
			e1.printStackTrace();
		}
	}
}
