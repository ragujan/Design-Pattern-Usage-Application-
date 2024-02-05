package com.rag.syzygy.design_patterns.interpreter;

public class ToggleOptionExpression implements CommandExpression {
    private String option;

    public ToggleOptionExpression(String Option) {
        this.option = Option;
    }

    @Override
    public void interpret(ExtraNoteContext context) {
        context.toggleTopping(option);
    }
}
