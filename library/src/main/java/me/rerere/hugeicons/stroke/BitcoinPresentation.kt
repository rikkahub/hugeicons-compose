package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinPresentation: ImageVector
    get() {
        if (_bitcoinPresentation != null) {
            return _bitcoinPresentation!!
        }
        _bitcoinPresentation = ImageVector.Builder(
            name = "BitcoinPresentation",
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
        moveTo(12f, 19f)
        lineTo(12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 2f)
        horizontalLineTo(3f)
        curveTo(2.5286f, 2f, 2.29289f, 2f, 2.14645f, 2.14645f)
        curveTo(2f, 2.29289f, 2f, 2.5286f, 2f, 3f)
        verticalLineTo(4f)
        curveTo(2f, 4.4714f, 2f, 4.70711f, 2.14645f, 4.85355f)
        curveTo(2.29289f, 5f, 2.5286f, 5f, 3f, 5f)
        horizontalLineTo(21f)
        curveTo(21.4714f, 5f, 21.7071f, 5f, 21.8536f, 4.85355f)
        curveTo(22f, 4.70711f, 22f, 4.4714f, 22f, 4f)
        verticalLineTo(3f)
        curveTo(22f, 2.5286f, 22f, 2.29289f, 21.8536f, 2.14645f)
        curveTo(21.7071f, 2f, 21.4714f, 2f, 21f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 5f)
        verticalLineTo(13f)
        curveTo(3f, 15.8284f, 3f, 17.2426f, 3.87868f, 18.1213f)
        curveTo(4.75736f, 19f, 6.17157f, 19f, 9f, 19f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 19f, 19.2426f, 19f, 20.1213f, 18.1213f)
        curveTo(21f, 17.2426f, 21f, 15.8284f, 21f, 13f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 10f)
        horizontalLineTo(16f)
        moveTo(14f, 14f)
        lineTo(18f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.9375f, 14.6667f)
        lineTo(6.9375f, 9.33333f)
        moveTo(8.5f, 9.33333f)
        verticalLineTo(8f)
        moveTo(8.5f, 16f)
        verticalLineTo(14.6667f)
        moveTo(6.9375f, 12f)
        horizontalLineTo(10.0625f)
        moveTo(10.0625f, 12f)
        curveTo(10.5803f, 12f, 11f, 12.4477f, 11f, 13f)
        verticalLineTo(13.6667f)
        curveTo(11f, 14.219f, 10.5803f, 14.6667f, 10.0625f, 14.6667f)
        horizontalLineTo(6f)
        moveTo(10.0625f, 12f)
        curveTo(10.5803f, 12f, 11f, 11.5523f, 11f, 11f)
        verticalLineTo(10.3333f)
        curveTo(11f, 9.78105f, 10.5803f, 9.33333f, 10.0625f, 9.33333f)
        horizontalLineTo(6f)
        }
        }.build()

        return _bitcoinPresentation!!
    }

private var _bitcoinPresentation: ImageVector? = null
