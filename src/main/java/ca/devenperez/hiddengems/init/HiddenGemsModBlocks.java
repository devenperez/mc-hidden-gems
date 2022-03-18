
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ca.devenperez.hiddengems.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

import ca.devenperez.hiddengems.block.MoonstoneOreBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HiddenGemsModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block MOONSTONE_ORE = register(new MoonstoneOreBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
