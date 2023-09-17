package com.scaler.lld.design.assignments.singleton;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManagerImpl fileBasedConfigurationManagerInstance = new FileBasedConfigurationManagerImpl();
    private FileBasedConfigurationManagerImpl(){}

    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub
        if(!properties.containsKey(key)) return null;
        return properties.get(key).toString();
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stub
        if(!properties.containsKey(key)) return null;
        return convert(properties.get(key).toString(),type);
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        properties.put(key,value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        properties.put(key,value);
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        properties.remove(key);
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stub
        return fileBasedConfigurationManagerInstance;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        fileBasedConfigurationManagerInstance = new FileBasedConfigurationManagerImpl();
    }

}