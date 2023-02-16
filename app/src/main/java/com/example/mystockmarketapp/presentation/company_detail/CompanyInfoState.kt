package com.example.mystockmarketapp.presentation.company_detail

import com.example.mystockmarketapp.domain.model.CompanyInfo
import com.example.mystockmarketapp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfo: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
