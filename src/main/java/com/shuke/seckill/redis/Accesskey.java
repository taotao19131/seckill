package com.shuke.seckill.redis;

public class Accesskey extends BasePrefix {
    private Accesskey(int expireSeconds ,String prefix) {
        super(expireSeconds,prefix);
    }

    public static Accesskey withExpire(int expireSeconds) {
        return new Accesskey(expireSeconds, "access");
    }
}
