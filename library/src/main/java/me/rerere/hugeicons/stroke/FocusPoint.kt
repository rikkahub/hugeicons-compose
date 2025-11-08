package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FocusPoint: ImageVector
    get() {
        if (_focusPoint != null) {
            return _focusPoint!!
        }
        _focusPoint = ImageVector.Builder(
            name = "FocusPoint",
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
        moveTo(9.13437f, 2.5f)
        curveTo(6.46809f, 2.56075f, 4.91075f, 2.81456f, 3.84669f, 3.87493f)
        curveTo(2.91541f, 4.80297f, 2.60411f, 6.10756f, 2.50005f, 8.2f)
        moveTo(14.8657f, 2.5f)
        curveTo(17.532f, 2.56075f, 19.0893f, 2.81456f, 20.1534f, 3.87493f)
        curveTo(21.0847f, 4.80297f, 21.396f, 6.10756f, 21.5f, 8.2f)
        moveTo(14.8657f, 21.5f)
        curveTo(17.532f, 21.4392f, 19.0893f, 21.1854f, 20.1534f, 20.1251f)
        curveTo(21.0847f, 19.197f, 21.396f, 17.8924f, 21.5f, 15.8f)
        moveTo(9.13437f, 21.5f)
        curveTo(6.46809f, 21.4392f, 4.91075f, 21.1854f, 3.84669f, 20.1251f)
        curveTo(2.91541f, 19.197f, 2.60411f, 17.8924f, 2.50005f, 15.8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 7f)
        lineTo(12.5f, 7f)
        moveTo(11.5f, 12f)
        horizontalLineTo(12.5f)
        moveTo(11.5f, 17f)
        horizontalLineTo(12.5f)
        moveTo(5f, 12f)
        horizontalLineTo(6f)
        moveTo(18f, 12f)
        horizontalLineTo(19f)
        }
        }.build()

        return _focusPoint!!
    }

private var _focusPoint: ImageVector? = null
