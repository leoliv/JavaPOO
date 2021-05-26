package entities;

import exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder; // Titular da conta
    private Double balance; // saldo
    private Double withdrawLimit; // Limite de saque

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount; // aqui o mais igual "+=" acrescenta ao this.balance o amout.
    }



    // ESSA É UMA SOLUÇÃO BOA! A MELHOR SOLUÇÃO

    public void withdraw(double amount) {
        validateWithDraw(amount);
        this.balance -= amount;
    }
    private void validateWithDraw(double amount) {
        if (amount > getWithdrawLimit()) {
            // Uma das regras é que essa classe não pode imprimir na tela
            // System.out.println("Erro de saque: A quantia exede o limite do saque");
            //return "Erro de saque: A quantia exede o limite do saque"; // Gambiarra
            throw new BusinessException("Erro de saque: A quantia exede o limite do saque"); //Para instanciar uma exceção da um "throw new" e o nome da exceção
            // o Throw corta o método
        } if (amount > getBalance()) {
            // Você pode criar uma exceção customizada.
            throw new BusinessException("Erro de saque: Saldo insuficiente"); //Para instanciar uma exceção da um "throw new" e o nome da exceção
            // return "Erro de saque: Saldo insuficiente"; // Gambiarra
        }
    }
}
