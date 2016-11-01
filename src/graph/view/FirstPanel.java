package graph.view;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import graph.controller.GraphController;

public class FirstPanel extends JPanel
{
	private GraphController baseController;
	private JButton colorButton;
	private JButton randomButton;
	private SpringLayout baseLayout;
	
	public FirstPanel(GraphController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		this.colorButton = new JButton("colors!");
		
		
		this.randomButton = new JButton("RandomColors");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.add(colorButton);
		this.add(randomButton);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, colorButton, 0, SpringLayout.SOUTH, randomButton);
		baseLayout.putConstraint(SpringLayout.NORTH, randomButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, randomButton, -213, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, randomButton, 290, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, randomButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, colorButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, colorButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, colorButton, 200, SpringLayout.WEST, this);
	}
	private void setupListeners()
	{
		
	}
	
}
