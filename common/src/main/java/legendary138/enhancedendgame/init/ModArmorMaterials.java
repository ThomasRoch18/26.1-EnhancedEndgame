package legendary138.enhancedendgame.init;

import com.google.common.collect.Maps;
import legendary138.enhancedendgame.Constants;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;

public class ModArmorMaterials {
    private ModArmorMaterials() {
    }

    public static final ResourceKey<EquipmentAsset> ENDIRIUM_ASSET = ResourceKey.create(EquipmentAssets.ROOT_ID, Constants.id("endirium"));

    public static final ArmorMaterial ENDIRIUM_ARMOR_MATERIAL =
            new ArmorMaterial(45, makeDefense(3, 6, 8, 3, 45),
                    20, SoundEvents.ARMOR_EQUIP_NETHERITE, 4.0F, 0.15F, ModItemTags.ENDIRIUM_ARMOR_MATERIAL_REPAIR_ITEMS, ENDIRIUM_ASSET);

    static Map<ArmorType, Integer> makeDefense(final int boots, final int legs, final int chest, final int helm, final int body) {
        return Maps.newEnumMap(Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body));
    }

}

