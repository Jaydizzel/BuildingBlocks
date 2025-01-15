package net.jaydizzle.buildingblocks.item;

import net.jaydizzle.buildingblocks.BuildingBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class JDItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BuildingBlocks.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}