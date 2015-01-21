package geftutorial;

import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import gefmvc.*;


public class View {
	
	public static final String ID = "GEFTutorial.view";
	
	
	// Use a standard Viewer for the Draw2d canvas
		private ScrollingGraphicalViewer viewer = new ScrollingGraphicalViewer();
	 
		// Use standard RootEditPart as holder for all other edit parts
		private RootEditPart rootEditPart = new FreeformGraphicalRootEditPart();
	 
		// Custom made EditPartFactory, will automatically be called to create edit
		// parts for model elements
		private EditPartFactory editPartFactory = new GraphicalPartFactory();
		// The model
		private Model model;
	 
		/**
		 * This is a callback that will allow us to create the viewer and initialize
		 * it.
		 */
		public void createPartControl(Composite parent) {
			// Create a dummy model
			model = new Model();
	 
			// Initialize the viewer, 'parent' is the
			// enclosing RCP windowframe
			viewer.createControl(parent);
			viewer.setRootEditPart(rootEditPart);
			viewer.setEditPartFactory(editPartFactory);
	 
			// Inject the model into the viewer, the viewer will
			// traverse the model automatically
			viewer.setContents(model);
	 
			// Set the view's background to white
			viewer.getControl().setBackground(new Color(null, 255, 255, 255));
		}
	 
		/**
		 * Passing the focus request to the viewer's control.
		 */
		public void setFocus() {
			viewer.getControl().setFocus();
		}
	}
