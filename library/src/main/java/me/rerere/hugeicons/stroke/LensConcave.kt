package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LensConcave: ImageVector
    get() {
        if (_lensConcave != null) {
            return _lensConcave!!
        }
        _lensConcave = ImageVector.Builder(
            name = "LensConcave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.50295f, 18.1483f)
            curveTo(6.70064f, 20.1238f, 6.29948f, 21.1115f, 6.59105f, 21.5558f)
            curveTo(6.88262f, 22f, 7.79342f, 22f, 9.61503f, 22f)
            horizontalLineTo(14.3781f)
            curveTo(16.1971f, 22f, 17.1066f, 22f, 17.3988f, 21.5623f)
            curveTo(17.691f, 21.1245f, 17.3031f, 20.1255f, 16.5274f, 18.1274f)
            curveTo(15.8186f, 16.3018f, 15.4328f, 14.2156f, 15.4328f, 12f)
            curveTo(15.4328f, 9.78439f, 15.8186f, 7.69824f, 16.5274f, 5.87264f)
            curveTo(17.3031f, 3.87454f, 17.691f, 2.87548f, 17.3988f, 2.43774f)
            curveTo(17.1066f, 2f, 16.1971f, 2f, 14.3781f, 2f)
            horizontalLineTo(9.61503f)
            curveTo(7.79342f, 2f, 6.88262f, 2f, 6.59105f, 2.44424f)
            curveTo(6.29948f, 2.88848f, 6.70064f, 3.87621f, 7.50295f, 5.85167f)
            curveTo(8.24643f, 7.68226f, 8.66825f, 9.7759f, 8.66825f, 12f)
            curveTo(8.66825f, 14.2241f, 8.24643f, 16.3177f, 7.50295f, 18.1483f)
            close()
        }
        }.build()

        return _lensConcave!!
    }

private var _lensConcave: ImageVector? = null
