Use petclinic;
select distinct first_name from vets,vet_specialties where vets.id = vet_specialties.vet_id;
select vets.first_name, specialties.name 
from vets,vet_specialties,specialties 
where vets.id= vet_specialties.vet_id 
and vet_specialties.specialty_id = specialties.id; 
describe pets;
select specialtie0_.vet_id as vet1_1_, specialtie0_.specialty_id as specialty2_1_, specialty1_.id as id2_0_, specialty1_.name as name2_0_ from vet_specialties specialtie0_ left outer join specialties specialty1_ on specialtie0_.specialty_id=specialty1_.id where specialtie0_.vet_id =
(select vet0_.id as id0_, vet0_.first_name as first2_0_, vet0_.last_name as last3_0_ from vets vet0_ order by vet0_.last_name, vet0_.first_name);
