package Model;

public class EmployeeModel {

    private String username = "admin";
    private String password = "admin123";

    public boolean validateLogin(String user, String pass) {

        if (user.equals(username) && pass.equals(password)) {
            return true;
        }

        return false;
    }

    public boolean changePassword(String oldPassword,
                                  String newPassword,
                                  String confirmPassword) {

        if (!password.equals(oldPassword)) {
            return false;
        }

        if (!newPassword.equals(confirmPassword)) {
            return false;
        }

        password = newPassword;
        return true;
    }
}