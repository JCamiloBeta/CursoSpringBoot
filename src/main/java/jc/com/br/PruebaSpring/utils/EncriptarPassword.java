package jc.com.br.PruebaSpring.utils;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
    public static void main(String[] args) {

        var password = "9701";

        System.out.println("password: " + password);
        System.out.println("password encriptado: " + encriptarPassword(password));
    }

    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
