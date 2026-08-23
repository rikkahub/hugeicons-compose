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

val HugeIcons.Navigation07: ImageVector
    get() {
        if (_navigation07 != null) {
            return _navigation07!!
        }
        _navigation07 = ImageVector.Builder(
            name = "Navigation07",
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
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6.72945f, 10.4584f)
            curveTo(9.00174f, 5.81947f, 10.1379f, 3.5f, 11.9922f, 3.5f)
            curveTo(13.8465f, 3.5f, 14.9826f, 5.81946f, 17.2549f, 10.4584f)
            lineTo(18.8023f, 13.6174f)
            curveTo(20.5474f, 17.18f, 21.4199f, 18.9613f, 20.7855f, 19.8178f)
            curveTo(20.615f, 20.0481f, 20.3902f, 20.238f, 20.1288f, 20.3729f)
            curveTo(19.1565f, 20.8743f, 17.3716f, 19.8641f, 13.8018f, 17.8436f)
            curveTo(13.01f, 17.3954f, 12.6141f, 17.1713f, 12.1811f, 17.1312f)
            curveTo(12.0555f, 17.1196f, 11.9289f, 17.1196f, 11.8032f, 17.1312f)
            curveTo(11.3703f, 17.1713f, 10.9744f, 17.3954f, 10.1826f, 17.8436f)
            curveTo(6.61278f, 19.8641f, 4.82789f, 20.8743f, 3.85556f, 20.3729f)
            curveTo(3.59415f, 20.238f, 3.36938f, 20.0481f, 3.19883f, 19.8178f)
            curveTo(2.56445f, 18.9613f, 3.437f, 17.18f, 5.18208f, 13.6174f)
            lineTo(6.72945f, 10.4584f)
            close()
        }
        }.build()

        return _navigation07!!
    }

private var _navigation07: ImageVector? = null
