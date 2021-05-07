package com.manar.membre;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.manar.membre.entities.Conservatoire;
import com.manar.membre.entities.Membre;
import com.manar.membre.repos.MembreRepository;
import com.manar.membre.service.MembreService;



@SpringBootTest
class MembresApplicationTests {
@Autowired
private MembreRepository membreRepository;
private MembreService membreService;
@Test
public void testCreateMembre() {
Membre memb = new Membre("Manar", (long) 1 , new Date());
membreRepository.save(memb);
}
@Test
public void testFindMembre()
{
Membre m = membreRepository.findById(1L).get();
System.out.println(m);
}
@Test
public void testUpdateMembre()
{
Membre m = membreRepository.findById(1L).get();
m.setNumMembre((long) 1000);
membreRepository.save(m);
}
@Test
public void testDeleteMembre()
{
membreRepository.deleteById(1L);;
}

@Test
public void testListerTousMembres()
{
List<Membre> mems = membreRepository.findAll();
for (Membre m : mems)
{
System.out.println(m);
}
}
/*@Test
public void testFindByNomMembreContains()
{
Page<Membre> mems = membreService.getAllMembresParPage(0,2);
System.out.println(mems.getSize());
System.out.println(mems.getTotalElements());

System.out.println(mems.getTotalPages());
//mems.getContent().forEach(p -> {System.out.println(p.toString());

for (Membre m : mems)
{
System.out.println(m);
} 

 };*/
 @Test
 public void testFindByNomMembre()
 {
 List<Membre> mems = membreRepository.findByNomMembre("manar");
 for (Membre m : mems)
 {
 System.out.println(m);
 }
 }
 @Test
 public void testFindByNomMembreContains()
 {
 List<Membre> mems=membreRepository.findByNomMembreContains("manar");
 for (Membre m : mems)
 {
 System.out.println(m);
 } }
 @Test
 public void testfindByNomNum()
 {
 List<Membre> mems = membreRepository.findByNomNum("manar", 2.0);
 for (Membre m : mems)
 {
 System.out.println(m);
 }
 }
 @Test
 public void testfindByIdCon()
 {
 Conservatoire c = new Conservatoire();
 c.setIdCon(1L);
 List<Membre> mems = membreRepository.findByIdCon(c);
 for (Membre m : mems)
 {
 System.out.println(m);
 }
 }
 @Test
 public void findByIdC()
 {
 List<Membre> mems = membreRepository.findByIdC(1L);
 for (Membre m : mems)
 {
 System.out.println(m);
 }
  }

 @Test
 public void testfindByOrderByNomMembreAsc()
 {
 List<Membre> mems = membreRepository.findByOrderByNomMembreAsc();
 for (Membre m : mems)
 {
 System.out.println(m);
 }
 }
 @Test
 public void testTrierMembresNomsNum()
 {
 List<Membre> mems = membreRepository.trierMembresNomsNum();
 for (Membre m : mems)
 {
 System.out.println(m);
 }
 }
}

