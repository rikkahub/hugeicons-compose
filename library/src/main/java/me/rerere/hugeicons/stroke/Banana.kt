package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Banana: ImageVector
    get() {
        if (_banana != null) {
            return _banana!!
        }
        _banana = ImageVector.Builder(
            name = "Banana",
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
        moveTo(14f, 11.9171f)
        curveTo(16f, 10.9087f, 18.478f, 11.7529f, 19.5777f, 14.1858f)
        curveTo(21.2282f, 17.8369f, 17.7619f, 21.8826f, 14.0077f, 21.9975f)
        curveTo(13.8997f, 22.0008f, 13.7859f, 21.9824f, 13.6861f, 21.9409f)
        curveTo(10.9391f, 20.7977f, 17.4719f, 16.7411f, 15.3319f, 14.5481f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.2591f, 13f)
        curveTo(12.753f, 11.1383f, 11.9705f, 9.25852f, 9.99515f, 9.72396f)
        curveTo(8.79898f, 10.0058f, 8.51642f, 10.8832f, 7.79305f, 10.9566f)
        curveTo(7.23113f, 11.0137f, 6.88441f, 10.372f, 7.03542f, 9.83562f)
        curveTo(8.1091f, 6.02216f, 15.5f, 6.03124f, 15.5f, 10.0073f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.0009f, 18.9084f)
        curveTo(11.807f, 19.9994f, 7.12675f, 20.6141f, 5.01867f, 19.0798f)
        curveTo(4.44082f, 18.6592f, 3.69853f, 18.7865f, 3.0238f, 18.7865f)
        curveTo(1.38828f, 18.7865f, 1.84992f, 15.5993f, 3.43752f, 16.2134f)
        curveTo(3.99904f, 16.4306f, 5.0201f, 16.7126f, 5.78158f, 16.281f)
        curveTo(10.6831f, 13.5034f, 15.9947f, 13.024f, 17.7464f, 5.71395f)
        curveTo(18.5261f, 2.46023f, 18.7506f, 2f, 20.0529f, 2f)
        curveTo(21.3553f, 2f, 22.9193f, 5.00117f, 21.3265f, 9.95847f)
        curveTo(20.9057f, 11.2678f, 20.4081f, 12.5772f, 19.6965f, 13.7991f)
        }
        }.build()

        return _banana!!
    }

private var _banana: ImageVector? = null
