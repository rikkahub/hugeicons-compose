package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = ImageVector.Builder(
            name = "Hexagon",
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
        moveTo(7.84308f, 3.80211f)
        curveTo(9.8718f, 2.6007f, 10.8862f, 2f, 12f, 2f)
        curveTo(13.1138f, 2f, 14.1282f, 2.6007f, 16.1569f, 3.80211f)
        lineTo(16.8431f, 4.20846f)
        curveTo(18.8718f, 5.40987f, 19.8862f, 6.01057f, 20.4431f, 7f)
        curveTo(21f, 7.98943f, 21f, 9.19084f, 21f, 11.5937f)
        verticalLineTo(12.4063f)
        curveTo(21f, 14.8092f, 21f, 16.0106f, 20.4431f, 17f)
        curveTo(19.8862f, 17.9894f, 18.8718f, 18.5901f, 16.8431f, 19.7915f)
        lineTo(16.1569f, 20.1979f)
        curveTo(14.1282f, 21.3993f, 13.1138f, 22f, 12f, 22f)
        curveTo(10.8862f, 22f, 9.8718f, 21.3993f, 7.84308f, 20.1979f)
        lineTo(7.15692f, 19.7915f)
        curveTo(5.1282f, 18.5901f, 4.11384f, 17.9894f, 3.55692f, 17f)
        curveTo(3f, 16.0106f, 3f, 14.8092f, 3f, 12.4063f)
        verticalLineTo(11.5937f)
        curveTo(3f, 9.19084f, 3f, 7.98943f, 3.55692f, 7f)
        curveTo(4.11384f, 6.01057f, 5.1282f, 5.40987f, 7.15692f, 4.20846f)
        lineTo(7.84308f, 3.80211f)
        }
        }.build()

        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
