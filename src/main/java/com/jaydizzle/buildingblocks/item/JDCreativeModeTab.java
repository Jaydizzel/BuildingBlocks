package com.jaydizzle.buildingblocks.item;

import com.jaydizzle.buildingblocks.BuildingBlocks;
import com.jaydizzle.buildingblocks.block.*;
import com.jaydizzle.buildingblocks.block.custom.JDBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class JDCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BuildingBlocks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("main_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(JDBlocks.BASIC_BRICKS.get()))
                    .title(Component.translatable("creativetab.main_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(JDBlocks.PINK_CALCITE.get());
                        pOutput.accept(JDBlocks.PURPLE_CALCITE.get());
                        pOutput.accept(JDBlocks.ORANGE_CALCITE.get());
                        pOutput.accept(JDBlocks.LIGHT_BLUE_CALCITE.get());
                        pOutput.accept(JDBlocks.YELLOW_CALCITE.get());
                        pOutput.accept(JDBlocks.LIME_CALCITE.get());
                        pOutput.accept(JDBlocks.BLUE_CALCITE.get());
                        pOutput.accept(JDBlocks.LIGHT_GRAY_CALCITE.get());
                        pOutput.accept(JDBlocks.MAGENTA_CALCITE.get());
                        pOutput.accept(JDBlocks.GRAY_CALCITE.get());
                        pOutput.accept(JDBlocks.BLUE_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.BROWN_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.CYAN_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.GRAY_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.GREEN_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.LIGHT_BLUE_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.LIGHT_GRAY_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.LIME_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.MAGENTA_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.ORANGE_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.PINK_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.PURPLE_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.RED_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.WHITE_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.YELLOW_CONCRETE_BRICKS.get());
                        pOutput.accept(JDBlocks.YELLOW_BRICKS.get());
                        pOutput.accept(JDBlocks.RED_BRICKS.get());
                        pOutput.accept(JDBlocks.BLACK_BRICKS.get());
                        pOutput.accept(JDBlocks.WHITE_BRICKS.get());
                        pOutput.accept(JDBlocks.BROWN_BRICKS.get());
                        pOutput.accept(JDBlocks.AQUA_BRICKS.get());
                        pOutput.accept(JDBlocks.ORANGE_BRICKS.get());
                        pOutput.accept(JDBlocks.GREEN_BRICKS.get());
                        pOutput.accept(JDBlocks.GRAY_BRICKS.get());
                        pOutput.accept(JDBlocks.BLUE_BRICKS.get());
                        pOutput.accept(JDBlocks.PURPLE_BRICKS.get());
                        pOutput.accept(JDBlocks.BASIC_BRICKS.get());


                        pOutput.accept(JDSlabs.SPRUCE_LOG_SLAB.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}