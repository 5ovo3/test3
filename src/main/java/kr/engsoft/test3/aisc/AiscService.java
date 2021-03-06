package kr.engsoft.test3.aisc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AiscService {

    private final AiscRepository aiscRepository;

    public List<Aisc> selectGates() {
        return aiscRepository.selectGates();
    }
}
