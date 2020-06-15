package com.teamacronymcoders.vexsbm;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("vexsbm")
public class BrilliantMachines {

    public static final Logger LOGGER = LogManager.getLogger("Brilliant Machines");

    public BrilliantMachines() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

}
