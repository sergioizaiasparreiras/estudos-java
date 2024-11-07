package entities;
/*
 *  A classe Account contém uma variável de instância 'name', 
 *  e métodos para configurar e obter esse valor
 */

public class Account {
    // variável de instância
    private String name;

    public Account(String name){
        this.name = null;
    }
    // método que define o nome do objeto (altera o nome)
    public void setName(String name){
        this.name = name;
    }

    // método para recuperar o nome do objeto (obtem o nome)
    public String getName(){
        return name;
    }
}
