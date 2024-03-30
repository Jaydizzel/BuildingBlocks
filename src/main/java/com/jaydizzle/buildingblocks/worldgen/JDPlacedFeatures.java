package com.jaydizzle.buildingblocks.worldgen;

import com.jaydizzle.buildingblocks.BuildingBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class JDPlacedFeatures {
    public static final ResourceKey<PlacedFeature> OVERWORLD_STONES_PLACED_KEY = registerKey("overworld_stones_placed");
    public static final ResourceKey<PlacedFeature> NETHER_STONES_PLACED_KEY = registerKey("nether_stones_placed");
    public static final ResourceKey<PlacedFeature> END_STONES_PLACED_KEY = registerKey("end_stones_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, OVERWORLD_STONES_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.OVERWORLD_STONES_KEY),
                JDOrePlacement.commonOrePlacement(12,   //# of veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-58), VerticalAnchor.absolute(200)))); //spawn range

        register(context, NETHER_STONES_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.NETHER_STONES_KEY),
                JDOrePlacement.commonOrePlacement(12,   //# of veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-58), VerticalAnchor.absolute(200))));

        register(context, END_STONES_PLACED_KEY, configuredFeatures.getOrThrow(JDConfiguredFeatures.END_STONES_KEY),
                JDOrePlacement.commonOrePlacement(12,   //# of veins per chunk
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-58), VerticalAnchor.absolute(200))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(BuildingBlocks.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}


