package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AircraftGame: ImageVector
    get() {
        if (_aircraftGame != null) {
            return _aircraftGame!!
        }
        _aircraftGame = ImageVector.Builder(
            name = "AircraftGame",
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
        moveTo(5.43876f, 16.2353f)
        curveTo(5.43876f, 15.9728f, 5.43048f, 15.7223f, 5.41491f, 15.4832f)
        moveTo(5.41491f, 15.4832f)
        curveTo(5.27345f, 13.3108f, 4.53006f, 12.0839f, 3.9244f, 11.4706f)
        curveTo(2.87884f, 12.5294f, 0.464067f, 16.7647f, 3.41663f, 19.9412f)
        lineTo(8.18741f, 17.8235f)
        curveTo(8.28323f, 18.2095f, 8.39847f, 18.5927f, 8.53467f, 18.9717f)
        curveTo(8.84621f, 19.8385f, 9.00197f, 20.272f, 9.51962f, 20.636f)
        curveTo(10.0373f, 21f, 10.6089f, 21f, 11.7522f, 21f)
        horizontalLineTo(12.2478f)
        curveTo(13.3911f, 21f, 13.9627f, 21f, 14.4804f, 20.636f)
        curveTo(14.998f, 20.272f, 15.1538f, 19.8385f, 15.4653f, 18.9717f)
        curveTo(15.6015f, 18.5927f, 15.7168f, 18.2095f, 15.8126f, 17.8235f)
        lineTo(20.5834f, 19.9412f)
        curveTo(23.5359f, 16.7647f, 21.1212f, 12.5294f, 20.0756f, 11.4706f)
        curveTo(19.4699f, 12.0839f, 18.7265f, 13.3108f, 18.5851f, 15.4832f)
        moveTo(5.41491f, 15.4832f)
        lineTo(6.51316f, 15.0678f)
        curveTo(7.12169f, 14.8376f, 7.42596f, 14.7225f, 7.59991f, 14.4928f)
        curveTo(7.77386f, 14.2631f, 7.80478f, 13.9083f, 7.86661f, 13.1989f)
        curveTo(8.25599f, 8.73199f, 10.4257f, 4.62034f, 12f, 3f)
        curveTo(13.5743f, 4.62034f, 15.744f, 8.73199f, 16.1334f, 13.1989f)
        curveTo(16.1952f, 13.9083f, 16.2261f, 14.2631f, 16.4001f, 14.4928f)
        curveTo(16.574f, 14.7225f, 16.8783f, 14.8376f, 17.4868f, 15.0678f)
        lineTo(18.5851f, 15.4832f)
        moveTo(18.5612f, 16.2353f)
        curveTo(18.5612f, 15.9728f, 18.5695f, 15.7223f, 18.5851f, 15.4832f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        lineTo(12f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 8f)
        verticalLineTo(7f)
        moveTo(20f, 4f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 8f)
        verticalLineTo(7f)
        moveTo(4f, 4f)
        verticalLineTo(3f)
        }
        }.build()

        return _aircraftGame!!
    }

private var _aircraftGame: ImageVector? = null
