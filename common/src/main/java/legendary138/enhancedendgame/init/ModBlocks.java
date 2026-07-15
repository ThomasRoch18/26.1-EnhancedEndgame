package legendary138.enhancedendgame.init;

import legendary138.enhancedendgame.services.Services;
import legendary138.enhancedendgame.services.util.RegistryHandle;
import net.minecraft.world.level.block.Block;

public final class ModBlocks {
    private ModBlocks() {
    }

    public static void load() {
    }

    public static final RegistryHandle<Block> ENDIRIUM_ORE = Services.REGISTRY.registerBlock("endirium_ore",
            properties -> new Block(properties.strength(40.0F, 1200).requiresCorrectToolForDrops()));
}
