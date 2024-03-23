package com.jaydizzle.buildingblocks.block;

import com.jaydizzle.buildingblocks.BuildingBlocks;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class JDSlabs {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BuildingBlocks.MOD_ID);

    public static final RegistryObject<Block> SPRUCE_LOG_SLAB = registerBlock("spruce_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> OAK_LOG_SLAB = registerBlock("oak_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> DARK_OAK_LOG_SLAB = registerBlock("dark_oak_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> ACACIA_LOG_SLAB = registerBlock("acacia_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> JUNGLE_LOG_SLAB = registerBlock("jungle_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> BIRCH_LOG_SLAB = registerBlock("birch_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> WARPED_LOG_SLAB = registerBlock("warped_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_SLAB).sound(SoundType.STEM).strength(2f, 2f)));
    public static final RegistryObject<Block> CRIMSON_LOG_SLAB = registerBlock("crimson_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB).sound(SoundType.STEM).strength(2f, 2f)));
    public static final RegistryObject<Block> SPRUCE_SKINNED_LOG_SLAB = registerBlock("spruce_skinned_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> OAK_SKINNED_LOG_SLAB = registerBlock("oak_skinned_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> DARK_SKINNED_OAK_LOG_SLAB = registerBlock("dark_oak_skinned_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> ACACIA_SKINNED_LOG_SLAB = registerBlock("acacia_skinned_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> JUNGLE_SKINNED_LOG_SLAB = registerBlock("jungle_skinned_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> BIRCH_SKINNED_LOG_SLAB = registerBlock("birch_skinned_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SLAB).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> WARPED_SKINNED_LOG_SLAB = registerBlock("warped_skinned_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_SLAB).sound(SoundType.STEM).strength(2f, 2f)));
    public static final RegistryObject<Block> CRIMSON_SKINNED_LOG_SLAB = registerBlock("crimson_skinned_log_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB).sound(SoundType.STEM).strength(2f, 2f)));
    public static final RegistryObject<Block> CALCITE_SLAB = registerBlock("calcite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(0.75f, 0.75f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CLAY_SLAB = registerBlock("clay_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).sound(SoundType.GRAVEL).strength(0.6f, 0.6f)));
    public static final RegistryObject<Block> GRAVEL_SLAB = registerBlock("gravel_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).sound(SoundType.GRAVEL).strength(0.6f, 0.6f)));
    public static final RegistryObject<Block> TUFF_SLAB = registerBlock("tuff_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.TUFF).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAND_SLAB = registerBlock("sand_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SAND).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> RED_SAND_SLAB = registerBlock("red_sand_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_SAND).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> DIRT_SLAB = registerBlock("dirt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT).sound(SoundType.GRAVEL).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> ROOTED_DIRT_SLAB = registerBlock("rooted_dirt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT).sound(SoundType.ROOTED_DIRT).strength(0.5f, 0.1f)));
    public static final RegistryObject<Block> AMETHYST_SLAB = registerBlock("amethyst_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).sound(SoundType.AMETHYST).strength(1.5f, 1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_SLAB = registerBlock("obsidian_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).sound(SoundType.STONE).strength(50f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_SLAB = registerBlock("crying_obsidian_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN).sound(SoundType.STONE).strength(50f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHERRACK_SLAB = registerBlock("netherrack_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK).strength(0.4f, 0.4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_SLAB = registerBlock("end_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).sound(SoundType.STONE).strength(3f, 9f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_QUARTZ_SLAB = registerBlock("chiseled_quartz_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK).sound(SoundType.STONE).strength(0.8f, 4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_BRICKS_SLAB = registerBlock("quartz_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).sound(SoundType.STONE).strength(0.8f, 4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_PILLAR_SLAB = registerBlock("quartz_pillar_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.STONE).strength(0.8f, 4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BONE_BLOCK_SLAB = registerBlock("bone_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).sound(SoundType.BONE_BLOCK).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT).sound(SoundType.BASALT).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BASALT_SLAB = registerBlock("basalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT).sound(SoundType.BASALT).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_WOOL_SLAB = registerBlock("white_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> LIME_WOOL_SLAB = registerBlock("lime_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> PINK_WOOL_SLAB = registerBlock("pink_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> GRAY_WOOL_SLAB = registerBlock("gray_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> BLUE_WOOL_SLAB = registerBlock("blue_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> BROWN_WOOL_SLAB = registerBlock("brown_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> GREEN_WOOL_SLAB = registerBlock("green_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> RED_WOOL_SLAB = registerBlock("red_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> BLACK_WOOL_SLAB = registerBlock("black_wool_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_SLAB = registerBlock("cracked_nether_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS).sound(SoundType.NETHER_BRICKS).strength(2f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_SLAB = registerBlock("chiseled_nether_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS).sound(SoundType.NETHER_BRICKS).strength(2f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_SLAB = registerBlock("chiseled_red_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).sound(SoundType.STONE).strength(0.8f, 0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_SANDSTONE_SLAB = registerBlock("chiseled_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).sound(SoundType.STONE).strength(0.8f, 0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_SLAB = registerBlock("chiseled_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_STONE_BRICKS_SLAB = registerBlock("cracked_stone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB = registerBlock("cracked_polished_blackstone_bricks_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSS_BLOCK_SLAB = registerBlock("moss_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.MOSS).strength(0.1f, 0.1f)));
    public static final RegistryObject<Block> HONEYCOMB_BLOCK_SLAB = registerBlock("honeycomb_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK).sound(SoundType.CORAL_BLOCK).strength(0.6f, 0.6f)));
    public static final RegistryObject<Block> TERRACOTTA_SLAB = registerBlock("terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CONCRETE_POWDER_SLAB = registerBlock("black_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> BLUE_CONCRETE_POWDER_SLAB = registerBlock("blue_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> BROWN_CONCRETE_POWDER_SLAB = registerBlock("brown_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> CYAN_CONCRETE_POWDER_SLAB = registerBlock("cyan_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> GRAY_CONCRETE_POWDER_SLAB = registerBlock("gray_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> GREEN_CONCRETE_POWDER_SLAB = registerBlock("green_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_POWDER_SLAB = registerBlock("light_blue_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_POWDER_SLAB = registerBlock("light_gray_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> LIME_CONCRETE_POWDER_SLAB = registerBlock("lime_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_POWDER_SLAB = registerBlock("magenta_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_POWDER_SLAB = registerBlock("orange_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> PINK_CONCRETE_POWDER_SLAB = registerBlock("pink_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_POWDER_SLAB = registerBlock("purple_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> RED_CONCRETE_POWDER_SLAB = registerBlock("red_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> WHITE_CONCRETE_POWDER_SLAB = registerBlock("white_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_POWDER_SLAB = registerBlock("yellow_concrete_powder_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));


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
