package cc.hchier;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author hchier
 * @date 2025/5/8 17:28
 */
@Mojo(name = "sayThankYou", defaultPhase = LifecyclePhase.CLEAN)
public class SayThankYou extends AbstractMojo {

    @Parameter(property = "name1", defaultValue = "Zelensky")
    private String name1;

    @Parameter(property = "name2", defaultValue = "Trump")
    private String name2;

    public void execute() {
        String str =
                "you don't even say thank you, " + name1 + ", you have no cards to play.\n" +
                        "thank you! " + name2;
        getLog().info(str);
    }
}
