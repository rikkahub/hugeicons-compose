package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FilterVertical: ImageVector
    get() {
        if (_filterVertical != null) {
            return _filterVertical!!
        }
        _filterVertical = ImageVector.Builder(
            name = "FilterVertical",
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
        moveTo(7f, 21f)
        lineTo(7f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 21f)
        lineTo(17f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 6f)
        lineTo(17f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 9f)
        lineTo(7f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 18f)
        curveTo(6.06812f, 18f, 5.60218f, 18f, 5.23463f, 17.8478f)
        curveTo(4.74458f, 17.6448f, 4.35523f, 17.2554f, 4.15224f, 16.7654f)
        curveTo(4f, 16.3978f, 4f, 15.9319f, 4f, 15f)
        curveTo(4f, 14.0681f, 4f, 13.6022f, 4.15224f, 13.2346f)
        curveTo(4.35523f, 12.7446f, 4.74458f, 12.3552f, 5.23463f, 12.1522f)
        curveTo(5.60218f, 12f, 6.06812f, 12f, 7f, 12f)
        curveTo(7.93188f, 12f, 8.39782f, 12f, 8.76537f, 12.1522f)
        curveTo(9.25542f, 12.3552f, 9.64477f, 12.7446f, 9.84776f, 13.2346f)
        curveTo(10f, 13.6022f, 10f, 14.0681f, 10f, 15f)
        curveTo(10f, 15.9319f, 10f, 16.3978f, 9.84776f, 16.7654f)
        curveTo(9.64477f, 17.2554f, 9.25542f, 17.6448f, 8.76537f, 17.8478f)
        curveTo(8.39782f, 18f, 7.93188f, 18f, 7f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 12f)
        curveTo(16.0681f, 12f, 15.6022f, 12f, 15.2346f, 11.8478f)
        curveTo(14.7446f, 11.6448f, 14.3552f, 11.2554f, 14.1522f, 10.7654f)
        curveTo(14f, 10.3978f, 14f, 9.93188f, 14f, 9f)
        curveTo(14f, 8.06812f, 14f, 7.60218f, 14.1522f, 7.23463f)
        curveTo(14.3552f, 6.74458f, 14.7446f, 6.35523f, 15.2346f, 6.15224f)
        curveTo(15.6022f, 6f, 16.0681f, 6f, 17f, 6f)
        curveTo(17.9319f, 6f, 18.3978f, 6f, 18.7654f, 6.15224f)
        curveTo(19.2554f, 6.35523f, 19.6448f, 6.74458f, 19.8478f, 7.23463f)
        curveTo(20f, 7.60218f, 20f, 8.06812f, 20f, 9f)
        curveTo(20f, 9.93188f, 20f, 10.3978f, 19.8478f, 10.7654f)
        curveTo(19.6448f, 11.2554f, 19.2554f, 11.6448f, 18.7654f, 11.8478f)
        curveTo(18.3978f, 12f, 17.9319f, 12f, 17f, 12f)
        }
        }.build()

        return _filterVertical!!
    }

private var _filterVertical: ImageVector? = null
