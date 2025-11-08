package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinSearch: ImageVector
    get() {
        if (_bitcoinSearch != null) {
            return _bitcoinSearch!!
        }
        _bitcoinSearch = ImageVector.Builder(
            name = "BitcoinSearch",
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
        moveTo(17.5f, 17.5f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 11f)
        curveTo(20f, 6.02944f, 15.9706f, 2f, 11f, 2f)
        curveTo(6.02944f, 2f, 2f, 6.02944f, 2f, 11f)
        curveTo(2f, 15.9706f, 6.02944f, 20f, 11f, 20f)
        curveTo(15.9706f, 20f, 20f, 15.9706f, 20f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.125f, 14f)
        lineTo(9.125f, 8f)
        moveTo(11f, 8f)
        verticalLineTo(6.5f)
        moveTo(11f, 15.5f)
        verticalLineTo(14f)
        moveTo(9.125f, 11f)
        horizontalLineTo(12.875f)
        moveTo(12.875f, 11f)
        curveTo(13.4963f, 11f, 14f, 11.5037f, 14f, 12.125f)
        verticalLineTo(12.875f)
        curveTo(14f, 13.4963f, 13.4963f, 14f, 12.875f, 14f)
        horizontalLineTo(8f)
        moveTo(12.875f, 11f)
        curveTo(13.4963f, 11f, 14f, 10.4963f, 14f, 9.875f)
        verticalLineTo(9.125f)
        curveTo(14f, 8.50368f, 13.4963f, 8f, 12.875f, 8f)
        horizontalLineTo(8f)
        }
        }.build()

        return _bitcoinSearch!!
    }

private var _bitcoinSearch: ImageVector? = null
