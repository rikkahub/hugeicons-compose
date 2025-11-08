package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Presentation02: ImageVector
    get() {
        if (_presentation02 != null) {
            return _presentation02!!
        }
        _presentation02 = ImageVector.Builder(
            name = "Presentation02",
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
        moveTo(3f, 17f)
        horizontalLineTo(21f)
        verticalLineTo(8f)
        curveTo(21f, 5.17157f, 21f, 3.75736f, 20.1213f, 2.87868f)
        curveTo(19.2426f, 2f, 17.8284f, 2f, 15f, 2f)
        horizontalLineTo(9f)
        curveTo(6.17157f, 2f, 4.75736f, 2f, 3.87868f, 2.87868f)
        curveTo(3f, 3.75736f, 3f, 5.17157f, 3f, 8f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 17f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        lineTo(12.0001f, 19f)
        lineTo(17f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17.1973f)
        verticalLineTo(22f)
        }
        }.build()

        return _presentation02!!
    }

private var _presentation02: ImageVector? = null
