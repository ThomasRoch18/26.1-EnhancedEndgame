package legendary138.enhancedendgame.init;

import legendary138.enhancedendgame.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public final class ModItemTags {
    private ModItemTags() {
    }

    public static final TagKey<Item> ENDIRIUM_TOOL_MATERIAL_REPAIR_ITEMS = create("endirium_tool_material_repair_items");

    public static TagKey<Item> create(String name) {
        return TagKey.create(Registries.ITEM, Constants.id(name));
    }
}
