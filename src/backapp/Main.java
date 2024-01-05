package backapp;


import backapp.model.Holder;
import backapp.model.JointAccount;
import backapp.model.OverdraftAccount;

public class Main {
    public static void main(String[] args)  {
        Holder holderPanos = new Holder(123, "panos", "mere", "123");
        Holder holderMike = new Holder(13, "mike", "tsiou", "333");
        System.out.println(holderPanos.converToString());

        OverdraftAccount overdraftaccount = new OverdraftAccount("1234", holderPanos, 222.0);
        System.out.println(overdraftaccount.converToString());

        try {
            overdraftaccount.withdraw(222, "123");
            overdraftaccount.withdraw(222, "12");
        }catch (Exception e) {
            e.printStackTrace();
        }


        JointAccount jointAccount = new JointAccount("2222", holderPanos, holderMike, 22222.4);
        System.out.println(jointAccount.converToString());

    }
}
