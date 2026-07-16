package legendary138.enhancedendgame;

import legendary138.enhancedendgame.datagen.EnhancedEndgameEnglishLanguageProvider;
import legendary138.enhancedendgame.datagen.EnhancedEndgameLootTableProvider;
import legendary138.enhancedendgame.datagen.EnhancedEndgameModelProvider;
import legendary138.enhancedendgame.datagen.EnhancedEndgameTagProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class EnhancedEndgameDatagen {
    private EnhancedEndgameDatagen() {
    }

    public static void onGatherClientData(GatherDataEvent.Client event) {
        event.createProvider(EnhancedEndgameModelProvider::new);
        event.createProvider(EnhancedEndgameEnglishLanguageProvider::new);
        event.createProvider(EnhancedEndgameTagProvider::new);
        event.createProvider(EnhancedEndgameLootTableProvider::new);
    }
}
