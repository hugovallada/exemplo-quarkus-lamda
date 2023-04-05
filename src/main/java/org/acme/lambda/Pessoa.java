package org.acme.lambda;

import java.util.Map;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Map<String, String> dados;

    public Pessoa(String nome, Integer idade, Map<String, String> dados) {
        this.nome = nome;
        this.idade = idade;
        this.dados = dados;
    }

    /**
     * @deprecated Uso exclusivo para o bind
     */
    @Deprecated
    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Map<String, String> getDados() {
        return dados;
    }

    public void setDados(Map<String, String> dados) {
        this.dados = dados;
    }

}
