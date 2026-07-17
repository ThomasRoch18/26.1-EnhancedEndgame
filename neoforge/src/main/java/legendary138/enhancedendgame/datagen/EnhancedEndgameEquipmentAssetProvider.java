package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.init.ModArmorMaterials;
import net.minecraft.client.data.models.EquipmentAssetProvider;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.function.BiConsumer;

public class EnhancedEndgameEquipmentAssetProvider extends EquipmentAssetProvider {
    public EnhancedEndgameEquipmentAssetProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void registerModels(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> output) {
        output.accept(ModArmorMaterials.ENDIRIUM_ASSET,
                EquipmentClientInfo.builder().addHumanoidLayers(Constants.id("endirium")).build());
    }
}
