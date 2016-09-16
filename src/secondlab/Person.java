package secondlab;


import java.util.Objects;

class Person {

        private final boolean man;
        private final String name;
        private Person spouse;

        public Person(boolean man, String name) {
            this.man = man;
            this.name = name;
        }

        /**
         * This method checks gender of persons. If genders are not equal - tries to marry.
         * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
         * @param person - new husband/wife for this person.
         * @return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
         */
        public boolean marry(Person person) {
            if (person == null)
                return false;
            else {
                if (this.man != person.man) {

                    if (person.equals(spouse)) {
                        return false;
                    } else {
                        //TODO: null pointer; TODO: check: are they already spouse?
                        divorce();
                        spouse = person;
                        person.spouse = this;
                        return true;
                    }

                } else return false;
            }

        }


        /**
         * Sets spouse = null if spouse is not null
         * @return true - if person status has been changed
         */
        public boolean divorce() {
            if (this.spouse != null) {
                spouse.spouse = null;
                spouse = null;
                return true;
            } else return false;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return man == person.man &&
                Objects.equals(name, person.name) &&
                Objects.equals(spouse, person.spouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(man, name, spouse);
    }
}
