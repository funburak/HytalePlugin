package com.funburak.hytale.events;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.util.EventTitleUtil;

public class EventHandler {

    /**
     * Displays a welcome title when a player joins the server.
     *
     * @param event
     */
    public static void onPlayerReady(PlayerReadyEvent event) {
        PlayerRef playerRef = event.getPlayerRef().getStore().getComponent(event.getPlayerRef(), PlayerRef.getComponentType());
        assert playerRef != null;
        EventTitleUtil.showEventTitleToPlayer(playerRef,
                Message.raw(event.getPlayer().getDisplayName()),
                Message.raw("Welcome"),
                false);
    }
}
