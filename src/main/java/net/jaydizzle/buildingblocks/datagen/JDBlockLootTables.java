package net.jaydizzle.buildingblocks.datagen;

import net.jaydizzle.buildingblocks.block.JDBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class JDBlockLootTables extends BlockLootSubProvider {
    protected JDBlockLootTables(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }

    @Override
    protected void generate() {
        //CUSTOM BLOCKS
        this.dropSelf(JDBlocks.PINK_CALCITE.get());
        this.dropSelf(JDBlocks.PURPLE_CALCITE.get());
        this.dropSelf(JDBlocks.ORANGE_CALCITE.get());
        this.dropSelf(JDBlocks.LIGHT_BLUE_CALCITE.get());
        this.dropSelf(JDBlocks.YELLOW_CALCITE.get());
        this.dropSelf(JDBlocks.LIME_CALCITE.get());
        this.dropSelf(JDBlocks.BLUE_CALCITE.get());
        this.dropSelf(JDBlocks.LIGHT_GRAY_CALCITE.get());
        this.dropSelf(JDBlocks.MAGENTA_CALCITE.get());
        this.dropSelf(JDBlocks.GRAY_CALCITE.get());
        this.dropSelf(JDBlocks.BLUE_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.BROWN_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.CYAN_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.GRAY_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.GREEN_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.LIGHT_BLUE_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.LIGHT_GRAY_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.LIME_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.MAGENTA_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.ORANGE_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.PINK_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.PURPLE_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.RED_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.WHITE_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.YELLOW_CONCRETE_BRICKS.get());
        this.dropSelf(JDBlocks.YELLOW_BRICKS.get());
        this.dropSelf(JDBlocks.RED_BRICKS.get());
        this.dropSelf(JDBlocks.BLACK_BRICKS.get());
        this.dropSelf(JDBlocks.WHITE_BRICKS.get());
        this.dropSelf(JDBlocks.BROWN_BRICKS.get());
        this.dropSelf(JDBlocks.AQUA_BRICKS.get());
        this.dropSelf(JDBlocks.ORANGE_BRICKS.get());
        this.dropSelf(JDBlocks.GREEN_BRICKS.get());
        this.dropSelf(JDBlocks.GRAY_BRICKS.get());
        this.dropSelf(JDBlocks.BLUE_BRICKS.get());
        this.dropSelf(JDBlocks.PURPLE_BRICKS.get());
        this.dropSelf(JDBlocks.BASIC_BRICKS.get());
        this.dropSelf(JDBlocks.BLUE_COBBLESTONE.get());
        this.dropSelf(JDBlocks.TURQUOISE_COBBLESTONE.get());
        this.dropSelf(JDBlocks.BROWN_COBBLESTONE.get());
        this.dropSelf(JDBlocks.GREEN_COBBLESTONE.get());
        this.dropSelf(JDBlocks.RED_COBBLESTONE.get());
        this.dropSelf(JDBlocks.BLACK_COBBLESTONE.get());
        this.dropSelf(JDBlocks.SPIRAL_STONE.get());
        this.dropSelf(JDBlocks.PURPLE_COBBLESTONE.get());

        //SLABS
        this.add(JDBlocks.SPRUCE_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.SPRUCE_LOG_SLAB.get()));
        this.add(JDBlocks.OAK_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.OAK_LOG_SLAB.get()));
        this.add(JDBlocks.DARK_OAK_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.DARK_OAK_LOG_SLAB.get()));
        this.add(JDBlocks.ACACIA_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.ACACIA_LOG_SLAB.get()));
        this.add(JDBlocks.JUNGLE_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.JUNGLE_LOG_SLAB.get()));
        this.add(JDBlocks.BIRCH_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.BIRCH_LOG_SLAB.get()));
        this.add(JDBlocks.WARPED_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.WARPED_LOG_SLAB.get()));
        this.add(JDBlocks.CRIMSON_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.CRIMSON_LOG_SLAB.get()));
        this.add(JDBlocks.SPRUCE_SKINNED_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.SPRUCE_SKINNED_LOG_SLAB.get()));
        this.add(JDBlocks.OAK_SKINNED_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.OAK_SKINNED_LOG_SLAB.get()));
        this.add(JDBlocks.DARK_SKINNED_OAK_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.DARK_SKINNED_OAK_LOG_SLAB.get()));
        this.add(JDBlocks.ACACIA_SKINNED_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.ACACIA_SKINNED_LOG_SLAB.get()));
        this.add(JDBlocks.JUNGLE_SKINNED_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.JUNGLE_SKINNED_LOG_SLAB.get()));
        this.add(JDBlocks.BIRCH_SKINNED_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.BIRCH_SKINNED_LOG_SLAB.get()));
        this.add(JDBlocks.WARPED_SKINNED_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.WARPED_SKINNED_LOG_SLAB.get()));
        this.add(JDBlocks.CRIMSON_SKINNED_LOG_SLAB.get(), block -> createSlabItemTable(JDBlocks.CRIMSON_SKINNED_LOG_SLAB.get()));
        this.add(JDBlocks.CALCITE_SLAB.get(), block -> createSlabItemTable(JDBlocks.CALCITE_SLAB.get()));
        this.add(JDBlocks.CLAY_SLAB.get(), block -> createSlabItemTable(JDBlocks.CLAY_SLAB.get()));
        this.add(JDBlocks.GRAVEL_SLAB.get(), block -> createSlabItemTable(JDBlocks.GRAVEL_SLAB.get()));
        this.add(JDBlocks.TUFF_SLAB.get(), block -> createSlabItemTable(JDBlocks.TUFF_SLAB.get()));
        this.add(JDBlocks.SAND_SLAB.get(), block -> createSlabItemTable(JDBlocks.SAND_SLAB.get()));
        this.add(JDBlocks.RED_SAND_SLAB.get(), block -> createSlabItemTable(JDBlocks.RED_SAND_SLAB.get()));
        this.add(JDBlocks.DIRT_SLAB.get(), block -> createSlabItemTable(JDBlocks.DIRT_SLAB.get()));
        this.add(JDBlocks.COARSE_DIRT_SLAB.get(), block -> createSlabItemTable(JDBlocks.COARSE_DIRT_SLAB.get()));
        this.add(JDBlocks.ROOTED_DIRT_SLAB.get(), block -> createSlabItemTable(JDBlocks.ROOTED_DIRT_SLAB.get()));
        this.add(JDBlocks.AMETHYST_SLAB.get(), block -> createSlabItemTable(JDBlocks.AMETHYST_SLAB.get()));
        this.add(JDBlocks.OBSIDIAN_SLAB.get(), block -> createSlabItemTable(JDBlocks.OBSIDIAN_SLAB.get()));
        this.add(JDBlocks.CRYING_OBSIDIAN_SLAB.get(), block -> createSlabItemTable(JDBlocks.CRYING_OBSIDIAN_SLAB.get()));
        this.add(JDBlocks.NETHERRACK_SLAB.get(), block -> createSlabItemTable(JDBlocks.NETHERRACK_SLAB.get()));
        this.add(JDBlocks.END_STONE_SLAB.get(), block -> createSlabItemTable(JDBlocks.END_STONE_SLAB.get()));
        this.add(JDBlocks.CHISELED_QUARTZ_SLAB.get(), block -> createSlabItemTable(JDBlocks.CHISELED_QUARTZ_SLAB.get()));
        this.add(JDBlocks.QUARTZ_BRICKS_SLAB.get(), block -> createSlabItemTable(JDBlocks.QUARTZ_BRICKS_SLAB.get()));
        this.add(JDBlocks.QUARTZ_PILLAR_SLAB.get(), block -> createSlabItemTable(JDBlocks.QUARTZ_PILLAR_SLAB.get()));
        this.add(JDBlocks.BONE_BLOCK_SLAB.get(), block -> createSlabItemTable(JDBlocks.BONE_BLOCK_SLAB.get()));
        this.add(JDBlocks.SMOOTH_BASALT_SLAB.get(), block -> createSlabItemTable(JDBlocks.SMOOTH_BASALT_SLAB.get()));
        this.add(JDBlocks.BASALT_SLAB.get(), block -> createSlabItemTable(JDBlocks.BASALT_SLAB.get()));
        this.add(JDBlocks.POLISHED_BASALT_SLAB.get(), block -> createSlabItemTable(JDBlocks.POLISHED_BASALT_SLAB.get()));
        this.add(JDBlocks.WHITE_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.WHITE_WOOL_SLAB.get()));
        this.add(JDBlocks.ORANGE_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.ORANGE_WOOL_SLAB.get()));
        this.add(JDBlocks.MAGENTA_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.MAGENTA_WOOL_SLAB.get()));
        this.add(JDBlocks.LIGHT_BLUE_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIGHT_BLUE_WOOL_SLAB.get()));
        this.add(JDBlocks.YELLOW_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.YELLOW_WOOL_SLAB.get()));
        this.add(JDBlocks.LIME_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIME_WOOL_SLAB.get()));
        this.add(JDBlocks.PINK_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.PINK_WOOL_SLAB.get()));
        this.add(JDBlocks.GRAY_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.GRAY_WOOL_SLAB.get()));
        this.add(JDBlocks.LIGHT_GRAY_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIGHT_GRAY_WOOL_SLAB.get()));
        this.add(JDBlocks.CYAN_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.CYAN_WOOL_SLAB.get()));
        this.add(JDBlocks.PURPLE_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.PURPLE_WOOL_SLAB.get()));
        this.add(JDBlocks.BLUE_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.BLUE_WOOL_SLAB.get()));
        this.add(JDBlocks.BROWN_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.BROWN_WOOL_SLAB.get()));
        this.add(JDBlocks.GREEN_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.GREEN_WOOL_SLAB.get()));
        this.add(JDBlocks.RED_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.RED_WOOL_SLAB.get()));
        this.add(JDBlocks.BLACK_WOOL_SLAB.get(), block -> createSlabItemTable(JDBlocks.BLACK_WOOL_SLAB.get()));
        this.add(JDBlocks.CRACKED_NETHER_BRICKS_SLAB.get(), block -> createSlabItemTable(JDBlocks.CRACKED_NETHER_BRICKS_SLAB.get()));
        this.add(JDBlocks.CHISELED_NETHER_BRICKS_SLAB.get(), block -> createSlabItemTable(JDBlocks.CHISELED_NETHER_BRICKS_SLAB.get()));
        this.add(JDBlocks.CHISELED_RED_SANDSTONE_SLAB.get(), block -> createSlabItemTable(JDBlocks.CHISELED_RED_SANDSTONE_SLAB.get()));
        this.add(JDBlocks.CHISELED_SANDSTONE_SLAB.get(), block -> createSlabItemTable(JDBlocks.CHISELED_SANDSTONE_SLAB.get()));
        this.add(JDBlocks.CHISELED_STONE_BRICKS_SLAB.get(), block -> createSlabItemTable(JDBlocks.CHISELED_STONE_BRICKS_SLAB.get()));
        this.add(JDBlocks.CRACKED_STONE_BRICKS_SLAB.get(), block -> createSlabItemTable(JDBlocks.CRACKED_STONE_BRICKS_SLAB.get()));
        this.add(JDBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB.get(), block -> createSlabItemTable(JDBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB.get()));
        this.add(JDBlocks.MOSS_BLOCK_SLAB.get(), block -> createSlabItemTable(JDBlocks.MOSS_BLOCK_SLAB.get()));
        this.add(JDBlocks.HONEYCOMB_BLOCK_SLAB.get(), block -> createSlabItemTable(JDBlocks.HONEYCOMB_BLOCK_SLAB.get()));
        this.add(JDBlocks.TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.BLACK_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.BLACK_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.BLUE_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.BLUE_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.BROWN_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.BROWN_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.CYAN_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.CYAN_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.GRAY_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.GRAY_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.GREEN_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.GREEN_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.LIME_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIME_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.MAGENTA_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.MAGENTA_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.ORANGE_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.ORANGE_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.PINK_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.PINK_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.PURPLE_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.PURPLE_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.RED_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.RED_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.WHITE_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.WHITE_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.YELLOW_TERRACOTTA_SLAB.get(), block -> createSlabItemTable(JDBlocks.YELLOW_TERRACOTTA_SLAB.get()));
        this.add(JDBlocks.BLACK_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.BLACK_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.BLUE_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.BLUE_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.BROWN_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.BROWN_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.CYAN_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.CYAN_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.GRAY_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.GRAY_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.GREEN_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.GREEN_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.LIME_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIME_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.MAGENTA_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.MAGENTA_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.ORANGE_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.ORANGE_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.PINK_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.PINK_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.PURPLE_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.PURPLE_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.RED_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.RED_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.WHITE_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.WHITE_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.YELLOW_CONCRETE_POWDER_SLAB.get(), block -> createSlabItemTable(JDBlocks.YELLOW_CONCRETE_POWDER_SLAB.get()));
        this.add(JDBlocks.BLACK_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.BLACK_CONCRETE_SLAB.get()));
        this.add(JDBlocks.BLUE_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.BLUE_CONCRETE_SLAB.get()));
        this.add(JDBlocks.BROWN_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.BROWN_CONCRETE_SLAB.get()));
        this.add(JDBlocks.CYAN_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.CYAN_CONCRETE_SLAB.get()));
        this.add(JDBlocks.GRAY_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.GRAY_CONCRETE_SLAB.get()));
        this.add(JDBlocks.GREEN_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.GREEN_CONCRETE_SLAB.get()));
        this.add(JDBlocks.LIGHT_BLUE_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIGHT_BLUE_CONCRETE_SLAB.get()));
        this.add(JDBlocks.LIGHT_GRAY_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIGHT_GRAY_CONCRETE_SLAB.get()));
        this.add(JDBlocks.LIME_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.LIME_CONCRETE_SLAB.get()));
        this.add(JDBlocks.MAGENTA_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.MAGENTA_CONCRETE_SLAB.get()));
        this.add(JDBlocks.ORANGE_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.ORANGE_CONCRETE_SLAB.get()));
        this.add(JDBlocks.PINK_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.PINK_CONCRETE_SLAB.get()));
        this.add(JDBlocks.PURPLE_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.PURPLE_CONCRETE_SLAB.get()));
        this.add(JDBlocks.RED_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.RED_CONCRETE_SLAB.get()));
        this.add(JDBlocks.WHITE_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.WHITE_CONCRETE_SLAB.get()));
        this.add(JDBlocks.YELLOW_CONCRETE_SLAB.get(), block -> createSlabItemTable(JDBlocks.YELLOW_CONCRETE_SLAB.get()));
        this.add(JDBlocks.GLOWSTONE_SLAB.get(), block -> createSlabItemTable(JDBlocks.GLOWSTONE_SLAB.get()));
        this.add(JDBlocks.SHROOMLIGHT_SLAB.get(), block -> createSlabItemTable(JDBlocks.SHROOMLIGHT_SLAB.get()));
        this.add(JDBlocks.SEA_LANTERN_SLAB.get(), block -> createSlabItemTable(JDBlocks.SEA_LANTERN_SLAB.get()));
        this.add(JDBlocks.KELP_SLAB.get(), block -> createSlabItemTable(JDBlocks.KELP_SLAB.get()));
        this.add(JDBlocks.WARPED_WART_SLAB.get(), block -> createSlabItemTable(JDBlocks.WARPED_WART_SLAB.get()));
        this.add(JDBlocks.CRIMSON_WART_SLAB.get(), block -> createSlabItemTable(JDBlocks.CRIMSON_WART_SLAB.get()));
        this.add(JDBlocks.OCHRE_FROGLIGHT_SLAB.get(), block -> createSlabItemTable(JDBlocks.OCHRE_FROGLIGHT_SLAB.get()));
        this.add(JDBlocks.VERDANT_FROGLIGHT_SLAB.get(), block -> createSlabItemTable(JDBlocks.OCHRE_FROGLIGHT_SLAB.get()));
        this.add(JDBlocks.PEARLESCENT_FROGLIGHT_SLAB.get(), block -> createSlabItemTable(JDBlocks.OCHRE_FROGLIGHT_SLAB.get()));

        //STAIRS
        this.dropSelf(JDBlocks.OCHRE_FROGLIGHT_STAIRS.get());
        this.dropSelf(JDBlocks.VERDANT_FROGLIGHT_STAIRS.get());
        this.dropSelf(JDBlocks.PEARLESCENT_FROGLIGHT_STAIRS.get());
        this.dropSelf(JDBlocks.SPRUCE_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.OAK_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.DARK_OAK_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.ACACIA_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.JUNGLE_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.BIRCH_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.WARPED_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.CRIMSON_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.SPRUCE_SKINNED_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.OAK_SKINNED_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.DARK_OAK_SKINNED_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.ACACIA_SKINNED_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.JUNGLE_SKINNED_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.BIRCH_SKINNED_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.WARPED_SKINNED_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.CRIMSON_SKINNED_LOG_STAIRS.get());
        this.dropSelf(JDBlocks.CALCITE_STAIRS.get());
        this.dropSelf(JDBlocks.CLAY_STAIRS.get());
        this.dropSelf(JDBlocks.GRAVEL_STAIRS.get());
        this.dropSelf(JDBlocks.TUFF_STAIRS.get());
        this.dropSelf(JDBlocks.SAND_STAIRS.get());
        this.dropSelf(JDBlocks.RED_SAND_STAIRS.get());
        this.dropSelf(JDBlocks.DIRT_STAIRS.get());
        this.dropSelf(JDBlocks.COARSE_DIRT_STAIRS.get());
        this.dropSelf(JDBlocks.ROOTED_DIRT_STAIRS.get());
        this.dropSelf(JDBlocks.AMETHYST_STAIRS.get());
        this.dropSelf(JDBlocks.OBSIDIAN_STAIRS.get());
        this.dropSelf(JDBlocks.CRYING_OBSIDIAN_STAIRS.get());
        this.dropSelf(JDBlocks.NETHERRACK_STAIRS.get());
        this.dropSelf(JDBlocks.END_STONE_STAIRS.get());
        this.dropSelf(JDBlocks.CHISELED_QUARTZ_STAIRS.get());
        this.dropSelf(JDBlocks.QUARTZ_BRICKS_STAIRS.get());
        this.dropSelf(JDBlocks.QUARTZ_PILLAR_STAIRS.get());
        this.dropSelf(JDBlocks.BONE_BLOCK_STAIRS.get());
        this.dropSelf(JDBlocks.SMOOTH_BASALT_STAIRS.get());
        this.dropSelf(JDBlocks.BASALT_STAIRS.get());
        this.dropSelf(JDBlocks.POLISHED_BASALT_STAIRS.get());
        this.dropSelf(JDBlocks.WHITE_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.ORANGE_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.MAGENTA_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.LIGHT_BLUE_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.YELLOW_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.LIME_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.PINK_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.GRAY_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.LIGHT_GRAY_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.CYAN_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.PURPLE_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.BLUE_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.BROWN_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.GREEN_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.RED_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.BLACK_WOOL_STAIRS.get());
        this.dropSelf(JDBlocks.CRACKED_NETHER_BRICKS_STAIRS.get());
        this.dropSelf(JDBlocks.CHISELED_NETHER_BRICKS_STAIRS.get());
        this.dropSelf(JDBlocks.CHISELED_RED_SANDSTONE_STAIRS.get());
        this.dropSelf(JDBlocks.CHISELED_SANDSTONE_STAIRS.get());
        this.dropSelf(JDBlocks.CHISELED_STONE_BRICKS_STAIRS.get());
        this.dropSelf(JDBlocks.CRACKED_STONE_BRICKS_STAIRS.get());
        this.dropSelf(JDBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS.get());
        this.dropSelf(JDBlocks.MOSS_BLOCK_STAIRS.get());
        this.dropSelf(JDBlocks.HONEYCOMB_BLOCK_STAIRS.get());
        this.dropSelf(JDBlocks.TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.BLACK_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.BLUE_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.BROWN_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.CYAN_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.GRAY_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.GREEN_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.LIME_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.MAGENTA_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.PINK_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.PURPLE_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.RED_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.WHITE_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.YELLOW_TERRACOTTA_STAIRS.get());
        this.dropSelf(JDBlocks.BLACK_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.BLUE_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.BROWN_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.CYAN_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.GRAY_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.GREEN_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.LIGHT_BLUE_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.LIGHT_GRAY_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.LIME_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.MAGENTA_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.ORANGE_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.PINK_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.PURPLE_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.RED_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.WHITE_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.YELLOW_CONCRETE_POWDER_STAIRS.get());
        this.dropSelf(JDBlocks.BLACK_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.BLUE_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.BROWN_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.CYAN_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.GRAY_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.GREEN_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.LIME_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.MAGENTA_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.ORANGE_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.PINK_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.PURPLE_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.RED_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.WHITE_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.YELLOW_CONCRETE_STAIRS.get());
        this.dropSelf(JDBlocks.SMOOTH_STONE_STAIRS.get());
        this.dropSelf(JDBlocks.GLOWSTONE_STAIRS.get());
        this.dropSelf(JDBlocks.SHROOMLIGHT_STAIRS.get());
        this.dropSelf(JDBlocks.SEA_LANTERN_STAIRS.get());
        this.dropSelf(JDBlocks.KELP_STAIRS.get());
        this.dropSelf(JDBlocks.WARPED_WART_STAIRS.get());
        this.dropSelf(JDBlocks.CRIMSON_WART_STAIRS.get());

        //WALLS
        this.dropSelf(JDBlocks.SPRUCE_LOG_WALL.get());
        this.dropSelf(JDBlocks.OAK_LOG_WALL.get());
        this.dropSelf(JDBlocks.DARK_OAK_LOG_WALL.get());
        this.dropSelf(JDBlocks.ACACIA_LOG_WALL.get());
        this.dropSelf(JDBlocks.JUNGLE_LOG_WALL.get());
        this.dropSelf(JDBlocks.BIRCH_LOG_WALL.get());
        this.dropSelf(JDBlocks.WARPED_LOG_WALL.get());
        this.dropSelf(JDBlocks.CRIMSON_LOG_WALL.get());
        this.dropSelf(JDBlocks.SPRUCE_SKINNED_LOG_WALL.get());
        this.dropSelf(JDBlocks.OAK_SKINNED_LOG_WALL.get());
        this.dropSelf(JDBlocks.DARK_SKINNED_OAK_LOG_WALL.get());
        this.dropSelf(JDBlocks.ACACIA_SKINNED_LOG_WALL.get());
        this.dropSelf(JDBlocks.JUNGLE_SKINNED_LOG_WALL.get());
        this.dropSelf(JDBlocks.BIRCH_SKINNED_LOG_WALL.get());
        this.dropSelf(JDBlocks.WARPED_SKINNED_LOG_WALL.get());
        this.dropSelf(JDBlocks.CRIMSON_SKINNED_LOG_WALL.get());
        this.dropSelf(JDBlocks.CALCITE_WALL.get());
        this.dropSelf(JDBlocks.CLAY_WALL.get());
        this.dropSelf(JDBlocks.GRAVEL_WALL.get());
        this.dropSelf(JDBlocks.TUFF_WALL.get());
        this.dropSelf(JDBlocks.SAND_WALL.get());
        this.dropSelf(JDBlocks.RED_SAND_WALL.get());
        this.dropSelf(JDBlocks.DIRT_WALL.get());
        this.dropSelf(JDBlocks.COARSE_DIRT_WALL.get());
        this.dropSelf(JDBlocks.ROOTED_DIRT_WALL.get());
        this.dropSelf(JDBlocks.AMETHYST_WALL.get());
        this.dropSelf(JDBlocks.OBSIDIAN_WALL.get());
        this.dropSelf(JDBlocks.CRYING_OBSIDIAN_WALL.get());
        this.dropSelf(JDBlocks.NETHERRACK_WALL.get());
        this.dropSelf(JDBlocks.END_STONE_WALL.get());
        this.dropSelf(JDBlocks.CHISELED_QUARTZ_WALL.get());
        this.dropSelf(JDBlocks.QUARTZ_BRICKS_WALL.get());
        this.dropSelf(JDBlocks.QUARTZ_PILLAR_WALL.get());
        this.dropSelf(JDBlocks.BONE_BLOCK_WALL.get());
        this.dropSelf(JDBlocks.SMOOTH_BASALT_WALL.get());
        this.dropSelf(JDBlocks.BASALT_WALL.get());
        this.dropSelf(JDBlocks.POLISHED_BASALT_WALL.get());
        this.dropSelf(JDBlocks.WHITE_WOOL_WALL.get());
        this.dropSelf(JDBlocks.ORANGE_WOOL_WALL.get());
        this.dropSelf(JDBlocks.MAGENTA_WOOL_WALL.get());
        this.dropSelf(JDBlocks.LIGHT_BLUE_WOOL_WALL.get());
        this.dropSelf(JDBlocks.YELLOW_WOOL_WALL.get());
        this.dropSelf(JDBlocks.LIME_WOOL_WALL.get());
        this.dropSelf(JDBlocks.PINK_WOOL_WALL.get());
        this.dropSelf(JDBlocks.GRAY_WOOL_WALL.get());
        this.dropSelf(JDBlocks.LIGHT_GRAY_WOOL_WALL.get());
        this.dropSelf(JDBlocks.CYAN_WOOL_WALL.get());
        this.dropSelf(JDBlocks.PURPLE_WOOL_WALL.get());
        this.dropSelf(JDBlocks.BLUE_WOOL_WALL.get());
        this.dropSelf(JDBlocks.BROWN_WOOL_WALL.get());
        this.dropSelf(JDBlocks.GREEN_WOOL_WALL.get());
        this.dropSelf(JDBlocks.RED_WOOL_WALL.get());
        this.dropSelf(JDBlocks.BLACK_WOOL_WALL.get());
        this.dropSelf(JDBlocks.CRACKED_NETHER_BRICKS_WALL.get());
        this.dropSelf(JDBlocks.CHISELED_NETHER_BRICKS_WALL.get());
        this.dropSelf(JDBlocks.CHISELED_RED_SANDSTONE_WALL.get());
        this.dropSelf(JDBlocks.CHISELED_SANDSTONE_WALL.get());
        this.dropSelf(JDBlocks.CHISELED_STONE_BRICKS_WALL.get());
        this.dropSelf(JDBlocks.CRACKED_STONE_BRICKS_WALL.get());
        this.dropSelf(JDBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL.get());
        this.dropSelf(JDBlocks.MOSS_BLOCK_WALL.get());
        this.dropSelf(JDBlocks.HONEYCOMB_BLOCK_WALL.get());
        this.dropSelf(JDBlocks.TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.BLACK_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.BLUE_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.BROWN_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.CYAN_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.GRAY_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.GREEN_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.LIME_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.MAGENTA_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.ORANGE_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.PINK_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.PURPLE_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.RED_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.WHITE_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.YELLOW_TERRACOTTA_WALL.get());
        this.dropSelf(JDBlocks.BLACK_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.BLUE_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.BROWN_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.CYAN_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.GRAY_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.GREEN_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.LIGHT_BLUE_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.LIGHT_GRAY_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.LIME_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.MAGENTA_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.ORANGE_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.PINK_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.PURPLE_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.RED_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.WHITE_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.YELLOW_CONCRETE_POWDER_WALL.get());
        this.dropSelf(JDBlocks.BLACK_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.BLUE_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.BROWN_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.CYAN_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.GRAY_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.GREEN_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.LIGHT_BLUE_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.LIGHT_GRAY_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.LIME_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.MAGENTA_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.ORANGE_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.PINK_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.PURPLE_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.RED_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.WHITE_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.YELLOW_CONCRETE_WALL.get());
        this.dropSelf(JDBlocks.MANGROVE_PLANK_WALL.get());
        this.dropSelf(JDBlocks.OAK_PLANK_WALL.get());
        this.dropSelf(JDBlocks.DARK_OAK_PLANK_WALL.get());
        this.dropSelf(JDBlocks.SPRUCE_PLANK_WALL.get());
        this.dropSelf(JDBlocks.JUNGLE_PLANK_WALL.get());
        this.dropSelf(JDBlocks.ACACIA_PLANK_WALL.get());
        this.dropSelf(JDBlocks.BIRCH_PLANK_WALL.get());
        this.dropSelf(JDBlocks.CRIMSON_PLANK_WALL.get());
        this.dropSelf(JDBlocks.WARPED_PLANK_WALL.get());
        this.dropSelf(JDBlocks.MANGROVE_LOG_WALL.get());
        this.dropSelf(JDBlocks.PACKED_MUD_WALL.get());
        this.dropSelf(JDBlocks.MUDDY_MANGROVE_ROOTS_WALL.get());
        this.dropSelf(JDBlocks.STRIPPED_MANGROVE_LOG_WALL.get());
        this.dropSelf(JDBlocks.MUD_WALL.get());
        this.dropSelf(JDBlocks.OCHRE_FROGLIGHT_WALL.get());
        this.dropSelf(JDBlocks.VERDANT_FROGLIGHT_WALL.get());
        this.dropSelf(JDBlocks.PEARLESCENT_FROGLIGHT_WALL.get());
        this.dropSelf(JDBlocks.SMOOTH_STONE_WALL.get());
        this.dropSelf(JDBlocks.GLOWSTONE_WALL.get());
        this.dropSelf(JDBlocks.SHROOMLIGHT_WALL.get());
        this.dropSelf(JDBlocks.SEA_LANTERN_WALL.get());
        this.dropSelf(JDBlocks.KELP_WALL.get());
        this.dropSelf(JDBlocks.WARPED_WART_WALL.get());
        this.dropSelf(JDBlocks.CRIMSON_WART_WALL.get());
        this.dropSelf(JDBlocks.STONE_PATH.get());

        //FENCES
        this.dropSelf(JDBlocks.SPRUCE_LOG_FENCE.get());
        this.dropSelf(JDBlocks.OAK_LOG_FENCE.get());
        this.dropSelf(JDBlocks.DARK_OAK_LOG_FENCE.get());
        this.dropSelf(JDBlocks.ACACIA_LOG_FENCE.get());
        this.dropSelf(JDBlocks.JUNGLE_LOG_FENCE.get());
        this.dropSelf(JDBlocks.BIRCH_LOG_FENCE.get());
        this.dropSelf(JDBlocks.WARPED_LOG_FENCE.get());
        this.dropSelf(JDBlocks.CRIMSON_LOG_FENCE.get());
        this.dropSelf(JDBlocks.SPRUCE_SKINNED_LOG_FENCE.get());
        this.dropSelf(JDBlocks.OAK_SKINNED_LOG_FENCE.get());
        this.dropSelf(JDBlocks.DARK_SKINNED_OAK_LOG_FENCE.get());
        this.dropSelf(JDBlocks.ACACIA_SKINNED_LOG_FENCE.get());
        this.dropSelf(JDBlocks.JUNGLE_SKINNED_LOG_FENCE.get());
        this.dropSelf(JDBlocks.BIRCH_SKINNED_LOG_FENCE.get());
        this.dropSelf(JDBlocks.WARPED_SKINNED_LOG_FENCE.get());
        this.dropSelf(JDBlocks.CRIMSON_SKINNED_LOG_FENCE.get());

        //FENCE GATES
        this.dropSelf(JDBlocks.SPRUCE_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.OAK_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.DARK_OAK_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.ACACIA_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.JUNGLE_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.BIRCH_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.WARPED_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.CRIMSON_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.SPRUCE_SKINNED_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.OAK_SKINNED_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.DARK_SKINNED_OAK_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.ACACIA_SKINNED_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.JUNGLE_SKINNED_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.BIRCH_SKINNED_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.WARPED_SKINNED_LOG_FENCE_GATE.get());
        this.dropSelf(JDBlocks.CRIMSON_SKINNED_LOG_FENCE_GATE.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return JDBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}