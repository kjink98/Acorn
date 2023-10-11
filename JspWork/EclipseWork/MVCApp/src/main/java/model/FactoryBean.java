package model;

public class FactoryBean {
    private FactoryBean() {

    }

    private static FactoryBean factory = new FactoryBean();

    public static FactoryBean newInstance() {
        return factory;
    }

    public ICommand createInstance(String cmd) {
        if (cmd.equals("MAIN")) {
            return new MainCommand();
        } else if (cmd.equals("CONFIRM")) {
            return new ConfirmCommand();
        } else if (cmd.equals("COMPLETE")) {
            return new CompleteCommand();
        } else {
            return new RegisterCommand();
        }
    }
}
