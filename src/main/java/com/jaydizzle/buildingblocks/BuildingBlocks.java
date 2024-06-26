package com.jaydizzle.buildingblocks;

import com.jaydizzle.buildingblocks.block.custom.JDBlocks;
import com.jaydizzle.buildingblocks.item.JDCreativeModeTab;
import com.jaydizzle.buildingblocks.item.JDItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(BuildingBlocks.MOD_ID)

public class BuildingBlocks {

    public static final String MOD_ID = "buildingblocks";

    private static final Logger LOGGER = LogManager.getLogger();

    public BuildingBlocks() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        JDItems.register(eventBus);
        JDBlocks.register(eventBus);
        JDCreativeModeTab.register(eventBus);

        eventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
//453 blocks

//cherry wood
//WALLS ETC FOR MY BLOCKS

//end island w purple cobblestone