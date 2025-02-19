package net.jaydizzle.buildingblocks.worldgen;

import net.jaydizzle.buildingblocks.BuildingBlocks;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class JDBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_STONES = registerKey("add_overworld_stones");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_STONES = registerKey("add_nether_stones");
    public static final ResourceKey<BiomeModifier> ADD_WARPED_STONES = registerKey("add_warped_stones");
    public static final ResourceKey<BiomeModifier> ADD_SOUL_STONES = registerKey("add_soul_stones");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_STONES1 = registerKey("add_overworld_stones1");
    public static final ResourceKey<BiomeModifier> ADD_OVERWORLD_STONES2 = registerKey("add_overworld_stones2");

    public static final ResourceKey<BiomeModifier> ADD_END_STONES = registerKey("add_end_stones");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_OVERWORLD_STONES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.OVERWORLD_STONES_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_STONES1, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.OVERWORLD_STONES_PLACED_KEY1)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_OVERWORLD_STONES2, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.OVERWORLD_STONES_PLACED_KEY2)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_WARPED_STONES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.WARPED_STONES_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SOUL_STONES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.SOUL_STONES_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_STONES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.NETHER_STONES_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_STONES, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(JDPlacedFeatures.END_STONES_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(BuildingBlocks.MOD_ID, name));
    }
}
