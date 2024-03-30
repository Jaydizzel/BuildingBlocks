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
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_STONES_KEY = registerKey("nether_stones");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONES_KEY = registerKey("end_stones");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceable = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endStoneReplaceable = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldOres = List.of(
                OreConfiguration.target(stoneReplaceable, JDBlocks.BLACK_COBBLESTONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> netherOres = List.of(
                OreConfiguration.target(netherrackReplaceable, JDBlocks.RED_COBBLESTONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> endOres = List.of(
                OreConfiguration.target(endStoneReplaceable, JDBlocks.BLUE_COBBLESTONE.get().defaultBlockState()));

        register(context, OVERWORLD_STONES_KEY, Feature.ORE, new OreConfiguration(overworldOres, 64));  //vein size
        register(context, NETHER_STONES_KEY, Feature.ORE, new OreConfiguration(netherOres, 64));
        register(context, END_STONES_KEY, Feature.ORE, new OreConfiguration(endOres, 64));

    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(BuildingBlocks.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}


