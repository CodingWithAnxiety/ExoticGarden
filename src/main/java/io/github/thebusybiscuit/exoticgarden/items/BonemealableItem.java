package io.github.thebusybiscuit.exoticgarden.items;

import io.github.thebusybiscuit.exoticgarden.ExoticGarden;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;

import org.bukkit.inventory.ItemStack;

/**
 * A {@link BonemealableItem} is a special kind of {@link SlimefunItem} that can be disabled
 * from being bonemealed.
 * 
 * @author TheBusyBiscuit
 *
 */
public class BonemealableItem extends SlimefunItem {

    private final boolean disableBonemealing;

    public BonemealableItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
        
        Config cfg = ExoticGarden.getInstance().getCfg();
        this.disableBonemealing = cfg.getBoolean("options.disable-bonemeal");
    }

    /**
     * This returns whether this {@link BonemealableItem} can be bonemealed or not.
     * 
     * @return Whether this {@link BonemealableItem} can be bonemealed
     */
    public boolean isBonemealDisabled() {
        return disableBonemealing;
    }

}
