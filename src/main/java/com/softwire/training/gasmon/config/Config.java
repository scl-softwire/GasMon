package com.softwire.training.gasmon.config;

import com.typesafe.config.ConfigFactory;

public class Config {

    public final ExampleConfig example;

    public Config() {
        com.typesafe.config.Config config = ConfigFactory.load();
        example = ExampleConfig.fromRawConfig(config.getConfig("example"));
    }

    public static class ExampleConfig {

        public final String greeting;

        private ExampleConfig(String greeting) {
            this.greeting = greeting;
        }

        private static ExampleConfig fromRawConfig(com.typesafe.config.Config config) {
            return new ExampleConfig(config.getString("greeting"));
        }
    }

}
