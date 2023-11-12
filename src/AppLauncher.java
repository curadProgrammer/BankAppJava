import db_objs.User;
import guis.BankingAppGui;
import guis.LoginGui;
import guis.RegisterGui;

import javax.swing.*;
import java.math.BigDecimal;

public class AppLauncher {
    public static void main(String[] args) {
        // use invokeLater to make updates to the GUI more thread-safe
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new LoginGui().setVisible(true);
//                new RegisterGui().setVisible(true);
//                new BankingAppGui(
//                        new User(4, "username", "password", new BigDecimal("20.00"))
//                ).setVisible(true);
            }
        });
    }
}
