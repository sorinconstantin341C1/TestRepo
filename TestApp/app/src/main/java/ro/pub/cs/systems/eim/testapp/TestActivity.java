package ro.pub.cs.systems.eim.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TestActivity extends AppCompatActivity {

    private EditText eText = null;
    private Button nButton = null;
    private Button sButton = null;
    private Button wButton = null;
    private Button eButton = null;

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.n_button:
                    int nNumberOfClicks = Integer.parseInt(eText.getText().toString());
                    nNumberOfClicks++;
                    eText.setText(String.valueOf(nNumberOfClicks));
                    break;
                case R.id.s_button:
                    int sNumberOfClicks = Integer.parseInt(eText.getText().toString());
                    sNumberOfClicks++;
                    eText.setText(String.valueOf(sNumberOfClicks));
                    break;
                case R.id.e_button:
                    int eNumberOfClicks = Integer.parseInt(eText.getText().toString());
                    eNumberOfClicks++;
                    eText.setText(String.valueOf(eNumberOfClicks));
                    break;
                case R.id.w_button:
                    int wNumberOfClicks = Integer.parseInt(eText.getText().toString());
                    wNumberOfClicks++;
                    eText.setText(String.valueOf(wNumberOfClicks));
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        eText = (EditText)findViewById(R.id.an_edit_text);
        eText.setText(String.valueOf(0));

        nButton = (Button)findViewById(R.id.n_button);
        sButton = (Button)findViewById(R.id.s_button);
        eButton = (Button)findViewById(R.id.e_button);
        wButton = (Button)findViewById(R.id.w_button);

        nButton.setOnClickListener(buttonClickListener);
        sButton.setOnClickListener(buttonClickListener);
        eButton.setOnClickListener(buttonClickListener);
        wButton.setOnClickListener(buttonClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
