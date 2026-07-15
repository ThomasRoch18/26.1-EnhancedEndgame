package legendary138.enhancedendgame.services.types;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.services.util.BlockWithItemRegistryHolder;
import legendary138.enhancedendgame.services.util.RegistryHandle;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface IRegistryHelper {
    <T extends Item> RegistryHandle<T> registerItem(String name, Function<Item.Properties, T> item);

    <T extends BlockItem> RegistryHandle<T> registerBlockItem(String name, RegistryHandle<? extends Block> block, BiFunction<Block, Item.Properties, T> item);

    // default <T extends Block> BlockWithItemRegistryHolder registerBlockWithItem(String name, Function<BlockBehaviour.Properties, T> block);

    <T extends Block> RegistryHandle<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> block);

    static ResourceKey<Item> itemKey(String name) {
        return ResourceKey.create(Registries.ITEM, Constants.id(name));
    }

    static ResourceKey<Block> blockKey(String name) {
        return ResourceKey.create(Registries.BLOCK, Constants.id(name));
    }
}
