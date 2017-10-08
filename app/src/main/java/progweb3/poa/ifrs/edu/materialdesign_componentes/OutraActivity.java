package progweb3.poa.ifrs.edu.materialdesign_componentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OutraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String themeName = "Theme.AppCompat.Light.NoActionBar";
        //substituir por: Theme.AppCompat.DayNight.DarkActionBar
        int themeId = getResources().getIdentifier(themeName, "style", getPackageName());
        setTheme(themeId);
        setContentView(R.layout.activity_outra);
    }
}
