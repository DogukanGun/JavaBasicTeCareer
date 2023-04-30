package com.company.homeworks.designpatternsHomework.proxy;

public class DebitCardProxy implements BankAccount{

    private SavingAccount savingAccount;
    private int amount;



    public DebitCardProxy(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }



    @Override
    public void debit(int amount) {
        this.amount = amount;
        if(savingAccount.validate(amount)){
            savingAccount.debit(amount);
        }else{System.out.println("Lütfen yazdığınız girişi kontrol edin.");
        }
    }

}
