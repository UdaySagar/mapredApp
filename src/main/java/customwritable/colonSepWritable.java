package customwritable;
import java.io.*;

import org.apache.hadoop.io.*;
/**
 * Created by UdaySagar on 3/22/17.
 */
public class colonSepWritable implements WritableComparable<colonSepWritable> {

    private String city;
    private String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void write(DataOutput out) throws IOException {

    }

    public void readFields(DataInput in) throws IOException {

    }

    @Override
    public int hashCode() {
        return city.hashCode() + state.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof colonSepWritable) {
            colonSepWritable tp = (colonSepWritable) o;
            return tp.state.equals(state) && tp.city.equals(city);
        }
        return false;
    }

    public int compareTo(colonSepWritable ct) {
        int cmp = ct.state.compareTo(state);
        if(cmp != 0) {
            return cmp;
        }
        return ct.city.compareTo(city);
    }
}
