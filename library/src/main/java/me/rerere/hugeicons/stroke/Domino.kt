package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Domino: ImageVector
    get() {
        if (_domino != null) {
            return _domino!!
        }
        _domino = ImageVector.Builder(
            name = "Domino",
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
        moveTo(19f, 16f)
        curveTo(19f, 18.8284f, 19f, 20.2426f, 17.9749f, 21.1213f)
        curveTo(16.9497f, 22f, 15.2998f, 22f, 12f, 22f)
        curveTo(8.70017f, 22f, 7.05025f, 22f, 6.02513f, 21.1213f)
        curveTo(5f, 20.2426f, 5f, 18.8284f, 5f, 16f)
        lineTo(5f, 8f)
        curveTo(5f, 5.17157f, 5f, 3.75736f, 6.02513f, 2.87868f)
        curveTo(7.05026f, 2f, 8.70017f, 2f, 12f, 2f)
        curveTo(15.2998f, 2f, 16.9497f, 2f, 17.9749f, 2.87868f)
        curveTo(19f, 3.75736f, 19f, 5.17157f, 19f, 8f)
        lineTo(19f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 18f)
        horizontalLineTo(14.491f)
        moveTo(9.50115f, 16f)
        lineTo(9.49219f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0078f, 7f)
        lineTo(11.9988f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 12f)
        lineTo(5f, 12f)
        }
        }.build()

        return _domino!!
    }

private var _domino: ImageVector? = null
