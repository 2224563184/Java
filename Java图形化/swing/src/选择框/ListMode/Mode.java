package 选择框.ListMode;

import javax.swing.*;

public class Mode extends AbstractListModel<Integer> {

    private int start;
    private int end;
    private int interval;


    public Mode(int start, int end, int interval) {
        this.start = start;
        this.end = end;
        this.interval = interval;
    }

    @Override
    public int getSize() {
        int i = (end - start) / interval;
        return i;
    }

    @Override
    public Integer getElementAt(int index) {
        int t = index * interval + start;
        return t+1;
    }
}
