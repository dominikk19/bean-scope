package pl.dkiszka.beanscope.request;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Dominik Kiszka {dominikk19}
 * @project bean-scope
 * @date 12.05.2021
 */
@Controller
@RequiredArgsConstructor
@Slf4j
class RequestItemController {
    private final RequestItemService itemService;

    @GetMapping("/request/mvc")
    @ResponseBody
    String showServiceInfo() {
        log.info("RequestItemController " + itemService.toString());
        return "ok";
    }
}
