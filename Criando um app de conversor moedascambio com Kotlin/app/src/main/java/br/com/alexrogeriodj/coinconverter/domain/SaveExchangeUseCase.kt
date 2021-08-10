package br.com.alexrogeriodj.coinconverter.domain

import br.com.alexrogeriodj.coinconverter.core.UseCase
import br.com.alexrogeriodj.coinconverter.data.model.ExchangeResponseValue
import br.com.alexrogeriodj.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class SaveExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoSource<ExchangeResponseValue>() {

    override suspend fun execute(param: ExchangeResponseValue): Flow<Unit> {
        return flow {
            repository.save(param)
            emit(Unit)
        }
    }
}