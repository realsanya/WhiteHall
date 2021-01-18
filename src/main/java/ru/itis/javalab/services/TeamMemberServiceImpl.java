package ru.itis.javalab.services;

import ru.itis.javalab.dto.TeamMemberDto;
import ru.itis.javalab.models.TeamMember;
import ru.itis.javalab.repositories.interfaces.TeamMemberRepository;
import ru.itis.javalab.services.interfaces.TeamMemberService;

import java.util.List;

public class TeamMemberServiceImpl implements TeamMemberService {

    private TeamMemberRepository teamMemberRepository;

    public TeamMemberServiceImpl(TeamMemberRepository teamMemberRepository) {
        this.teamMemberRepository = teamMemberRepository;
    }

    @Override
    public List<TeamMemberDto> getAllMembers() {
        return TeamMemberDto.from(teamMemberRepository.findAll());
    }

    @Override
    public List<TeamMemberDto> getAllMembers(int page, int size) {
        return null;
    }

    @Override
    public void addUser(TeamMemberDto memberDto) {
        teamMemberRepository.save(TeamMember.builder()
                .first_name(memberDto.getFirst_name())
                .last_name(memberDto.getLast_name())
                .role_id(memberDto.getRole())
                .text(memberDto.getText())
                .build());
    }

    @Override
    public TeamMemberDto getMember(Integer memberId) {
        return TeamMemberDto.from(teamMemberRepository.findById(memberId));
    }
}
