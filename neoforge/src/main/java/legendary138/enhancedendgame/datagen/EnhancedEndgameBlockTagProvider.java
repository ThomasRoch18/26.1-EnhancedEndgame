package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class EnhancedEndgameBlockTagProvider extends BlockTagsProvider {
    public EnhancedEndgameBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // Chainable, i.e. can put .add(...) over and over
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ENDIRIUM_ORE.get())
                .add(ModBlocks.ENDIRIUM_BLOCK.get());
        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .add(ModBlocks.ENDIRIUM_ORE.get())
                .add(ModBlocks.ENDIRIUM_BLOCK.get());
    }
}
