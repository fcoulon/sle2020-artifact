package fr.inria.diverse.socket;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.DocumentFormattingParams;
import org.eclipse.lsp4j.FormattingOptions;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializedParams;
import org.eclipse.lsp4j.Location;
import org.eclipse.lsp4j.MessageActionItem;
import org.eclipse.lsp4j.MessageParams;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.PublishDiagnosticsParams;
import org.eclipse.lsp4j.ReferenceContext;
import org.eclipse.lsp4j.ReferenceParams;
import org.eclipse.lsp4j.RenameParams;
import org.eclipse.lsp4j.ShowMessageRequestParams;
import org.eclipse.lsp4j.TextDocumentIdentifier;
import org.eclipse.lsp4j.TextDocumentItem;
import org.eclipse.lsp4j.TextEdit;
import org.eclipse.lsp4j.WorkspaceEdit;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.xtext.ide.server.LanguageServerImpl;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;

import fr.inria.diverse.ide.LogoLSPModule;

public class LogoServerMain {
	
	public static void main(String[] args) {
		try {
			LanguageServerImpl server = new LogoLSPModule().createInjectorAndDoEMFRegistration().getInstance(LanguageServerImpl.class);
			
//			new LogoIdeSetup().createInjectorAndDoEMFRegistration();
//			ASMPackage rootPkg = ASMPackage.eINSTANCE;
//			ResourceSet rs = new ResourceSetImpl();
//			Resource res = rs.getResource(URI.createURI("/home/fcoulon/tree.logo"),true);
//			System.out.println(res.getContents().get(0));
//			
//			XtextResource xRes = (XtextResource) res;
//			Iterable<INode> it = xRes.getParseResult().getSyntaxErrors();
//			it.iterator().forEachRemaining(node -> {
//				System.out.println(node.getSyntaxErrorMessage());
//			});
			
			
			LanguageClient mockClient = new LanguageClient() {
				@Override
				public void telemetryEvent(Object object) {
				}

				@Override
				public void publishDiagnostics(PublishDiagnosticsParams diagnostics) {
					System.out.println("Diag !");
					synchronized (server) {
						server.notify();
					}
				}

				@Override
				public void showMessage(MessageParams messageParams) {
				}

				@Override
				public CompletableFuture<MessageActionItem> showMessageRequest(ShowMessageRequestParams requestParams) {
					return null;
				}

				@Override
				public void logMessage(MessageParams message) {
				}
			};

			server.connect(mockClient);

			InitializeParams initParam = new InitializeParams();
			server.initialize(initParam);
			server.initialized(new InitializedParams());
			
			DidOpenTextDocumentParams openParam = new DidOpenTextDocumentParams(
					new TextDocumentItem("/home/fcoulon/tree.logo", "logo", 1, "LogoProgram {\n" + 
							"	Proc Square(size) {\n" + 
							"		PenDown;\n" + 
							"		Repeat 4.0 {\n" + 
							"			Forward size;\n" + 
							"			Left 90.0\n" + 
							"		};\n" + 
							"		PenUp\n" + 
							"	};\n" + 
							"\n" + 
							"	Proc Tree(baseSize, depth, direction) {\n" + 
							"\n" + 
							"		Proc SubSquareSize(size, angle) {\n" + 
							"			Return size * Cos angle\n" + 
							"		};\n" + 
							"\n" + 
							"		Left 90.0;\n" + 
							"		Forward baseSize;\n" + 
							"		Right 45.0 - direction;\n" + 
							"		Square(SubSquareSize(baseSize, 45.0 + direction));\n" + 
							"		If depth > 0.0 {\n" + 
							"			Tree(SubSquareSize(baseSize, 45.0 + direction), depth - 1.0, 0.0)\n" + 
							"		};\n" + 
							"		Right 45.0 + direction;\n" + 
							"		Forward baseSize;\n" + 
							"		Right 45.0 - direction;\n" + 
							"		Back baseSize;\n" + 
							"		Square(SubSquareSize(baseSize, 45.0 - direction));\n" + 
							"		If depth > 0.0 {\n" + 
							"			Tree(SubSquareSize(baseSize, 45.0 - direction), depth - 1.0, 0.0)\n" + 
							"		};\n" + 
							"		Forward SubSquareSize(baseSize, 45.0 - direction);\n" + 
							"		Left 45.0 - direction;\n" + 
							"		Back baseSize;\n" + 
							"		Left 90.0;\n" + 
							"		Back baseSize;\n" + 
							"		Right 90.0\n" + 
							"	};\n" + 
							"\n" + 
							"	Square(150.0);\n" + 
							"	Tree(150.0, 8.0, 5.0)\n" + 
							"}\n" + 
							""));
			server.didOpen(openParam);
			
			synchronized (server) {
				server.wait();
			}


//			RenameParams param = new RenameParams(new TextDocumentIdentifier("/home/fcoulon/tree.logo"), new Position(1,9), "foobar");
//			CompletableFuture<WorkspaceEdit> reply = server.rename(param);
//			System.out.println(reply.get());
//			
//			ReferenceParams refParam = new ReferenceParams(new ReferenceContext());
//			refParam.setTextDocument(new TextDocumentIdentifier("/home/fcoulon/tree.logo"));
//			refParam.setPosition(new Position(1,9));
//			CompletableFuture<List<? extends Location>> replyRef = server.references(refParam);
//			System.out.println(replyRef.get());
			
//			DocumentFormattingParams formatParam = new DocumentFormattingParams(new TextDocumentIdentifier("/home/fcoulon/tree.logo"), new FormattingOptions());
//			CompletableFuture<List<? extends TextEdit>> replyFormat = server.formatting(formatParam);
//			System.out.println(replyFormat.get());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DONE");
	}

}
