package helpers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.libs.Json;
import play.mvc.Http.Request;

public class ControllerHelper {
	public static JsonNode errorJson(Integer code, String message, JsonNode errors) {
		ObjectNode node = Json.newObject();
		node.put("code", code);
		node.put("message", message);
		node.putPOJO("errors", errors);
		return node;
	}
	
	public static boolean acceptsJson(Request request) {
		return request.accepts("application/json");
	}
}