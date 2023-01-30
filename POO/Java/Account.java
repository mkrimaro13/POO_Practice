package Java;

public class Account {
    protected Integer id; // Protected hace que los atributos solo sean visibles para las subclases
    protected String name;
    protected String document;
    protected String email;
    protected String password;

    public Account(String name, String document, String email, String password){
        // Recibe los parámetros obligatorios, los parámetros están siendo llamados de manera LOCAL al método, luego con el "this." se esta asignando a la variable GLOBAL
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;

    }

}
