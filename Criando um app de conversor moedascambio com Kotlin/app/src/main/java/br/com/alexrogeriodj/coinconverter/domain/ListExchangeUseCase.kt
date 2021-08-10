package br.com.alexrogeriodj.coinconverter.domain

import br.com.alexrogeriodj.coinconverter.core.UseCase
import br.com.alexrogeriodj.coinconverter.data.model.ExchangeResponseValue
import br.com.alexrogeriodj.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class ListExchangeUseCase(
    private val repository: CoinRepository
) : UseCase.NoParam<List<ExchangeResponseValue>>() {

    override suspend fun execute(): Flow<List<ExchangeResponseValue>> {
        return repository.list()
    }
}