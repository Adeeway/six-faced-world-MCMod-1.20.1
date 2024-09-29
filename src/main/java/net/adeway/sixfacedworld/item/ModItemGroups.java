package net.adeway.sixfacedworld.item;

import net.adeway.sixfacedworld.SixFacedWorldMod;
import net.adeway.sixfacedworld.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SIX_FACE_WORLD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SixFacedWorldMod.MOD_ID, "death_adder_rat_skin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.six_faced_world_items"))
                    .icon(() -> new ItemStack(ModItems.DEATH_ADDER_RAT_SKIN)).entries((displayContext, entries) ->  {
                    entries.add(ModItems.DEATH_ADDER_RAT_SKIN);

                    }).build());

    public static final ItemGroup SIX_FACE_WORLD_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SixFacedWorldMod.MOD_ID, "death_adder_rat_skin_block"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.six_faced_world_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.DEATH_ADDER_RAT_SKIN_BLOCK)).entries((displayContext, entries) ->  {
                        entries.add(ModBlocks.DEATH_ADDER_RAT_SKIN_BLOCK);


                    }).build());




    public static void registerItemGroups(){
        SixFacedWorldMod.LOGGER.info("Registering Item Groups for " + SixFacedWorldMod.MOD_ID);
    }
}
