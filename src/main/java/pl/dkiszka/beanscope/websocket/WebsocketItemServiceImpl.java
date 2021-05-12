package pl.dkiszka.beanscope.websocket;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

/**
 * @author Dominik Kiszka {dominikk19}
 * @project bean-scope
 * @date 12.05.2021
 */
@Service
@Scope(value = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
class WebsocketItemServiceImpl implements WebsocketPrototypeItemService {
    @Override
    public String getMessage() {
        return "ItemService";
    }
}
