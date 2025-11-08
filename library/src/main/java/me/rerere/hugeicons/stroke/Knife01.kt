package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Knife01: ImageVector
    get() {
        if (_knife01 != null) {
            return _knife01!!
        }
        _knife01 = ImageVector.Builder(
            name = "Knife01",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.8865f, 8.11621f)
        lineTo(18.8955f, 8.11621f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.6024f, 16.7446f)
        curveTo(18.3895f, 13.7178f, 20.3287f, 11.3284f, 21.54f, 9.70091f)
        curveTo(22.203f, 8.81007f, 22.5345f, 8.36466f, 22.4972f, 7.75756f)
        curveTo(22.4193f, 6.48963f, 19.2253f, 3f, 17.8204f, 3f)
        curveTo(17.1774f, 3f, 16.66f, 3.53734f, 15.6252f, 4.61201f)
        lineTo(3.04984f, 17.6718f)
        curveTo(2.31672f, 18.4331f, 2.31672f, 19.6675f, 3.04984f, 20.4289f)
        curveTo(3.881f, 21.2921f, 5.26287f, 21.1587f, 5.92662f, 20.1512f)
        lineTo(8.21648f, 16.6756f)
        curveTo(9.13465f, 15.282f, 9.79389f, 15.2741f, 10.8945f, 16.4171f)
        curveTo(11.5597f, 17.108f, 12.4005f, 18.395f, 13.4477f, 18.3828f)
        curveTo(14.1008f, 18.3753f, 14.6013f, 17.8317f, 15.6024f, 16.7446f)
        }
        }.build()

        return _knife01!!
    }

private var _knife01: ImageVector? = null
