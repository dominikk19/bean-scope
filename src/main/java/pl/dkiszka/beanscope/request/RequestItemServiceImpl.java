package pl.dkiszka.beanscope.request;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author Dominik Kiszka {dominikk19}
 * @project bean-scope
 * @date 12.05.2021
 */
@Component
@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@RequestScope
class RequestItemServiceImpl implements RequestItemService {
    @Override
    public String getMessage() {
        return "ItemService";
    }
}
