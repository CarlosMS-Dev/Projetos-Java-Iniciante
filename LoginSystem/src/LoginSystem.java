import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String Login = "admin";
        String Password = "password";
        
        System.out.println("Nome de usuário: ");
        String inputUsername = sc1.nextLine();
        
        System.out.println("Digite a senha: ");
        String inputPassword = sc1.nextLine();
        
        if(inputUsername.equals(Login) && inputPassword.equals(Password)){
            System.out.println("Login bem-sucedido.");
                        
        } else if(inputUsername.equals(Login) && !inputPassword.equals(Password)){
            System.out.println("Senha incorreta!");
          
        } else{
            System.out.println("Conta inexistente.");
        } 
       
        sc1.close();
    }
}
