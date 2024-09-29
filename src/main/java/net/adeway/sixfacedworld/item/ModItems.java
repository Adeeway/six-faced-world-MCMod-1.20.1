package net.adeway.sixfacedworld.item;

import net.adeway.sixfacedworld.SixFacedWorldMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DEATH_ADDER_RAT_SKIN = registerItem("death_adder_rat_skin", new Item(new FabricItemSettings()));

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(DEATH_ADDER_RAT_SKIN);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SixFacedWorldMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SixFacedWorldMod.LOGGER.info("Registering Mod Items for " + SixFacedWorldMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
