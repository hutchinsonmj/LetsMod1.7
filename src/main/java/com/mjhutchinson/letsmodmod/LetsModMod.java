package com.mjhutchinson.letsmodmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="LetsModMod", name="Lets Mod Mod", version="1.7.2-1.0.0")
public class LetsModMod{

    @Mod.Instance("LetsModMod")
    public static LetsModMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){ }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){}

}
