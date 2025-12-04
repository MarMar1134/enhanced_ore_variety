package net.marmar.enhanced_ore_variety.data;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.marmar.enhanced_ore_variety.block.EOVBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EOVTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB, EnhancedOreVariety.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ORE_VARIANTS = TABS.register("ore_variants",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(EOVBlocks.GRANITE_IRON_ORE))
                    .title(Component.translatable("tabs." + EnhancedOreVariety.MOD_ID + ".ore_variants"))
                    .displayItems(((parameters, output) -> {
                        //Coal
                        output.accept(EOVBlocks.GRANITE_COAL_ORE.get());
                        output.accept(EOVBlocks.DIORITE_COAL_ORE.get());
                        output.accept(EOVBlocks.ANDESITE_COAL_ORE.get());
                        output.accept(EOVBlocks.TUFF_COAL_ORE.get());
                        output.accept(EOVBlocks.BLACKSTONE_COAL_ORE.get());

                        //Copper
                        output.accept(EOVBlocks.GRANITE_COPPER_ORE.get());
                        output.accept(EOVBlocks.DIORITE_COPPER_ORE.get());
                        output.accept(EOVBlocks.ANDESITE_COPPER_ORE.get());
                        output.accept(EOVBlocks.TUFF_COPPER_ORE.get());
                        output.accept(EOVBlocks.BLACKSTONE_COPPER_ORE.get());

                        //Iron
                        output.accept(EOVBlocks.GRANITE_IRON_ORE.get());
                        output.accept(EOVBlocks.DIORITE_IRON_ORE.get());
                        output.accept(EOVBlocks.ANDESITE_IRON_ORE.get());
                        output.accept(EOVBlocks.TUFF_IRON_ORE.get());
                        output.accept(EOVBlocks.BLACKSTONE_IRON_ORE.get());

                        //Gold
                        output.accept(EOVBlocks.GRANITE_GOLD_ORE.get());
                        output.accept(EOVBlocks.DIORITE_GOLD_ORE.get());
                        output.accept(EOVBlocks.ANDESITE_GOLD_ORE.get());
                        output.accept(EOVBlocks.TUFF_GOLD_ORE.get());
                        output.accept(EOVBlocks.BLACKSTONE_GOLD_ORE.get());

                        //Redstone
                        output.accept(EOVBlocks.GRANITE_REDSTONE_ORE.get());
                        output.accept(EOVBlocks.DIORITE_REDSTONE_ORE.get());
                        output.accept(EOVBlocks.ANDESITE_REDSTONE_ORE.get());
                        output.accept(EOVBlocks.TUFF_REDSTONE_ORE.get());
                        output.accept(EOVBlocks.BLACKSTONE_REDSTONE_ORE.get());

                        //Emerald
                        output.accept(EOVBlocks.GRANITE_EMERALD_ORE.get());
                        output.accept(EOVBlocks.DIORITE_EMERALD_ORE.get());
                        output.accept(EOVBlocks.ANDESITE_EMERALD_ORE.get());
                        output.accept(EOVBlocks.TUFF_EMERALD_ORE.get());
                        output.accept(EOVBlocks.BLACKSTONE_EMERALD_ORE.get());

                        //Lapis lazuli
                        output.accept(EOVBlocks.GRANITE_LAPIS_ORE.get());
                        output.accept(EOVBlocks.DIORITE_LAPIS_ORE.get());
                        output.accept(EOVBlocks.ANDESITE_LAPIS_ORE.get());
                        output.accept(EOVBlocks.TUFF_LAPIS_ORE.get());
                        output.accept(EOVBlocks.BLACKSTONE_LAPIS_ORE.get());

                        //Diamond
                        output.accept(EOVBlocks.GRANITE_DIAMOND_ORE.get());
                        output.accept(EOVBlocks.DIORITE_DIAMOND_ORE.get());
                        output.accept(EOVBlocks.ANDESITE_DIAMOND_ORE.get());
                        output.accept(EOVBlocks.TUFF_DIAMOND_ORE.get());
                        output.accept(EOVBlocks.BLACKSTONE_DIAMOND_ORE.get());

                        //Blackstone quartz
                        output.accept(EOVBlocks.BLACKSTONE_QUARTZ_ORE.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus){
        TABS.register(eventBus);
    }
}
