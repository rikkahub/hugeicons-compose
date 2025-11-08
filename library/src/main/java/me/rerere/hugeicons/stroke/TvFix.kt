package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TvFix: ImageVector
    get() {
        if (_tvFix != null) {
            return _tvFix!!
        }
        _tvFix = ImageVector.Builder(
            name = "TvFix",
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
        moveTo(2f, 14f)
        curveTo(2f, 10.2288f, 2f, 8.34315f, 3.17157f, 7.17157f)
        curveTo(4.34315f, 6f, 6.22876f, 6f, 10f, 6f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 6f, 19.6569f, 6f, 20.8284f, 7.17157f)
        curveTo(22f, 8.34315f, 22f, 10.2288f, 22f, 14f)
        curveTo(22f, 17.7712f, 22f, 19.6569f, 20.8284f, 20.8284f)
        curveTo(19.6569f, 22f, 17.7712f, 22f, 14f, 22f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 22f, 4.34315f, 22f, 3.17157f, 20.8284f)
        curveTo(2f, 19.6569f, 2f, 17.7712f, 2f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.3333f, 12.6665f)
        lineTo(10.6667f, 15.3333f)
        moveTo(13.3333f, 12.6665f)
        curveTo(14.0697f, 13.4029f, 15.2636f, 13.4032f, 16f, 12.6668f)
        moveTo(13.3333f, 12.6665f)
        curveTo(12.597f, 11.9301f, 12.597f, 10.7364f, 13.3333f, 10f)
        moveTo(10.6667f, 15.3333f)
        curveTo(11.4031f, 16.0698f, 11.403f, 17.2636f, 10.6667f, 18f)
        moveTo(10.6667f, 15.3333f)
        curveTo(9.93031f, 14.5969f, 8.73638f, 14.5968f, 8f, 15.3332f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 3f)
        lineTo(12f, 6f)
        lineTo(16f, 2f)
        }
        }.build()

        return _tvFix!!
    }

private var _tvFix: ImageVector? = null
