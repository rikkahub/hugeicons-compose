package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinEllipse: ImageVector
    get() {
        if (_bitcoinEllipse != null) {
            return _bitcoinEllipse!!
        }
        _bitcoinEllipse = ImageVector.Builder(
            name = "BitcoinEllipse",
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
        moveTo(9.5f, 16f)
        lineTo(9.5f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 8f)
        verticalLineTo(6f)
        moveTo(13.5f, 8f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 18f)
        verticalLineTo(16f)
        moveTo(13.5f, 18f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 12f)
        horizontalLineTo(14.5f)
        curveTo(15.3284f, 12f, 16f, 12.6716f, 16f, 13.5f)
        verticalLineTo(14.5f)
        curveTo(16f, 15.3284f, 15.3284f, 16f, 14.5f, 16f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 8f)
        lineTo(14.5f, 8f)
        curveTo(15.3284f, 8f, 16f, 8.67157f, 16f, 9.5f)
        verticalLineTo(10.5f)
        curveTo(16f, 11.3284f, 15.3284f, 12f, 14.5f, 12f)
        horizontalLineTo(9.5f)
        }
        }.build()

        return _bitcoinEllipse!!
    }

private var _bitcoinEllipse: ImageVector? = null
