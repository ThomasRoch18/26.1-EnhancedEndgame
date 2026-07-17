package legendary138.enhancedendgame.init;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

public final class ModSmithingTemplates {

    private static final Component APPLIES_TO =
            Component.translatable(
                    "item.enhancedendgame.endirium_upgrade_smithing_template.applies_to"
            ).withStyle(ChatFormatting.BLUE);

    private static final Component INGREDIENTS =
            Component.translatable(
                    "item.enhancedendgame.endirium_upgrade_smithing_template.ingredients"
            ).withStyle(ChatFormatting.BLUE);

    private static final Component BASE_SLOT_DESCRIPTION =
            Component.translatable(
                    "item.enhancedendgame.endirium_upgrade_smithing_template.base_slot_description"
            );

    private static final Component ADDITION_SLOT_DESCRIPTION =
            Component.translatable(
                    "item.enhancedendgame.endirium_upgrade_smithing_template.addition_slot_description"
            );

    private static final List<Identifier> EMPTY_BASE_SLOT_ICONS = List.of(
            Identifier.withDefaultNamespace("container/slot/helmet"),
            Identifier.withDefaultNamespace("container/slot/chestplate"),
            Identifier.withDefaultNamespace("container/slot/leggings"),
            Identifier.withDefaultNamespace("container/slot/boots"),
            Identifier.withDefaultNamespace("container/slot/sword"),
            Identifier.withDefaultNamespace("container/slot/pickaxe"),
            Identifier.withDefaultNamespace("container/slot/axe"),
            Identifier.withDefaultNamespace("container/slot/hoe"),
            Identifier.withDefaultNamespace("container/slot/shovel"),
            Identifier.withDefaultNamespace("container/slot/spear")
    );

    private static final List<Identifier> EMPTY_ADDITION_SLOT_ICONS = List.of(
            Identifier.withDefaultNamespace("container/slot/ingot")
    );

    public static SmithingTemplateItem createEndiriumUpgrade(
            Item.Properties properties
    ) {
        return new SmithingTemplateItem(
                APPLIES_TO,
                INGREDIENTS,
                BASE_SLOT_DESCRIPTION,
                ADDITION_SLOT_DESCRIPTION,
                EMPTY_BASE_SLOT_ICONS,
                EMPTY_ADDITION_SLOT_ICONS,
                properties.rarity(Rarity.UNCOMMON)
        );
    }
}

