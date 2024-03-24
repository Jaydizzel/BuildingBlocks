package com.jaydizzle.buildingblocks.datagen;

import com.jaydizzle.buildingblocks.BuildingBlocks;
import com.jaydizzle.buildingblocks.block.*;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JDItemModelProvider extends ItemModelProvider {
    public JDItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BuildingBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //FENCES
        fenceItemVanilla(JDFences.SPRUCE_LOG_FENCE, Blocks.SPRUCE_LOG);
        fenceItemVanilla(JDFences.OAK_LOG_FENCE, Blocks.OAK_LOG);
        fenceItemVanilla(JDFences.DARK_OAK_LOG_FENCE, Blocks.DARK_OAK_LOG);
        fenceItemVanilla(JDFences.ACACIA_LOG_FENCE, Blocks.ACACIA_LOG);
        fenceItemVanilla(JDFences.JUNGLE_LOG_FENCE, Blocks.JUNGLE_LOG);
        fenceItemVanilla(JDFences.BIRCH_LOG_FENCE, Blocks.BIRCH_LOG);
        fenceItemVanilla(JDFences.WARPED_LOG_FENCE, Blocks.WARPED_HYPHAE);
        fenceItemVanilla(JDFences.CRIMSON_LOG_FENCE, Blocks.CRIMSON_HYPHAE);
        fenceItemVanilla(JDFences.SPRUCE_SKINNED_LOG_FENCE, Blocks.STRIPPED_SPRUCE_LOG);
        fenceItemVanilla(JDFences.OAK_SKINNED_LOG_FENCE, Blocks.STRIPPED_OAK_LOG);
        fenceItemVanilla(JDFences.DARK_SKINNED_OAK_LOG_FENCE, Blocks.STRIPPED_DARK_OAK_LOG);
        fenceItemVanilla(JDFences.ACACIA_SKINNED_LOG_FENCE, Blocks.STRIPPED_ACACIA_LOG);
        fenceItemVanilla(JDFences.JUNGLE_SKINNED_LOG_FENCE, Blocks.STRIPPED_JUNGLE_WOOD);
        fenceItemVanilla(JDFences.BIRCH_SKINNED_LOG_FENCE, Blocks.STRIPPED_BIRCH_LOG);
        fenceItemVanilla(JDFences.WARPED_SKINNED_LOG_FENCE, Blocks.STRIPPED_WARPED_HYPHAE);
        fenceItemVanilla(JDFences.CRIMSON_SKINNED_LOG_FENCE, Blocks.STRIPPED_CRIMSON_HYPHAE);
        fenceItemVanilla(JDFences.CRIMSON_SKINNED_LOG_FENCE, Blocks.STRIPPED_CRIMSON_HYPHAE);

        //WALLS
        wallItemVanilla(JDWalls.SPRUCE_LOG_WALL, Blocks.SPRUCE_LOG);
        wallItemVanilla(JDWalls.OAK_LOG_WALL, Blocks.OAK_LOG);
        wallItemVanilla(JDWalls.DARK_OAK_LOG_WALL, Blocks.DARK_OAK_LOG);
        wallItemVanilla(JDWalls.ACACIA_LOG_WALL, Blocks.ACACIA_LOG);
        wallItemVanilla(JDWalls.JUNGLE_LOG_WALL, Blocks.JUNGLE_LOG);
        wallItemVanilla(JDWalls.BIRCH_LOG_WALL, Blocks.BIRCH_LOG);
        wallItemVanilla(JDWalls.WARPED_LOG_WALL, Blocks.WARPED_HYPHAE);
        wallItemVanilla(JDWalls.CRIMSON_LOG_WALL, Blocks.CRIMSON_HYPHAE);
        wallItemVanilla(JDWalls.SPRUCE_SKINNED_LOG_WALL, Blocks.STRIPPED_SPRUCE_LOG);
        wallItemVanilla(JDWalls.OAK_SKINNED_LOG_WALL, Blocks.STRIPPED_OAK_LOG);
        wallItemVanilla(JDWalls.DARK_SKINNED_OAK_LOG_WALL, Blocks.STRIPPED_DARK_OAK_LOG);
        wallItemVanilla(JDWalls.ACACIA_SKINNED_LOG_WALL, Blocks.STRIPPED_ACACIA_LOG);
        wallItemVanilla(JDWalls.JUNGLE_SKINNED_LOG_WALL, Blocks.STRIPPED_JUNGLE_LOG);
        wallItemVanilla(JDWalls.BIRCH_SKINNED_LOG_WALL, Blocks.STRIPPED_BIRCH_LOG);
        wallItemVanilla(JDWalls.WARPED_SKINNED_LOG_WALL, Blocks.STRIPPED_WARPED_HYPHAE);
        wallItemVanilla(JDWalls.CRIMSON_SKINNED_LOG_WALL, Blocks.STRIPPED_CRIMSON_HYPHAE);
        wallItemVanilla(JDWalls.CALCITE_WALL, Blocks.CALCITE);
        wallItemVanilla(JDWalls.CLAY_WALL, Blocks.CLAY);
        wallItemVanilla(JDWalls.GRAVEL_WALL, Blocks.GRAVEL);
        wallItemVanilla(JDWalls.TUFF_WALL, Blocks.TUFF);
        wallItemVanilla(JDWalls.SAND_WALL, Blocks.SAND);
        wallItemVanilla(JDWalls.RED_SAND_WALL, Blocks.RED_SAND);
        wallItemVanilla(JDWalls.DIRT_WALL, Blocks.DIRT);
        wallItemVanilla(JDWalls.COARSE_DIRT_WALL, Blocks.COARSE_DIRT);
        wallItemVanilla(JDWalls.ROOTED_DIRT_WALL, Blocks.ROOTED_DIRT);
        wallItemVanilla(JDWalls.AMETHYST_WALL, Blocks.AMETHYST_BLOCK);
        wallItemVanilla(JDWalls.OBSIDIAN_WALL, Blocks.OBSIDIAN);
        wallItemVanilla(JDWalls.CRYING_OBSIDIAN_WALL, Blocks.CRYING_OBSIDIAN);
        wallItemVanilla(JDWalls.NETHERRACK_WALL, Blocks.NETHERRACK);
        wallItemVanilla(JDWalls.END_STONE_WALL, Blocks.END_STONE);
        wallItemVanilla(JDWalls.CHISELED_QUARTZ_WALL, Blocks.CHISELED_QUARTZ_BLOCK);
        wallItemVanilla(JDWalls.QUARTZ_BRICKS_WALL, Blocks.QUARTZ_BRICKS);
        wallItemVanilla(JDWalls.QUARTZ_PILLAR_WALL, Blocks.QUARTZ_PILLAR);
        wallItemVanilla(JDWalls.BONE_BLOCK_WALL, Blocks.BONE_BLOCK);
        wallItemVanilla(JDWalls.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
        wallItemVanilla(JDWalls.BASALT_WALL, Blocks.BASALT);
        wallItemVanilla(JDWalls.POLISHED_BASALT_WALL, Blocks.POLISHED_BASALT);
        wallItemVanilla(JDWalls.WHITE_WOOL_WALL, Blocks.WHITE_WOOL);
        wallItemVanilla(JDWalls.ORANGE_WOOL_WALL, Blocks.ORANGE_WOOL);
        wallItemVanilla(JDWalls.MAGENTA_WOOL_WALL, Blocks.MAGENTA_WOOL);
        wallItemVanilla(JDWalls.LIGHT_BLUE_WOOL_WALL, Blocks.LIGHT_BLUE_WOOL);
        wallItemVanilla(JDWalls.YELLOW_WOOL_WALL, Blocks.YELLOW_WOOL);
        wallItemVanilla(JDWalls.LIME_WOOL_WALL, Blocks.LIME_WOOL);
        wallItemVanilla(JDWalls.PINK_WOOL_WALL, Blocks.PINK_WOOL);
        wallItemVanilla(JDWalls.GRAY_WOOL_WALL, Blocks.GRAY_WOOL);
        wallItemVanilla(JDWalls.LIGHT_GRAY_WOOL_WALL, Blocks.LIGHT_GRAY_WOOL);
        wallItemVanilla(JDWalls.CYAN_WOOL_WALL, Blocks.CYAN_WOOL);
        wallItemVanilla(JDWalls.PURPLE_WOOL_WALL, Blocks.PURPLE_WOOL);
        wallItemVanilla(JDWalls.BLUE_WOOL_WALL, Blocks.BLUE_WOOL);
        wallItemVanilla(JDWalls.BROWN_WOOL_WALL, Blocks.BROWN_WOOL);
        wallItemVanilla(JDWalls.GREEN_WOOL_WALL, Blocks.GREEN_WOOL);
        wallItemVanilla(JDWalls.RED_WOOL_WALL, Blocks.RED_WOOL);
        wallItemVanilla(JDWalls.BLACK_WOOL_WALL, Blocks.BLACK_WOOL);
        wallItemVanilla(JDWalls.CRACKED_NETHER_BRICKS_WALL, Blocks.CRACKED_NETHER_BRICKS);
        wallItemVanilla(JDWalls.CHISELED_NETHER_BRICKS_WALL, Blocks.CHISELED_NETHER_BRICKS);
        wallItemVanilla(JDWalls.CHISELED_RED_SANDSTONE_WALL, Blocks.CHISELED_RED_SANDSTONE);
        wallItemVanilla(JDWalls.CHISELED_SANDSTONE_WALL, Blocks.CHISELED_SANDSTONE);
        wallItemVanilla(JDWalls.CHISELED_STONE_BRICKS_WALL, Blocks.CHISELED_STONE_BRICKS);
        wallItemVanilla(JDWalls.CRACKED_STONE_BRICKS_WALL, Blocks.CRACKED_STONE_BRICKS);
        wallItemVanilla(JDWalls.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        wallItemVanilla(JDWalls.MOSS_BLOCK_WALL, Blocks.MOSS_BLOCK);
        wallItemVanilla(JDWalls.HONEYCOMB_BLOCK_WALL, Blocks.HONEYCOMB_BLOCK);
        wallItemVanilla(JDWalls.TERRACOTTA_WALL, Blocks.TERRACOTTA);
        wallItemVanilla(JDWalls.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);
        wallItemVanilla(JDWalls.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);
        wallItemVanilla(JDWalls.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);
        wallItemVanilla(JDWalls.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);
        wallItemVanilla(JDWalls.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);
        wallItemVanilla(JDWalls.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);
        wallItemVanilla(JDWalls.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);
        wallItemVanilla(JDWalls.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);
        wallItemVanilla(JDWalls.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);
        wallItemVanilla(JDWalls.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);
        wallItemVanilla(JDWalls.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);
        wallItemVanilla(JDWalls.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);
        wallItemVanilla(JDWalls.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);
        wallItemVanilla(JDWalls.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);
        wallItemVanilla(JDWalls.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);
        wallItemVanilla(JDWalls.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);
        wallItemVanilla(JDWalls.BLACK_CONCRETE_POWDER_WALL, Blocks.BLACK_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.BLUE_CONCRETE_POWDER_WALL, Blocks.BLUE_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.BROWN_CONCRETE_POWDER_WALL, Blocks.BROWN_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.CYAN_CONCRETE_POWDER_WALL, Blocks.CYAN_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.GRAY_CONCRETE_POWDER_WALL, Blocks.GRAY_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.GREEN_CONCRETE_POWDER_WALL, Blocks.GREEN_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.LIGHT_BLUE_CONCRETE_POWDER_WALL, Blocks.LIGHT_BLUE_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.LIGHT_GRAY_CONCRETE_POWDER_WALL, Blocks.LIGHT_GRAY_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.LIME_CONCRETE_POWDER_WALL, Blocks.LIME_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.MAGENTA_CONCRETE_POWDER_WALL, Blocks.MAGENTA_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.ORANGE_CONCRETE_POWDER_WALL, Blocks.ORANGE_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.PINK_CONCRETE_POWDER_WALL, Blocks.PINK_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.PURPLE_CONCRETE_POWDER_WALL, Blocks.PURPLE_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.RED_CONCRETE_POWDER_WALL, Blocks.RED_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.WHITE_CONCRETE_POWDER_WALL, Blocks.WHITE_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.YELLOW_CONCRETE_POWDER_WALL, Blocks.YELLOW_CONCRETE_POWDER);
        wallItemVanilla(JDWalls.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
        wallItemVanilla(JDWalls.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
        wallItemVanilla(JDWalls.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
        wallItemVanilla(JDWalls.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
        wallItemVanilla(JDWalls.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
        wallItemVanilla(JDWalls.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
        wallItemVanilla(JDWalls.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
        wallItemVanilla(JDWalls.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
        wallItemVanilla(JDWalls.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
        wallItemVanilla(JDWalls.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
        wallItemVanilla(JDWalls.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
        wallItemVanilla(JDWalls.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
        wallItemVanilla(JDWalls.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
        wallItemVanilla(JDWalls.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
        wallItemVanilla(JDWalls.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
        wallItemVanilla(JDWalls.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
        wallItemVanilla(JDWalls.MANGROVE_PLANK_WALL, Blocks.MANGROVE_PLANKS);
        wallItemVanilla(JDWalls.OAK_PLANK_WALL, Blocks.OAK_PLANKS);
        wallItemVanilla(JDWalls.DARK_OAK_PLANK_WALL, Blocks.DARK_OAK_PLANKS);
        wallItemVanilla(JDWalls.SPRUCE_PLANK_WALL, Blocks.SPRUCE_PLANKS);
        wallItemVanilla(JDWalls.JUNGLE_PLANK_WALL, Blocks.JUNGLE_PLANKS);
        wallItemVanilla(JDWalls.ACACIA_PLANK_WALL, Blocks.ACACIA_PLANKS);
        wallItemVanilla(JDWalls.BIRCH_PLANK_WALL, Blocks.BIRCH_PLANKS);
        wallItemVanilla(JDWalls.CRIMSON_PLANK_WALL, Blocks.CRIMSON_PLANKS);
        wallItemVanilla(JDWalls.WARPED_PLANK_WALL, Blocks.WARPED_PLANKS);
        wallItemVanilla(JDWalls.MANGROVE_LOG_WALL, Blocks.MANGROVE_LOG);
        wallItemVanilla(JDWalls.PACKED_MUD_WALL, Blocks.PACKED_MUD);
        wallItemVanilla(JDWalls.MUDDY_MANGROVE_ROOTS_WALL, Blocks.MUDDY_MANGROVE_ROOTS);
        wallItemVanilla(JDWalls.STRIPPED_MANGROVE_LOG_WALL, Blocks.STRIPPED_MANGROVE_LOG);
        wallItemVanilla(JDWalls.MUD_WALL, Blocks.MUD);
        wallItemVanilla(JDWalls.OCHRE_FROGLIGHT_WALL, Blocks.OCHRE_FROGLIGHT);
        wallItemVanilla(JDWalls.VERDANT_FROGLIGHT_WALL, Blocks.VERDANT_FROGLIGHT);
        wallItemVanilla(JDWalls.PEARLESCENT_FROGLIGHT_WALL, Blocks.PEARLESCENT_FROGLIGHT);

        //STAIRS
        evenSimplerBlockItem(JDStairs.SPRUCE_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.OAK_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.DARK_OAK_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.ACACIA_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.JUNGLE_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.BIRCH_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.WARPED_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.CRIMSON_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.SPRUCE_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.OAK_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.DARK_OAK_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.ACACIA_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.JUNGLE_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.BIRCH_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.WARPED_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.CRIMSON_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDStairs.CALCITE_STAIRS);
        evenSimplerBlockItem(JDStairs.CLAY_STAIRS);
        evenSimplerBlockItem(JDStairs.GRAVEL_STAIRS);
        evenSimplerBlockItem(JDStairs.TUFF_STAIRS);
        evenSimplerBlockItem(JDStairs.SAND_STAIRS);
        evenSimplerBlockItem(JDStairs.RED_SAND_STAIRS);
        evenSimplerBlockItem(JDStairs.DIRT_STAIRS);
        evenSimplerBlockItem(JDStairs.COARSE_DIRT_STAIRS);
        evenSimplerBlockItem(JDStairs.ROOTED_DIRT_STAIRS);
        evenSimplerBlockItem(JDStairs.AMETHYST_STAIRS);
        evenSimplerBlockItem(JDStairs.OBSIDIAN_STAIRS);
        evenSimplerBlockItem(JDStairs.CRYING_OBSIDIAN_STAIRS);
        evenSimplerBlockItem(JDStairs.NETHERRACK_STAIRS);
        evenSimplerBlockItem(JDStairs.END_STONE_STAIRS);
        evenSimplerBlockItem(JDStairs.CHISELED_QUARTZ_STAIRS);
        evenSimplerBlockItem(JDStairs.QUARTZ_BRICKS_STAIRS);
        evenSimplerBlockItem(JDStairs.QUARTZ_PILLAR_STAIRS);
        evenSimplerBlockItem(JDStairs.BONE_BLOCK_STAIRS);
        evenSimplerBlockItem(JDStairs.SMOOTH_BASALT_STAIRS);
        evenSimplerBlockItem(JDStairs.BASALT_STAIRS);
        evenSimplerBlockItem(JDStairs.POLISHED_BASALT_STAIRS);
        evenSimplerBlockItem(JDStairs.WHITE_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.ORANGE_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.MAGENTA_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.LIGHT_BLUE_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.YELLOW_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.LIME_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.PINK_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.GRAY_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.LIGHT_GRAY_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.CYAN_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.PURPLE_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.BLUE_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.BROWN_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.GREEN_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.RED_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.BLACK_WOOL_STAIRS);
        evenSimplerBlockItem(JDStairs.CRACKED_NETHER_BRICKS_STAIRS);
        evenSimplerBlockItem(JDStairs.CHISELED_NETHER_BRICKS_STAIRS);
        evenSimplerBlockItem(JDStairs.CHISELED_RED_SANDSTONE_STAIRS);
        evenSimplerBlockItem(JDStairs.CHISELED_SANDSTONE_STAIRS);
        evenSimplerBlockItem(JDStairs.CHISELED_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(JDStairs.CRACKED_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(JDStairs.CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS);
        evenSimplerBlockItem(JDStairs.MOSS_BLOCK_STAIRS);
        evenSimplerBlockItem(JDStairs.HONEYCOMB_BLOCK_STAIRS);
        evenSimplerBlockItem(JDStairs.TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.BLACK_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.BLUE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.BROWN_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.CYAN_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.GRAY_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.GREEN_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.LIGHT_BLUE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.LIGHT_GRAY_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.LIME_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.MAGENTA_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.ORANGE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.PINK_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.PURPLE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.RED_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.WHITE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.YELLOW_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDStairs.BLACK_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.BLUE_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.BROWN_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.CYAN_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.GRAY_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.GREEN_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.LIGHT_BLUE_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.LIGHT_GRAY_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.LIME_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.MAGENTA_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.ORANGE_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.PINK_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.PURPLE_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.RED_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.WHITE_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.YELLOW_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDStairs.BLACK_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.BLUE_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.BROWN_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.CYAN_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.GRAY_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.GREEN_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.LIGHT_BLUE_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.LIGHT_GRAY_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.LIME_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.MAGENTA_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.ORANGE_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.PINK_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.PURPLE_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.RED_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.WHITE_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDStairs.YELLOW_CONCRETE_STAIRS);

        //SLABS
        evenSimplerBlockItem(JDSlabs.SPRUCE_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.OAK_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.DARK_OAK_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.ACACIA_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.JUNGLE_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.BIRCH_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.WARPED_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.CRIMSON_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.SPRUCE_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.OAK_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.DARK_SKINNED_OAK_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.ACACIA_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.JUNGLE_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.BIRCH_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.WARPED_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.CRIMSON_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDSlabs.CALCITE_SLAB);
        evenSimplerBlockItem(JDSlabs.CLAY_SLAB);
        evenSimplerBlockItem(JDSlabs.GRAVEL_SLAB);
        evenSimplerBlockItem(JDSlabs.TUFF_SLAB);
        evenSimplerBlockItem(JDSlabs.SAND_SLAB);
        evenSimplerBlockItem(JDSlabs.RED_SAND_SLAB);
        evenSimplerBlockItem(JDSlabs.DIRT_SLAB);
        evenSimplerBlockItem(JDSlabs.COARSE_DIRT_SLAB);
        evenSimplerBlockItem(JDSlabs.ROOTED_DIRT_SLAB);
        evenSimplerBlockItem(JDSlabs.AMETHYST_SLAB);
        evenSimplerBlockItem(JDSlabs.OBSIDIAN_SLAB);
        evenSimplerBlockItem(JDSlabs.CRYING_OBSIDIAN_SLAB);
        evenSimplerBlockItem(JDSlabs.NETHERRACK_SLAB);
        evenSimplerBlockItem(JDSlabs.END_STONE_SLAB);
        evenSimplerBlockItem(JDSlabs.CHISELED_QUARTZ_SLAB);
        evenSimplerBlockItem(JDSlabs.QUARTZ_BRICKS_SLAB);
        evenSimplerBlockItem(JDSlabs.QUARTZ_PILLAR_SLAB);
        evenSimplerBlockItem(JDSlabs.BONE_BLOCK_SLAB);
        evenSimplerBlockItem(JDSlabs.SMOOTH_BASALT_SLAB);
        evenSimplerBlockItem(JDSlabs.BASALT_SLAB);
        evenSimplerBlockItem(JDSlabs.POLISHED_BASALT_SLAB);
        evenSimplerBlockItem(JDSlabs.WHITE_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.ORANGE_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.MAGENTA_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.LIGHT_BLUE_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.YELLOW_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.LIME_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.PINK_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.GRAY_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.LIGHT_GRAY_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.CYAN_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.PURPLE_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.BLUE_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.BROWN_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.GREEN_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.RED_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.BLACK_WOOL_SLAB);
        evenSimplerBlockItem(JDSlabs.CRACKED_NETHER_BRICKS_SLAB);
        evenSimplerBlockItem(JDSlabs.CHISELED_NETHER_BRICKS_SLAB);
        evenSimplerBlockItem(JDSlabs.CHISELED_RED_SANDSTONE_SLAB);
        evenSimplerBlockItem(JDSlabs.CHISELED_SANDSTONE_SLAB);
        evenSimplerBlockItem(JDSlabs.CHISELED_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(JDSlabs.CRACKED_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(JDSlabs.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB);
        evenSimplerBlockItem(JDSlabs.MOSS_BLOCK_SLAB);
        evenSimplerBlockItem(JDSlabs.HONEYCOMB_BLOCK_SLAB);
        evenSimplerBlockItem(JDSlabs.TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.BLACK_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.BLUE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.BROWN_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.CYAN_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.GRAY_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.GREEN_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.LIGHT_BLUE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.LIGHT_GRAY_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.LIME_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.MAGENTA_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.ORANGE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.PINK_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.PURPLE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.RED_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.WHITE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.YELLOW_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDSlabs.BLACK_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.BLUE_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.BROWN_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.CYAN_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.GRAY_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.GREEN_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.LIGHT_BLUE_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.LIGHT_GRAY_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.LIME_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.MAGENTA_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.ORANGE_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.PINK_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.PURPLE_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.RED_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.WHITE_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.YELLOW_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDSlabs.BLACK_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.BLUE_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.BROWN_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.CYAN_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.GRAY_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.GREEN_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.LIGHT_BLUE_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.LIGHT_GRAY_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.LIME_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.MAGENTA_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.ORANGE_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.PINK_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.PURPLE_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.RED_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.WHITE_CONCRETE_SLAB);
        evenSimplerBlockItem(JDSlabs.YELLOW_CONCRETE_SLAB);

        //FENCE GATES
        evenSimplerBlockItem(JDFenceGates.SPRUCE_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.OAK_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.DARK_OAK_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.ACACIA_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.JUNGLE_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.BIRCH_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.WARPED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.CRIMSON_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.SPRUCE_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.OAK_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.DARK_SKINNED_OAK_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.ACACIA_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.JUNGLE_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.BIRCH_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.WARPED_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDFenceGates.CRIMSON_SKINNED_LOG_FENCE_GATE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BuildingBlocks.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(BuildingBlocks.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void fenceItemVanilla(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(BuildingBlocks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(BuildingBlocks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(BuildingBlocks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItemVanilla(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(BuildingBlocks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BuildingBlocks.MOD_ID,"item/" + item.getId().getPath()));
    }
}