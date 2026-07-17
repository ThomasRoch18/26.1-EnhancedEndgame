package legendary138.enhancedendgame.init;

import legendary138.enhancedendgame.services.Services;
import legendary138.enhancedendgame.services.util.RegistryHandle;
import net.minecraft.world.item.*;

import java.security.Provider;

import static legendary138.enhancedendgame.init.ModBlocks.ENDIRIUM_BLOCK;
import static legendary138.enhancedendgame.init.ModBlocks.ENDIRIUM_ORE;

public class ModItems {
    private ModItems() {
    }

    public static void load() {
    }

    public static final RegistryHandle<Item> ENDIRIUM_INGOT = Services.REGISTRY.registerItem("endirium_ingot",
            properties -> new Item(properties.stacksTo(64).fireResistant()));
    public static final RegistryHandle<SmithingTemplateItem> ENDIRIUM_UPGRADE_SMITHING_TEMPLATE = Services.REGISTRY.registerItem("endirium_upgrade_smithing_template",
            ModSmithingTemplates::createEndiriumUpgrade);
    public static final RegistryHandle<Item> ENDIRIUM_NUGGET = Services.REGISTRY.registerItem("endirium_nugget",
            properties -> new Item(properties.stacksTo(64).fireResistant()));

    public static RegistryHandle<BlockItem> ENDIRIUM_ORE_ITEM = Services.REGISTRY.registerBlockItem("endirium_ore", ENDIRIUM_ORE,
            (block, properties) -> new BlockItem(block, properties.stacksTo(64).fireResistant()));
    public static RegistryHandle<BlockItem> ENDIRIUM_BLOCK_ITEM = Services.REGISTRY.registerBlockItem("endirium_block", ENDIRIUM_BLOCK,
            (block, properties) -> new BlockItem(block, properties.stacksTo(64).fireResistant()));

    public static final RegistryHandle<Item> ENDIRIUM_SWORD = Services.REGISTRY.registerItem("endirium_sword",
            properties -> new Item(properties.sword(ModToolMaterials.ENDIRIUM_TOOL_MATERIAL, 3.0F, -2.2F).fireResistant()));
    public static final RegistryHandle<Item> ENDIRIUM_PICKAXE = Services.REGISTRY.registerItem("endirium_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.ENDIRIUM_TOOL_MATERIAL, 1.0F, -2.8F).fireResistant()));
    public static final RegistryHandle<ShovelItem> ENDIRIUM_SHOVEL = Services.REGISTRY.registerItem("endirium_shovel",
            properties -> new ShovelItem(ModToolMaterials.ENDIRIUM_TOOL_MATERIAL, 1.5F, -3.0F, properties.fireResistant()));
    public static final RegistryHandle<AxeItem> ENDIRIUM_AXE = Services.REGISTRY.registerItem("endirium_axe",
            properties -> new AxeItem(ModToolMaterials.ENDIRIUM_TOOL_MATERIAL, 5.0F, -2.8F, properties.fireResistant()));
    public static final RegistryHandle<HoeItem> ENDIRIUM_HOE = Services.REGISTRY.registerItem("endirium_hoe",
            properties -> new HoeItem(ModToolMaterials.ENDIRIUM_TOOL_MATERIAL, -4.0F, 0.0F, properties.fireResistant()));
    public static final RegistryHandle<Item> ENDIRIUM_SPEAR = Services.REGISTRY.registerItem("endirium_spear",
            properties -> new Item(properties.spear(ModToolMaterials.ENDIRIUM_TOOL_MATERIAL, 1.25F, 1.325F,
                    0.3F, 2.0F, 8.0F, 4.5F, 5.1F, 7.5F, 4.6F).fireResistant()));
}
