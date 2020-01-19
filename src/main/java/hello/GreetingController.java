package hello;

import hello.Models.PWSData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import org.springframework.web.util.HtmlUtils;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class GreetingController {

    @Autowired
    private SimpMessagingTemplate template;

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

    @RequestMapping(value = "/data/report", method = GET, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public String greetingJsonGet(HttpEntity<String> httpEntity) {
        String json = httpEntity.getBody();
        // json contains the plain json string
        System.out.println("get");
        System.out.println(json);
        return json;
    }

    @RequestMapping(value = "/data/report", method = POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public void greetingJsonPost(PWSData pwsData) throws Exception {

        // json contains the plain json string
        System.out.println("post");
        System.out.println(pwsData);

        this.template.convertAndSend("/topic/greetings", pwsData);

        //fireGreeting();
    }

    public void fireGreeting() {
        System.out.println("Fire");
        this.template.convertAndSend("/topic/greetings", new Greeting("Fire"));
    }
}
