package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RotateSquare: ImageVector
    get() {
        if (_rotateSquare != null) {
            return _rotateSquare!!
        }
        _rotateSquare = ImageVector.Builder(
            name = "RotateSquare",
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
        moveTo(8.66667f, 3.86984f)
        curveTo(9.998f, 2.62328f, 10.9234f, 2f, 12f, 2f)
        curveTo(13.4966f, 2f, 14.7009f, 3.20434f, 17.1096f, 5.61302f)
        lineTo(18.387f, 6.89042f)
        curveTo(20.7957f, 9.2991f, 22f, 10.5034f, 22f, 12f)
        curveTo(22f, 13.4966f, 20.7957f, 14.7009f, 18.387f, 17.1096f)
        lineTo(17.1096f, 18.387f)
        curveTo(14.7009f, 20.7957f, 13.4966f, 22f, 12f, 22f)
        curveTo(10.5034f, 22f, 9.2991f, 20.7957f, 6.89042f, 18.387f)
        lineTo(5.61302f, 17.1096f)
        curveTo(3.20434f, 14.7009f, 2f, 13.4966f, 2f, 12f)
        curveTo(2f, 10.8912f, 2.87352f, 9.7285f, 4.3058f, 8.22081f)
        curveTo(5.01214f, 7.47727f, 5.36531f, 7.1055f, 5.23534f, 6.80275f)
        curveTo(5.10536f, 6.5f, 4.59884f, 6.5f, 3.58579f, 6.5f)
        horizontalLineTo(2.5f)
        }
        }.build()

        return _rotateSquare!!
    }

private var _rotateSquare: ImageVector? = null
