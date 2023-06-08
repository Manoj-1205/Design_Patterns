package Singleton;

//Singleton Class
public class ConfigurationManager {

    private static ConfigurationManager configurationManagerInstance = null;
    //step1 : Declare a private constructor so the class cannot be instantiated from outside
    private ConfigurationManager(){

    }

    //step2 : Create a global access pointer
    public static ConfigurationManager getInstance(){
            if(configurationManagerInstance == null){
                configurationManagerInstance =  new ConfigurationManager();
            }
            return configurationManagerInstance;
    }
}
