package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.init.ModBlocks;
import legendary138.enhancedendgame.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
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

        add(ModBlocks.ENDIRIUM_ORE.get(), "Endirium Ore");
    }

    private void add(Component component, String value) {
        if (component.getContents() instanceof TranslatableContents translatableContents) {
            add(translatableContents.getKey(), value);
        }
    }
}
