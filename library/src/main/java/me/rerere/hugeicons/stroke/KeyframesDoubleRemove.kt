package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KeyframesDoubleRemove: ImageVector
    get() {
        if (_keyframesDoubleRemove != null) {
            return _keyframesDoubleRemove!!
        }
        _keyframesDoubleRemove = ImageVector.Builder(
            name = "KeyframesDoubleRemove",
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
        moveTo(14.002f, 4.5f)
        curveTo(14.3775f, 4.16667f, 14.6982f, 4f, 15.068f, 4f)
        curveTo(15.7661f, 4f, 16.2896f, 4.59409f, 17.3365f, 5.78228f)
        lineTo(19.9113f, 8.70448f)
        curveTo(21.3036f, 10.2847f, 21.9998f, 11.0747f, 21.9998f, 12f)
        curveTo(21.9998f, 12.9253f, 21.3036f, 13.7153f, 19.9113f, 15.2955f)
        lineTo(17.3365f, 18.2177f)
        curveTo(16.2896f, 19.4059f, 15.7661f, 20f, 15.068f, 20f)
        curveTo(14.6982f, 20f, 14.3775f, 19.8333f, 14.002f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 5.4398f)
        curveTo(7.86196f, 4.47993f, 8.35392f, 4f, 8.98862f, 4f)
        curveTo(9.69478f, 4f, 10.2243f, 4.59409f, 11.2832f, 5.78228f)
        lineTo(13.8875f, 8.70448f)
        curveTo(15.2959f, 10.2847f, 16f, 11.0747f, 16f, 12f)
        curveTo(16f, 12.9253f, 15.2959f, 13.7153f, 13.8876f, 15.2955f)
        lineTo(11.2832f, 18.2177f)
        curveTo(10.2243f, 19.4059f, 9.69478f, 20f, 8.98862f, 20f)
        curveTo(8.35392f, 20f, 7.86196f, 19.5201f, 7f, 18.5602f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        horizontalLineTo(9f)
        }
        }.build()

        return _keyframesDoubleRemove!!
    }

private var _keyframesDoubleRemove: ImageVector? = null
