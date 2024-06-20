package net.zffu.discovery.gui.type;

import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

/**
 * Types of GUI.
 * @since 0.0.1
 */
public enum GUIType {

    /**
     * The amounts of slots contained in the type.
     */
    private int slots;

    public int getSlots() {
        return this.slots;
    }

    /**
     * Creates an inventory based on the GUIType.
     * @param display
     * @return
     */
    public Inventory createInventory(String display) {
        if(this.slots != -1) return Bukkit.createInventory(null, this.slots, display);
        return Bukkit.createInventory(null, InventoryType.values()[this.ordinal()], display);
    }

}
