package util;

/**
 *
 * @author bekab
 */

public class Validator {
    public static boolean isValidCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }
    public static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("\\d{11}");
    }
    public static boolean isValidMatricula(String matricula) {
        return matricula != null && !matricula.trim().isEmpty();
    }
}
