package legendary138.enhancedendgame;

import legendary138.enhancedendgame.loot.FabricLootTableModifiers;
import legendary138.enhancedendgame.worldgen.EnhancedEndgameFabricWorldgen;
import net.fabricmc.api.ModInitializer;

public class EnhancedEndgame implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
        FabricLootTableModifiers.register();
        EnhancedEndgameFabricWorldgen.load();
    }
}
