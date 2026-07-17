package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.init.ModBlocks;
import legendary138.enhancedendgame.init.ModItemTags;
import legendary138.enhancedendgame.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class EnhancedEndgameItemTagProvider extends ItemTagsProvider {
    public EnhancedEndgameItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Chainable, i.e. can put .add(...) over and over
        tag(ModItemTags.ENDIRIUM_TOOL_MATERIAL_REPAIR_ITEMS).add(ModItems.ENDIRIUM_INGOT.get());
    }
}
