package com.mjhutchinson.letsmodmod;

import com.mjhutchinson.letsmodmod.configuration.ConfigurationHandler;
import com.mjhutchinson.letsmodmod.proxy.IProxy;
import com.mjhutchinson.letsmodmod.referance.Referance;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Referance.MOD_ID, name=Referance.MOD_NAME, version=Referance.MOD_VERSION)
public class LetsModMod{

    @Mod.Instance(Referance.MOD_ID)
    public static LetsModMod instance;

    @SidedProxy(clientSide = Referance.CLIENT_PROXY_CLASS, serverSide = Referance.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){}

}
