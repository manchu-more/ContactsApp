
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;


public class contactTabel extends AbstractTableModel {

    private String[] columns;
    private Object[][] rows;
    
    public contactTabel(){}
    public contactTabel(Object[][] data,String[] columnsName){
        this.columns= columnsName;
        this.rows=data;
        
        
    }
    
    @Override
    public Class getColumnClass(int col){
        if(col==4){
            return Icon.class;
        }
        else{return getValueAt(0,col).getClass();}
    }
    
    
   @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    return this.rows[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col){
    return this.columns[col];
    }
}
