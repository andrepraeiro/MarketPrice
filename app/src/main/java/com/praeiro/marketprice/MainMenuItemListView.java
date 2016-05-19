package com.praeiro.marketprice;

/**
 * Created by 26586 on 19/05/2016.
 */
public class MainMenuItemListView {
    private String texto;
    private int iconeRid;

    public MainMenuItemListView(){
        this("",-1);
    }

    public MainMenuItemListView(String texto, int iconeRid){
        this.texto = texto;
        this.iconeRid = iconeRid;
    }

    public int getIconeRid(){
        return iconeRid;
    }

    public void setIconeRid(int iconeRid){
        this.iconeRid = iconeRid;
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

}
