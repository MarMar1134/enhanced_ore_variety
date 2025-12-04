package net.marmar.enhanced_ore_variety.block;

import net.marmar.enhanced_ore_variety.EnhancedOreVariety;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class EOVBlocks {
    //Deferred registers
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
            ForgeRegistries.BLOCKS, EnhancedOreVariety.MOD_ID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(
            ForgeRegistries.ITEMS, EnhancedOreVariety.MOD_ID);


    //Diorite variants
    public static final RegistryObject<Block> DIORITE_COAL_ORE = registerBlockWithItem("diorite_coal_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> DIORITE_COPPER_ORE = registerBlockWithItem("diorite_copper_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> DIORITE_IRON_ORE = registerBlockWithItem("diorite_iron_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> DIORITE_GOLD_ORE = registerBlockWithItem("diorite_gold_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> DIORITE_LAPIS_ORE = registerBlockWithItem("diorite_lapis_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> DIORITE_REDSTONE_ORE = registerBlockWithItem("diorite_redstone_ore",
            ()-> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<Block> DIORITE_EMERALD_ORE = registerBlockWithItem("diorite_emerald_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> DIORITE_DIAMOND_ORE = registerBlockWithItem("diorite_diamond_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE), UniformInt.of(3, 7)));

    //Andesite variants
    public static final RegistryObject<Block> ANDESITE_COAL_ORE = registerBlockWithItem("andesite_coal_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> ANDESITE_COPPER_ORE = registerBlockWithItem("andesite_copper_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> ANDESITE_IRON_ORE = registerBlockWithItem("andesite_iron_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> ANDESITE_GOLD_ORE = registerBlockWithItem("andesite_gold_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> ANDESITE_LAPIS_ORE = registerBlockWithItem("andesite_lapis_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> ANDESITE_REDSTONE_ORE = registerBlockWithItem("andesite_redstone_ore",
            ()-> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<Block> ANDESITE_EMERALD_ORE = registerBlockWithItem("andesite_emerald_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> ANDESITE_DIAMOND_ORE = registerBlockWithItem("andesite_diamond_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE), UniformInt.of(3, 7)));

    //Granite variants
    public static final RegistryObject<Block> GRANITE_COAL_ORE = registerBlockWithItem("granite_coal_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> GRANITE_COPPER_ORE = registerBlockWithItem("granite_copper_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> GRANITE_IRON_ORE = registerBlockWithItem("granite_iron_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> GRANITE_GOLD_ORE = registerBlockWithItem("granite_gold_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> GRANITE_LAPIS_ORE = registerBlockWithItem("granite_lapis_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> GRANITE_REDSTONE_ORE = registerBlockWithItem("granite_redstone_ore",
            ()-> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<Block> GRANITE_EMERALD_ORE = registerBlockWithItem("granite_emerald_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> GRANITE_DIAMOND_ORE = registerBlockWithItem("granite_diamond_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE), UniformInt.of(3, 7)));

    //Tuff variants
    public static final RegistryObject<Block> TUFF_COAL_ORE = registerBlockWithItem("tuff_coal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> TUFF_COPPER_ORE = registerBlockWithItem("tuff_copper_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    public static final RegistryObject<Block> TUFF_IRON_ORE = registerBlockWithItem("tuff_iron_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final RegistryObject<Block> TUFF_GOLD_ORE = registerBlockWithItem("tuff_gold_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_GOLD_ORE)));
    public static final RegistryObject<Block> TUFF_LAPIS_ORE = registerBlockWithItem("tuff_lapis_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
    public static final RegistryObject<Block> TUFF_REDSTONE_ORE = registerBlockWithItem("tuff_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
    public static final RegistryObject<Block> TUFF_EMERALD_ORE = registerBlockWithItem("tuff_emerald_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_EMERALD_ORE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> TUFF_DIAMOND_ORE = registerBlockWithItem("tuff_diamond_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE), UniformInt.of(3, 7)));

    //Blackstone
    public static final RegistryObject<Block> BLACKSTONE_COAL_ORE = registerBlockWithItem("blackstone_coal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(0, 2)));
    public static final RegistryObject<Block> BLACKSTONE_COPPER_ORE = registerBlockWithItem("blackstone_copper_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
    public static final RegistryObject<Block> BLACKSTONE_IRON_ORE = registerBlockWithItem("blackstone_iron_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> BLACKSTONE_GOLD_ORE = registerBlockWithItem("blackstone_gold_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).sound(SoundType.STONE), UniformInt.of(0, 1)));
    public static final RegistryObject<Block> BLACKSTONE_LAPIS_ORE = registerBlockWithItem("blackstone_lapis_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE)));
    public static final RegistryObject<Block> BLACKSTONE_REDSTONE_ORE = registerBlockWithItem("blackstone_redstone_ore",
            () -> new RedStoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE)));
    public static final RegistryObject<Block> BLACKSTONE_EMERALD_ORE = registerBlockWithItem("blackstone_emerald_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.EMERALD_ORE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> BLACKSTONE_DIAMOND_ORE = registerBlockWithItem("blackstone_diamond_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> BLACKSTONE_QUARTZ_ORE = registerBlockWithItem("blackstone_quartz_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).sound(SoundType.STONE), UniformInt.of(2, 5)));

    //Helper methods
    private static <T extends Block> RegistryObject<T> registerBlockWithItem(String name, Supplier<T> block){
        RegistryObject<T> ToReturn = BLOCKS.register(name, block);
        registerBlockItem(name, ToReturn);
        return ToReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
        BLOCK_ITEMS.register(eventBus);
    }
}
