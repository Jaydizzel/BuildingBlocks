package com.jaydizzle.buildingblocks.datagen;

import com.jaydizzle.buildingblocks.BuildingBlocks;
import com.jaydizzle.buildingblocks.block.custom.JDBlocks;
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
        fenceItemVanilla(JDBlocks.SPRUCE_LOG_FENCE, Blocks.SPRUCE_LOG);
        fenceItemVanilla(JDBlocks.OAK_LOG_FENCE, Blocks.OAK_LOG);
        fenceItemVanilla(JDBlocks.DARK_OAK_LOG_FENCE, Blocks.DARK_OAK_LOG);
        fenceItemVanilla(JDBlocks.ACACIA_LOG_FENCE, Blocks.ACACIA_LOG);
        fenceItemVanilla(JDBlocks.JUNGLE_LOG_FENCE, Blocks.JUNGLE_LOG);
        fenceItemVanilla(JDBlocks.BIRCH_LOG_FENCE, Blocks.BIRCH_LOG);
        fenceItemVanilla(JDBlocks.WARPED_LOG_FENCE, Blocks.WARPED_STEM);
        fenceItemVanilla(JDBlocks.CRIMSON_LOG_FENCE, Blocks.CRIMSON_STEM);
        fenceItemVanilla(JDBlocks.SPRUCE_SKINNED_LOG_FENCE, Blocks.STRIPPED_SPRUCE_LOG);
        fenceItemVanilla(JDBlocks.OAK_SKINNED_LOG_FENCE, Blocks.STRIPPED_OAK_LOG);
        fenceItemVanilla(JDBlocks.DARK_SKINNED_OAK_LOG_FENCE, Blocks.STRIPPED_DARK_OAK_LOG);
        fenceItemVanilla(JDBlocks.ACACIA_SKINNED_LOG_FENCE, Blocks.STRIPPED_ACACIA_LOG);
        fenceItemVanilla(JDBlocks.JUNGLE_SKINNED_LOG_FENCE, Blocks.STRIPPED_JUNGLE_LOG);
        fenceItemVanilla(JDBlocks.BIRCH_SKINNED_LOG_FENCE, Blocks.STRIPPED_BIRCH_LOG);
        fenceItemVanilla(JDBlocks.WARPED_SKINNED_LOG_FENCE, Blocks.STRIPPED_WARPED_STEM);
        fenceItemVanilla(JDBlocks.CRIMSON_SKINNED_LOG_FENCE, Blocks.STRIPPED_CRIMSON_STEM);

        //WALLS
        wallItemVanilla(JDBlocks.SPRUCE_LOG_WALL, "block/spruce_log");
        wallItemVanilla(JDBlocks.OAK_LOG_WALL, "block/oak_log");
        wallItemVanilla(JDBlocks.DARK_OAK_LOG_WALL, "block/dark_oak_log");
        wallItemVanilla(JDBlocks.ACACIA_LOG_WALL, "block/acacia_log");
        wallItemVanilla(JDBlocks.JUNGLE_LOG_WALL, "block/jungle_log");
        wallItemVanilla(JDBlocks.BIRCH_LOG_WALL, "block/birch_log");
        wallItemVanilla(JDBlocks.WARPED_LOG_WALL, "block/warped_stem");
        wallItemVanilla(JDBlocks.CRIMSON_LOG_WALL, "block/crimson_stem");
        wallItemVanilla(JDBlocks.SPRUCE_SKINNED_LOG_WALL, "block/stripped_spruce_log");
        wallItemVanilla(JDBlocks.OAK_SKINNED_LOG_WALL, "block/stripped_oak_log");
        wallItemVanilla(JDBlocks.DARK_SKINNED_OAK_LOG_WALL, "block/stripped_dark_oak_log");
        wallItemVanilla(JDBlocks.ACACIA_SKINNED_LOG_WALL, "block/stripped_acacia_log");
        wallItemVanilla(JDBlocks.JUNGLE_SKINNED_LOG_WALL, "block/stripped_jungle_log");
        wallItemVanilla(JDBlocks.BIRCH_SKINNED_LOG_WALL, "block/stripped_birch_log");
        wallItemVanilla(JDBlocks.WARPED_SKINNED_LOG_WALL, "block/stripped_warped_stem");
        wallItemVanilla(JDBlocks.CRIMSON_SKINNED_LOG_WALL, "block/stripped_crimson_stem");
        wallItemVanilla(JDBlocks.CALCITE_WALL, "block/calcite");
        wallItemVanilla(JDBlocks.CLAY_WALL, "block/clay");
        wallItemVanilla(JDBlocks.GRAVEL_WALL, "block/gravel");
        wallItemVanilla(JDBlocks.TUFF_WALL, "block/tuff");
        wallItemVanilla(JDBlocks.SAND_WALL, "block/sand");
        wallItemVanilla(JDBlocks.RED_SAND_WALL, "block/red_sand");
        wallItemVanilla(JDBlocks.DIRT_WALL, "block/dirt");
        wallItemVanilla(JDBlocks.COARSE_DIRT_WALL, "block/coarse_dirt");
        wallItemVanilla(JDBlocks.ROOTED_DIRT_WALL, "block/rooted_dirt");
        wallItemVanilla(JDBlocks.AMETHYST_WALL, "block/amethyst_block");
        wallItemVanilla(JDBlocks.OBSIDIAN_WALL, "block/obsidian");
        wallItemVanilla(JDBlocks.CRYING_OBSIDIAN_WALL, "block/crying_obsidian");
        wallItemVanilla(JDBlocks.NETHERRACK_WALL, "block/netherrack");
        wallItemVanilla(JDBlocks.END_STONE_WALL, "block/end_stone");
        wallItemVanilla(JDBlocks.CHISELED_QUARTZ_WALL, "block/chiseled_quartz_block");
        wallItemVanilla(JDBlocks.QUARTZ_BRICKS_WALL, "block/quartz_bricks");
        wallItemVanilla(JDBlocks.QUARTZ_PILLAR_WALL, "block/quartz_pillar");
        wallItemVanilla(JDBlocks.BONE_BLOCK_WALL, "block/bone_block_side");
        wallItemVanilla(JDBlocks.SMOOTH_BASALT_WALL, "block/smooth_basalt");
        wallItemVanilla(JDBlocks.BASALT_WALL, "block/basalt_side");
        wallItemVanilla(JDBlocks.POLISHED_BASALT_WALL, "block/polished_basalt_side");
        wallItemVanilla(JDBlocks.WHITE_WOOL_WALL, "block/white_wool");
        wallItemVanilla(JDBlocks.ORANGE_WOOL_WALL, "block/orange_wool");
        wallItemVanilla(JDBlocks.MAGENTA_WOOL_WALL, "block/magenta_wool");
        wallItemVanilla(JDBlocks.LIGHT_BLUE_WOOL_WALL, "block/light_blue_wool");
        wallItemVanilla(JDBlocks.YELLOW_WOOL_WALL, "block/yellow_wool");
        wallItemVanilla(JDBlocks.LIME_WOOL_WALL, "block/lime_wool");
        wallItemVanilla(JDBlocks.PINK_WOOL_WALL, "block/pink_wool");
        wallItemVanilla(JDBlocks.GRAY_WOOL_WALL, "block/gray_wool");
        wallItemVanilla(JDBlocks.LIGHT_GRAY_WOOL_WALL, "block/light_gray_wool");
        wallItemVanilla(JDBlocks.CYAN_WOOL_WALL, "block/cyan_wool");
        wallItemVanilla(JDBlocks.PURPLE_WOOL_WALL, "block/purple_wool");
        wallItemVanilla(JDBlocks.BLUE_WOOL_WALL, "block/blue_wool");
        wallItemVanilla(JDBlocks.BROWN_WOOL_WALL, "block/brown_wool");
        wallItemVanilla(JDBlocks.GREEN_WOOL_WALL, "block/green_wool");
        wallItemVanilla(JDBlocks.RED_WOOL_WALL, "block/red_wool");
        wallItemVanilla(JDBlocks.BLACK_WOOL_WALL, "block/black_wool");
        wallItemVanilla(JDBlocks.CRACKED_NETHER_BRICKS_WALL, "block/cracked_nether_bricks");
        wallItemVanilla(JDBlocks.CHISELED_NETHER_BRICKS_WALL, "block/chiseled_nether_bricks");
        wallItemVanilla(JDBlocks.CHISELED_RED_SANDSTONE_WALL, "block/chiseled_red_sandstone");
        wallItemVanilla(JDBlocks.CHISELED_SANDSTONE_WALL, "block/chiseled_sandstone");
        wallItemVanilla(JDBlocks.CHISELED_STONE_BRICKS_WALL, "block/chiseled_stone_bricks");
        wallItemVanilla(JDBlocks.CRACKED_STONE_BRICKS_WALL, "block/cracked_stone_bricks");
        wallItemVanilla(JDBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL, "block/cracked_polished_blackstone_bricks");
        wallItemVanilla(JDBlocks.MOSS_BLOCK_WALL, "block/moss_block");
        wallItemVanilla(JDBlocks.HONEYCOMB_BLOCK_WALL, "block/honeycomb_block");
        wallItemVanilla(JDBlocks.TERRACOTTA_WALL, "block/terracotta");
        wallItemVanilla(JDBlocks.BLACK_TERRACOTTA_WALL, "block/black_terracotta");
        wallItemVanilla(JDBlocks.BLUE_TERRACOTTA_WALL, "block/blue_terracotta");
        wallItemVanilla(JDBlocks.BROWN_TERRACOTTA_WALL, "block/brown_terracotta");
        wallItemVanilla(JDBlocks.CYAN_TERRACOTTA_WALL, "block/cyan_terracotta");
        wallItemVanilla(JDBlocks.GRAY_TERRACOTTA_WALL, "block/gray_terracotta");
        wallItemVanilla(JDBlocks.GREEN_TERRACOTTA_WALL, "block/green_terracotta");
        wallItemVanilla(JDBlocks.LIGHT_BLUE_TERRACOTTA_WALL, "block/light_blue_terracotta");
        wallItemVanilla(JDBlocks.LIGHT_GRAY_TERRACOTTA_WALL, "block/light_gray_terracotta");
        wallItemVanilla(JDBlocks.LIME_TERRACOTTA_WALL, "block/lime_terracotta");
        wallItemVanilla(JDBlocks.MAGENTA_TERRACOTTA_WALL, "block/magenta_terracotta");
        wallItemVanilla(JDBlocks.ORANGE_TERRACOTTA_WALL, "block/orange_terracotta");
        wallItemVanilla(JDBlocks.PINK_TERRACOTTA_WALL, "block/pink_terracotta");
        wallItemVanilla(JDBlocks.PURPLE_TERRACOTTA_WALL, "block/purple_terracotta");
        wallItemVanilla(JDBlocks.RED_TERRACOTTA_WALL, "block/red_terracotta");
        wallItemVanilla(JDBlocks.WHITE_TERRACOTTA_WALL, "block/white_terracotta");
        wallItemVanilla(JDBlocks.YELLOW_TERRACOTTA_WALL, "block/yellow_terracotta");
        wallItemVanilla(JDBlocks.BLACK_CONCRETE_POWDER_WALL, "block/black_concrete_powder");
        wallItemVanilla(JDBlocks.BLUE_CONCRETE_POWDER_WALL, "block/blue_concrete_powder");
        wallItemVanilla(JDBlocks.BROWN_CONCRETE_POWDER_WALL, "block/brown_concrete_powder");
        wallItemVanilla(JDBlocks.CYAN_CONCRETE_POWDER_WALL, "block/cyan_concrete_powder");
        wallItemVanilla(JDBlocks.GRAY_CONCRETE_POWDER_WALL, "block/gray_concrete_powder");
        wallItemVanilla(JDBlocks.GREEN_CONCRETE_POWDER_WALL, "block/green_concrete_powder");
        wallItemVanilla(JDBlocks.LIGHT_BLUE_CONCRETE_POWDER_WALL, "block/light_blue_concrete_powder");
        wallItemVanilla(JDBlocks.LIGHT_GRAY_CONCRETE_POWDER_WALL, "block/light_gray_concrete_powder");
        wallItemVanilla(JDBlocks.LIME_CONCRETE_POWDER_WALL, "block/lime_concrete_powder");
        wallItemVanilla(JDBlocks.MAGENTA_CONCRETE_POWDER_WALL, "block/magenta_concrete_powder");
        wallItemVanilla(JDBlocks.ORANGE_CONCRETE_POWDER_WALL, "block/orange_concrete_powder");
        wallItemVanilla(JDBlocks.PINK_CONCRETE_POWDER_WALL, "block/pink_concrete_powder");
        wallItemVanilla(JDBlocks.PURPLE_CONCRETE_POWDER_WALL, "block/purple_concrete_powder");
        wallItemVanilla(JDBlocks.RED_CONCRETE_POWDER_WALL, "block/red_concrete_powder");
        wallItemVanilla(JDBlocks.WHITE_CONCRETE_POWDER_WALL, "block/white_concrete_powder");
        wallItemVanilla(JDBlocks.YELLOW_CONCRETE_POWDER_WALL, "block/yellow_concrete_powder");
        wallItemVanilla(JDBlocks.BLACK_CONCRETE_WALL, "block/black_concrete");
        wallItemVanilla(JDBlocks.BLUE_CONCRETE_WALL, "block/blue_concrete");
        wallItemVanilla(JDBlocks.BROWN_CONCRETE_WALL, "block/brown_concrete");
        wallItemVanilla(JDBlocks.CYAN_CONCRETE_WALL, "block/cyan_concrete");
        wallItemVanilla(JDBlocks.GRAY_CONCRETE_WALL, "block/gray_concrete");
        wallItemVanilla(JDBlocks.GREEN_CONCRETE_WALL, "block/green_concrete");
        wallItemVanilla(JDBlocks.LIGHT_BLUE_CONCRETE_WALL, "block/light_blue_concrete");
        wallItemVanilla(JDBlocks.LIGHT_GRAY_CONCRETE_WALL, "block/light_gray_concrete");
        wallItemVanilla(JDBlocks.LIME_CONCRETE_WALL, "block/lime_concrete");
        wallItemVanilla(JDBlocks.MAGENTA_CONCRETE_WALL, "block/magenta_concrete");
        wallItemVanilla(JDBlocks.ORANGE_CONCRETE_WALL, "block/orange_concrete");
        wallItemVanilla(JDBlocks.PINK_CONCRETE_WALL, "block/pink_concrete");
        wallItemVanilla(JDBlocks.PURPLE_CONCRETE_WALL, "block/purple_concrete");
        wallItemVanilla(JDBlocks.RED_CONCRETE_WALL, "block/red_concrete");
        wallItemVanilla(JDBlocks.WHITE_CONCRETE_WALL, "block/white_concrete");
        wallItemVanilla(JDBlocks.YELLOW_CONCRETE_WALL, "block/yellow_concrete");
        wallItemVanilla(JDBlocks.MANGROVE_PLANK_WALL, "block/mangrove_planks");
        wallItemVanilla(JDBlocks.OAK_PLANK_WALL, "block/oak_planks");
        wallItemVanilla(JDBlocks.DARK_OAK_PLANK_WALL, "block/dark_oak_planks");
        wallItemVanilla(JDBlocks.SPRUCE_PLANK_WALL, "block/spruce_planks");
        wallItemVanilla(JDBlocks.JUNGLE_PLANK_WALL, "block/jungle_planks");
        wallItemVanilla(JDBlocks.ACACIA_PLANK_WALL, "block/acacia_planks");
        wallItemVanilla(JDBlocks.BIRCH_PLANK_WALL, "block/birch_planks");
        wallItemVanilla(JDBlocks.CRIMSON_PLANK_WALL, "block/crimson_planks");
        wallItemVanilla(JDBlocks.WARPED_PLANK_WALL, "block/warped_planks");
        wallItemVanilla(JDBlocks.MANGROVE_LOG_WALL, "block/mangrove_log");
        wallItemVanilla(JDBlocks.PACKED_MUD_WALL, "block/packed_mud");
        wallItemVanilla(JDBlocks.MUDDY_MANGROVE_ROOTS_WALL, "block/muddy_mangrove_roots_side");
        wallItemVanilla(JDBlocks.STRIPPED_MANGROVE_LOG_WALL, "block/stripped_mangrove_log");
        wallItemVanilla(JDBlocks.MUD_WALL, "block/mud");
        wallItemVanilla(JDBlocks.OCHRE_FROGLIGHT_WALL, "block/ochre_froglight_side");
        wallItemVanilla(JDBlocks.VERDANT_FROGLIGHT_WALL, "block/verdant_froglight_side");
        wallItemVanilla(JDBlocks.PEARLESCENT_FROGLIGHT_WALL, "block/pearlescent_froglight_side");
        wallItemVanilla(JDBlocks.SMOOTH_STONE_WALL, "block/smooth_stone");
        wallItemVanilla(JDBlocks.GLOWSTONE_WALL, "block/glowstone");

        //STAIRS
        evenSimplerBlockItem(JDBlocks.SPRUCE_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.OAK_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.DARK_OAK_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.ACACIA_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.JUNGLE_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.BIRCH_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.WARPED_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.CRIMSON_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.SPRUCE_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.OAK_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.DARK_OAK_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.ACACIA_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.JUNGLE_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.BIRCH_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.WARPED_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.CRIMSON_SKINNED_LOG_STAIRS);
        evenSimplerBlockItem(JDBlocks.CALCITE_STAIRS);
        evenSimplerBlockItem(JDBlocks.CLAY_STAIRS);
        evenSimplerBlockItem(JDBlocks.GRAVEL_STAIRS);
        evenSimplerBlockItem(JDBlocks.TUFF_STAIRS);
        evenSimplerBlockItem(JDBlocks.SAND_STAIRS);
        evenSimplerBlockItem(JDBlocks.RED_SAND_STAIRS);
        evenSimplerBlockItem(JDBlocks.DIRT_STAIRS);
        evenSimplerBlockItem(JDBlocks.COARSE_DIRT_STAIRS);
        evenSimplerBlockItem(JDBlocks.ROOTED_DIRT_STAIRS);
        evenSimplerBlockItem(JDBlocks.AMETHYST_STAIRS);
        evenSimplerBlockItem(JDBlocks.OBSIDIAN_STAIRS);
        evenSimplerBlockItem(JDBlocks.CRYING_OBSIDIAN_STAIRS);
        evenSimplerBlockItem(JDBlocks.NETHERRACK_STAIRS);
        evenSimplerBlockItem(JDBlocks.END_STONE_STAIRS);
        evenSimplerBlockItem(JDBlocks.CHISELED_QUARTZ_STAIRS);
        evenSimplerBlockItem(JDBlocks.QUARTZ_BRICKS_STAIRS);
        evenSimplerBlockItem(JDBlocks.QUARTZ_PILLAR_STAIRS);
        evenSimplerBlockItem(JDBlocks.BONE_BLOCK_STAIRS);
        evenSimplerBlockItem(JDBlocks.SMOOTH_BASALT_STAIRS);
        evenSimplerBlockItem(JDBlocks.BASALT_STAIRS);
        evenSimplerBlockItem(JDBlocks.POLISHED_BASALT_STAIRS);
        evenSimplerBlockItem(JDBlocks.WHITE_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.ORANGE_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.MAGENTA_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIGHT_BLUE_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.YELLOW_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIME_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.PINK_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.GRAY_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIGHT_GRAY_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.CYAN_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.PURPLE_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.BLUE_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.BROWN_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.GREEN_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.RED_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.BLACK_WOOL_STAIRS);
        evenSimplerBlockItem(JDBlocks.CRACKED_NETHER_BRICKS_STAIRS);
        evenSimplerBlockItem(JDBlocks.CHISELED_NETHER_BRICKS_STAIRS);
        evenSimplerBlockItem(JDBlocks.CHISELED_RED_SANDSTONE_STAIRS);
        evenSimplerBlockItem(JDBlocks.CHISELED_SANDSTONE_STAIRS);
        evenSimplerBlockItem(JDBlocks.CHISELED_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(JDBlocks.CRACKED_STONE_BRICKS_STAIRS);
        evenSimplerBlockItem(JDBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_STAIRS);
        evenSimplerBlockItem(JDBlocks.MOSS_BLOCK_STAIRS);
        evenSimplerBlockItem(JDBlocks.HONEYCOMB_BLOCK_STAIRS);
        evenSimplerBlockItem(JDBlocks.TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.BLACK_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.BLUE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.BROWN_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.CYAN_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.GRAY_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.GREEN_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIME_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.MAGENTA_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.ORANGE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.PINK_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.PURPLE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.RED_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.WHITE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.YELLOW_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(JDBlocks.BLACK_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.BLUE_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.BROWN_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.CYAN_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.GRAY_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.GREEN_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIGHT_BLUE_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIGHT_GRAY_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIME_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.MAGENTA_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.ORANGE_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.PINK_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.PURPLE_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.RED_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.WHITE_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.YELLOW_CONCRETE_POWDER_STAIRS);
        evenSimplerBlockItem(JDBlocks.BLACK_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.BLUE_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.BROWN_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.CYAN_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.GRAY_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.GREEN_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.LIME_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.MAGENTA_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.ORANGE_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.PINK_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.PURPLE_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.RED_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.WHITE_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.YELLOW_CONCRETE_STAIRS);
        evenSimplerBlockItem(JDBlocks.SMOOTH_STONE_STAIRS);
        evenSimplerBlockItem(JDBlocks.GLOWSTONE_STAIRS);

        //SLABS
        evenSimplerBlockItem(JDBlocks.SPRUCE_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.OAK_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.DARK_OAK_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.ACACIA_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.JUNGLE_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.BIRCH_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.WARPED_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.CRIMSON_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.SPRUCE_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.OAK_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.DARK_SKINNED_OAK_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.ACACIA_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.JUNGLE_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.BIRCH_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.WARPED_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.CRIMSON_SKINNED_LOG_SLAB);
        evenSimplerBlockItem(JDBlocks.CALCITE_SLAB);
        evenSimplerBlockItem(JDBlocks.CLAY_SLAB);
        evenSimplerBlockItem(JDBlocks.GRAVEL_SLAB);
        evenSimplerBlockItem(JDBlocks.TUFF_SLAB);
        evenSimplerBlockItem(JDBlocks.SAND_SLAB);
        evenSimplerBlockItem(JDBlocks.RED_SAND_SLAB);
        evenSimplerBlockItem(JDBlocks.DIRT_SLAB);
        evenSimplerBlockItem(JDBlocks.COARSE_DIRT_SLAB);
        evenSimplerBlockItem(JDBlocks.ROOTED_DIRT_SLAB);
        evenSimplerBlockItem(JDBlocks.AMETHYST_SLAB);
        evenSimplerBlockItem(JDBlocks.OBSIDIAN_SLAB);
        evenSimplerBlockItem(JDBlocks.CRYING_OBSIDIAN_SLAB);
        evenSimplerBlockItem(JDBlocks.NETHERRACK_SLAB);
        evenSimplerBlockItem(JDBlocks.END_STONE_SLAB);
        evenSimplerBlockItem(JDBlocks.CHISELED_QUARTZ_SLAB);
        evenSimplerBlockItem(JDBlocks.QUARTZ_BRICKS_SLAB);
        evenSimplerBlockItem(JDBlocks.QUARTZ_PILLAR_SLAB);
        evenSimplerBlockItem(JDBlocks.BONE_BLOCK_SLAB);
        evenSimplerBlockItem(JDBlocks.SMOOTH_BASALT_SLAB);
        evenSimplerBlockItem(JDBlocks.BASALT_SLAB);
        evenSimplerBlockItem(JDBlocks.POLISHED_BASALT_SLAB);
        evenSimplerBlockItem(JDBlocks.WHITE_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.ORANGE_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.MAGENTA_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.LIGHT_BLUE_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.YELLOW_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.LIME_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.PINK_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.GRAY_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.LIGHT_GRAY_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.CYAN_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.PURPLE_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.BLUE_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.BROWN_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.GREEN_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.RED_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.BLACK_WOOL_SLAB);
        evenSimplerBlockItem(JDBlocks.CRACKED_NETHER_BRICKS_SLAB);
        evenSimplerBlockItem(JDBlocks.CHISELED_NETHER_BRICKS_SLAB);
        evenSimplerBlockItem(JDBlocks.CHISELED_RED_SANDSTONE_SLAB);
        evenSimplerBlockItem(JDBlocks.CHISELED_SANDSTONE_SLAB);
        evenSimplerBlockItem(JDBlocks.CHISELED_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(JDBlocks.CRACKED_STONE_BRICKS_SLAB);
        evenSimplerBlockItem(JDBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_SLAB);
        evenSimplerBlockItem(JDBlocks.MOSS_BLOCK_SLAB);
        evenSimplerBlockItem(JDBlocks.HONEYCOMB_BLOCK_SLAB);
        evenSimplerBlockItem(JDBlocks.TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.BLACK_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.BLUE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.BROWN_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.CYAN_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.GRAY_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.GREEN_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.LIME_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.MAGENTA_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.ORANGE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.PINK_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.PURPLE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.RED_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.WHITE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.YELLOW_TERRACOTTA_SLAB);
        evenSimplerBlockItem(JDBlocks.BLACK_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.BLUE_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.BROWN_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.CYAN_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.GRAY_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.GREEN_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.LIGHT_BLUE_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.LIGHT_GRAY_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.LIME_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.MAGENTA_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.ORANGE_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.PINK_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.PURPLE_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.RED_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.WHITE_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.YELLOW_CONCRETE_POWDER_SLAB);
        evenSimplerBlockItem(JDBlocks.BLACK_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.BLUE_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.BROWN_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.CYAN_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.GRAY_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.GREEN_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.LIME_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.MAGENTA_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.ORANGE_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.PINK_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.PURPLE_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.RED_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.WHITE_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.YELLOW_CONCRETE_SLAB);
        evenSimplerBlockItem(JDBlocks.GLOWSTONE_SLAB);

        //FENCE GATES
        evenSimplerBlockItem(JDBlocks.SPRUCE_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.OAK_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.DARK_OAK_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.ACACIA_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.JUNGLE_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.BIRCH_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.WARPED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.CRIMSON_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.SPRUCE_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.OAK_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.DARK_SKINNED_OAK_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.ACACIA_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.JUNGLE_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.BIRCH_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.WARPED_SKINNED_LOG_FENCE_GATE);
        evenSimplerBlockItem(JDBlocks.CRIMSON_SKINNED_LOG_FENCE_GATE);

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
                .texture("texture",  new ResourceLocation("block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(BuildingBlocks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(BuildingBlocks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItemVanilla(RegistryObject<Block> block, String baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", mcLoc(baseBlock));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BuildingBlocks.MOD_ID,"item/" + item.getId().getPath()));
    }
}