package io.bdrillard.SparkJavaTest;

import io.bdrillard.SparkJavaTest.util.*;
import io.bdrillard.SparkJavaTest.index.*;
import static spark.Spark.*;

/**
 * Created by aleksander on 8/28/16.
 */
public class Server {
    public static void main(String[] args) {
        // staticFiles.location("/public");

        get(Path.Web.INDEX, IndexController.serveIndexPage);
    }
}
