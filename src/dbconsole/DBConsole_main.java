package dbconsole;

import dbconsole.DBConsole_View;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class DBConsole_main{
 

	public static void main(String[] args) {
	
		int month,eruption,c=1;
		ResultSet rs;
		MySQL mysql = new MySQL();
		rs = mysql.selectAll();
		
	    DBConsole_View graph = new DBConsole_View();
	    graph.setBounds(5,5,655,455);
		graph.setVisible(true);
		
	    try {
			while(rs.next()){
			    month = rs.getInt("month");
			    eruption = rs.getInt("eruption");
			    graph.Addsakurajima(eruption,month,c);
				    		  				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
	}
			
}

