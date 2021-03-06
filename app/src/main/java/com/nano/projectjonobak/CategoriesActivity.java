package com.nano.projectjonobak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoriesActivity extends AppCompatActivity implements View.OnClickListener {

    private Button divisionButton, ministerButton, civilserviceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_categories );

        divisionButton = ( Button ) findViewById ( R.id.divisionCategoriesButtonId );
        ministerButton = ( Button ) findViewById ( R.id.ministerCategoriesButtonId );
        civilserviceButton = ( Button ) findViewById ( R.id.CivilServiceCategoriesButtonId);

        divisionButton.setOnClickListener ( this );
        ministerButton.setOnClickListener ( this );
        civilserviceButton .setOnClickListener ( this );
    }

    @Override
    public void onClick(View v) {

        if(v.getId () == R.id.divisionCategoriesButtonId)
        {
            Intent intent = new Intent ( CategoriesActivity.this,DivisionList.class );
            startActivity ( intent );

        }

        else if(v.getId () == R.id.ministerCategoriesButtonId)
        {
            Intent intent = new Intent ( CategoriesActivity.this,MinistriesList.class );
            startActivity ( intent );

        }
        else if(v.getId () == R.id.CivilServiceCategoriesButtonId)
        {
            Intent intent = new Intent ( CategoriesActivity.this,CivilService.class );
            startActivity ( intent );

        }

    }
}
