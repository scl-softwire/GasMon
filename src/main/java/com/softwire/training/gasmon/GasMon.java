package com.softwire.training.gasmon;

import com.softwire.training.gasmon.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GasMon {

    private static final Logger LOG = LoggerFactory.getLogger(GasMon.class);

    public static void main(String[] args) {
        LOG.info("Reading config file...");
        Config config = new Config();

        LOG.info("Greeting my user!");
        System.out.println(config.example.greeting);
    }

}
