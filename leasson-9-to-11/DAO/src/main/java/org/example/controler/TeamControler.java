package org.example.controler;

import org.example.dao.TeamDTO;
import org.example.dao.TeamDao;
import org.example.model.Team;

import java.util.Optional;

public class TeamControler {
    final private TeamDao teamDao;

    public TeamControler(TeamDao teamDao) {
        this.teamDao = teamDao;
    }

    public void save(Team team){
        if(team == null) throw new IllegalArgumentException("Invalid Team");

        TeamDTO dto = new TeamDTO(team.getId(),team.getName(),team.getBaseLocation(),team.getCoachName());

        teamDao.save(dto);
    }

    public Optional<Team> findOne(Integer id){
        if(id == null || id < 0) throw new IllegalArgumentException("Id null or invalid");

        Optional<TeamDTO> dto = teamDao.findOne(id);

        if(dto.isEmpty()) throw new IllegalStateException("Cannot find this team");

        TeamDTO teamDTO = dto.get();

        Team team = new Team(teamDTO.id(),teamDTO.name(),teamDTO.baseLocation(),teamDTO.coachName());

        return Optional.of(team);

    }

    public void update (Team team){
        if(team == null) throw new IllegalArgumentException("Invalid team");

        if(team.getId() == null || team.getId() <= 0) throw new IllegalArgumentException("Invalid id");

        if (team.getName() == null || team.getName().isEmpty()) throw new IllegalArgumentException("Invalid Team");

        if(teamDao.findOne(team.getId()).isEmpty()) throw new IllegalArgumentException("Team not found");

        TeamDTO teamDTO = new TeamDTO(team.getId(),team.getName(),team.getBaseLocation(),team.getCoachName());

        teamDao.update(teamDTO);

    }

    public void delete (Integer id){
        if(id == null || id <= 0) throw new IllegalArgumentException("invalid id");

        teamDao.delete(id);
    }


}
