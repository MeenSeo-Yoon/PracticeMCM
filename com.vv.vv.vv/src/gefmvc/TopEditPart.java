package gefmvc;

import java.util.List;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class TopEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		//��Ʈ �ǰ� ����
		//FreeformLayout�� xyLayout�� ��� �޴´� ���� ��ġ�� 0,0���� �����Ѱ� �ܿ��� xyLayout�� ���� �ٸ��� �ʴ�.
		//XYLayout�� �����Ӱ� ��ġ�� ������ Layout�̴�.
		
		Figure f = new FreeformLayer();
		
		f.setLayoutManager(new FreeformLayout());//���̾ƿ��� FreeFormLayout���� ����
		//Layout�� ȭ�鿡 ������ ��ġ�� ����
		//�� ���̾� �׷��� ������ �ִ� child Model���� ��ġ�ؼ� �����ϰ� �ȴ�.
		
		f.setBorder(new MarginBorder(1));//Border�� 1�� ����
		//Create a layout for the graphical screen
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;//���� 3���� �����Ѵ�.
		gridLayout.horizontalSpacing = 40;//���򰣰��� 40���� ����
		gridLayout.verticalSpacing = 40;
		gridLayout.marginHeight = 20;//���� ������ 20���� �Ѵ�.
		gridLayout.marginWidth = 20;
		f.setLayoutManager(gridLayout);//���̾ƿ��� gridLayout����
		f.setOpaque(true);//���� ����
		return f;
		
		
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		
	}
	protected List<NodeModel> getModelChildren(){
		List<NodeModel> children = ((Model)getModel()).getNodes();
		return children;
		
	}

}
