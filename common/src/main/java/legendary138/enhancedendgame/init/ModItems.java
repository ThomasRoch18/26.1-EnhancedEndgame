package legendary138.enhancedendgame.init;

import legendary138.enhancedendgame.services.Services;
import legendary138.enhancedendgame.services.util.RegistryHandle;
import net.minecraft.world.item.Item;

public class ModItems {
    private ModItems() {
    }

    public static final RegistryHandle<Item> ENDIRIUM_INGOT = Services.REGISTRY.registerItem("endirium_ingot",
            properties -> new Item(properties.stacksTo(64)));
}
