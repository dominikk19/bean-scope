package pl.dkiszka.beanscope.singleton;

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
class SingletonRestItemController {
    private final SingletonItemService itemService;

    @GetMapping("/singleton/rest")
    @ResponseBody
    String showServiceInfo() {
        log.info("SingletonRestItemController " + itemService.toString());
        return "ok";
    }
}
