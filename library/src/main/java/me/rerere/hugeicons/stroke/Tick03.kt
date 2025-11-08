package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Tick03: ImageVector
    get() {
        if (_tick03 != null) {
            return _tick03!!
        }
        _tick03 = ImageVector.Builder(
            name = "Tick03",
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
        moveTo(11.4743f, 17.3058f)
        curveTo(14.4874f, 14.0819f, 17.3962f, 11.8949f, 21.0501f, 8.79776f)
        curveTo(22.1437f, 7.87072f, 22.3126f, 6.24578f, 21.4547f, 5.09453f)
        curveTo(20.5429f, 3.87098f, 18.8103f, 3.62642f, 17.6376f, 4.59913f)
        curveTo(14.2907f, 7.37521f, 11.6868f, 10.0482f, 9.21679f, 12.9051f)
        curveTo(9.08718f, 13.055f, 9.02237f, 13.13f, 8.95511f, 13.1722f)
        curveTo(8.78453f, 13.2792f, 8.57138f, 13.2803f, 8.3997f, 13.1751f)
        curveTo(8.33199f, 13.1336f, 8.26707f, 13.0601f, 8.13722f, 12.9131f)
        lineTo(6.82103f, 11.4229f)
        curveTo(5.6201f, 10.0631f, 3.46608f, 10.2137f, 2.46339f, 11.7274f)
        curveTo(1.76171f, 12.7867f, 1.86569f, 14.1905f, 2.71567f, 15.1334f)
        lineTo(4.7796f, 17.4229f)
        curveTo(6.32334f, 19.1353f, 7.09521f, 19.9916f, 8.02185f, 19.9999f)
        curveTo(8.94849f, 20.0083f, 9.79043f, 19.1075f, 11.4743f, 17.3058f)
        }
        }.build()

        return _tick03!!
    }

private var _tick03: ImageVector? = null
