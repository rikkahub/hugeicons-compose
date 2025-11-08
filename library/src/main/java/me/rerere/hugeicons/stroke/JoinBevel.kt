package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.JoinBevel: ImageVector
    get() {
        if (_joinBevel != null) {
            return _joinBevel!!
        }
        _joinBevel = ImageVector.Builder(
            name = "JoinBevel",
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
        moveTo(15f, 13f)
        lineTo(18f, 13f)
        curveTo(19.8856f, 13f, 20.8284f, 13f, 21.4142f, 13.5858f)
        curveTo(22f, 14.1716f, 22f, 15.1144f, 22f, 17f)
        verticalLineTo(18f)
        curveTo(22f, 19.8856f, 22f, 20.8284f, 21.4142f, 21.4142f)
        curveTo(20.8284f, 22f, 19.8856f, 22f, 18f, 22f)
        horizontalLineTo(10.6569f)
        curveTo(9.83935f, 22f, 9.4306f, 22f, 9.06306f, 21.8478f)
        curveTo(8.69552f, 21.6955f, 8.40649f, 21.4065f, 7.82843f, 20.8284f)
        lineTo(3.17157f, 16.1716f)
        curveTo(2.59351f, 15.5935f, 2.30448f, 15.3045f, 2.15224f, 14.9369f)
        curveTo(2f, 14.5694f, 2f, 14.1606f, 2f, 13.3431f)
        lineTo(2f, 6f)
        curveTo(2f, 4.11438f, 2f, 3.17157f, 2.58579f, 2.58579f)
        curveTo(3.17157f, 2f, 4.11438f, 2f, 6f, 2f)
        lineTo(7f, 2f)
        curveTo(8.88562f, 2f, 9.82843f, 2f, 10.4142f, 2.58579f)
        curveTo(11f, 3.17157f, 11f, 4.11438f, 11f, 6f)
        verticalLineTo(9f)
        curveTo(11f, 10.8856f, 11f, 11.8284f, 11.5858f, 12.4142f)
        curveTo(12.1716f, 13f, 13.1144f, 13f, 15f, 13f)
        }
        }.build()

        return _joinBevel!!
    }

private var _joinBevel: ImageVector? = null
