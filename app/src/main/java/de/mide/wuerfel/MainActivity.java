package de.mide.wuerfel;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * Fehlersuchaufgabe: App simuliert einen Würfel mit sechs Seiten.
 * <br><br>
 *
 * This project is licensed under the terms of the BSD 3-Clause License.
 */
public class MainActivity extends Activity implements OnClickListener {

    /**
     * Zufallsgenerator; die Methode {@code nextInt(obergrenze)} diese Objekts erzeugt eine
     * Zufallszahl zwischen 0 und {@code obergrenze-1} (jeweils einschließlich).
     */
    final private Random _random = new Random();

    /** TextView-Element zur Anzeige der gewürfelten Zahl. */
    private TextView _zahlTextView = null;

    /** Button um eine neue Zahl von 1 bis 6 zu würfeln. */
    private Button _wuerfelButton1 = null;


    /**
     * Lifecycle-Methode: Lädt Layout-Datei, füllt Member-Variablen für UI-Elemente,
     * setzt Event-Handler-Objekt für Button.
     */
    @Override
    protected void onCreate( Bundle savedInstanceState ) {

        super.onCreate( savedInstanceState );

        _zahlTextView   = findViewById( R.id.zahlTextView    );
        _wuerfelButton1 = findViewById( R.id.wuerfelButton_1 );

        setContentView( R.layout.activity_main );

        _wuerfelButton1.setOnClickListener( this );
    }


    /**
     * Event-Handler-Methode für Button.
     *
     * @param view  UI-Element, welches das Event ausgelöst hat.
     */
    @Override
    public void onClick( View view ) {

        // Zufallszahl zwischen 1..6 erzeugen (normaler Würfel)
        int zufallszahl = _random.nextInt( 6 ) + 1;

        _zahlTextView.setText( zufallszahl + "" );
    }

}
