import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

     public void adicionarProdutos(long codigoProd , String nome , int quantidade , double preco){
        estoqueProdutosMap.put(codigoProd,new Produto(nome, preco, quantidade));
     }
     public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
     }
     public double exibirTotalEstoque(){
        double valorTotal = 0;
        for(Produto p : estoqueProdutosMap.values()){
            valorTotal += p.getPreco();
        }
        return valorTotal;
     }
}
