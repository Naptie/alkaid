package com.alkaidmc.alkaid.bukkit.extra.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.atomic.AtomicLong;

@SuppressWarnings("unused")
public class TickEvent extends Event {
    static final HandlerList HANDLERS_LIST = new HandlerList();
    static AtomicLong tick = new AtomicLong(0);

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS_LIST;
    }

    public long getTick() {
        return TickEvent.tick.get();
    }

    public void setTick(long tick) {
        TickEvent.tick.set(tick);
    }
}
