
class Frog
    {
    private String name;
    private int age;

    public void setName(String name)
        {
        this.name = name;
        }

    public void setAge(int age)
        {
        this.age = age;
        }

    public String getname()
        {
        return name;
        }

    public int getAge()
        {
        return age;
        }

    public void setInfo(String name , int age)
        {
            setName(name);
            setAge(age);
        }
    }

public class Application
    {
    public static void main(String[] args)
        {
        Frog frog1 = new Frog();

        /* old method not good
         frog1.name = "Bertia";
         frog1.age = 1;
         */
        frog1.setName("Bertia");
        frog1.setAge(1);

        System.out.println(frog1.getname());

        frog1.setInfo("frogChange", 2);
        System.out.println(frog1.getname());
        }
    }
