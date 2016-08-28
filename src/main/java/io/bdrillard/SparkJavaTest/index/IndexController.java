package io.bdrillard.SparkJavaTest.index;

import io.bdrillard.SparkJavaTest.util.Path;
import spark.*;
import java.util.HashMap;
import java.util.Map;
import static io.bdrillard.SparkJavaTest.util.ViewUtil.*;

/**
 * Created by aleksander on 8/28/16.
 */
public class IndexController {
    public static Route serveIndexPage = (Request request, Response response) -> {
        Map<String, Object> params = new HashMap<>();
        params.put("title", "Welcome!");

        return render(request, params, Path.Template.INDEX);
    };
}