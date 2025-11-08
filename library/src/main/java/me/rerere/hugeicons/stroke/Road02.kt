package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Road02: ImageVector
    get() {
        if (_road02 != null) {
            return _road02!!
        }
        _road02 = ImageVector.Builder(
            name = "Road02",
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
        moveTo(20.8284f, 5.17157f)
        curveTo(19.6569f, 4f, 17.7712f, 4f, 14f, 4f)
        lineTo(10f, 4f)
        curveTo(6.22877f, 4f, 4.34315f, 4f, 3.17157f, 5.17157f)
        moveTo(20.8284f, 5.17157f)
        curveTo(22f, 6.34315f, 22f, 8.22876f, 22f, 12f)
        curveTo(22f, 15.7712f, 22f, 17.6569f, 20.8284f, 18.8284f)
        moveTo(20.8284f, 5.17157f)
        curveTo(20.8284f, 5.17157f, 20.8284f, 5.17157f, 20.8284f, 5.17157f)
        moveTo(3.17157f, 5.17157f)
        curveTo(2f, 6.34315f, 2f, 8.22876f, 2f, 12f)
        curveTo(2f, 15.7712f, 2f, 17.6569f, 3.17157f, 18.8284f)
        moveTo(3.17157f, 5.17157f)
        curveTo(3.17157f, 5.17157f, 3.17157f, 5.17157f, 3.17157f, 5.17157f)
        moveTo(3.17157f, 18.8284f)
        curveTo(4.34315f, 20f, 6.22876f, 20f, 10f, 20f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 20f, 19.6569f, 20f, 20.8284f, 18.8284f)
        moveTo(3.17157f, 18.8284f)
        curveTo(3.17157f, 18.8284f, 3.17157f, 18.8284f, 3.17157f, 18.8284f)
        moveTo(20.8284f, 18.8284f)
        curveTo(20.8284f, 18.8284f, 20.8284f, 18.8284f, 20.8284f, 18.8284f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 12f)
        lineTo(11f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 12f)
        lineTo(16.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 12f)
        lineTo(5.5f, 12f)
        }
        }.build()

        return _road02!!
    }

private var _road02: ImageVector? = null
