package net.marmar.enhanced_ore_variety.datagen.lang.spanish;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class UyLangProvider extends AbstractSpanishLangProvider{
    public UyLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "es_uy", registryLookup);
    }
}
