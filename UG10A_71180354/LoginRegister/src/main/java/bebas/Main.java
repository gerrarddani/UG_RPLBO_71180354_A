package bebas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static java.lang.System.*;

public class Main extends Throwable {
    static public void main(String[] args) throws UsernameException {
        Scanner input = new Scanner(System.in);
        out.println("Selamat datang di Toko Dani Yudha");
        out.println("Silahkan daftarkan dirikamu untuk dapat mengakses menu di Toko Dani Yudha");
        out.println(" ");

        while (true){
            System.out.print("Username: ");
            String username;
            username =input.nextLine();
            try {
                if (username.isEmpty()) {
                    throw new UsernameException(1);
                } else if (username.length() < 6 ) {
                    throw new UsernameException(2);
                }
                ;
            } catch(UsernameException e){
                out.println ("Maaf, " + e.getErrorMessage());
                continue;
            }
            break;
        }
        while(true) {
            System.out.print("Email: ");
            email = input.nextLine();
            try {
                if(email.isEmpty()) {
                    throw new EmailException(1);
                }
                String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(email);
                if(!matcher.matches()) {
                    throw new EmailException(2);
                }
            } catch (EmailException e) {
                out.println ("Maaf, " + e.getErrorMessage());
                continue;
            }
            break;
        }
        while (true){
            System.out.print("Password: ");
            String password;
            password =input.nextLine();
            try {
                if (password.isEmpty()) {
                    throw new PasswordException(1);
                } else if (password.length() < 7 ){
                    throw new PasswordException(2);
                } else if(password.equals(username)){
                    throw new PasswordException(4);
                }else {
                    boolean flagKecil = false;
                    boolean flagBesar = false;
                    boolean flagAngka = false;
                    boolean flagSimbol = false;
                    for(int i=0;i<password.length();i++){
                        char c = password.charAt(i);
                        if(Character.isLetter(c) && Character.isLowerCase(c))
                            flagKecil = true;
                        if(Character.isLetter(c) && Character.isUpperCase(c))
                            flagBesar = true;
                        if(Character.isDigit(c))
                            flagAngka = true;
                        if(Character.isAlphabetic(c))
                            flagSimbol = true;
                    }
                    if(!(flagKecil && flagAngka && flagBesar && flagSimbol)){
                        throw new PasswordException(3);
                    }
                }
                ;
            } catch(PasswordException e){
                out.println ("Maaf, " + e.getErrorMessage());
                continue;
            }
            break;
        }
        while (true){
            System.out.print("Konfrimasi pasword: ");
            String login;
            login =input.nextLine();
            try {
                if (login.isEmpty()) {
                    throw new LoginException(1);
                } else if(login.equals(password) ){
                    throw new LoginException(4);
                }
                ;
            } catch(LoginException e){
                out.println ("Maaf, " + e.getErrorMessage());
                continue;
            }
            break;
        }
        while (true){
            System.out.print("Akun kamu berhasil di daftarkan! ");
            System.out.print("Silahkan login untuk melanjutkan, ");
            System.out.print("Username : ");
            String login;
            login =input.nextLine();
            try {
                if (login.isEmpty()) {
                    throw new LoginException(1);
                } else if(login.equals(password) ){
                    throw new LoginException(4);
                }
                ;
            } catch(LoginException e){
                out.println ("Maaf, " + e.getErrorMessage());
                continue;
            }
            break;
        }
        while (true){
            System.out.print("Password : ");
            String login;
            login =input.nextLine();
            try {
                if (login.isEmpty()) {
                    throw new LoginException(1);
                } else if(login.equals(password) ){
                    throw new LoginException(4);
                }
                ;
            } catch(LoginException e){
                out.println ("Maaf, " + e.getErrorMessage());
                continue;
            }
            break;
        }
        while (true){
            System.out.print("Selamat datang," +username);
            String login;
            login =input.nextLine();
            try {
                if (login.isEmpty()) {
                    throw new LoginException(1);
                } else if(login.equals(password) ){
                    throw new LoginException(4);
                }
                ;
            } catch(LoginException e){
                out.println ("Maaf, " + e.getErrorMessage());
                continue;
            }
            break;
        }
    }

        private static String username;
        private static String email;
        private static String password;

        public void User (String username, String email, String password) throws
        UsernameException, EmailException, PasswordException, LoginException {
            boolean ok = true;
            this.username = username;
        }

    }