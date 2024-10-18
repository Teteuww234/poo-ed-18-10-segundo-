package estruturaDeDados;

public class Pilha {
    private int valores;
    private int topo;
    
    public int getValores() {
        return valores;
    }

    public void setValores(int valores) {
        this.valores = valores;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }
    public pilha(){
        valores = new int[10];
    }

    public void Adicionar(int num){
        valores[num] = 10 ;
    }
    
    public void retirar(){
        
    }
}
