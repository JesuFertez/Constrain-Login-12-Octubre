package MyCustomView.TextView;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import timber.log.Timber;

public class CustomTextViewPersonalizada extends AppCompatTextView {

    public CustomTextViewPersonalizada(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Timber.d("onTouchEvent"+event.toString());
        decoTexto();
        return super.onTouchEvent(event);
    }
    private void decoTexto(){
        if(!getText().toString().isEmpty()){
            setShadowLayer(6,4,4, Color.rgb(250,00,250));
            setBackgroundColor(Color.parseColor("#7986cb"));
            setTextColor(Color.parseColor("#ffffff"));
        }else{
            setBackgroundColor(Color.RED);
        }
    }
}
