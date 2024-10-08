package net.adeway.sixfacedworld.block;

import net.adeway.sixfacedworld.SixFacedWorldMod;
import net.adeway.sixfacedworld.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block DEATH_ADDER_RAT_SKIN_BLOCK= registerBlock("death_adder_rat_skin_block",
             new Block(FabricBlockSettings.copyOf(Blocks.SOUL_SOIL)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SixFacedWorldMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SixFacedWorldMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }



    public static void registerModBlocks(){


        SixFacedWorldMod.LOGGER.info("Registering ModBlocks for " + SixFacedWorldMod.MOD_ID);
    }
}
