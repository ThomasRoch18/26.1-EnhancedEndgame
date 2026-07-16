package legendary138.enhancedendgame.init;

import legendary138.enhancedendgame.services.Services;
import legendary138.enhancedendgame.services.util.RegistryHandle;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ToolMaterial;

import static legendary138.enhancedendgame.init.ModBlocks.ENDIRIUM_BLOCK;
import static legendary138.enhancedendgame.init.ModBlocks.ENDIRIUM_ORE;

public class ModItems {
    private ModItems() {
    }

    public static void load() {
    }

    public static final RegistryHandle<Item> ENDIRIUM_INGOT = Services.REGISTRY.registerItem("endirium_ingot",
            properties -> new Item(properties.stacksTo(64)));
    public static final RegistryHandle<Item> ENDIRIUM_UPGRADE_SMITHING_TEMPLATE = Services.REGISTRY.registerItem("endirium_upgrade_smithing_template",
            properties -> new Item(properties.stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final RegistryHandle<Item> ENDIRIUM_NUGGET = Services.REGISTRY.registerItem("endirium_nugget",
            properties -> new Item(properties.stacksTo(64)));

    public static RegistryHandle<BlockItem> ENDIRIUM_ORE_ITEM = Services.REGISTRY.registerBlockItem("endirium_ore", ENDIRIUM_ORE,
            (block, properties) -> new BlockItem(block, properties.stacksTo(64)));
    public static RegistryHandle<BlockItem> ENDIRIUM_BLOCK_ITEM = Services.REGISTRY.registerBlockItem("endirium_block", ENDIRIUM_BLOCK,
            (block, properties) -> new BlockItem(block, properties.stacksTo(64)));

}
