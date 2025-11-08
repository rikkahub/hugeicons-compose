package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Route02: ImageVector
    get() {
        if (_route02 != null) {
            return _route02!!
        }
        _route02 = ImageVector.Builder(
            name = "Route02",
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
        moveTo(18.7185f, 10.7151f)
        curveTo(18.5258f, 10.8979f, 18.2682f, 11f, 18.0001f, 11f)
        curveTo(17.732f, 11f, 17.4744f, 10.8979f, 17.2817f, 10.7151f)
        curveTo(15.5167f, 9.03169f, 13.1515f, 7.15111f, 14.305f, 4.42085f)
        curveTo(14.9286f, 2.94462f, 16.4257f, 2f, 18.0001f, 2f)
        curveTo(19.5745f, 2f, 21.0715f, 2.94462f, 21.6952f, 4.42085f)
        curveTo(22.8472f, 7.14767f, 20.4878f, 9.03749f, 18.7185f, 10.7151f)
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

        return _route02!!
    }

private var _route02: ImageVector? = null
