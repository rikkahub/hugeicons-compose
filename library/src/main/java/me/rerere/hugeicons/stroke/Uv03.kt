package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Uv03: ImageVector
    get() {
        if (_uv03 != null) {
            return _uv03!!
        }
        _uv03 = ImageVector.Builder(
            name = "Uv03",
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
        moveTo(17f, 13f)
        curveTo(17f, 10.2386f, 14.7614f, 8f, 12f, 8f)
        curveTo(9.23858f, 8f, 7f, 10.2386f, 7f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9998f, 4f)
        horizontalLineTo(12.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.3671f, 6.63268f)
        lineTo(18.3734f, 6.63903f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.63658f, 6.63978f)
        lineTo(5.64293f, 6.63343f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.0039f, 12.9959f)
        lineTo(21.0039f, 13.0049f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.00391f, 12.9959f)
        lineTo(3.00391f, 13.0049f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 16f)
        verticalLineTo(19f)
        curveTo(6.5f, 19.9428f, 6.5f, 20.4142f, 6.79289f, 20.7071f)
        curveTo(7.08579f, 21f, 7.55719f, 21f, 8.5f, 21f)
        verticalLineTo(21f)
        curveTo(9.44281f, 21f, 9.91421f, 21f, 10.2071f, 20.7071f)
        curveTo(10.5f, 20.4142f, 10.5f, 19.9428f, 10.5f, 19f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 16f)
        lineTo(15.5f, 21f)
        lineTo(17.5f, 16f)
        }
        }.build()

        return _uv03!!
    }

private var _uv03: ImageVector? = null
