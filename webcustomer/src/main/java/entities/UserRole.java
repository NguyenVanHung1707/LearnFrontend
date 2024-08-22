package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users_role")
public class UserRole {
    @Id
    @Column(name = "users_role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "users_id", referencedColumnName = "users_role_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "users_role_id")
    private Role role;

    public UserRole() {
        super();
        // TODO Auto-generated constructor stub
    }

    public UserRole(Long id, User user, Role role) {
        this.id = id;
        this.user = user;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}