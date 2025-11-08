package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Route03: ImageVector
    get() {
        if (_route03 != null) {
            return _route03!!
        }
        _route03 = ImageVector.Builder(
            name = "Route03",
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
        moveTo(18f, 2f)
        curveTo(20.1647f, 2f, 22f, 3.81484f, 22f, 6.01659f)
        curveTo(22f, 8.25341f, 20.1348f, 9.82312f, 18.412f, 10.8905f)
        curveTo(18.2864f, 10.9623f, 18.1445f, 11f, 18f, 11f)
        curveTo(17.8555f, 11f, 17.7136f, 10.9623f, 17.588f, 10.8905f)
        curveTo(15.8684f, 9.8127f, 14f, 8.26115f, 14f, 6.01659f)
        curveTo(14f, 3.81484f, 15.8353f, 2f, 18f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 6f)
        horizontalLineTo(18.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 7f)
        horizontalLineTo(9.5f)
        curveTo(7.567f, 7f, 6f, 8.34315f, 6f, 10f)
        curveTo(6f, 11.6569f, 7.567f, 13f, 9.5f, 13f)
        horizontalLineTo(12.5f)
        curveTo(14.433f, 13f, 16f, 14.3431f, 16f, 16f)
        curveTo(16f, 17.6569f, 14.433f, 19f, 12.5f, 19f)
        horizontalLineTo(11f)
        }
        }.build()

        return _route03!!
    }

private var _route03: ImageVector? = null
