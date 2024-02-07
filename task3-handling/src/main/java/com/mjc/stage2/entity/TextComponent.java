package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    //private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        StringBuilder sb = new StringBuilder();
        for (AbstractTextComponent item: componentList) {
            sb.append(item);
        }
        return sb.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        this.componentList.add(textComponent);
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        this.componentList.remove(textComponent);
    }

    @Override
    public int getSize() {
        return this.componentList.size();
    }
// Write your code here!
}