package ccv.checkhelzio.filacademica2015;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class FilTextView extends TextView {

    public FilTextView(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public FilTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public FilTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fil.ttf", context);
        setTypeface(customFont, Typeface.BOLD);
    }
}