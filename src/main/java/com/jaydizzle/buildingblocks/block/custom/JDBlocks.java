package com.jaydizzle.buildingblocks.block.custom;

import com.jaydizzle.buildingblocks.BuildingBlocks;
import com.jaydizzle.buildingblocks.item.JDCreativeModeTab;
import com.jaydizzle.buildingblocks.item.JDItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class JDBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BuildingBlocks.MOD_ID);

    //slab,stair,wall
    public static final RegistryObject<Block> PINK_CALCITE = registerBlock("pink_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_CALCITE = registerBlock("purple_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_CALCITE = registerBlock("orange_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_CALCITE = registerBlock("light_blue_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_CALCITE = registerBlock("yellow_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_CALCITE = registerBlock("lime_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CALCITE = registerBlock("blue_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_CALCITE = registerBlock("light_gray_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_CALCITE = registerBlock("magenta_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_CALCITE = registerBlock("gray_calcite", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> BLUE_CONCRETE_BRICKS = registerBlock("blue_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_CONCRETE_BRICKS = registerBlock("brown_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_CONCRETE_BRICKS = registerBlock("cyan_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_CONCRETE_BRICKS = registerBlock("gray_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_CONCRETE_BRICKS = registerBlock("green_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_BRICKS = registerBlock("light_blue_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_BRICKS = registerBlock("light_gray_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_CONCRETE_BRICKS = registerBlock("lime_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_BRICKS = registerBlock("magenta_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_CONCRETE_BRICKS = registerBlock("orange_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_CONCRETE_BRICKS = registerBlock("pink_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_CONCRETE_BRICKS = registerBlock("purple_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_CONCRETE_BRICKS = registerBlock("red_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_CONCRETE_BRICKS = registerBlock("white_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_CONCRETE_BRICKS = registerBlock("yellow_concrete_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> YELLOW_BRICKS = registerBlock("yellow_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_BRICKS = registerBlock("red_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_BRICKS = registerBlock("black_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_BRICKS = registerBlock("white_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_BRICKS = registerBlock("brown_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AQUA_BRICKS = registerBlock("aqua_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_BRICKS = registerBlock("orange_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_BRICKS = registerBlock("green_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_BRICKS = registerBlock("gray_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_BRICKS = registerBlock("blue_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BASIC_BRICKS = registerBlock("basic_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_BRICKS = registerBlock("purple_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.STONE).strength(2f, 2f).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return com.jaydizzle.buildingblocks.item.JDItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
