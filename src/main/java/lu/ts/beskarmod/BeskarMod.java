package lu.ts.beskarmod;

import lu.ts.beskarmod.block.ModBlocks;
import lu.ts.beskarmod.item.ModItemGroups;
import lu.ts.beskarmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeskarMod implements ModInitializer {
	public static final String MODID = "beskarmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Here to serve you, Mandalorian!");
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}