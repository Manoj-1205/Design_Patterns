import Singleton.ConfigurationManager;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager3 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager4 = ConfigurationManager.getInstance();

        System.out.println(configurationManager+" "+configurationManager2);

    }
}