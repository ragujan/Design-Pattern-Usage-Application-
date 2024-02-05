package com.rag.syzygy.design_patterns.interpreter;

public class RemoveOptionExpression implements CommandExpression {
    private String option;

    public RemoveOptionExpression(String Option) {
        this.option = Option;
    }

    @Override
    public void interpret(ExtraNoteContext context) {
        context.removeTopping(option);
    }
}
