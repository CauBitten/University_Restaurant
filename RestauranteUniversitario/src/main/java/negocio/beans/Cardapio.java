package negocio.beans;

import java.util.Objects;

public class Cardapio {
    private String principal1;
    private String principal2;
    private String vegetariano;
    private String guarnicao;
    private String salada;
    private String sobremesa;

    public String getPrincipal2() {
        return principal2;
    }

    public void setPrincipal2(String principal2) {
        this.principal2 = principal2;
    }

    public String getVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(String vegetariano) {
        this.vegetariano = vegetariano;
    }

    public String getGuarnicao() {
        return guarnicao;
    }

    public void setGuarnicao(String guarnicao) {
        this.guarnicao = guarnicao;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public String getSuco() {
        return suco;
    }

    public void setSuco(String suco) {
        this.suco = suco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrincipal1() {
        return principal1;
    }

    public void setPrincipal1(String principal1) {
        this.principal1 = principal1;
    }

    private String suco;
    private long id;

    public Cardapio(String principal1, String principal2, String vegetariano,
                    String guarnicao, String salada, String sobremesa, String suco, long id) {

        this.principal1 = principal1;
        this.principal2 = principal2;
        this.vegetariano = vegetariano;
        this.guarnicao = guarnicao;
        this.salada = salada;
        this.sobremesa = sobremesa;
        this.suco = suco;
        this.id = id;
    }

    public String toString(){
        return    "Prato principal 1 : " + principal1 + "\nPrato principal 2 : " + principal2 +
                "\nVegetariano       : " + vegetariano +"\nGuarnicao         : " + guarnicao +
                "\nSalada            : " + salada +
                "\nSobremesa         : " + sobremesa +  "\nSuco : " + suco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Cardapio cardapio = (Cardapio) o;
        return Objects.equals(principal1, cardapio.principal1) && Objects.equals(principal2, cardapio.principal2)
                && Objects.equals(vegetariano, cardapio.vegetariano) && Objects.equals(guarnicao, cardapio.guarnicao)
                && Objects.equals(salada, cardapio.salada) && Objects.equals(sobremesa, cardapio.sobremesa) && Objects.equals(suco, cardapio.suco);
    }
}
