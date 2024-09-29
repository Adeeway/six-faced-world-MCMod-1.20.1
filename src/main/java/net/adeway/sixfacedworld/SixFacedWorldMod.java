package net.adeway.sixfacedworld;

import net.adeway.sixfacedworld.block.ModBlocks;
import net.adeway.sixfacedworld.item.ModItemGroups;
import net.adeway.sixfacedworld.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SixFacedWorldMod implements ModInitializer {
	public static final String MOD_ID = "sixfacedworld";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}