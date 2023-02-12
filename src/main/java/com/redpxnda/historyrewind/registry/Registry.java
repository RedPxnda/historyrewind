package com.redpxnda.historyrewind.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.redpxnda.historyrewind.HistoryRewind.MODID;

public class Registry {
    /*
    ██████╗░██╗░░░░░░█████╗░░█████╗░██╗░░██╗░██████╗
    ██╔══██╗██║░░░░░██╔══██╗██╔══██╗██║░██╔╝██╔════╝
    ██████╦╝██║░░░░░██║░░██║██║░░╚═╝█████═╝░╚█████╗░
    ██╔══██╗██║░░░░░██║░░██║██║░░██╗██╔═██╗░░╚═══██╗
    ██████╦╝███████╗╚█████╔╝╚█████╔╝██║░╚██╗██████╔╝
    ╚═════╝░╚══════╝░╚════╝░░╚════╝░╚═╝░░╚═╝╚═════╝░
     */
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<Block> WATTIEZA_WOOD = BLOCKS.register("wattieza_wood", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WATTIEZA_PLANKS = BLOCKS.register("wattieza_planks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WATTIEZA_LOG = BLOCKS.register("wattieza_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WATTIEZA_LEAVES = BLOCKS.register("wattieza_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).noOcclusion().randomTicks()));

    /*
    ██╗████████╗███████╗███╗░░░███╗░██████╗
    ██║╚══██╔══╝██╔════╝████╗░████║██╔════╝
    ██║░░░██║░░░█████╗░░██╔████╔██║╚█████╗░
    ██║░░░██║░░░██╔══╝░░██║╚██╔╝██║░╚═══██╗
    ██║░░░██║░░░███████╗██║░╚═╝░██║██████╔╝
    ╚═╝░░░╚═╝░░░╚══════╝╚═╝░░░░░╚═╝╚═════╝░
     */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> WATTIEZA_WOOD_ITEM = ITEMS.register("wattieza_wood", () -> new BlockItem(WATTIEZA_WOOD.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WATTIEZA_PLANKS_ITEM = ITEMS.register("wattieza_planks", () -> new BlockItem(WATTIEZA_PLANKS.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WATTIEZA_LOG_ITEM = ITEMS.register("wattieza_log", () -> new BlockItem(WATTIEZA_LOG.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WATTIEZA_LEAVES_ITEM = ITEMS.register("wattieza_leaves", () -> new BlockItem(WATTIEZA_LEAVES.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
    }
}
