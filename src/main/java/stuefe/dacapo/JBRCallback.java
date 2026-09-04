package stuefe.dacapo;

import org.dacapo.harness.Callback;
import org.dacapo.harness.CommandLineArgs;

import java.time.ZonedDateTime;

public class JBRCallback extends Callback {

    public JBRCallback(CommandLineArgs args) {
        super(args);
    }

    /* Immediately prior to start of the benchmark */
    @Override
    public void start(String benchmark) {
        ZonedDateTime now = ZonedDateTime.now();
        if (isWarmup()) {
            System.out.printf(">>> Warmup %d started at %s.\n", this.iterations + 1, now.toString());
        } else {
            System.out.printf(">>> Final started at %s.\n", now.toString());
        }
        super.start(benchmark);
    }

}
