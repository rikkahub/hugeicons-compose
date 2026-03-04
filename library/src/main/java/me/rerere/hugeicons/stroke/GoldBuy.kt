package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GoldBuy: ImageVector
    get() {
        if (_goldBuy != null) {
            return _goldBuy!!
        }
        _goldBuy = ImageVector.Builder(
            name = "GoldBuy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 13.8475f)
        curveTo(20.6814f, 13.0147f, 21.0166f, 12.3661f, 20.9994f, 11.6409f)
        curveTo(20.9706f, 10.432f, 19.9738f, 9.48267f, 17.9802f, 7.58405f)
        lineTo(16.0235f, 5.7206f)
        curveTo(14.119f, 3.90687f, 13.1668f, 3f, 12f, 3f)
        curveTo(10.8332f, 3f, 9.88095f, 3.90687f, 7.9765f, 5.7206f)
        lineTo(6.01983f, 7.58405f)
        curveTo(4.02623f, 9.48267f, 3.02944f, 10.432f, 3.00064f, 11.6409f)
        curveTo(2.97184f, 12.8497f, 3.9223f, 13.8454f, 5.82322f, 15.8368f)
        lineTo(7.77989f, 17.8866f)
        curveTo(9.76116f, 19.9622f, 10.7518f, 21f, 12f, 21f)
        curveTo(12.7074f, 21f, 13.3321f, 20.6667f, 14.1013f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.1016f, 14f)
        curveTo(20.7005f, 13.2683f, 21f, 12.6705f, 21f, 12f)
        curveTo(21f, 10.7919f, 20.0278f, 9.81971f, 18.0834f, 7.87531f)
        lineTo(16.1247f, 5.9166f)
        curveTo(14.1803f, 3.9722f, 13.2081f, 3f, 12f, 3f)
        curveTo(10.7919f, 3f, 9.81971f, 3.9722f, 7.87531f, 5.9166f)
        lineTo(5.9166f, 7.87531f)
        curveTo(3.9722f, 9.81971f, 3f, 10.7919f, 3f, 12f)
        curveTo(3f, 13.2081f, 3.9722f, 14.1803f, 5.9166f, 16.1247f)
        lineTo(7.87531f, 18.0834f)
        curveTo(9.81971f, 20.0278f, 10.7919f, 21f, 12f, 21f)
        curveTo(12.7074f, 21f, 13.3339f, 20.6667f, 14.1221f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 21.5f)
        verticalLineTo(17f)
        moveTo(21f, 20f)
        lineTo(20.5617f, 20.5769f)
        curveTo(19.841f, 21.5256f, 19.4806f, 22f, 19f, 22f)
        curveTo(18.5194f, 22f, 18.159f, 21.5256f, 17.4383f, 20.5769f)
        lineTo(17f, 20f)
        }
        }.build()

        return _goldBuy!!
    }

private var _goldBuy: ImageVector? = null
