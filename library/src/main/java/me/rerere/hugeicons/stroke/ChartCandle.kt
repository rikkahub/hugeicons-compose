package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartCandle: ImageVector
    get() {
        if (_chartCandle != null) {
            return _chartCandle!!
        }
        _chartCandle = ImageVector.Builder(
            name = "ChartCandle",
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
        moveTo(10f, 9f)
        verticalLineTo(15f)
        curveTo(10f, 15.9319f, 10f, 16.3978f, 9.84776f, 16.7654f)
        curveTo(9.64477f, 17.2554f, 9.25542f, 17.6448f, 8.76537f, 17.8478f)
        curveTo(8.39782f, 18f, 7.93188f, 18f, 7f, 18f)
        curveTo(6.06812f, 18f, 5.60218f, 18f, 5.23463f, 17.8478f)
        curveTo(4.74458f, 17.6448f, 4.35523f, 17.2554f, 4.15224f, 16.7654f)
        curveTo(4f, 16.3978f, 4f, 15.9319f, 4f, 15f)
        verticalLineTo(9f)
        curveTo(4f, 8.06812f, 4f, 7.60218f, 4.15224f, 7.23463f)
        curveTo(4.35523f, 6.74458f, 4.74458f, 6.35523f, 5.23463f, 6.15224f)
        curveTo(5.60218f, 6f, 6.06812f, 6f, 7f, 6f)
        curveTo(7.93188f, 6f, 8.39782f, 6f, 8.76537f, 6.15224f)
        curveTo(9.25542f, 6.35523f, 9.64477f, 6.74458f, 9.84776f, 7.23463f)
        curveTo(10f, 7.60218f, 10f, 8.06812f, 10f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 14f)
        verticalLineTo(15f)
        curveTo(20f, 15.9319f, 20f, 16.3978f, 19.8478f, 16.7654f)
        curveTo(19.6448f, 17.2554f, 19.2554f, 17.6448f, 18.7654f, 17.8478f)
        curveTo(18.3978f, 18f, 17.9319f, 18f, 17f, 18f)
        curveTo(16.0681f, 18f, 15.6022f, 18f, 15.2346f, 17.8478f)
        curveTo(14.7446f, 17.6448f, 14.3552f, 17.2554f, 14.1522f, 16.7654f)
        curveTo(14f, 16.3978f, 14f, 15.9319f, 14f, 15f)
        verticalLineTo(14f)
        curveTo(14f, 13.0681f, 14f, 12.6022f, 14.1522f, 12.2346f)
        curveTo(14.3552f, 11.7446f, 14.7446f, 11.3552f, 15.2346f, 11.1522f)
        curveTo(15.6022f, 11f, 16.0681f, 11f, 17f, 11f)
        curveTo(17.9319f, 11f, 18.3978f, 11f, 18.7654f, 11.1522f)
        curveTo(19.2554f, 11.3552f, 19.6448f, 11.7446f, 19.8478f, 12.2346f)
        curveTo(20f, 12.6022f, 20f, 13.0681f, 20f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 11f)
        verticalLineTo(3f)
        moveTo(17f, 18f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 6f)
        verticalLineTo(3f)
        moveTo(7f, 18f)
        verticalLineTo(21f)
        }
        }.build()

        return _chartCandle!!
    }

private var _chartCandle: ImageVector? = null
