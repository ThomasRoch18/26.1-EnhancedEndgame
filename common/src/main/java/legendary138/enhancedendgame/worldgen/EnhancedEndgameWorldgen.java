package legendary138.enhancedendgame.worldgen;

import legendary138.enhancedendgame.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class EnhancedEndgameWorldgen {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ENDIRIUM_ORE = configuredFeatureKey("endirium_ore");

    public static final ResourceKey<PlacedFeature> ENDIRIUM_ORE_PLACED = placedFeatureKey("endirium_ore");

    private EnhancedEndgameWorldgen() {
    }

    public static void load() {
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> configuredFeatureKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Constants.id(name));
    }

    private static ResourceKey<PlacedFeature> placedFeatureKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Constants.id(name));
    }
}
