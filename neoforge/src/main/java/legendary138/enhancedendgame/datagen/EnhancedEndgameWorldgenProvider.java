package legendary138.enhancedendgame.datagen;

import legendary138.enhancedendgame.Constants;
import legendary138.enhancedendgame.datagen.bootstrap.EnhancedEndgameWorldgenBootstrapper;
import legendary138.enhancedendgame.worldgen.EnhancedEndgameWorldgen;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class EnhancedEndgameWorldgenProvider extends DatapackBuiltinEntriesProvider {
    private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, EnhancedEndgameWorldgenBootstrapper::bootstrapConfiguredFeatures)
            .add(Registries.PLACED_FEATURE, EnhancedEndgameWorldgenBootstrapper::bootstrapPlacedFeatures)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, EnhancedEndgameWorldgenProvider::boostrapBiomeModifier);

    private static final ResourceKey<BiomeModifier> ENDIRIUM_ORE_MODIFIER = biomeModifierKey("endirium_ore");

    public EnhancedEndgameWorldgenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Constants.MOD_ID));
    }

    private static void boostrapBiomeModifier(BootstrapContext<BiomeModifier> context) {
        HolderGetter<Biome> biomes = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        context.register(
                ENDIRIUM_ORE_MODIFIER,
                new BiomeModifiers.AddFeaturesBiomeModifier(
                        biomes.getOrThrow(BiomeTags.IS_END),
                        HolderSet.direct(
                                placedFeatures.getOrThrow(
                                        EnhancedEndgameWorldgen.ENDIRIUM_ORE_PLACED
                                )
                        ),
                        GenerationStep.Decoration.UNDERGROUND_ORES
                )
        );
    }

    private static ResourceKey<BiomeModifier> biomeModifierKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, Constants.id(name));
    }
}
