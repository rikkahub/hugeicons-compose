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
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 3.5f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 3.5f, 4.34315f, 3.5f, 3.17157f, 4.67157f)
        curveTo(2f, 5.84315f, 2f, 7.72876f, 2f, 11.5f)
        verticalLineTo(13.5f)
        curveTo(2f, 17.2712f, 2f, 19.1569f, 3.17157f, 20.3284f)
        curveTo(4.34315f, 21.5f, 6.22876f, 21.5f, 10f, 21.5f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 21.5f, 19.6569f, 21.5f, 20.8284f, 20.3284f)
        curveTo(22f, 19.1569f, 22f, 17.2712f, 22f, 13.5f)
        verticalLineTo(11.5f)
        curveTo(22f, 7.72876f, 22f, 5.84315f, 20.8284f, 4.67157f)
        curveTo(19.6569f, 3.5f, 17.7712f, 3.5f, 14f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 17.5f)
        lineTo(16.348f, 11.8797f)
        curveTo(16.1263f, 11.6377f, 15.8131f, 11.5f, 15.485f, 11.5f)
        curveTo(15.1744f, 11.5f, 14.8766f, 11.6234f, 14.6571f, 11.8429f)
        lineTo(10f, 16.5f)
        lineTo(7.83928f, 14.3393f)
        curveTo(7.62204f, 14.122f, 7.32741f, 14f, 7.02019f, 14f)
        curveTo(6.68931f, 14f, 6.37423f, 14.1415f, 6.15441f, 14.3888f)
        lineTo(2.5f, 18.5f)
        }
        }.build()

        return _image03!!
    }

private var _image03: ImageVector? = null
