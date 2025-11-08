package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Radio02: ImageVector
    get() {
        if (_radio02 != null) {
            return _radio02!!
        }
        _radio02 = ImageVector.Builder(
            name = "Radio02",
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
        moveTo(2f, 13f)
        curveTo(2f, 9.70017f, 2f, 8.05025f, 2.87868f, 7.02513f)
        curveTo(3.75736f, 6f, 5.17157f, 6f, 8f, 6f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 6f, 20.2426f, 6f, 21.1213f, 7.02513f)
        curveTo(22f, 8.05025f, 22f, 9.70017f, 22f, 13f)
        curveTo(22f, 16.2998f, 22f, 17.9497f, 21.1213f, 18.9749f)
        curveTo(20.2426f, 20f, 18.8284f, 20f, 16f, 20f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 20f, 3.75736f, 20f, 2.87868f, 18.9749f)
        curveTo(2f, 17.9497f, 2f, 16.2998f, 2f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 15f)
        horizontalLineTo(7.00898f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 20f)
        verticalLineTo(22f)
        moveTo(18f, 20f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 6f)
        lineTo(19f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 11f)
        horizontalLineTo(6f)
        }
        }.build()

        return _radio02!!
    }

private var _radio02: ImageVector? = null
