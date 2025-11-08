package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScreenRotation: ImageVector
    get() {
        if (_screenRotation != null) {
            return _screenRotation!!
        }
        _screenRotation = ImageVector.Builder(
            name = "ScreenRotation",
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
        moveTo(2f, 12f)
        curveTo(2.13134f, 15.1935f, 4.1976f, 21.442f, 11.2999f, 21.9778f)
        curveTo(11.718f, 22.0094f, 11.9271f, 22.0251f, 11.987f, 21.8984f)
        curveTo(12.047f, 21.7717f, 11.8959f, 21.6247f, 11.5937f, 21.3308f)
        lineTo(10.2375f, 20.0117f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12.0001f)
        curveTo(21.8687f, 8.80658f, 19.8024f, 2.55807f, 12.7001f, 2.02225f)
        curveTo(12.282f, 1.99071f, 12.0729f, 1.97494f, 12.013f, 2.10167f)
        curveTo(11.953f, 2.2284f, 12.1041f, 2.37535f, 12.4063f, 2.66926f)
        lineTo(13.7625f, 3.98835f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.07586f, 13.4458f)
        curveTo(6.71281f, 12.0827f, 6.03128f, 11.4012f, 6.00104f, 10.5846f)
        curveTo(5.97079f, 9.76793f, 6.60363f, 9.13508f, 7.86933f, 7.86939f)
        curveTo(9.13502f, 6.6037f, 9.76786f, 5.97085f, 10.5845f, 6.0011f)
        curveTo(11.4012f, 6.03134f, 12.0827f, 6.71287f, 13.4457f, 8.07592f)
        lineTo(15.9241f, 10.5543f)
        curveTo(17.2872f, 11.9174f, 17.9687f, 12.5989f, 17.999f, 13.4156f)
        curveTo(18.0292f, 14.2322f, 17.3964f, 14.865f, 16.1307f, 16.1307f)
        curveTo(14.865f, 17.3964f, 14.2321f, 18.0293f, 13.4155f, 17.999f)
        curveTo(12.5988f, 17.9688f, 11.9173f, 17.2873f, 10.5543f, 15.9242f)
        lineTo(8.07586f, 13.4458f)
        }
        }.build()

        return _screenRotation!!
    }

private var _screenRotation: ImageVector? = null
