package legendary138.enhancedendgame.init;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.services.Services;
import legendary138.enhancedendgame.services.util.RegistryHandle;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.Map;
import java.util.Objects;

public final class ModCreativeTabs {
    private ModCreativeTabs() {
    }

    public static final RegistryHandle<CreativeModeTab> enhancedEndgameTab = Services.REGISTRY.registerCreativeTab(
            "enhanced_endgame", "itemGroup." + Constants.MOD_ID + ".enhanced_endgame",
            () -> new ItemStack(ModItems.ENDIRIUM_INGOT.get()),
            output -> BuiltInRegistries.ITEM.entrySet().stream()
                    .filter(entry -> Objects.equals(entry.getKey().identifier().getNamespace(), Constants.MOD_ID))
                    .map(Map.Entry::getValue)
                    .forEachOrdered(output::accept));

    public static void load() {
    }
}
