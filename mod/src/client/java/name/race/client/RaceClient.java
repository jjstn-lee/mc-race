package name.race.client;

import net.fabricmc.api.ClientModInitializer;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;

public class RaceClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		HttpClient httpClient = HttpClient.newHttpClient();

		httpClient.newWebSocketBuilder()
				.buildAsync(URI.create("ws://localhost:8080/ws"), new WebSocket.Listener() {});
	}
}