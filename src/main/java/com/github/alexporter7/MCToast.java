package com.github.alexporter7;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCToast implements ModInitializer {
	public static final String MOD_ID = "mctoast";
	public static final String MOD_NAME = "MCToast";
	public static final String MOD_VERSION = "0.1.0";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info(String.format("[%s] with mod ID [%s] version [%s] has initialized",
				MOD_NAME, MOD_ID, MOD_VERSION));
	}
}