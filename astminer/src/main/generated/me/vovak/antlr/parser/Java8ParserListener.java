// Generated from Java8Parser.g4 by ANTLR 4.7.1
package me.vovak.antlr.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Java8Parser}.
 */
public interface Java8ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(Java8Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(Java8Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(Java8Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(Java8Parser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(Java8Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(Java8Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(Java8Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(Java8Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(Java8Parser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(Java8Parser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(Java8Parser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(Java8Parser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(Java8Parser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(Java8Parser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Java8Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Java8Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(Java8Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(Java8Parser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(Java8Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(Java8Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(Java8Parser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(Java8Parser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(Java8Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(Java8Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(Java8Parser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(Java8Parser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(Java8Parser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(Java8Parser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(Java8Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(Java8Parser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(Java8Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(Java8Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(Java8Parser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(Java8Parser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(Java8Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(Java8Parser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(Java8Parser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Java8Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(Java8Parser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(Java8Parser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(Java8Parser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(Java8Parser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(Java8Parser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(Java8Parser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(Java8Parser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(Java8Parser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(Java8Parser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(Java8Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(Java8Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(Java8Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(Java8Parser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(Java8Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(Java8Parser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(Java8Parser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(Java8Parser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(Java8Parser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(Java8Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(Java8Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(Java8Parser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(Java8Parser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(Java8Parser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(Java8Parser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(Java8Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(Java8Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(Java8Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(Java8Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(Java8Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(Java8Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(Java8Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(Java8Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(Java8Parser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(Java8Parser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(Java8Parser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(Java8Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(Java8Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(Java8Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(Java8Parser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(Java8Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(Java8Parser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(Java8Parser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(Java8Parser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(Java8Parser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(Java8Parser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Java8Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Java8Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(Java8Parser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(Java8Parser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(Java8Parser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(Java8Parser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(Java8Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(Java8Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(Java8Parser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(Java8Parser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(Java8Parser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(Java8Parser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(Java8Parser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(Java8Parser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(Java8Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(Java8Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(Java8Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(Java8Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(Java8Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(Java8Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(Java8Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(Java8Parser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(Java8Parser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(Java8Parser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(Java8Parser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(Java8Parser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(Java8Parser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(Java8Parser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(Java8Parser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(Java8Parser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(Java8Parser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Java8Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Java8Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(Java8Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(Java8Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(Java8Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(Java8Parser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(Java8Parser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Java8Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Java8Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(Java8Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(Java8Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(Java8Parser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(Java8Parser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(Java8Parser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(Java8Parser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(Java8Parser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(Java8Parser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(Java8Parser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(Java8Parser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(Java8Parser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(Java8Parser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(Java8Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(Java8Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(Java8Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(Java8Parser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(Java8Parser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(Java8Parser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(Java8Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(Java8Parser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(Java8Parser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(Java8Parser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(Java8Parser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(Java8Parser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(Java8Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(Java8Parser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(Java8Parser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(Java8Parser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Java8Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Java8Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(Java8Parser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(Java8Parser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(Java8Parser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(Java8Parser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(Java8Parser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(Java8Parser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Java8Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Java8Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(Java8Parser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(Java8Parser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(Java8Parser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(Java8Parser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(Java8Parser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(Java8Parser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(Java8Parser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(Java8Parser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(Java8Parser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(Java8Parser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(Java8Parser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(Java8Parser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(Java8Parser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(Java8Parser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(Java8Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(Java8Parser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(Java8Parser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(Java8Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(Java8Parser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(Java8Parser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(Java8Parser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(Java8Parser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(Java8Parser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(Java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(Java8Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(Java8Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(Java8Parser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(Java8Parser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(Java8Parser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(Java8Parser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(Java8Parser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Java8Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(Java8Parser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Java8Parser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(Java8Parser.ArgumentsContext ctx);
}