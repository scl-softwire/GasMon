package com.softwire.training.gasmon;

import com.softwire.training.gasmon.config.Config;

public class GasMon {

    public static void main(String[] args) {
        Config config = new Config();
        System.out.println(config.example.greeting);
    }

}
