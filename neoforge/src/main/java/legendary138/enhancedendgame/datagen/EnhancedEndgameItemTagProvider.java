package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.init.ModItemTags;
import legendary138.enhancedendgame.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
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
        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(ModItems.ENDIRIUM_INGOT.get());

        // Weapon Tags
        tag(ItemTags.WEAPON_ENCHANTABLE).add(ModItems.ENDIRIUM_SWORD.get()).add(ModItems.ENDIRIUM_AXE.get()).add(ModItems.ENDIRIUM_SPEAR.get());
        tag(ItemTags.MELEE_WEAPON_ENCHANTABLE).add(ModItems.ENDIRIUM_SWORD.get()).add(ModItems.ENDIRIUM_AXE.get()).add(ModItems.ENDIRIUM_SPEAR.get());
        tag(ItemTags.SHARP_WEAPON_ENCHANTABLE).add(ModItems.ENDIRIUM_SWORD.get()).add(ModItems.ENDIRIUM_AXE.get()).add(ModItems.ENDIRIUM_SPEAR.get());
        tag(ItemTags.FIRE_ASPECT_ENCHANTABLE).add(ModItems.ENDIRIUM_SWORD.get()).add(ModItems.ENDIRIUM_AXE.get()).add(ModItems.ENDIRIUM_SPEAR.get());
        tag(ItemTags.SWEEPING_ENCHANTABLE).add(ModItems.ENDIRIUM_SWORD.get());
        tag(ItemTags.LUNGE_ENCHANTABLE).add(ModItems.ENDIRIUM_SPEAR.get());

        // Mining Tags
        tag(ItemTags.MINING_ENCHANTABLE).add(ModItems.ENDIRIUM_PICKAXE.get()).add(ModItems.ENDIRIUM_SHOVEL.get()).add(ModItems.ENDIRIUM_AXE.get()).add(ModItems.ENDIRIUM_HOE.get());
        tag(ItemTags.MINING_LOOT_ENCHANTABLE).add(ModItems.ENDIRIUM_PICKAXE.get()).add(ModItems.ENDIRIUM_SHOVEL.get()).add(ModItems.ENDIRIUM_AXE.get()).add(ModItems.ENDIRIUM_HOE.get());

        // Misc Tags
        tag(ItemTags.DURABILITY_ENCHANTABLE).add(ModItems.ENDIRIUM_PICKAXE.get()).add(ModItems.ENDIRIUM_SHOVEL.get()).add(ModItems.ENDIRIUM_AXE.get()).add(ModItems.ENDIRIUM_HOE.get())
                                            .add(ModItems.ENDIRIUM_SWORD.get()).add(ModItems.ENDIRIUM_SPEAR.get());

    }
}
