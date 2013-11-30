package pct.Testescrollerbt;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Act_scroll_rbs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_scroll_rbs);
        
        final RadioButton[] rb = new RadioButton[50]; 
        RadioGroup rg = (RadioGroup) findViewById(R.id.radiogroup);//not this RadioGroup rg = new RadioGroup(this);
        rg.setOrientation(RadioGroup.VERTICAL);//or RadioGroup.VERTICAL
           for(int i=0; i<50; i++)
        	   
           {
        	   
        	   rb[i]  = new RadioButton(this);
               rg.addView(rb[i]); 
               rb[i].setText("busão"+i);
           }
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.act_scroll_rbs, menu);
        return true;
    }
    
}
