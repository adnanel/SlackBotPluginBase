package slackbot.plugins

import org.json.JSONObject
import slackapi.SlackContext
import slackapi.types.MessageListener
import java.util.function.Consumer


// config is passed by string and not by JSONObject because it allows the plugin writer
// to use another library (or even version) to use for JSON parsing
// Otherwise we'd all have to use the EXACT same library+version
public interface SlackBotPlugin : MessageListener {
    val MinTickTimer : Long
    fun Tick(logger : Consumer<String>)
    fun Initialize( configJson : String )
}

