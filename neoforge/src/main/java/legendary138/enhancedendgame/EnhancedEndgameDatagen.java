package legendary138.enhancedendgame;

import legendary138.enhancedendgame.datagen.*;
        import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class EnhancedEndgameDatagen {
    private EnhancedEndgameDatagen() {
    }

    public static void onGatherClientData(GatherDataEvent.Client event) {
        event.createProvider(EnhancedEndgameModelProvider::new);
        event.createProvider(EnhancedEndgameEnglishLanguageProvider::new);
        event.createProvider(EnhancedEndgameBlockTagProvider::new);
        event.createProvider(EnhancedEndgameLootTableProvider::new);
        event.createProvider(EnhancedEndgameRecipeProvider.Runner::new);
        event.createProvider(EnhancedEndgameItemTagProvider::new);
    }

    public static void onGatherServerData(GatherDataEvent.Server event) {
        event.createProvider(
                EnhancedEndgameGlobalLootModifierProvider::new
        );
    }
}
