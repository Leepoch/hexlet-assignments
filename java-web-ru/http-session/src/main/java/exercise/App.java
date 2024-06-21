package exercise;

import io.javalin.Javalin;
import java.util.List;
import java.util.Map;

public final class App {

    private static final List<Map<String, String>> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            if (ctx.queryParam("page") == null) {
                var result = USERS.subList(0, 5);
                ctx.json(result);
            } else {
                var pageCount = ctx.queryParamAsClass("page", Integer.class).get();
                var per = ctx.queryParamAsClass("per", Integer.class).get();
                var maxUsersCount = pageCount * per;
                var result = USERS.subList(maxUsersCount - per, maxUsersCount);
                ctx.json(result);
            }
        });
        // END

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
