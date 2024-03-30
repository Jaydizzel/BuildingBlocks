package com.jaydizzle.buildingblocks.worldgen;

import com.jaydizzle.buildingblocks.BuildingBlocks;
import com.jaydizzle.buildingblocks.block.custom.JDBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class JDConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_STONES_KEY = registerKey("overworld_stones");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_STONES_KEY1 = registerKey("overworld_stones1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_STONES_KEY2 = registerKey("overworld_stones2");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WARPED_STONES_KEY = registerKey("warped_stones");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SOUL_STONES_KEY = registerKey("soul_stones");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_STONES_KEY = registerKey("nether_stones");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONES_KEY = registerKey("end_stones");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceable = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endStoneReplaceable = new BlockMatchTest(Blocks.END_STONE);
        RuleTest warpedReplaceable = new BlockMatchTest(Blocks.WARPED_NYLIUM);
        RuleTest soulReplaceable = new BlockMatchTest(Blocks.SOUL_SAND);

        List<OreConfiguration.TargetBlockState> overworldStones = List.of(
                OreConfiguration.target(stoneReplaceable, JDBlocks.TURQUOISE_COBBLESTONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldStones1 = List.of(
                OreConfiguration.target(stoneReplaceable, JDBlocks.GREEN_COBBLESTONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldStones2 = List.of(
                OreConfiguration.target(stoneReplaceable, JDBlocks.BLACK_COBBLESTONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherStones = List.of(
                OreConfiguration.target(netherrackReplaceable, JDBlocks.RED_COBBLESTONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> warpedStones = List.of(
                OreConfiguration.target(warpedReplaceable, JDBlocks.BLUE_COBBLESTONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> soulStones = List.of(
                OreConfiguration.target(soulReplaceable, JDBlocks.BROWN_COBBLESTONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> endStones = List.of(
                OreConfiguration.target(endStoneReplaceable, JDBlocks.PURPLE_COBBLESTONE.get().defaultBlockState()));

        register(context, OVERWORLD_STONES_KEY, Feature.ORE, new OreConfiguration(overworldStones, 48));  //vein size
        register(context, NETHER_STONES_KEY, Feature.ORE, new OreConfiguration(netherStones, 64));
        register(context, WARPED_STONES_KEY, Feature.ORE, new OreConfiguration(warpedStones, 64));
        register(context, SOUL_STONES_KEY, Feature.ORE, new OreConfiguration(soulStones, 64));
        register(context, END_STONES_KEY, Feature.ORE, new OreConfiguration(endStones, 64));
        register(context, OVERWORLD_STONES_KEY1, Feature.ORE, new OreConfiguration(overworldStones1, 48));
        register(context, OVERWORLD_STONES_KEY2, Feature.ORE, new OreConfiguration(overworldStones2, 48));

    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(BuildingBlocks.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}


