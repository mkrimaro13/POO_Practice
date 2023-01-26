package Java;

public class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document, String email, String password){
        // Recibe los parámetros obligatorios, los parámetros están siendo llamados de manera LOCAL al método, luego con el "this." se esta asignando a la variable GLOBAL
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;

    }

}
