package home_work;

import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class Client {
    private String id;
    private int policy;
}
