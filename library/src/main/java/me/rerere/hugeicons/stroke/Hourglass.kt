package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = ImageVector.Builder(
            name = "Hourglass",
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
        moveTo(4f, 3f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 3f)
        verticalLineTo(5.03039f)
        curveTo(5.5f, 6.27227f, 6.07682f, 7.4437f, 7.06116f, 8.20089f)
        lineTo(12f, 12f)
        lineTo(16.9388f, 8.20089f)
        curveTo(17.9232f, 7.44371f, 18.5f, 6.27227f, 18.5f, 5.03039f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 21f)
        verticalLineTo(18.9696f)
        curveTo(5.5f, 17.7277f, 6.07682f, 16.5563f, 7.06116f, 15.7991f)
        lineTo(12f, 12f)
        lineTo(16.9388f, 15.7991f)
        curveTo(17.9232f, 16.5563f, 18.5f, 17.7277f, 18.5f, 18.9696f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 21f)
        horizontalLineTo(20f)
        }
        }.build()

        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
