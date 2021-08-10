package br.com.alexrogeriodj.coinconverter.domain

import br.com.alexrogeriodj.coinconverter.core.UseCase
import br.com.alexrogeriodj.coinconverter.data.model.ExchangeResponseValue
import br.com.alexrogeriodj.coinconverter.data.repository.CoinRepository
import kotlinx.coroutines.flow.Flow

class GetExchangeValueUseCase(
    private val repository: CoinRepository
) : UseCase<String, ExchangeResponseValue>() {

    override suspend fun execute(param: String): Flow<ExchangeResponseValue> {
        return repository.getExchangeValue(param)
    }

}