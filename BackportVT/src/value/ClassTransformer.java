package value;

import org.objectweb.asm.tree.ClassNode;

/**
 * Created by Fabien GIACHERIO on 15/02/17.
 */
public class ClassTransformer {
    protected ClassTransformer ct;
    public ClassTransformer(ClassTransformer ct) {
        this.ct = ct;
    }
    public void transform(ClassNode cn) {
        if (ct != null) {
            ct.transform(cn);
        }
    }
}