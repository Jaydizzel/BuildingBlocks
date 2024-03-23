package com.jaydizzle.buildingblocks.block;

import com.jaydizzle.buildingblocks.BuildingBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class JDFenceGates {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BuildingBlocks.MOD_ID);
    public static final RegistryObject<Block> SPRUCE_LOG_FENCE_GATE = registerBlock("spruce_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> OAK_LOG_FENCE_GATE = registerBlock("oak_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> DARK_OAK_LOG_FENCE_GATE = registerBlock("dark_oak_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> ACACIA_LOG_FENCE_GATE = registerBlock("acacia_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> JUNGLE_LOG_FENCE_GATE = registerBlock("jungle_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> BIRCH_LOG_FENCE_GATE = registerBlock("birch_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> WARPED_LOG_FENCE_GATE = registerBlock("warped_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_HYPHAE).sound(SoundType.STEM).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> CRIMSON_LOG_FENCE_GATE = registerBlock("crimson_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HYPHAE).sound(SoundType.STEM).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> SPRUCE_SKINNED_LOG_FENCE_GATE = registerBlock("spruce_skinned_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> OAK_SKINNED_LOG_FENCE_GATE = registerBlock("oak_skinned_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> DARK_SKINNED_OAK_LOG_FENCE_GATE = registerBlock("dark_oak_skinned_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> ACACIA_SKINNED_LOG_FENCE_GATE = registerBlock("acacia_skinned_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> JUNGLE_SKINNED_LOG_FENCE_GATE = registerBlock("jungle_skinned_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> BIRCH_SKINNED_LOG_FENCE_GATE = registerBlock("birch_skinned_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).sound(SoundType.WOOD).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> WARPED_SKINNED_LOG_FENCE_GATE = registerBlock("warped_skinned_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_WARPED_HYPHAE).sound(SoundType.STEM).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
    public static final RegistryObject<Block> CRIMSON_SKINNED_LOG_FENCE_GATE = registerBlock("crimson_skinned_log_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).sound(SoundType.STEM).strength(2f, 2f), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_OPEN));
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
