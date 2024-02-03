package com.rag.syzygy.views.customization_options;

import com.rag.syzygy.domains.customized_food_domains.CustomizedOptions;
import com.rag.syzygy.views.CustomizationOptionValueChangedListener;

import javax.swing.*;

public class CustomizationOptionPanel extends JPanel {

	CustomizationOptionValueChangedListener valueChanged;

	public CustomizationOptionValueChangedListener getValueChanged() {
		return valueChanged;
	}

	protected CustomizedOptions customizationOptions;

	public void setValueChanged(CustomizationOptionValueChangedListener valueChanged) {
		this.valueChanged = valueChanged;
	}
}
