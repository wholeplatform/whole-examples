/**
 * Copyright 2004-2016 Riccardo Solmi. All rights reserved.
 * This file is part of the Whole Platform.
 *
 * The Whole Platform is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Whole Platform is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the Whole Platform. If not, see <http://www.gnu.org/licenses/>.
 */
package org.whole.crossexamples.lwc16.minijava.ui.editparts;

import org.eclipse.gef.EditPart;
import org.whole.crossexamples.lwc16.minijava.model.*;
import org.whole.crossexamples.lwc16.minijava.model.Boolean;
import org.whole.crossexamples.lwc16.minijava.visitors.MiniJavaIdentityDefaultVisitor;
import org.whole.lang.model.adapters.IEntityAdapter;
import org.whole.lang.ui.editparts.CommaSeparatedCompositeFlowPart;
import org.whole.lang.ui.editparts.CompositeColumnPart;
import org.whole.lang.ui.editparts.IEditPartFactory;
import org.whole.lang.ui.editparts.KeywordDataEntityPart;
import org.whole.lang.ui.editparts.ContentDataEntityPart;
import org.whole.lang.ui.editparts.ContentTextualEntityPart;
import org.whole.lang.ui.editparts.PlaceHolderPart;
import org.whole.lang.ui.notations.text.editparts.DefaultTextualPartFactory;

/** 
 * @author Enrico Persiani
 */
public class MiniJavaTextualPartFactoryVisitor extends MiniJavaIdentityDefaultVisitor implements IEditPartFactory {
	protected EditPart part, context;

	public EditPart createEditPart(EditPart context, Object modelEntity) {
		this.context = context;
		((IMiniJavaEntity) modelEntity).accept(this);
		return part;
	}

	public boolean visitAdapter(IEntityAdapter entity) {
		part = new PlaceHolderPart();
		return super.visitAdapter(entity);
	}

	public void visit(IMiniJavaEntity entity) {
		part = DefaultTextualPartFactory.instance().createEditPart(context, entity);
	}

	@Override
	public void visit(Program entity) {
		part = new ProgramPart();
	}

	@Override
	public void visit(MainClass entity) {
		part = new MainClassPart();
	}

	public void visit(ClassDeclaration entity) {
		part = new ClassDeclarationPart();
	}

	public void visit(VariableDeclaration entity) {
		part = new VariableDeclarationPart();
	}

	public void visit(MethodDeclaration entity) {
		part = new MethodDeclarationPart();
	}

	public void visit(MethodInvocation entity) {
		part = new MethodInvocationPart();
	}

	public void visit(VariableAssignment entity) {
		part = new VariableAssignmentPart();
	}

	public void visit(IfStatement entity) {
		part = new IfStatementPart();
	}

	public void visit(PrintlnStatement entity) {
		part = new PrintlnStatementPart();
	}

	public void visit(Identifier entity) {
		part = new ContentTextualEntityPart();
	}

	public void visit(IntArray entity) {
		part = new IntArrayPart();
	}

	public void visit(ArrayElementAssignment entity) {
		part = new ArrayElementAssignmentPart();
	}

	public void visit(ArrayLength entity) {
		part = new ArrayLengthPart();
	}
	
	public void visit(ArrayCreation entity) {
		part = new ArrayCreationPart();
	}
	
	public void visit(ArrayAccess entity) {
		part = new ArrayAccessPart();
	}

	public void visit(WhileStatement entity) {
		part = new WhileStatementPart();
	}

	public void visit(ThisExpression entity) {
		part = new KeywordPart("this");
	}

	public void visit(ClassInstanceCreation entity) {
		part = new ClassInstanceCreationPart();
	}

	public void visit(ParenthesizedExpression entity) {
		part = new ParenthesizedExpressionPart();
	}

	public void visit(NotExpression entity) {
		part = new NotExpressionPart();
	}

	public void visit(InfixExpression entity) {
		part = new InfixExpressionPart();
	}

	public void visit(InfixOperator entity) {
		part = new ContentDataEntityPart();
	}

	public void visit(Boolean entity) {
		part = new KeywordPart("boolean");
	}

	public void visit(BooleanLiteral entity) {
		part = new KeywordDataEntityPart();
	}

	public void visit(Int entity) {
		part = new KeywordPart("int");
	}

	public void visit(IntLiteral entity) {
		part = new ContentDataEntityPart();
	}

	public void visit(ClassDeclarations entity) {
		part = new CompositeColumnPart();
	}
	
	public void visit(VariableDeclarations entity) {
		part = new CompositeColumnPart();
	}

	public void visit(MethodDeclarations entity) {
		part = new CompositeColumnPart();
	}

	public void visit(Arguments entity) {
		part = new CommaSeparatedCompositeFlowPart();
	}
	
	public void visit(Block entity) {
		part = new CompositeColumnPart();
	}
	
	public void visit(Statements entity) {
		part = new CompositeColumnPart();
	}
}
