package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinGraph: ImageVector
    get() {
        if (_bitcoinGraph != null) {
            return _bitcoinGraph!!
        }
        _bitcoinGraph = ImageVector.Builder(
            name = "BitcoinGraph",
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
        moveTo(13.5f, 19.5f)
        verticalLineTo(11.5f)
        curveTo(13.5f, 10.5572f, 13.5f, 10.0858f, 13.2071f, 9.79289f)
        curveTo(12.9142f, 9.5f, 12.4428f, 9.5f, 11.5f, 9.5f)
        curveTo(10.5572f, 9.5f, 10.0858f, 9.5f, 9.79289f, 9.79289f)
        curveTo(9.5f, 10.0858f, 9.5f, 10.5572f, 9.5f, 11.5f)
        verticalLineTo(19.5f)
        curveTo(9.5f, 20.4428f, 9.5f, 20.9142f, 9.79289f, 21.2071f)
        curveTo(10.0858f, 21.5f, 10.5572f, 21.5f, 11.5f, 21.5f)
        curveTo(12.4428f, 21.5f, 12.9142f, 21.5f, 13.2071f, 21.2071f)
        curveTo(13.5f, 20.9142f, 13.5f, 20.4428f, 13.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 12.5f)
        verticalLineTo(19.5f)
        curveTo(20.5f, 20.4428f, 20.5f, 20.9142f, 20.2071f, 21.2071f)
        curveTo(19.9142f, 21.5f, 19.4428f, 21.5f, 18.5f, 21.5f)
        curveTo(17.5572f, 21.5f, 17.0858f, 21.5f, 16.7929f, 21.2071f)
        curveTo(16.5f, 20.9142f, 16.5f, 20.4428f, 16.5f, 19.5f)
        verticalLineTo(12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4375f, 9.16667f)
        lineTo(17.4375f, 3.83333f)
        moveTo(19f, 3.83333f)
        verticalLineTo(2.5f)
        moveTo(19f, 10.5f)
        verticalLineTo(9.16667f)
        moveTo(17.4375f, 6.5f)
        horizontalLineTo(20.5625f)
        moveTo(20.5625f, 6.5f)
        curveTo(21.0803f, 6.5f, 21.5f, 6.94772f, 21.5f, 7.5f)
        verticalLineTo(8.16667f)
        curveTo(21.5f, 8.71895f, 21.0803f, 9.16667f, 20.5625f, 9.16667f)
        horizontalLineTo(16.5f)
        moveTo(20.5625f, 6.5f)
        curveTo(21.0803f, 6.5f, 21.5f, 6.05228f, 21.5f, 5.5f)
        verticalLineTo(4.83333f)
        curveTo(21.5f, 4.28105f, 21.0803f, 3.83333f, 20.5625f, 3.83333f)
        horizontalLineTo(16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 19.5f)
        verticalLineTo(14.5f)
        curveTo(6.5f, 13.5572f, 6.5f, 13.0858f, 6.20711f, 12.7929f)
        curveTo(5.91421f, 12.5f, 5.44281f, 12.5f, 4.5f, 12.5f)
        curveTo(3.55719f, 12.5f, 3.08579f, 12.5f, 2.79289f, 12.7929f)
        curveTo(2.5f, 13.0858f, 2.5f, 13.5572f, 2.5f, 14.5f)
        verticalLineTo(19.5f)
        curveTo(2.5f, 20.4428f, 2.5f, 20.9142f, 2.79289f, 21.2071f)
        curveTo(3.08579f, 21.5f, 3.55719f, 21.5f, 4.5f, 21.5f)
        curveTo(5.44281f, 21.5f, 5.91421f, 21.5f, 6.20711f, 21.2071f)
        curveTo(6.5f, 20.9142f, 6.5f, 20.4428f, 6.5f, 19.5f)
        }
        }.build()

        return _bitcoinGraph!!
    }

private var _bitcoinGraph: ImageVector? = null
