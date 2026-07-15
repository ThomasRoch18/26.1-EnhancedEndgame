package legendary138.enhancedendgame.services.util;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public record BlockWithItemRegistryHolder<T extends Block>(
        RegistryHandle<? extends Block> block,
        RegistryHandle<? extends BlockItem> item
) {
}
