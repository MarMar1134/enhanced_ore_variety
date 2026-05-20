package net.marmar.enhanced_ore_variety.block;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.minecraft.network.chat.Component;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Consumer;
import java.util.function.Function;

public class EOVBlocks {
    //Deferred registers
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EnhancedOreVariety.MOD_ID);
    public static final DeferredRegister.Items BLOCK_ITEMS = DeferredRegister.createItems(EnhancedOreVariety.MOD_ID);

    //Diorite variants
    public static final DeferredBlock<Block> DIORITE_COAL_ORE = registerBlock("diorite_coal_ore",
            properties -> new DropExperienceBlock(UniformInt.of(0, 2), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_COPPER_ORE = registerBlock("diorite_copper_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_IRON_ORE = registerBlock("diorite_iron_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_GOLD_ORE = registerBlock("diorite_gold_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_LAPIS_ORE = registerBlock("diorite_lapis_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_REDSTONE_ORE = registerBlock("diorite_redstone_ore",
            properties-> new RedStoneOreBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_EMERALD_ORE = registerBlock("diorite_emerald_ore",
            properties-> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DIORITE_DIAMOND_ORE = registerBlock("diorite_diamond_ore",
            properties-> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Andesite variants
    public static final DeferredBlock<Block> ANDESITE_COAL_ORE = registerBlock("andesite_coal_ore",
            properties-> new DropExperienceBlock(UniformInt.of(0, 2),properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_COPPER_ORE = registerBlock("andesite_copper_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_IRON_ORE = registerBlock("andesite_iron_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_GOLD_ORE = registerBlock("andesite_gold_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_LAPIS_ORE = registerBlock("andesite_lapis_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_REDSTONE_ORE = registerBlock("andesite_redstone_ore",
            properties-> new RedStoneOreBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_EMERALD_ORE = registerBlock("andesite_emerald_ore",
            properties-> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> ANDESITE_DIAMOND_ORE = registerBlock("andesite_diamond_ore",
            properties-> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Granite variants
    public static final DeferredBlock<Block> GRANITE_COAL_ORE = registerBlock("granite_coal_ore",
            properties-> new DropExperienceBlock(UniformInt.of(0, 2), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_COPPER_ORE = registerBlock("granite_copper_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_IRON_ORE = registerBlock("granite_iron_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_GOLD_ORE = registerBlock("granite_gold_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_LAPIS_ORE = registerBlock("granite_lapis_ore",
            properties-> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_REDSTONE_ORE = registerBlock("granite_redstone_ore",
            properties-> new RedStoneOreBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_EMERALD_ORE = registerBlock("granite_emerald_ore",
            properties-> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> GRANITE_DIAMOND_ORE = registerBlock("granite_diamond_ore",
            properties-> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Tuff variants
    public static final DeferredBlock<Block> TUFF_COAL_ORE = registerBlock("tuff_coal_ore",
            properties -> new DropExperienceBlock(UniformInt.of(0, 2), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.TUFF)));
    public static final DeferredBlock<Block> TUFF_COPPER_ORE = registerBlock("tuff_copper_ore",
            properties -> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.TUFF)));
    public static final DeferredBlock<Block> TUFF_IRON_ORE = registerBlock("tuff_iron_ore",
            properties -> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.TUFF)));
    public static final DeferredBlock<Block> TUFF_GOLD_ORE = registerBlock("tuff_gold_ore",
            properties -> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.TUFF)));
    public static final DeferredBlock<Block> TUFF_LAPIS_ORE = registerBlock("tuff_lapis_ore",
            properties -> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.TUFF)));
    public static final DeferredBlock<Block> TUFF_REDSTONE_ORE = registerBlock("tuff_redstone_ore",
            properties -> new RedStoneOreBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.TUFF)));
    public static final DeferredBlock<Block> TUFF_EMERALD_ORE = registerBlock("tuff_emerald_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.TUFF)));
    public static final DeferredBlock<Block> TUFF_DIAMOND_ORE = registerBlock("tuff_diamond_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.TUFF)));

    //Blackstone
    public static final DeferredBlock<Block> BLACKSTONE_COAL_ORE = registerBlock("blackstone_coal_ore",
            properties -> new DropExperienceBlock(UniformInt.of(0, 2), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACKSTONE_COPPER_ORE = registerBlock("blackstone_copper_ore",
            properties -> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACKSTONE_IRON_ORE = registerBlock("blackstone_iron_ore",
            properties -> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACKSTONE_GOLD_ORE = registerBlock("blackstone_gold_ore",
            properties -> new DropExperienceBlock(UniformInt.of(0, 1), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACKSTONE_LAPIS_ORE = registerBlock("blackstone_lapis_ore",
            properties -> new DropExperienceBlock(ConstantInt.of(0), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACKSTONE_REDSTONE_ORE = registerBlock("blackstone_redstone_ore",
            properties -> new RedStoneOreBlock(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACKSTONE_EMERALD_ORE = registerBlock("blackstone_emerald_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACKSTONE_DIAMOND_ORE = registerBlock("blackstone_diamond_ore",
            properties -> new DropExperienceBlock(UniformInt.of(3, 7), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> BLACKSTONE_QUARTZ_ORE = registerBlock("blackstone_quartz_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 5), properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));

    //Helper methods
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function, Component... components) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn, components);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block, Component... components) {
        BLOCK_ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()) {
            @Override
            public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                for(var component : components) {
                    builder.accept(component);
                }
                super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
            }
        });
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        BLOCK_ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        BLOCK_ITEMS.register(eventBus);
    }
}
