package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Image03: ImageVector
    get() {
        if (_image03 != null) {
            return _image03!!
        }
        _image03 = ImageVector.Builder(
            name = "Image03",
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
        moveTo(14f, 3f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 3f, 4.34315f, 3f, 3.17157f, 4.17157f)
        curveTo(2f, 5.34315f, 2f, 7.22876f, 2f, 11f)
        verticalLineTo(13f)
        curveTo(2f, 16.7712f, 2f, 18.6569f, 3.17157f, 19.8284f)
        curveTo(4.34315f, 21f, 6.22876f, 21f, 10f, 21f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 21f, 19.6569f, 21f, 20.8284f, 19.8284f)
        curveTo(22f, 18.6569f, 22f, 16.7712f, 22f, 13f)
        verticalLineTo(11f)
        curveTo(22f, 7.22876f, 22f, 5.34315f, 20.8284f, 4.17157f)
        curveTo(19.6569f, 3f, 17.7712f, 3f, 14f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 17f)
        lineTo(16.348f, 11.3797f)
        curveTo(16.1263f, 11.1377f, 15.8131f, 11f, 15.485f, 11f)
        curveTo(15.1744f, 11f, 14.8766f, 11.1234f, 14.6571f, 11.3429f)
        lineTo(10f, 16f)
        lineTo(7.83928f, 13.8393f)
        curveTo(7.62204f, 13.622f, 7.32741f, 13.5f, 7.02019f, 13.5f)
        curveTo(6.68931f, 13.5f, 6.37423f, 13.6415f, 6.15441f, 13.8888f)
        lineTo(2.5f, 18f)
        }
        }.build()

        return _image03!!
    }

private var _image03: ImageVector? = null
