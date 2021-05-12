package pl.dkiszka.beanscope.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Dominik Kiszka {dominikk19}
 * @project bean-scope
 * @date 12.05.2021
 */
@Service
@Scope("prototype")
class PrototypeItemServiceImpl implements PrototypeItemService {
    @Override
    public String getMessage() {
        return "ItemService";
    }
}
