package com.wang.starter.rpc.common;

import java.util.UUID;

public class RequestId {

    public static String next() {
        return UUID.randomUUID().toString();
    }

}
