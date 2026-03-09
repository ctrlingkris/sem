import java.util.Scanner;
class PasswordValidator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Password: ");
String pwd = sc.nextLine();
if (pwd.length() >= 8 &&
!pwd.contains(" ") &&
pwd.matches(".*[A-Z].*") &&
pwd.matches(".*[a-z].*") &&
pwd.matches(".*[0-9].*") &&
pwd.matches(".*[^a-zA-Z0-9].*")) {
System.out.println("Password is valid!");
}else{
System.out.println("Password does not meet requirements.");
}
}
}