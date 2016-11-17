package ccv.checkhelzio.filacademica2015;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class FilTextViewBold extends TextView {

    public FilTextViewBold(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public FilTextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public FilTextViewBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("filbold.ttf", context);
        setTypeface(customFont);
    }
}