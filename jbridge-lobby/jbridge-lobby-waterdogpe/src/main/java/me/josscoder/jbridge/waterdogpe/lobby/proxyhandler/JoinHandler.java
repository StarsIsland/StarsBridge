package me.josscoder.jbridge.waterdogpe.lobby.proxyhandler;

import dev.waterdog.waterdogpe.ProxyServer;
import dev.waterdog.waterdogpe.network.connection.handler.IJoinHandler;
import dev.waterdog.waterdogpe.network.serverinfo.ServerInfo;
import dev.waterdog.waterdogpe.player.ProxiedPlayer;
import me.josscoder.jbridge.waterdogpe.lobby.JBridgeLobby;

public class JoinHandler implements IJoinHandler {
    @Override
    public ServerInfo determineServer(ProxiedPlayer player) {
        String sortedLobbyService = JBridgeLobby.getInstance().getSortedLobbyServiceShortId();
        return ProxyServer.getInstance().getServerInfo(sortedLobbyService);
    }
}
