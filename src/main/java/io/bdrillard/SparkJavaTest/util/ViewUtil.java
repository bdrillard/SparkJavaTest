package io.bdrillard.SparkJavaTest.util;

import java.util.Map;

import spark.*;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

/**
 * Created by aleksander on 8/28/16.
 */
public class ViewUtil {
    private static final MustacheTemplateEngine engine = new MustacheTemplateEngine();

    public static String render(Request request, Map<String, Object> model, String templatePath) {

        return engine.render(new ModelAndView(model, templatePath));
    }
}
