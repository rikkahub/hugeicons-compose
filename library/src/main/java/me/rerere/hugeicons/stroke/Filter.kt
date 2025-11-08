package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = ImageVector.Builder(
            name = "Filter",
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
        moveTo(8.85746f, 12.5061f)
        curveTo(6.36901f, 10.6456f, 4.59564f, 8.59915f, 3.62734f, 7.44867f)
        curveTo(3.3276f, 7.09253f, 3.22938f, 6.8319f, 3.17033f, 6.3728f)
        curveTo(2.96811f, 4.8008f, 2.86701f, 4.0148f, 3.32795f, 3.5074f)
        curveTo(3.7889f, 3f, 4.60404f, 3f, 6.23433f, 3f)
        horizontalLineTo(17.7657f)
        curveTo(19.396f, 3f, 20.2111f, 3f, 20.672f, 3.5074f)
        curveTo(21.133f, 4.0148f, 21.0319f, 4.8008f, 20.8297f, 6.37281f)
        curveTo(20.7706f, 6.83191f, 20.6724f, 7.09254f, 20.3726f, 7.44867f)
        curveTo(19.403f, 8.60062f, 17.6261f, 10.6507f, 15.1326f, 12.5135f)
        curveTo(14.907f, 12.6821f, 14.7583f, 12.9567f, 14.7307f, 13.2614f)
        curveTo(14.4837f, 15.992f, 14.2559f, 17.4876f, 14.1141f, 18.2442f)
        curveTo(13.8853f, 19.4657f, 12.1532f, 20.2006f, 11.226f, 20.8563f)
        curveTo(10.6741f, 21.2466f, 10.0043f, 20.782f, 9.93278f, 20.1778f)
        curveTo(9.79643f, 19.0261f, 9.53961f, 16.6864f, 9.25927f, 13.2614f)
        curveTo(9.23409f, 12.9539f, 9.08486f, 12.6761f, 8.85746f, 12.5061f)
        }
        }.build()

        return _filter!!
    }

private var _filter: ImageVector? = null
