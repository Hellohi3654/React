package com.volmit.react.api;

import com.volmit.react.Info;
import com.volmit.react.React;
import com.volmit.react.util.Ex;

public enum SampledType {
    ENTITY_TIME_LOCK(Info.SAMPLER_ENTITY_TIME_LOCK),
    TILE_TIME_LOCK(Info.SAMPLER_TILE_TIME_LOCK),
    ENTITY_TIME(Info.SAMPLER_ENTITY_TIME),
    REACT_TIME(Info.SAMPLER_REACT_TIME),
    REACT_TASK_TIME(Info.SAMPLER_REACT_TASK_TIME),
    TILE_TIME(Info.SAMPLER_TILE_TIME),
    ENTITY_DROPTICK(Info.SAMPLER_ENTITY_DROPTICK),
    TILE_DROPTICK(Info.SAMPLER_TILE_DROPTICK),
    REDSTONE_TICK_USAGE(Info.SAMPLER_REDSTONE_TICK_USAGE),
    REDSTONE_TICK(Info.SAMPLER_REDSTONE_TICK),
    REDSTONE_SECOND(Info.SAMPLER_REDSTONE_SECOND),
    REDSTONE_TIME(Info.SAMPLER_REDSTONE_TIME),
    PHYSICS_TIME(Info.SAMPLER_PHYSICS_TIME),
    HOPPER_TICK_USAGE(Info.SAMPLER_HOPPER_TICK_USAGE),
    HOPPER_TICK(Info.SAMPLER_HOPPER_TICK),
    HOPPER_SECOND(Info.SAMPLER_HOPPER_SECOND),
    HOPPER_TIME(Info.SAMPLER_HOPPER_TIME),
    FLUID_TICK_USAGE(Info.SAMPLER_FLUID_TICK_USAGE),
    FLUID_TICK(Info.SAMPLER_FLUID_TICK),
    FLUID_SECOND(Info.SAMPLER_FLUID_SECOND),
    FLUID_TIME(Info.SAMPLER_FLUID_TIME),
    TPS(Info.SAMPLER_TPS),
    TICK(Info.SAMPLER_TICK),
    CPU(Info.SAMPLER_CPU),
    PLAYERCOUNT(Info.SAMPLER_PLAYERCOUNT),
    TIU(Info.SAMPLER_TIU),
    MEM(Info.SAMPLER_MEM),
    FREEMEM(Info.SAMPLER_FREEMEM),
    MEMTOTALS(Info.SAMPLER_MEMTOTALS),
    MAXMEM(Info.SAMPLER_MAXMEM),
    ALLOCMEM(Info.SAMPLER_ALLOCMEM),
    MAHS(Info.SAMPLER_MAHS),
    CHK_TIME(Info.SAMPLER_CHK_TIME),
    EXPLOSION_TIME(Info.SAMPLER_EXPLOSION_TIME),
    GROWTH_TIME(Info.SAMPLER_GROWTH_TIME),
    CHK(Info.SAMPLER_CHK),
    CHKS(Info.SAMPLER_CHKS),
    ENT(Info.SAMPLER_ENT),
    ENTLIV(Info.SAMPLER_ENTLIV),
    ENTDROP(Info.SAMPLER_ENTDROP),
    ENTTILE(Info.SAMPLER_ENTTILE);

    private String node;

    SampledType(String s) {
        try {
            node = s;
        } catch (Throwable e) {
            Ex.t(e);
        }
    }

    public ISampler get() {
        return React.instance.sampleController.getSampler(toString());
    }

    @Override
    public String toString() {
        return node;
    }

    public String getNode() {
        return node;
    }
}
