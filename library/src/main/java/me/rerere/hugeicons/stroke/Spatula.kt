package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Spatula: ImageVector
    get() {
        if (_spatula != null) {
            return _spatula!!
        }
        _spatula = ImageVector.Builder(
            name = "Spatula",
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
        moveTo(16.9883f, 2.3804f)
        lineTo(17.7472f, 2.93078f)
        curveTo(19.0221f, 3.85525f, 20.1429f, 4.97492f, 21.0683f, 6.24847f)
        lineTo(21.6192f, 7.00668f)
        curveTo(22.1959f, 7.80028f, 22.1094f, 8.89493f, 21.4153f, 9.58834f)
        lineTo(16.8845f, 14.1145f)
        curveTo(16.41f, 14.5885f, 15.7289f, 14.7927f, 15.0716f, 14.6579f)
        lineTo(13.0341f, 14.2402f)
        curveTo(12.3768f, 14.1054f, 11.6957f, 14.3095f, 11.2212f, 14.7835f)
        lineTo(4.64801f, 21.3501f)
        curveTo(4.25619f, 21.7598f, 3.37487f, 22.4818f, 2.42256f, 21.5305f)
        curveTo(1.5593f, 20.6681f, 2.22016f, 19.7259f, 2.63037f, 19.3344f)
        lineTo(9.20354f, 12.7679f)
        curveTo(9.67802f, 12.2939f, 9.88238f, 11.6135f, 9.74747f, 10.9568f)
        lineTo(9.32928f, 8.92141f)
        curveTo(9.19437f, 8.26476f, 9.39873f, 7.58432f, 9.87321f, 7.11031f)
        lineTo(14.404f, 2.58413f)
        curveTo(15.0981f, 1.89071f, 16.1939f, 1.80433f, 16.9883f, 2.3804f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.2207f, 10.686f)
        lineTo(17.3751f, 8.53168f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.375f, 8.84143f)
        lineTo(15.5294f, 6.68707f)
        }
        }.build()

        return _spatula!!
    }

private var _spatula: ImageVector? = null
