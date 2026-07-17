package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.init.ModItems;
import legendary138.enhancedendgame.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public final class EnhancedEndgameGlobalLootModifierProvider
        extends GlobalLootModifierProvider {

    public EnhancedEndgameGlobalLootModifierProvider(
            PackOutput output,
            CompletableFuture<HolderLookup.Provider> registries
    ) {
        super(output, registries, Constants.MOD_ID);
    }

    @Override
    protected void start() {
        add(
                "endirium_upgrade_smithing_template_to_end_cities",
                new AddItemModifier(
                        new LootItemCondition[]{
                                LootTableIdCondition.builder(BuiltInLootTables.END_CITY_TREASURE.identifier()).build(),
                                LootItemRandomChanceCondition.randomChance(.25F).build()
                        },
                        ModItems.ENDIRIUM_UPGRADE_SMITHING_TEMPLATE.get()
                )
        );
    }
}