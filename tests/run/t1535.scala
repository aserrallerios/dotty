class ASTNode {
    lazy val x = 42
}

class BlockStmt extends ASTNode

class ClassDecl extends BlockStmt {
    lazy val y = true
}

object Test extends dotty.runtime.LegacyApp {
    val n = new ClassDecl ()
    println (n.x)
    println (n.y)
}
