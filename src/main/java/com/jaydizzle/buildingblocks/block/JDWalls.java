package com.jaydizzle.buildingblocks.block;

import com.jaydizzle.buildingblocks.BuildingBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class JDWalls {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BuildingBlocks.MOD_ID);

    public static final RegistryObject<Block> SPRUCE_LOG_WALL = registerBlock("spruce_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> OAK_LOG_WALL = registerBlock("oak_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> DARK_OAK_LOG_WALL = registerBlock("dark_oak_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> ACACIA_LOG_WALL = registerBlock("acacia_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> JUNGLE_LOG_WALL = registerBlock("jungle_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> BIRCH_LOG_WALL = registerBlock("birch_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> WARPED_LOG_WALL = registerBlock("warped_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).sound(SoundType.STEM).strength(2f, 2f)));
    public static final RegistryObject<Block> CRIMSON_LOG_WALL = registerBlock("crimson_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).sound(SoundType.STEM).strength(2f, 2f)));
    public static final RegistryObject<Block> AMETHYST_WALL = registerBlock("amethyst_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).sound(SoundType.AMETHYST).strength(1.5f, 1.5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALCITE_WALL = registerBlock("calcite_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CALCITE).sound(SoundType.CALCITE).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SPRUCE_SKINNED_LOG_WALL = registerBlock("spruce_skinned_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> OAK_SKINNED_LOG_WALL = registerBlock("oak_skinned_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> DARK_SKINNED_OAK_LOG_WALL = registerBlock("dark_oak_skinned_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> ACACIA_SKINNED_LOG_WALL = registerBlock("acacia_skinned_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> JUNGLE_SKINNED_LOG_WALL = registerBlock("jungle_skinned_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> BIRCH_SKINNED_LOG_WALL = registerBlock("birch_skinned_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).sound(SoundType.WOOD).strength(2f, 2f)));
    public static final RegistryObject<Block> WARPED_SKINNED_LOG_WALL = registerBlock("warped_skinned_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).sound(SoundType.STEM).strength(2f, 2f)));
    public static final RegistryObject<Block> CRIMSON_SKINNED_LOG_WALL = registerBlock("crimson_skinned_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).sound(SoundType.STEM).strength(2f, 2f)));
    public static final RegistryObject<Block> CLAY_WALL = registerBlock("clay_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).sound(SoundType.GRAVEL).strength(0.6f, 0.6f)));
    public static final RegistryObject<Block> GRAVEL_WALL = registerBlock("gravel_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).sound(SoundType.GRAVEL).strength(0.6f, 0.6f)));
    public static final RegistryObject<Block> TUFF_WALL = registerBlock("tuff_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).sound(SoundType.TUFF).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAND_WALL = registerBlock("sand_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SAND).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> RED_SAND_WALL = registerBlock("red_sand_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_SAND).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> DIRT_WALL = registerBlock("dirt_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).sound(SoundType.GRAVEL).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> COARSE_DIRT_WALL = registerBlock("coarse_dirt_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT).sound(SoundType.GRAVEL).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> ROOTED_DIRT_WALL = registerBlock("rooted_dirt_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ROOTED_DIRT).sound(SoundType.ROOTED_DIRT).strength(0.5f, 0.1f)));
    public static final RegistryObject<Block> OBSIDIAN_WALL = registerBlock("obsidian_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).sound(SoundType.STONE).strength(50f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRYING_OBSIDIAN_WALL = registerBlock("crying_obsidian_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN).sound(SoundType.STONE).strength(50f, 1200f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHERRACK_WALL = registerBlock("netherrack_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).sound(SoundType.NETHERRACK).strength(0.4f, 0.4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> END_STONE_WALL = registerBlock("end_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).sound(SoundType.STONE).strength(3f, 9f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_QUARTZ_WALL = registerBlock("chiseled_quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK).sound(SoundType.STONE).strength(0.8f, 4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_BRICKS_WALL = registerBlock("quartz_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).sound(SoundType.STONE).strength(0.8f, 4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> QUARTZ_PILLAR_WALL = registerBlock("quartz_pillar_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).sound(SoundType.STONE).strength(0.8f, 4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BONE_BLOCK_WALL = registerBlock("bone_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).sound(SoundType.BONE_BLOCK).strength(2f, 2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_BASALT).sound(SoundType.BASALT).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BASALT_WALL = registerBlock("basalt_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).sound(SoundType.BASALT).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_BASALT).sound(SoundType.BASALT).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_WOOL_WALL = registerBlock("white_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> ORANGE_WOOL_WALL = registerBlock("orange_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> MAGENTA_WOOL_WALL = registerBlock("magenta_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> LIME_WOOL_WALL = registerBlock("lime_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> PINK_WOOL_WALL = registerBlock("pink_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> GRAY_WOOL_WALL = registerBlock("gray_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> LIGHT_GRAY_WOOL_WALL = registerBlock("light_gray_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> CYAN_WOOL_WALL = registerBlock("cyan_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> PURPLE_WOOL_WALL = registerBlock("purple_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> BLUE_WOOL_WALL = registerBlock("blue_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> BROWN_WOOL_WALL = registerBlock("brown_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> GREEN_WOOL_WALL = registerBlock("green_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> RED_WOOL_WALL = registerBlock("red_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> BLACK_WOOL_WALL = registerBlock("black_wool_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_WOOL).sound(SoundType.WOOL).strength(0.8f, 0.8f)));
    public static final RegistryObject<Block> CRACKED_NETHER_BRICKS_WALL = registerBlock("cracked_nether_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_NETHER_BRICKS).sound(SoundType.NETHER_BRICKS).strength(2f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_NETHER_BRICKS_WALL = registerBlock("chiseled_nether_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_NETHER_BRICKS).sound(SoundType.NETHER_BRICKS).strength(2f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_RED_SANDSTONE_WALL = registerBlock("chiseled_red_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).sound(SoundType.STONE).strength(0.8f, 0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_SANDSTONE_WALL = registerBlock("chiseled_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).sound(SoundType.STONE).strength(0.8f, 0.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_STONE_BRICKS_WALL = registerBlock("chiseled_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_STONE_BRICKS_WALL = registerBlock("cracked_stone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL = registerBlock("cracked_polished_blackstone_bricks_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE).strength(1.5f, 6f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOSS_BLOCK_WALL = registerBlock("moss_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).sound(SoundType.MOSS).strength(0.1f, 0.1f)));
    public static final RegistryObject<Block> HONEYCOMB_BLOCK_WALL = registerBlock("honeycomb_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.HONEYCOMB_BLOCK).sound(SoundType.CORAL_BLOCK).strength(0.6f, 0.6f)));
    public static final RegistryObject<Block> TERRACOTTA_WALL = registerBlock("terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_TERRACOTTA).sound(SoundType.STONE).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLACK_CONCRETE_POWDER_WALL = registerBlock("black_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> BLUE_CONCRETE_POWDER_WALL = registerBlock("blue_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> BROWN_CONCRETE_POWDER_WALL = registerBlock("brown_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> CYAN_CONCRETE_POWDER_WALL = registerBlock("cyan_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> GRAY_CONCRETE_POWDER_WALL = registerBlock("gray_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> GREEN_CONCRETE_POWDER_WALL = registerBlock("green_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_POWDER_WALL = registerBlock("light_blue_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_POWDER_WALL = registerBlock("light_gray_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> LIME_CONCRETE_POWDER_WALL = registerBlock("lime_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_POWDER_WALL = registerBlock("magenta_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> ORANGE_CONCRETE_POWDER_WALL = registerBlock("orange_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> PINK_CONCRETE_POWDER_WALL = registerBlock("pink_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> PURPLE_CONCRETE_POWDER_WALL = registerBlock("purple_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> RED_CONCRETE_POWDER_WALL = registerBlock("red_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> WHITE_CONCRETE_POWDER_WALL = registerBlock("white_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> YELLOW_CONCRETE_POWDER_WALL = registerBlock("yellow_concrete_powder_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE_POWDER).sound(SoundType.SAND).strength(0.5f, 0.5f)));
    public static final RegistryObject<Block> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIGHT_GRAY_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.LIME_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MAGENTA_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ORANGE_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PINK_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PURPLE_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RED_CONCRETE_WALL = registerBlock("red_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.YELLOW_CONCRETE).sound(SoundType.STONE).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    //need everything but wall
    //light levels for froglight wall
    public static final RegistryObject<Block> MANGROVE_PLANK_WALL = registerBlock("mangrove_plank_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> OAK_PLANK_WALL = registerBlock("oak_plank_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> DARK_OAK_PLANK_WALL = registerBlock("dark_oak_plank_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> SPRUCE_PLANK_WALL = registerBlock("spruce_plank_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> JUNGLE_PLANK_WALL = registerBlock("jungle_plank_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> ACACIA_PLANK_WALL = registerBlock("acacia_plank_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> BIRCH_PLANK_WALL = registerBlock("birch_plank_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> CRIMSON_PLANK_WALL = registerBlock("crimson_plank_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> WARPED_PLANK_WALL = registerBlock("warped_plank_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> MANGROVE_LOG_WALL = registerBlock("mangrove_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> PACKED_MUD_WALL = registerBlock("packed_mud_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_MUD).sound(SoundType.PACKED_MUD).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MUDDY_MANGROVE_ROOTS_WALL = registerBlock("muddy_mangrove_roots_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MUDDY_MANGROVE_ROOTS).sound(SoundType.MUDDY_MANGROVE_ROOTS).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_WALL = registerBlock("stripped_mangrove_log_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).sound(SoundType.WOOD).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> MUD_WALL = registerBlock("mud_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MUD).sound(SoundType.MUD).strength(1.8f, 1.8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OCHRE_FROGLIGHT_WALL = registerBlock("ochre_froglight_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> VERDANT_FROGLIGHT_WALL = registerBlock("verdant_froglight_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).strength(1.8f, 1.8f)));
    public static final RegistryObject<Block> PEARLESCENT_FROGLIGHT_WALL = registerBlock("pearlescent_froglight_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).strength(1.8f, 1.8f)));

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
