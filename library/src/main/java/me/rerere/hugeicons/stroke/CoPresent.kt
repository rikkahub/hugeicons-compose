package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CoPresent: ImageVector
    get() {
        if (_coPresent != null) {
            return _coPresent!!
        }
        _coPresent = ImageVector.Builder(
            name = "CoPresent",
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
        moveTo(3.58984f, 18.177f)
        curveTo(3.44055f, 18.0742f, 3.30166f, 17.9585f, 3.17157f, 17.8284f)
        curveTo(2f, 16.6569f, 2f, 14.7712f, 2f, 11f)
        curveTo(2f, 7.22876f, 2f, 5.34315f, 3.17157f, 4.17157f)
        curveTo(4.34315f, 3f, 6.22876f, 3f, 10f, 3f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 3f, 19.6569f, 3f, 20.8284f, 4.17157f)
        curveTo(22f, 5.34315f, 22f, 7.22876f, 22f, 11f)
        curveTo(22f, 14.7712f, 22f, 16.6569f, 20.8284f, 17.8284f)
        curveTo(20.6983f, 17.9585f, 20.5595f, 18.0742f, 20.4102f, 18.177f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.6863f, 16.926f)
        curveTo(7.82171f, 17.4525f, 5.55483f, 18.5276f, 6.93552f, 19.8729f)
        curveTo(7.60997f, 20.53f, 8.36113f, 21f, 9.30553f, 21f)
        horizontalLineTo(14.6945f)
        curveTo(15.6389f, 21f, 16.39f, 20.53f, 17.0645f, 19.8729f)
        curveTo(18.4452f, 18.5276f, 16.1783f, 17.4525f, 15.3137f, 16.926f)
        curveTo(13.2863f, 15.6913f, 10.7137f, 15.6913f, 8.6863f, 16.926f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 11f)
        curveTo(14.5f, 12.3807f, 13.3807f, 13.5f, 12f, 13.5f)
        curveTo(10.6193f, 13.5f, 9.5f, 12.3807f, 9.5f, 11f)
        curveTo(9.5f, 9.61929f, 10.6193f, 8.5f, 12f, 8.5f)
        curveTo(13.3807f, 8.5f, 14.5f, 9.61929f, 14.5f, 11f)
        }
        }.build()

        return _coPresent!!
    }

private var _coPresent: ImageVector? = null
