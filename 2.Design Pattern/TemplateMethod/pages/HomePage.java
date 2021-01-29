package TemplateMethod.pages;

import TemplateMethod.PageTemplate;

public class HomePage extends PageTemplate {
    @Override
    protected void showBody() {
        System.out.println("Content of homepage");
    }
}
