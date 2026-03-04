package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GoldSell: ImageVector
    get() {
        if (_goldSell != null) {
            return _goldSell!!
        }
        _goldSell = ImageVector.Builder(
            name = "GoldSell",
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
        moveTo(19f, 2.5f)
        verticalLineTo(7f)
        moveTo(21f, 4f)
        lineTo(20.5617f, 3.4231f)
        curveTo(19.841f, 2.47437f, 19.4806f, 2f, 19f, 2f)
        curveTo(18.5194f, 2f, 18.159f, 2.47437f, 17.4383f, 3.4231f)
        lineTo(17f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 9.87791f)
        curveTo(20.6667f, 10.6661f, 21f, 11.2926f, 21f, 12f)
        curveTo(21f, 13.2081f, 20.0278f, 14.1803f, 18.0834f, 16.1247f)
        lineTo(16.1247f, 18.0834f)
        curveTo(14.1803f, 20.0278f, 13.2081f, 21f, 12f, 21f)
        curveTo(10.7919f, 21f, 9.81971f, 20.0278f, 7.87531f, 18.0834f)
        lineTo(5.9166f, 16.1247f)
        curveTo(3.9722f, 14.1803f, 3f, 13.2081f, 3f, 12f)
        curveTo(3f, 10.7919f, 3.9722f, 9.81971f, 5.9166f, 7.87531f)
        lineTo(7.87531f, 5.9166f)
        curveTo(9.81971f, 3.9722f, 10.7919f, 3f, 12f, 3f)
        curveTo(12.7074f, 3f, 13.3339f, 3.33333f, 14.1221f, 4f)
        }
        }.build()

        return _goldSell!!
    }

private var _goldSell: ImageVector? = null
