package net.chaz2117.lostrunners.item;

import net.chaz2117.lostrunners.LostRunners;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUNNERS_BOOK = registerItem("runners_book",
            new Item(new FabricItemSettings().maxCount(1).group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LostRunners.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LostRunners.LOGGER.info("Registering Mod Items for Lost " + LostRunners.MOD_ID);
    }
}
