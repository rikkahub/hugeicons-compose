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
        moveTo(18.3865f, 8.11621f)
        lineTo(18.3955f, 8.11621f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.1024f, 16.7446f)
        curveTo(17.8895f, 13.7178f, 19.8287f, 11.3284f, 21.04f, 9.70091f)
        curveTo(21.703f, 8.81007f, 22.0345f, 8.36466f, 21.9972f, 7.75756f)
        curveTo(21.9193f, 6.48963f, 18.7253f, 3f, 17.3204f, 3f)
        curveTo(16.6774f, 3f, 16.16f, 3.53734f, 15.1252f, 4.61201f)
        lineTo(2.54984f, 17.6718f)
        curveTo(1.81672f, 18.4331f, 1.81672f, 19.6675f, 2.54984f, 20.4289f)
        curveTo(3.381f, 21.2921f, 4.76287f, 21.1587f, 5.42662f, 20.1512f)
        lineTo(7.71648f, 16.6756f)
        curveTo(8.63465f, 15.282f, 9.29389f, 15.2741f, 10.3945f, 16.4171f)
        curveTo(11.0597f, 17.108f, 11.9005f, 18.395f, 12.9477f, 18.3828f)
        curveTo(13.6008f, 18.3753f, 14.1013f, 17.8317f, 15.1024f, 16.7446f)
        }
        }.build()

        return _knife01!!
    }

private var _knife01: ImageVector? = null
