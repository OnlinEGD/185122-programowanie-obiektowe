package lab03;

public class User {
    private String login;
    private String password;
    public int age;

    public User(String login, String password, int age) {
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public void setPassword(String password) {
        if(password.length() < 8) { return; }
        this.password = password;
    }

    public void showUser() {
        System.out.println("Login: " + this.login + ", haslo: " + this.password + ", wiek: ", this.age);
    }
}

// login i password powinn byc prywatne
// age nie powinno byc statyczne
// setPassword powinno miec walidacje
// show user nie moze byc statyczne bo chcemy pokazac konkretnego usera