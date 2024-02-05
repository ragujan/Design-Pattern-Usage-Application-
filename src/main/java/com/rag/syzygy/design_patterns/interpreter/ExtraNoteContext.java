package com.rag.syzygy.design_patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

public class ExtraNoteContext {

	private Map<String, Boolean> customizationOptions;

	public ExtraNoteContext() {
		this.customizationOptions = new HashMap<>();
	}

	public void addTopping(String option) {
		customizationOptions.put(option, true);
	}

	public void removeTopping(String topping) {
		customizationOptions.put(topping, false);
	}

	public void toggleTopping(String topping) {
		if (customizationOptions.get(topping) != null) {
			if (customizationOptions.get(topping)) {
				customizationOptions.put(topping, false);
			} else {
				customizationOptions.put(topping, true);
			}

		} else {
			customizationOptions.put(topping, true);
		}
	}

	public Map<String, Boolean> getCustomizationOptions() {
		return customizationOptions;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		int index = 0;
		int trueCount = 0;
		for (Map.Entry<String, Boolean> entry : customizationOptions.entrySet()) {
			String key = entry.getKey();
			Boolean value = entry.getValue();
			if (value) {
				trueCount++;
			}

		}

		for (Map.Entry<String, Boolean> entry : customizationOptions.entrySet()) {
			String key = entry.getKey();
			Boolean value = entry.getValue();
			if (value) {
				builder.append(key.toLowerCase().replace("_", " "));
				if (index < trueCount-1) {
					builder.append(" and ");
					index++;
				}
			}

		}
		return builder.toString();
	}
}
