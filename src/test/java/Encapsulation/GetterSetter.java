package Encapsulation;

public class GetterSetter {

    public static void main(String[] args) {
        GetterSetterLogic userInfo = new GetterSetterLogic();
        //Set the values
        userInfo.setAge(31);
        userInfo.setName("Niraj");
        userInfo.setBalance(100);

        //Get the values
        int myAge = userInfo.getAge();
        String myName = userInfo.getName();
        double myBalance = userInfo.getBalance();

        System.out.println("My name is: " + myName + "\nMy age is: " + myAge + "\nMy bank balance is: " + myBalance);
    }
}

class GetterSetterLogic {
    private int age;
    private String name;
    private double balance;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setAge(int age) {
        if (checkAge(age)) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age out of bound");
        }
    }

    private boolean checkAge(int age) {
        return age <= 40 && age > 30;
    }

    public void setName(String name) {
        if (checkName(name)) {
            this.name = name;
        } else {
            throw new RuntimeException("Name cannot be blank");
        }
    }

    private boolean checkName(String name) {
        return name.isBlank() != true;
    }

    public void setBalance(double newBalance) {
        if (checkBalance(newBalance)) {
            this.balance = newBalance;
        } else {
            throw new IllegalArgumentException("Balance Cannot be nagative");
        }
    }

    private boolean checkBalance(double newBalance) {
        return newBalance > 0;
    }
}
