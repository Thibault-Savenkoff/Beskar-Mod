package lu.ts.beskarmod.item;

import lu.ts.beskarmod.BeskarMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BESKAR_INGOT = registerItem("beskar_ingot", new Item(new Item.Settings()));
    public static final Item RAW_BESKAR = registerItem("raw_beskar", new Item(new Item.Settings()));

    private static void addItemsToIngredientsItemGroup(FabricItemGroupEntries entries) {
        entries.add(BESKAR_INGOT);
        entries.add(RAW_BESKAR);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BeskarMod.MODID, name), item);
    }

    public static void  registerModItems() {
        BeskarMod.LOGGER.info("And also these items my dear!");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsItemGroup);
    }
}
