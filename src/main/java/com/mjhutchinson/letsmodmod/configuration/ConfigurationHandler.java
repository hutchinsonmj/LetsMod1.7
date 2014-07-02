package com.mjhutchinson.letsmodmod.configuration;

import com.mjhutchinson.letsmodmod.referance.ConfigurationReferance;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static void init(File configFile) {

        //Create the config file
        Configuration configuration = new Configuration(configFile);

        try{
            //load the config
            configuration.load();
            //load desired values from the config
            boolean configurationVal = configuration.get(ConfigurationReferance.CONFIG_CATAGORY_1, "configValue", true, "Test config value").getBoolean(true);
        }catch(Exception e){

        }finally {
            //save the configuration file
            configuration.save();
        }



    }

}