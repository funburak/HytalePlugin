package com.funburak.hytale.events;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.event.events.player.PlayerConnectEvent;
import com.hypixel.hytale.server.core.util.EventTitleUtil;

public class EventHandler {

    /**
     * Displays a welcome title when a player joins the server.
     *
     * @param event
     */
    public static void onPlayerConnect(PlayerConnectEvent event) {
        EventTitleUtil.showEventTitleToPlayer(event.getPlayerRef(),
                Message.raw(event.getPlayerRef().getUsername()),
                Message.raw("Welcome"),
                false);
    }
}
