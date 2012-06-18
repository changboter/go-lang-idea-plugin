package ro.redeul.google.go.lang.psi.impl.expressions.literals;

import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import ro.redeul.google.go.lang.psi.expressions.literals.GoLiteralBool;
import ro.redeul.google.go.lang.psi.impl.GoPsiElementBase;
import ro.redeul.google.go.lang.psi.visitors.GoElementVisitor;

public class GoLiteralBoolImpl extends GoPsiElementBase
    implements GoLiteralBool {

    public GoLiteralBoolImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public Type getType() {
        return Type.Bool;
    }

    @Override
    public Boolean getValue() {
        return null;
    }

    @Override
    public void accept(GoElementVisitor visitor) {
        visitor.visitLiteralBool(this);
    }
}