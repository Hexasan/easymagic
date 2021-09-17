package com.fuzs.easymagic.inventory.container;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MovableSlot extends Slot implements IMovableSlot {

    private boolean visible = false;

    public MovableSlot(IInventory inventoryIn, int index) {

        super(inventoryIn, index, 0, 0);
    }

    @Override
    public Slot getSlot() {

        return this;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public final boolean isEnabled() {

        return this.visible;
    }

    @Override
    public void setVisible(boolean visible) {

        this.visible = visible;
    }

}
