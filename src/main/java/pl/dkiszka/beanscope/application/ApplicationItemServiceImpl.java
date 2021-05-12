package pl.dkiszka.beanscope.application;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

/**
 * @author Dominik Kiszka {dominikk19}
 * @project bean-scope
 * @date 12.05.2021
 */
@Service
@Scope(value = "application", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@ApplicationScope
class ApplicationItemServiceImpl implements ApplicationPrototypeItemService {
    @Override
    public String getMessage() {
        return "ItemService";
    }
}
