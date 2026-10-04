package net.marmar.enhanced_ore_variety.datagen.lang.spanish;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class VeLangProvider extends AbstractSpanishLangProvider{
    public VeLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "es_ve", registryLookup);
    }
}
