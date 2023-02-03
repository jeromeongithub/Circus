package circus;

// consider using abstract class for Task
public abstract class Animal implements Asset { // "abstract" prevents users from creating the object Animal. (there's no animal called "animal")
    public abstract String speak(); // provide the behaviour is enough.
}
