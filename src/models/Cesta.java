package models;

import java.util.ArrayList;
import java.util.List;

public class Cesta {
    private List<ItensCesta> itensCestaList;

    public Cesta(){
        itensCestaList = new ArrayList<>();
    }

    public void addLista(Produto p, int quant){
        ItensCesta ic = new ItensCesta(p, quant);
        itensCestaList.add(ic);
    }

    public double calcTotal(){
        double d = 0.0;
        for (ItensCesta ic : itensCestaList){
            d = d + (ic.getProduto().getPreco() * ic.getQuantidade());
        }

        return d;
    }

    public void exibirLista(){
        for (ItensCesta ic : itensCestaList){
            System.out.printf(ic.toString());
        }
        System.out.printf("\nTotal: R$ " + calcTotal());
    }
}
