/*
 * COPYRIGHT: FREQUENTIS AG. All rights reserved.
 *            Registered with Commercial Court Vienna,
 *            reg.no. FN 72.115b.
 */
package com.chapterthree;

import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    @Override
    public int compare(final Person person1, final Person person2) {
        if (person1.getAge() > person2.getAge()) {
            return 1;
        } else if (person1.getAge() == person2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }
}
