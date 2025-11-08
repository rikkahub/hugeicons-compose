package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CourtLaw: ImageVector
    get() {
        if (_courtLaw != null) {
            return _courtLaw!!
        }
        _courtLaw = ImageVector.Builder(
            name = "CourtLaw",
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
        moveTo(2.35139f, 13.2135f)
        curveTo(1.99837f, 10.9162f, 1.82186f, 9.76763f, 2.25617f, 8.74938f)
        curveTo(2.69047f, 7.73112f, 3.65403f, 7.03443f, 5.58114f, 5.64106f)
        lineTo(7.02099f, 4.6f)
        curveTo(9.41829f, 2.86667f, 10.6169f, 2f, 12f, 2f)
        curveTo(13.3831f, 2f, 14.5817f, 2.86667f, 16.979f, 4.6f)
        lineTo(18.4189f, 5.64106f)
        curveTo(20.346f, 7.03443f, 21.3095f, 7.73112f, 21.7438f, 8.74938f)
        curveTo(22.1781f, 9.76763f, 22.0016f, 10.9162f, 21.6486f, 13.2135f)
        lineTo(21.3476f, 15.1724f)
        curveTo(20.8471f, 18.4289f, 20.5969f, 20.0572f, 19.429f, 21.0286f)
        curveTo(18.2611f, 22f, 16.5537f, 22f, 13.1388f, 22f)
        horizontalLineTo(10.8612f)
        curveTo(7.44633f, 22f, 5.73891f, 22f, 4.571f, 21.0286f)
        curveTo(3.40309f, 20.0572f, 3.15287f, 18.4289f, 2.65243f, 15.1724f)
        lineTo(2.35139f, 13.2135f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.25f, 13.25f)
        curveTo(12.4368f, 14.4368f, 14f, 15.6429f, 14f, 15.6429f)
        lineTo(16.1429f, 13.5f)
        curveTo(16.1429f, 13.5f, 14.9368f, 11.9368f, 13.75f, 10.75f)
        curveTo(12.5632f, 9.56319f, 11f, 8.35714f, 11f, 8.35714f)
        lineTo(8.85714f, 10.5f)
        curveTo(8.85714f, 10.5f, 10.0632f, 12.0632f, 11.25f, 13.25f)
        moveTo(11.25f, 13.25f)
        lineTo(7.5f, 17f)
        moveTo(16.5f, 13.1429f)
        lineTo(13.6429f, 16f)
        moveTo(11.3571f, 8f)
        lineTo(8.5f, 10.8571f)
        }
        }.build()

        return _courtLaw!!
    }

private var _courtLaw: ImageVector? = null
