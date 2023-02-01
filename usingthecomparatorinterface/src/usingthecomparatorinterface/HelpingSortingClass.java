package usingthecomparatorinterface;

import java.util.Comparator;

public class HelpingSortingClass implements Comparator{
	@Override
public int compare(Object x, Object y)
{
	if(((Student)(x)).id > ((Student)(y)).id)
	{
		return 1;
	}
	else {
		return -1;
	}
}
}
