
public class JLinkedList 
{
		protected STNode cabeca;
		protected long tamanho;
		public JLinkedList() 
		{
			cabeca = null;
			tamanho = 0;
		}
		public boolean isEmpty() 
		{
			return cabeca == null;
		}
		public STNode getFirst() throws UnderflowException
		{
			if(isEmpty()) 
			{
				throw new UnderflowException();
			}
			return cabeca;
		}
		public STNode getLast() throws UnderflowException 
		{
			if(isEmpty()) 
			{
				throw new UnderflowException();
			}
			STNode current = cabeca;
			while(current.getNext() != null) 
			{
				current = current.getNext();
			}
			return current;
		}
		public void InserirPrimeiro(STNode Novonode) 
		{
			if(tamanho == 1) 
			{
				Novonode.setNext(null);
			}
			else 
			{
				Novonode.setNext(cabeca);
				cabeca = Novonode;
			}
			tamanho++;
		}
		public void InserirUltimo(STNode Novonode) 
		{
			if(isEmpty()) 
			{
				InserirPrimeiro(Novonode);
			}
			STNode current = cabeca;
			while(current.getNext() != null) 
			{
				current = current.getNext();
			}
			current.setNext(Novonode);
			Novonode.setNext(null);
			tamanho++;
		}
		public STNode removePrimeiro() throws UnderflowException
		{
			STNode Noderemovido = cabeca;
			if(isEmpty()) 
			{
				throw new UnderflowException();
			}
			if(tamanho == 1) 
			{
				cabeca = null;
			}
			else 
			{
				cabeca = cabeca.getNext();
			}
			tamanho--;
			return Noderemovido;
		}
		public STNode removeUltimo() throws UnderflowException
		{
			if(isEmpty()) 
			{
				throw new UnderflowException();
			}
			STNode removedNode = cabeca;
			if(tamanho == 1) 
			{
				cabeca = null;
			}
			else 
			{
				int CTA = 0;
				STNode current = cabeca;
				while(current.getNext().getNext() != null) 
				{
					current = current.getNext();
					CTA++;
				}
				removedNode = current.getNext();
				current.setNext(null);
			}
			tamanho--;
			return removedNode;
		}
		public void mostra() 
		{
			if(isEmpty()) 
			{
				System.out.println("Não há itens na lista!!!");
			}
			else
			{				
			STNode current = cabeca;
			while(current != null) 
			{
				System.out.print(current.getElemento());
				current = current.getNext();
			}
		}
	}
}
