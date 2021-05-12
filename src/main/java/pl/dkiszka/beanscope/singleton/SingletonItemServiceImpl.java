package pl.dkiszka.beanscope.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Dominik Kiszka {dominikk19}
 * @project bean-scope
 * @date 12.05.2021
 */
@Service
@Scope("singleton")
class SingletonItemServiceImpl implements SingletonItemService {
    @Override
    public String getMessage() {
        return "ItemServiceSingleton";
    }
}
