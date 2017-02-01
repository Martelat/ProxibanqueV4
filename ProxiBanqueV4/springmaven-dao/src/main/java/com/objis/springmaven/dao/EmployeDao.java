package com.objis.springmaven.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.objis.springmaven.domaine.Employe;


public class EmployeDao implements IEmployeDao {
	// Propriétés du template
	JdbcTemplate template; // name dans spring-data

	// Getters & Setters du template
	/* (non-Javadoc)
	 * @see com.objis.springmaven.dao.IEmployeDao#getTemplate()
	 */
	public JdbcTemplate getTemplate() {
		return template;
	}

	/* (non-Javadoc)
	 * @see com.objis.springmaven.dao.IEmployeDao#setTemplate(org.springframework.jdbc.core.JdbcTemplate)
	 */
	public void setTemplate(JdbcTemplate template) { // Obligatoire, injection
														// par setteur
		this.template = template;
	}

	// Création du CRUD

	// 1.1 Lecture d'un(e) employé(e) by ID

	/* (non-Javadoc)
	 * @see com.objis.springmaven.dao.IEmployeDao#selectEmployeByID(com.objis.springmaven.domaine.Employe)
	 */
	public Employe selectEmployeByID(Employe employe) {
		return employe = this.template.queryForObject("select nom, prenom from employe where id =?",

				new RowMapper<Employe>() {
					public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
						Employe remploye = new Employe();
						remploye.setNom(rs.getString("nom"));
						remploye.setPrenom(rs.getString("prenom"));
						return remploye;
					}
				}, new Object[] { employe.getId() });

	}

	/* (non-Javadoc)
	 * @see com.objis.springmaven.dao.IEmployeDao#selectEmployeByID2(com.objis.springmaven.domaine.Employe)
	 */
	public Employe selectEmployeByID2(Employe employe) {
		return employe = this.template.queryForObject("select * from employe where id =?",
				new Object[] { employe.getId() }, 
				new RowMapper<Employe>() {
					public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
						Employe remploye = new Employe();
						remploye.setId(rs.getInt("id"));
						remploye.setNom(rs.getString("nom"));
						remploye.setPrenom(rs.getString("prenom"));
						remploye.setLogin(rs.getString("login"));
						remploye.setPassword(rs.getString("password"));
						remploye.setEmail(rs.getString("email"));
						remploye.setRole(rs.getString("role"));
						return remploye;
					}
				});

	}

	// 1.2 Lecture d'un(e) employé(e) by nom
	/* (non-Javadoc)
	 * @see com.objis.springmaven.dao.IEmployeDao#selectEmployeByNom(com.objis.springmaven.domaine.Employe)
	 */
	public Employe selectEmployeByNom(Employe employe) {
		return employe = this.template.queryForObject("select * from employe where nom =?",
				new Object[] { employe.getNom() }, 
				new RowMapper<Employe>() {
					public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
						Employe remploye = new Employe();
						remploye.setId(rs.getInt("id"));
						remploye.setNom(rs.getString("nom"));
						remploye.setPrenom(rs.getString("prenom"));
						remploye.setLogin(rs.getString("login"));
						remploye.setPassword(rs.getString("password"));
						remploye.setEmail(rs.getString("email"));
						remploye.setRole(rs.getString("role"));
						return remploye;
					}
				});}

	// 2 Mise à jour d'un(e) employé(e)

	/* (non-Javadoc)
	 * @see com.objis.springmaven.dao.IEmployeDao#updateEmploye(com.objis.springmaven.domaine.Employe)
	 */
	public void updateEmploye(Employe employe) {
		final String EMPLOYE_UPDATE = "update employe set login='" + employe.getLogin() + 
				"', password='" + employe.getPassword() + "', prenom='" + employe.getPrenom() + 
				"', nom='" + employe.getNom() + "', email='" + employe.getEmail() + "', role='" 
				+ employe.getRole() + "' where id = ?";
		
		System.out.println(EMPLOYE_UPDATE);

		template.update(EMPLOYE_UPDATE, employe.getId());
		
	}

	// 3 Création d'un(e) employé(e)

	/* (non-Javadoc)
	 * @see com.objis.springmaven.dao.IEmployeDao#createEmploye(com.objis.springmaven.domaine.Employe)
	 */
	public void createEmploye(Employe employe) {
		final String EMPLOYE_INSERT = "insert into employe (id, login, password, prenom, nom, email, role)"
				+ "values (?,?,?,?,?,?,?)";

		template.update(EMPLOYE_INSERT, employe.getId(), employe.getLogin(), employe.getPassword(), employe.getPrenom(),
				employe.getNom(), employe.getEmail(), employe.getRole());
	}

	

	// 4 Suppression d'un(e) employé(e)
	/* (non-Javadoc)
	 * @see com.objis.springmaven.dao.IEmployeDao#supressionEmploye(com.objis.springmaven.domaine.Employe)
	 */
	public void supressionEmploye(Employe employe) {
		final String EMPLOYE_DELETE = "delete from employe where id = ?";

		template.update(EMPLOYE_DELETE, employe.getId());}
	

	// 5 Lister les employé(e)s
	
	/* (non-Javadoc)
	 * @see com.objis.springmaven.dao.IEmployeDao#listeEmploye()
	 */
	public List<Employe> getAllEmployes() {
		List<Employe> list = template.query("select * from employe", new RowMapper<Employe>() {
            public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
                Employe employe = new Employe();
                employe.setId(rs.getInt("ID"));
                employe.setLogin(rs.getString("login"));
                employe.setPassword(rs.getString("password"));
                employe.setNom(rs.getString("nom"));
                employe.setPrenom(rs.getString("prenom"));
                employe.setEmail(rs.getString("email"));
                employe.setRole(rs.getString("role"));
                return employe;
            }
        });
		
		for (Employe e : list) {
			System.out.println(e);
		}
		
		return list;
	}
}
