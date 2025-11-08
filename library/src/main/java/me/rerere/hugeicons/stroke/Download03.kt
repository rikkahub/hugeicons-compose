package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Download03: ImageVector
    get() {
        if (_download03 != null) {
            return _download03!!
        }
        _download03 = ImageVector.Builder(
            name = "Download03",
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
        moveTo(14f, 21.5f)
        horizontalLineTo(10f)
        curveTo(6.71252f, 21.5f, 5.06878f, 21.5f, 3.96243f, 20.592f)
        curveTo(3.75989f, 20.4258f, 3.57418f, 20.2401f, 3.40796f, 20.0376f)
        curveTo(2.5f, 18.9312f, 2.5f, 17.2875f, 2.5f, 14f)
        curveTo(2.5f, 10.7125f, 2.5f, 9.06878f, 3.40796f, 7.96243f)
        curveTo(3.57418f, 7.75989f, 3.75989f, 7.57418f, 3.96243f, 7.40796f)
        curveTo(5.06878f, 6.5f, 6.71252f, 6.5f, 10f, 6.5f)
        horizontalLineTo(14f)
        curveTo(17.2875f, 6.5f, 18.9312f, 6.5f, 20.0376f, 7.40796f)
        curveTo(20.2401f, 7.57418f, 20.4258f, 7.75989f, 20.592f, 7.96243f)
        curveTo(21.5f, 9.06878f, 21.5f, 10.7125f, 21.5f, 14f)
        curveTo(21.5f, 17.2875f, 21.5f, 18.9312f, 20.592f, 20.0376f)
        curveTo(20.4258f, 20.2401f, 20.2401f, 20.4258f, 20.0376f, 20.592f)
        curveTo(18.9312f, 21.5f, 17.2875f, 21.5f, 14f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 14.5f)
        verticalLineTo(10.5f)
        curveTo(2.5f, 6.72876f, 2.5f, 4.84315f, 3.67157f, 3.67157f)
        curveTo(4.84315f, 2.5f, 6.72876f, 2.5f, 10.5f, 2.5f)
        horizontalLineTo(13.5f)
        curveTo(17.2712f, 2.5f, 19.1569f, 2.5f, 20.3284f, 3.67157f)
        curveTo(21.5f, 4.84315f, 21.5f, 6.72876f, 21.5f, 10.5f)
        verticalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 14.5f)
        curveTo(15f, 14.5f, 12.7905f, 17.4999f, 12f, 17.4999f)
        curveTo(11.2094f, 17.5f, 9f, 14.4999f, 9f, 14.4999f)
        moveTo(12f, 17f)
        lineTo(12f, 10.5f)
        }
        }.build()

        return _download03!!
    }

private var _download03: ImageVector? = null
