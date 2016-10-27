package ccv.checkhelzio.filacademica;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by check on 09/09/2016.
 */

public class HelzioAdapter extends FragmentStatePagerAdapter {
    HelzioAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return new ListaEventos().getEventos().size();
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public Fragment getItem(int position) {
        return ActividadFragment.init(position);
    }
}