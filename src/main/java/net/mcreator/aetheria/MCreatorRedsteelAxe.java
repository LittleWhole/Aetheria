package net.mcreator.aetheria;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@Elementsaetheria.ModElement.Tag
public class MCreatorRedsteelAxe extends Elementsaetheria.ModElement {
	@ObjectHolder("aetheria:redsteelaxe")
	public static final Item block = null;

	public MCreatorRedsteelAxe(Elementsaetheria instance) {
		super(instance, 118);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1750;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 4.5f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 28;
			}

			public Ingredient getRepairMaterial() {
				return null;
			}
		}, 1, -3F, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("redsteelaxe"));
	}
}
