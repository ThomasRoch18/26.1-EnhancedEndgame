package legendary138.enhancedendgame.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

// Make final if only one material, otherwise do not make final
public final class ModToolMaterials {
    private ModToolMaterials() {
    }

    public static final ToolMaterial ENDIRIUM_TOOL_MATERIAL =
            new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
                    2842,
                    10.0F,
                    6.0F,
                    20,
                    ModItemTags.ENDIRIUM_TOOL_MATERIAL_REPAIR_ITEMS);
}
