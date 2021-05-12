package pl.dkiszka.beanscope.session;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dominik Kiszka {dominikk19}
 * @project bean-scope
 * @date 12.05.2021
 */
@RestController
@RequiredArgsConstructor
@Slf4j
class SessionRestItemController {
    private final SessionItemService itemService;

    @GetMapping("/session/rest")
    @ResponseBody
    String showServiceInfo() {
        log.info("SessionRestItemController " + itemService.toString());
        return "ok";
    }
}
