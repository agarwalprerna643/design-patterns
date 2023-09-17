package com.scaler.lld.design.assignments.builder;

@WithBuilder
public class DatabaseConfigurationBuilder {
    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    public DatabaseConfigurationBuilder(String databaseUrl, String username, String password, int maxConnections, boolean enableCache, boolean isReadOnly) {
        this.databaseUrl = databaseUrl;
        this.username = username;
        this.password = password;
        this.maxConnections = maxConnections;
        this.enableCache = enableCache;
        this.isReadOnly = isReadOnly;
    }
    public DatabaseConfigurationBuilder(){}
    public static class builder{

        private static DatabaseConfigurationBuilder dbconfigbuilder = new DatabaseConfigurationBuilder();

        public builder setDatabaseUrl(String url) {
            dbconfigbuilder.databaseUrl = url;
            return this;
        }

        public builder setUsername(String _username) {
            dbconfigbuilder.username = _username;
            return this;
        }

        public builder getPassword(String _password) {
            dbconfigbuilder.password = _password;
            return this;
        }

        public builder setMaxConnections(int _maxConnections) {
            dbconfigbuilder.maxConnections =  _maxConnections;
            return this;
        }

        public builder enableCache() {
            dbconfigbuilder.enableCache = true;
            return this;
        }

        public builder makeReadOnly() {
            dbconfigbuilder.isReadOnly = true;
            return this;
        }

        public DatabaseConfigurationBuilder build(){

            return new DatabaseConfigurationBuilder(dbconfigbuilder.databaseUrl
                    , dbconfigbuilder.username, dbconfigbuilder.password
                    , dbconfigbuilder.maxConnections, dbconfigbuilder.enableCache, dbconfigbuilder.isReadOnly);
        }
    }
}