package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.init.ModBlocks;
import legendary138.enhancedendgame.init.ModCreativeTabs;
import legendary138.enhancedendgame.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class EnhancedEndgameEnglishLanguageProvider extends LanguageProvider {
    public EnhancedEndgameEnglishLanguageProvider(PackOutput output) {
        super(output, Constants.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.ENDIRIUM_INGOT.get(), "Endirium Ingot");
        add(ModItems.ENDIRIUM_UPGRADE_SMITHING_TEMPLATE.get(), "Endirium Upgrade");
        add(ModItems.ENDIRIUM_ORE_ITEM.get(), "Endirium Ore");
        add(ModItems.ENDIRIUM_BLOCK_ITEM.get(), "Endirium Block");
        add(ModItems.ENDIRIUM_NUGGET.get(), "Endirium Nugget");

        add(ModItems.ENDIRIUM_SWORD.get(), "Endirium Sword");
        add(ModItems.ENDIRIUM_PICKAXE.get(), "Endirium Pickaxe");
        add(ModItems.ENDIRIUM_SHOVEL.get(), "Endirium Shovel");
        add(ModItems.ENDIRIUM_AXE.get(), "Endirium Axe");
        add(ModItems.ENDIRIUM_HOE.get(), "Endirium Hoe");
        add(ModItems.ENDIRIUM_SPEAR.get(), "Endirium Spear");

        add(ModBlocks.ENDIRIUM_ORE.get(), "Endirium Ore");
        add(ModBlocks.ENDIRIUM_BLOCK.get(), "Endirium Block");

        add(ModCreativeTabs.ENHANCED_ENDGAME_TAB.get().getDisplayName(), ("Enhanced Endgame"));
    }

    private void add(Component component, String value) {
        if (component.getContents() instanceof TranslatableContents translatableContents) {
            add(translatableContents.getKey(), value);
        }
    }
}
