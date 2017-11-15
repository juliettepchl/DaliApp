import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;

/**
 * Created by Fanglin Chen on 12/18/14.
 * Used by Luke Hudspeth and Julliete Pouchol for CS65 Lab2 Tab Implementation
 *
 */

public class TabsViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;

    public static final int PEOPLE = 0;
    public static final int PROJECTS = 1;
    public static final String UI_TAB_PEOPLE = "PEOPLE";
    public static final String UI_TAB_PROJECTS = "PROJECTS";

    public TabsViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments){
        super(fm);
        this.fragments = fragments;
    }

    public android.support.v4.app.Fragment getItem(int pos){
        return fragments.get(pos);
    }

    public int getCount(){
        return fragments.size();
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case PEOPLE:
                return UI_TAB_PEOPLE;
            case PROJECTS:
                return UI_TAB_PROJECTS;
            default:
                break;
        }
        return null;
    }
}