import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class GerenciarControleAluguel {
    public static void main(String[] args) throws InterruptedException {
        Carro carro = new Carro();
        carro.setPlaca("ABC1234");
        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setAno(2020);
        carro.setNumeroPortas(4);

        Moto moto = new Moto();
        moto.setPlaca("XYZ9876");
        moto.setMarca("Honda");
        moto.setModelo("CG");
        moto.setAno(2021);
        moto.setCilindrada(150);

        Caminhao caminhao = new Caminhao();
        caminhao.setPlaca("DEF5678");
        caminhao.setMarca("Volvo");
        caminhao.setModelo("FH");
        caminhao.setAno(2019);
        caminhao.setCapacidadeCarga(12000);

        Aluguel aluguelCarro = new Aluguel();
        aluguelCarro.setVeiculo(carro);
        aluguelCarro.setDataAluguel(LocalDate.now());
        aluguelCarro.setHoraAluguel(LocalDateTime.now());
        aluguelCarro.apresentarRegistroAluguel();

        TimeUnit.SECONDS.sleep(1);

        aluguelCarro.setHoraDevolucao(LocalDateTime.now());
        aluguelCarro.apresentarRegistroAluguel();

        TimeUnit.SECONDS.sleep(1);

        Aluguel aluguelMoto = new Aluguel();
        aluguelMoto.setVeiculo(moto);
        aluguelMoto.setDataAluguel(LocalDate.now());
        aluguelMoto.setHoraAluguel(LocalDateTime.now());
        aluguelMoto.apresentarRegistroAluguel();

        TimeUnit.SECONDS.sleep(1);

        aluguelMoto.setHoraDevolucao(LocalDateTime.now());
        aluguelMoto.apresentarRegistroAluguel();

        TimeUnit.SECONDS.sleep(1);

        Aluguel aluguelCaminhao = new Aluguel();
        aluguelCaminhao.setVeiculo(caminhao);
        aluguelCaminhao.setDataAluguel(LocalDate.now());
        aluguelCaminhao.setHoraAluguel(LocalDateTime.now());
        aluguelCaminhao.apresentarRegistroAluguel();

        TimeUnit.SECONDS.sleep(1);

        aluguelCaminhao.setHoraDevolucao(LocalDateTime.now());
        aluguelCaminhao.apresentarRegistroAluguel();
    }
}
