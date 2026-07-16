package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.init.ModBlocks;
import legendary138.enhancedendgame.init.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class EnhancedEndgameModelProvider extends ModelProvider {
    public EnhancedEndgameModelProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.ENDIRIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ENDIRIUM_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);

        blockModels.createTrivialCube(ModBlocks.ENDIRIUM_ORE.get());
    }
}
