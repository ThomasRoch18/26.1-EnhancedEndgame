package legendary138.enhancedendgame.loot;

import legendary138.enhancedendgame.init.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public final class FabricLootTableModifiers {

    private FabricLootTableModifiers() {
    }

    public static void register() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (key != BuiltInLootTables.END_CITY_TREASURE) {
                return;
            }

            // Avoid modifying a datapack replacement of the vanilla table.
            if (!source.isBuiltin()) {
                return;
            }

            LootPool.Builder pool = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1.0F))
                    .when(
                            LootItemRandomChanceCondition.randomChance(0.10F)
                    )
                    .add(
                            LootItem.lootTableItem(
                                    ModItems.ENDIRIUM_UPGRADE_SMITHING_TEMPLATE.get()
                            )
                    );

            tableBuilder.withPool(pool);
        });
    }
}
