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

val HugeIcons.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = ImageVector.Builder(
            name = "GraduationCap",
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
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.54155f, 4.65208f)
            lineTo(6.98306f, 5.92425f)
            curveTo(3.66102f, 7.57609f, 2f, 8.40201f, 2f, 9.75f)
            curveTo(2f, 11.098f, 3.66102f, 11.9239f, 6.98306f, 13.5757f)
            lineTo(9.54155f, 14.8479f)
            curveTo(10.751f, 15.4493f, 11.3557f, 15.75f, 12f, 15.75f)
            curveTo(12.6443f, 15.75f, 13.249f, 15.4493f, 14.4584f, 14.8479f)
            lineTo(17.0169f, 13.5757f)
            curveTo(20.339f, 11.9239f, 22f, 11.098f, 22f, 9.75f)
            curveTo(22f, 8.40201f, 20.339f, 7.57609f, 17.0169f, 5.92425f)
            lineTo(14.4584f, 4.65208f)
            curveTo(13.249f, 4.05069f, 12.6443f, 3.75f, 12f, 3.75f)
            curveTo(11.3557f, 3.75f, 10.751f, 4.05069f, 9.54155f, 4.65208f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 13.25f)
            verticalLineTo(17.057f)
            curveTo(6f, 17.1486f, 6f, 17.1944f, 6.00176f, 17.2369f)
            curveTo(6.03098f, 17.9434f, 6.42116f, 18.5835f, 7.03141f, 18.926f)
            curveTo(7.06808f, 18.9466f, 7.10848f, 18.967f, 7.18928f, 19.008f)
            curveTo(7.51967f, 19.1755f, 7.68487f, 19.2592f, 7.84453f, 19.3332f)
            curveTo(10.4837f, 20.5556f, 13.5163f, 20.5556f, 16.1555f, 19.3332f)
            curveTo(16.3151f, 19.2592f, 16.4803f, 19.1755f, 16.8107f, 19.008f)
            curveTo(16.8915f, 18.967f, 16.9319f, 18.9466f, 16.9686f, 18.926f)
            curveTo(17.5788f, 18.5835f, 17.969f, 17.9434f, 17.9982f, 17.2369f)
            curveTo(18f, 17.1944f, 18f, 17.1486f, 18f, 17.057f)
            verticalLineTo(13.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 9.75f)
            verticalLineTo(16.2506f)
        }
        }.build()

        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
