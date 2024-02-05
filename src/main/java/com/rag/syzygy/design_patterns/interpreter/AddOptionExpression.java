package com.rag.syzygy.design_patterns.interpreter;

public class AddOptionExpression implements CommandExpression {
    private String option;

    public AddOptionExpression(String Option) {
        this.option = Option;
    }

    @Override
    public void interpret(ExtraNoteContext context) {
        context.addTopping(option);
    }
}
