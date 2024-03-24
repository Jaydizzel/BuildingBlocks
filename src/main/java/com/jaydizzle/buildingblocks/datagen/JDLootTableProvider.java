package com.jaydizzle.buildingblocks.datagen;

import com.jaydizzle.buildingblocks.datagen.loot.JDBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class JDLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(JDBlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }
}