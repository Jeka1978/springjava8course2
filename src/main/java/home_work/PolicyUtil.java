package home_work;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * @author Evgeny Borisov
 */
public class PolicyUtil {
    public static Map<String, List<Integer>> policiesByClient(List<Client> clients) {


        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, List<Integer>> map = clients.stream()
                .collect(groupingBy(Client::getId,
                        Collectors.mapping(Client::getPolicy, toList())));

//        multimap.putAll(map)
        return map;
    }


    public static void main(String[] args) {

    }
}
