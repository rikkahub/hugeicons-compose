package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FilterRemove: ImageVector
    get() {
        if (_filterRemove != null) {
            return _filterRemove!!
        }
        _filterRemove = ImageVector.Builder(
            name = "FilterRemove",
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
        moveTo(20.9987f, 4.5f)
        curveTo(20.9869f, 4.06504f, 20.8956f, 3.75346f, 20.672f, 3.5074f)
        curveTo(20.2111f, 3f, 19.396f, 3f, 17.7657f, 3f)
        horizontalLineTo(6.23433f)
        curveTo(4.60404f, 3f, 3.7889f, 3f, 3.32795f, 3.5074f)
        curveTo(2.86701f, 4.0148f, 2.96811f, 4.8008f, 3.17033f, 6.3728f)
        curveTo(3.22938f, 6.8319f, 3.3276f, 7.09253f, 3.62734f, 7.44867f)
        curveTo(4.59564f, 8.59915f, 6.36901f, 10.6456f, 8.85746f, 12.5061f)
        curveTo(9.08486f, 12.6761f, 9.23409f, 12.9539f, 9.25927f, 13.2614f)
        curveTo(9.53961f, 16.6864f, 9.79643f, 19.0261f, 9.93278f, 20.1778f)
        curveTo(10.0043f, 20.782f, 10.6741f, 21.2466f, 11.226f, 20.8563f)
        curveTo(12.1532f, 20.2006f, 13.8853f, 19.4657f, 14.1141f, 18.2442f)
        curveTo(14.1986f, 17.7934f, 14.3136f, 17.0803f, 14.445f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 7f)
        lineTo(15f, 13f)
        moveTo(21f, 13f)
        lineTo(15f, 7f)
        }
        }.build()

        return _filterRemove!!
    }

private var _filterRemove: ImageVector? = null
