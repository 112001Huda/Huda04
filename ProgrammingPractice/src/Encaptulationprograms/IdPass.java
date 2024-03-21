package Encaptulationprograms;
public class IdPass {
    private String Id = "Huda01";
    private int Password = 112001;
    /*public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int password) {
        this.Password = password;
    }
}
    class Test {
        public static void main(String[] args) {
            IdPass H = new IdPass();
            H.setId("Huda01 ");
            H.setPassword(112001);
            System.out.println(H.getId());
            System.out.println(H.getPassword());
        }
    }
