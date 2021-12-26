package com.cdpt.pokemon.util;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class TexturePackerTool {
	public static void main(String[] args) {
		TexturePacker.process(
				"res/Player/Green",
				"res/packed/Green",
				"textures");
	}
}
