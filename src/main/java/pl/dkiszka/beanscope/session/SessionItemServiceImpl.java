package pl.dkiszka.beanscope.session;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

/**
 * @author Dominik Kiszka {dominikk19}
 * @project bean-scope
 * @date 12.05.2021
 */
@Service
@Scope(scopeName = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@SessionScope
class SessionItemServiceImpl implements SessionItemService {
    @Override
    public String getMessage() {
        return "ItemService";
    }
}
