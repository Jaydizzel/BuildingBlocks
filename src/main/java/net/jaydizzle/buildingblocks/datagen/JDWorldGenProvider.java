package net.jaydizzle.buildingblocks.datagen;

import net.jaydizzle.buildingblocks.BuildingBlocks;
import net.jaydizzle.buildingblocks.worldgen.JDBiomeModifiers;
import net.jaydizzle.buildingblocks.worldgen.JDConfiguredFeatures;
import net.jaydizzle.buildingblocks.worldgen.JDPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class JDWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, JDConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, JDPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, JDBiomeModifiers::bootstrap);

    public JDWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(BuildingBlocks.MOD_ID));
    }
}
