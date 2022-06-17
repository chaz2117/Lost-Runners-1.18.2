package net.chaz2117.lostrunners;

import net.chaz2117.lostrunners.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LostRunners implements ModInitializer {
	public static final String MOD_ID = "lostrunners";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
