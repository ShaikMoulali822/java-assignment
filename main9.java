package Moulali;
public class main9 {

    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

    }
}
