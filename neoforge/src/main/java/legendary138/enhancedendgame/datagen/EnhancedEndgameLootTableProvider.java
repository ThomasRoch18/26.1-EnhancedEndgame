package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.init.ModBlocks;
import legendary138.enhancedendgame.init.ModItems;
import legendary138.enhancedendgame.services.NeoForgeRegistryHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class EnhancedEndgameLootTableProvider extends LootTableProvider {
    public EnhancedEndgameLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(
                output,
                Set.of(),
                List.of(
                        // add more Providers here, i.e. for entities, chests, etc.
                        new SubProviderEntry(EnhancedEndgameBlockLootProvider::new, LootContextParamSets.BLOCK)
                ),
                registries
        );
    }

    private static final class EnhancedEndgameBlockLootProvider extends BlockLootSubProvider {

        EnhancedEndgameBlockLootProvider(HolderLookup.Provider registries) {
            super(Set.of(ModItems.ENDIRIUM_ORE_ITEM.get()), FeatureFlags.DEFAULT_FLAGS, registries);
        }

        @Override
        protected void generate() {
            dropSelf(ModBlocks.ENDIRIUM_ORE.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return NeoForgeRegistryHelper.BLOCKS.getEntries()
                    .stream()
                    .map(entry -> (Block) entry.value())
                    .toList();
        }
    }
}
