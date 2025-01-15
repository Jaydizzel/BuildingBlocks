package net.jaydizzle.buildingblocks.datagen;

import net.jaydizzle.buildingblocks.BuildingBlocks;
import net.jaydizzle.buildingblocks.block.JDBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class JDItemModelProvider extends ItemModelProvider {
    public JDItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BuildingBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //FENCES
        fenceItemVanilla(JDBlocks.SPRUCE_LOG_FENCE, "spruce_log");
        fenceItemVanilla(JDBlocks.OAK_LOG_FENCE, "oak_log");
        fenceItemVanilla(JDBlocks.DARK_OAK_LOG_FENCE, "dark_oak_log");
        fenceItemVanilla(JDBlocks.ACACIA_LOG_FENCE, "acacia_log");
        fenceItemVanilla(JDBlocks.JUNGLE_LOG_FENCE, "jungle_log");
        fenceItemVanilla(JDBlocks.BIRCH_LOG_FENCE, "birch_log");
        fenceItemVanilla(JDBlocks.WARPED_LOG_FENCE, "warped_stem");
        fenceItemVanilla(JDBlocks.CRIMSON_LOG_FENCE, "crimson_stem");
        fenceItemVanilla(JDBlocks.SPRUCE_SKINNED_LOG_FENCE, "stripped_spruce_log");
        fenceItemVanilla(JDBlocks.OAK_SKINNED_LOG_FENCE, "stripped_oak_log");
        fenceItemVanilla(JDBlocks.DARK_SKINNED_OAK_LOG_FENCE, "stripped_dark_oak_log");
        fenceItemVanilla(JDBlocks.ACACIA_SKINNED_LOG_FENCE, "stripped_acacia_log");
        fenceItemVanilla(JDBlocks.JUNGLE_SKINNED_LOG_FENCE, "stripped_jungle_log");
        fenceItemVanilla(JDBlocks.BIRCH_SKINNED_LOG_FENCE, "stripped_birch_log");
        fenceItemVanilla(JDBlocks.WARPED_SKINNED_LOG_FENCE, "stripped_warped_stem");
        fenceItemVanilla(JDBlocks.CRIMSON_SKINNED_LOG_FENCE, "stripped_crimson_stem");

        //WALLS
        wallItemVanilla(JDBlocks.SPRUCE_LOG_WALL, "spruce_log");
        wallItemVanilla(JDBlocks.OAK_LOG_WALL, "oak_log");
        wallItemVanilla(JDBlocks.DARK_OAK_LOG_WALL, "dark_oak_log");
        wallItemVanilla(JDBlocks.ACACIA_LOG_WALL, "acacia_log");
        wallItemVanilla(JDBlocks.JUNGLE_LOG_WALL, "jungle_log");
        wallItemVanilla(JDBlocks.BIRCH_LOG_WALL, "birch_log");
        wallItemVanilla(JDBlocks.WARPED_LOG_WALL, "warped_stem");
        wallItemVanilla(JDBlocks.CRIMSON_LOG_WALL, "crimson_stem");
        wallItemVanilla(JDBlocks.SPRUCE_SKINNED_LOG_WALL, "stripped_spruce_log");
        wallItemVanilla(JDBlocks.OAK_SKINNED_LOG_WALL, "stripped_oak_log");
        wallItemVanilla(JDBlocks.DARK_SKINNED_OAK_LOG_WALL, "stripped_dark_oak_log");
        wallItemVanilla(JDBlocks.ACACIA_SKINNED_LOG_WALL, "stripped_acacia_log");
        wallItemVanilla(JDBlocks.JUNGLE_SKINNED_LOG_WALL, "stripped_jungle_log");
        wallItemVanilla(JDBlocks.BIRCH_SKINNED_LOG_WALL, "stripped_birch_log");
        wallItemVanilla(JDBlocks.WARPED_SKINNED_LOG_WALL, "stripped_warped_stem");
        wallItemVanilla(JDBlocks.CRIMSON_SKINNED_LOG_WALL, "stripped_crimson_stem");
        wallItemVanilla(JDBlocks.CALCITE_WALL, "calcite");
        wallItemVanilla(JDBlocks.CLAY_WALL, "clay");
        wallItemVanilla(JDBlocks.GRAVEL_WALL, "gravel");
        wallItemVanilla(JDBlocks.TUFF_WALL, "tuff");
        wallItemVanilla(JDBlocks.SAND_WALL, "sand");
        wallItemVanilla(JDBlocks.RED_SAND_WALL, "red_sand");
        wallItemVanilla(JDBlocks.DIRT_WALL, "dirt");
        wallItemVanilla(JDBlocks.COARSE_DIRT_WALL, "coarse_dirt");
        wallItemVanilla(JDBlocks.ROOTED_DIRT_WALL, "rooted_dirt");
        wallItemVanilla(JDBlocks.AMETHYST_WALL, "amethyst_block");
        wallItemVanilla(JDBlocks.OBSIDIAN_WALL, "obsidian");
        wallItemVanilla(JDBlocks.CRYING_OBSIDIAN_WALL, "crying_obsidian");
        wallItemVanilla(JDBlocks.NETHERRACK_WALL, "netherrack");
        wallItemVanilla(JDBlocks.END_STONE_WALL, "end_stone");
        wallItemVanilla(JDBlocks.CHISELED_QUARTZ_WALL, "chiseled_quartz_block");
        wallItemVanilla(JDBlocks.QUARTZ_BRICKS_WALL, "quartz_bricks");
        wallItemVanilla(JDBlocks.QUARTZ_PILLAR_WALL, "quartz_pillar");
        wallItemVanilla(JDBlocks.BONE_BLOCK_WALL, "bone_block_side");
        wallItemVanilla(JDBlocks.SMOOTH_BASALT_WALL, "smooth_basalt");
        wallItemVanilla(JDBlocks.BASALT_WALL, "basalt_side");
        wallItemVanilla(JDBlocks.POLISHED_BASALT_WALL, "polished_basalt_side");
        wallItemVanilla(JDBlocks.WHITE_WOOL_WALL, "white_wool");
        wallItemVanilla(JDBlocks.ORANGE_WOOL_WALL, "orange_wool");
        wallItemVanilla(JDBlocks.MAGENTA_WOOL_WALL, "magenta_wool");
        wallItemVanilla(JDBlocks.LIGHT_BLUE_WOOL_WALL, "light_blue_wool");
        wallItemVanilla(JDBlocks.YELLOW_WOOL_WALL, "yellow_wool");
        wallItemVanilla(JDBlocks.LIME_WOOL_WALL, "lime_wool");
        wallItemVanilla(JDBlocks.PINK_WOOL_WALL, "pink_wool");
        wallItemVanilla(JDBlocks.GRAY_WOOL_WALL, "gray_wool");
        wallItemVanilla(JDBlocks.LIGHT_GRAY_WOOL_WALL, "light_gray_wool");
        wallItemVanilla(JDBlocks.CYAN_WOOL_WALL, "cyan_wool");
        wallItemVanilla(JDBlocks.PURPLE_WOOL_WALL, "purple_wool");
        wallItemVanilla(JDBlocks.BLUE_WOOL_WALL, "blue_wool");
        wallItemVanilla(JDBlocks.BROWN_WOOL_WALL, "brown_wool");
        wallItemVanilla(JDBlocks.GREEN_WOOL_WALL, "green_wool");
        wallItemVanilla(JDBlocks.RED_WOOL_WALL, "red_wool");
        wallItemVanilla(JDBlocks.BLACK_WOOL_WALL, "black_wool");
        wallItemVanilla(JDBlocks.CRACKED_NETHER_BRICKS_WALL, "cracked_nether_bricks");
        wallItemVanilla(JDBlocks.CHISELED_NETHER_BRICKS_WALL, "chiseled_nether_bricks");
        wallItemVanilla(JDBlocks.CHISELED_RED_SANDSTONE_WALL, "chiseled_red_sandstone");
        wallItemVanilla(JDBlocks.CHISELED_SANDSTONE_WALL, "chiseled_sandstone");
        wallItemVanilla(JDBlocks.CHISELED_STONE_BRICKS_WALL, "chiseled_stone_bricks");
        wallItemVanilla(JDBlocks.CRACKED_STONE_BRICKS_WALL, "cracked_stone_bricks");
        wallItemVanilla(JDBlocks.CRACKED_POLISHED_BLACKSTONE_BRICKS_WALL, "cracked_polished_blackstone_bricks");
        wallItemVanilla(JDBlocks.MOSS_BLOCK_WALL, "moss_block");
        wallItemVanilla(JDBlocks.HONEYCOMB_BLOCK_WALL, "honeycomb_block");
        wallItemVanilla(JDBlocks.TERRACOTTA_WALL, "terracotta");
        wallItemVanilla(JDBlocks.BLACK_TERRACOTTA_WALL, "black_terracotta");
        wallItemVanilla(JDBlocks.BLUE_TERRACOTTA_WALL, "blue_terracotta");
        wallItemVanilla(JDBlocks.BROWN_TERRACOTTA_WALL, "brown_terracotta");
        wallItemVanilla(JDBlocks.CYAN_TERRACOTTA_WALL, "cyan_terracotta");
        wallItemVanilla(JDBlocks.GRAY_TERRACOTTA_WALL, "gray_terracotta");
        wallItemVanilla(JDBlocks.GREEN_TERRACOTTA_WALL, "green_terracotta");
        wallItemVanilla(JDBlocks.LIGHT_BLUE_TERRACOTTA_WALL, "light_blue_terracotta");
        wallItemVanilla(JDBlocks.LIGHT_GRAY_TERRACOTTA_WALL, "light_gray_terracotta");
        wallItemVanilla(JDBlocks.LIME_TERRACOTTA_WALL, "lime_terracotta");
        wallItemVanilla(JDBlocks.MAGENTA_TERRACOTTA_WALL, "magenta_terracotta");
        wallItemVanilla(JDBlocks.ORANGE_TERRACOTTA_WALL, "orange_terracotta");
        wallItemVanilla(JDBlocks.PINK_TERRACOTTA_WALL, "pink_terracotta");
        wallItemVanilla(JDBlocks.PURPLE_TERRACOTTA_WALL, "purple_terracotta");
        wallItemVanilla(JDBlocks.RED_TERRACOTTA_WALL, "red_terracotta");
        wallItemVanilla(JDBlocks.WHITE_TERRACOTTA_WALL, "white_terracotta");
        wallItemVanilla(JDBlocks.YELLOW_TERRACOTTA_WALL, "yellow_terracotta");
        wallItemVanilla(JDBlocks.BLACK_CONCRETE_POWDER_WALL, "black_concrete_powder");
        wallItemVanilla(JDBlocks.BLUE_CONCRETE_POWDER_WALL, "blue_concrete_powder");
        wallItemVanilla(JDBlocks.BROWN_CONCRETE_POWDER_WALL, "brown_concrete_powder");
        wallItemVanilla(JDBlocks.CYAN_CONCRETE_POWDER_WALL, "cyan_concrete_powder");
        wallItemVanilla(JDBlocks.GRAY_CONCRETE_POWDER_WALL, "gray_concrete_powder");
        wallItemVanilla(JDBlocks.GREEN_CONCRETE_POWDER_WALL, "green_concrete_powder");
        wallItemVanilla(JDBlocks.LIGHT_BLUE_CONCRETE_POWDER_WALL, "light_blue_concrete_powder");
        wallItemVanilla(JDBlocks.LIGHT_GRAY_CONCRETE_POWDER_WALL, "light_gray_concrete_powder");
        wallItemVanilla(JDBlocks.LIME_CONCRETE_POWDER_WALL, "lime_concrete_powder");
        wallItemVanilla(JDBlocks.MAGENTA_CONCRETE_POWDER_WALL, "magenta_concrete_powder");
        wallItemVanilla(JDBlocks.ORANGE_CONCRETE_POWDER_WALL, "orange_concrete_powder");
        wallItemVanilla(JDBlocks.PINK_CONCRETE_POWDER_WALL, "pink_concrete_powder");
        wallItemVanilla(JDBlocks.PURPLE_CONCRETE_POWDER_WALL, "purple_concrete_powder");
        wallItemVanilla(JDBlocks.RED_CONCRETE_POWDER_WALL, "red_concrete_powder");
        wallItemVanilla(JDBlocks.WHITE_CONCRETE_POWDER_WALL, "white_concrete_powder");
        wallItemVanilla(JDBlocks.YELLOW_CONCRETE_POWDER_WALL, "yellow_concrete_powder");
        wallItemVanilla(JDBlocks.BLACK_CONCRETE_WALL, "black_concrete");
        wallItemVanilla(JDBlocks.BLUE_CONCRETE_WALL, "blue_concrete");
        wallItemVanilla(JDBlocks.BROWN_CONCRETE_WALL, "brown_concrete");
        wallItemVanilla(JDBlocks.CYAN_CONCRETE_WALL, "cyan_concrete");
        wallItemVanilla(JDBlocks.GRAY_CONCRETE_WALL, "gray_concrete");
        wallItemVanilla(JDBlocks.GREEN_CONCRETE_WALL, "green_concrete");
        wallItemVanilla(JDBlocks.LIGHT_BLUE_CONCRETE_WALL, "light_blue_concrete");
        wallItemVanilla(JDBlocks.LIGHT_GRAY_CONCRETE_WALL, "light_gray_concrete");
        wallItemVanilla(JDBlocks.LIME_CONCRETE_WALL, "lime_concrete");
        wallItemVanilla(JDBlocks.MAGENTA_CONCRETE_WALL, "magenta_concrete");
        wallItemVanilla(JDBlocks.ORANGE_CONCRETE_WALL, "orange_concrete");
        wallItemVanilla(JDBlocks.PINK_CONCRETE_WALL, "pink_concrete");
        wallItemVanilla(JDBlocks.PURPLE_CONCRETE_WALL, "purple_concrete");
        wallItemVanilla(JDBlocks.RED_CONCRETE_WALL, "red_concrete");
        wallItemVanilla(JDBlocks.WHITE_CONCRETE_WALL, "white_concrete");
        wallItemVanilla(JDBlocks.YELLOW_CONCRETE_WALL, "yellow_concrete");
        wallItemVanilla(JDBlocks.MANGROVE_PLANK_WALL, "mangrove_planks");
        wallItemVanilla(JDBlocks.OAK_PLANK_WALL, "oak_planks");
        wallItemVanilla(JDBlocks.DARK_OAK_PLANK_WALL, "dark_oak_planks");
        wallItemVanilla(JDBlocks.SPRUCE_PLANK_WALL, "spruce_planks");
        wallItemVanilla(JDBlocks.JUNGLE_PLANK_WALL, "jungle_planks");
        wallItemVanilla(JDBlocks.ACACIA_PLANK_WALL, "acacia_planks");
        wallItemVanilla(JDBlocks.BIRCH_PLANK_WALL, "birch_planks");
        wallItemVanilla(JDBlocks.CRIMSON_PLANK_WALL, "crimson_planks");
        wallItemVanilla(JDBlocks.WARPED_PLANK_WALL, "warped_planks");
        wallItemVanilla(JDBlocks.MANGROVE_LOG_WALL, "mangrove_log");
        wallItemVanilla(JDBlocks.PACKED_MUD_WALL, "packed_mud");
        wallItemVanilla(JDBlocks.MUDDY_MANGROVE_ROOTS_WALL, "muddy_mangrove_roots_side");
        wallItemVanilla(JDBlocks.STRIPPED_MANGROVE_LOG_WALL, "stripped_mangrove_log");
        wallItemVanilla(JDBlocks.MUD_WALL, "mud");
        wallItemVanilla(JDBlocks.OCHRE_FROGLIGHT_WALL, "ochre_froglight_side");
        wallItemVanilla(JDBlocks.VERDANT_FROGLIGHT_WALL, "verdant_froglight_side");
        wallItemVanilla(JDBlocks.PEARLESCENT_FROGLIGHT_WALL, "pearlescent_froglight_side");
        wallItemVanilla(JDBlocks.SMOOTH_STONE_WALL, "smooth_stone");
        wallItemVanilla(JDBlocks.GLOWSTONE_WALL, "glowstone");
        wallItemVanilla(JDBlocks.SHROOMLIGHT_WALL, "shroomlight");
        wallItemVanilla(JDBlocks.SEA_LANTERN_WALL, "sea_lantern");
        wallItemVanilla(JDBlocks.KELP_WALL, "dried_kelp_top");
        wallItemVanilla(JDBlocks.WARPED_WART_WALL, "warped_wart_block");
        wallItemVanilla(JDBlocks.CRIMSON_WART_WALL, "nether_wart_block");

    }
    
    public void buttonItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(BuildingBlocks.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(BuildingBlocks.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItemVanilla(DeferredBlock<Block> block, String baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", "minecraft:block/" + baseBlock);
    }

    public void wallItem(DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(BuildingBlocks.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItemVanilla(DeferredBlock<Block> block, String baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", "minecraft:block/" + baseBlock);
    }

}