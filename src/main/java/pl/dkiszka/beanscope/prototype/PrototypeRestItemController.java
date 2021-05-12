package pl.dkiszka.beanscope.prototype;

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
class PrototypeRestItemController {
    private final PrototypeItemService itemService;

    @GetMapping("/prototype/rest")
    @ResponseBody
    String showServiceInfo() {
        log.info("PrototypeRestItemController " + itemService.toString());
        return "ok";
    }
}
