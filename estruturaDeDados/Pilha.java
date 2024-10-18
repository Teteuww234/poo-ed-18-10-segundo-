package estruturaDeDados;

public class Pilha {
    private int[] valores;
    private int topo;
    private final int CAPACIDADE = 10;

    public Pilha(){
        valores = new int [CAPACIDADE];
        topo--;
    }
    public void Adicionar(int valor){
        if (topo < CAPACIDADE - 1) {
            topo++;
            valores[topo] = valor;
            System.out.println("Valor adicionado" + valores);
        } else {
            System.out.println("Pilha cheia, não foi possivel adicionar o valor" + valor);
            
        }
    }
    
    public void retirar(){
        if (topo >= 0) {
            int valor = valores[topo];
            topo--;
        } else {
            System.out.println("Pilha vazia, não foi possivel retirar um valor" );
            return -1;
        }
        
    }
}
