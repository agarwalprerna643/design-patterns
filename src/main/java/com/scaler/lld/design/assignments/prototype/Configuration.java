package com.scaler.lld.design.assignments.prototype;

public class Configuration implements ClonableObject, ConfigurationPrototypeRegistry {
    private String themeColor;
    private Boolean autoSave;
    private String language;
    private Boolean darkMode;
    private Integer fontSize;
    private String fontFamily;
    private ConfigurationType type;

    public Configuration(){}

    public Configuration(String themeColor, Boolean autoSave, String language, Boolean darkMode, Integer fontSize, String fontFamily, ConfigurationType type) {
        this.themeColor = themeColor;
        this.autoSave = autoSave;
        this.language = language;
        this.darkMode = darkMode;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.type = type;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public Boolean getAutoSave() {
        return autoSave;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public ConfigurationType getType() {
        return type;
    }

    @Override
    public void addPrototype(Configuration user) {
        registry.put(user.type,user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return registry.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        Configuration prototype = registry.get(type);
        return new Configuration(prototype.themeColor, prototype.autoSave,prototype.language,prototype.darkMode,prototype.fontSize,prototype.fontFamily,prototype.type);
    }

    @Override
    public Object cloneObject() {
        return new Configuration(this.themeColor,this.autoSave,this.language,this.darkMode,this.fontSize,this.fontFamily,this.type);
    }
}