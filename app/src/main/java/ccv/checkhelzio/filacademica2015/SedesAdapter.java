package ccv.checkhelzio.filacademica2015;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by check on 09/09/2016.
 */

public class SedesAdapter extends FragmentStatePagerAdapter {
    SedesAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {
        return new ListasSedes().getListaSedes().size();
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public Fragment getItem(int position) {
        return SedesFragment.init(position);
    }
}