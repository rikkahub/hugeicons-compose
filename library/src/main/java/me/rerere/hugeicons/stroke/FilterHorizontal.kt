package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FilterHorizontal: ImageVector
    get() {
        if (_filterHorizontal != null) {
            return _filterHorizontal!!
        }
        _filterHorizontal = ImageVector.Builder(
            name = "FilterHorizontal",
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
        moveTo(3f, 7f)
        horizontalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 17f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 17f)
        lineTo(21f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7f)
        lineTo(21f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7f)
        curveTo(6f, 6.06812f, 6f, 5.60218f, 6.15224f, 5.23463f)
        curveTo(6.35523f, 4.74458f, 6.74458f, 4.35523f, 7.23463f, 4.15224f)
        curveTo(7.60218f, 4f, 8.06812f, 4f, 9f, 4f)
        curveTo(9.93188f, 4f, 10.3978f, 4f, 10.7654f, 4.15224f)
        curveTo(11.2554f, 4.35523f, 11.6448f, 4.74458f, 11.8478f, 5.23463f)
        curveTo(12f, 5.60218f, 12f, 6.06812f, 12f, 7f)
        curveTo(12f, 7.93188f, 12f, 8.39782f, 11.8478f, 8.76537f)
        curveTo(11.6448f, 9.25542f, 11.2554f, 9.64477f, 10.7654f, 9.84776f)
        curveTo(10.3978f, 10f, 9.93188f, 10f, 9f, 10f)
        curveTo(8.06812f, 10f, 7.60218f, 10f, 7.23463f, 9.84776f)
        curveTo(6.74458f, 9.64477f, 6.35523f, 9.25542f, 6.15224f, 8.76537f)
        curveTo(6f, 8.39782f, 6f, 7.93188f, 6f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        curveTo(12f, 16.0681f, 12f, 15.6022f, 12.1522f, 15.2346f)
        curveTo(12.3552f, 14.7446f, 12.7446f, 14.3552f, 13.2346f, 14.1522f)
        curveTo(13.6022f, 14f, 14.0681f, 14f, 15f, 14f)
        curveTo(15.9319f, 14f, 16.3978f, 14f, 16.7654f, 14.1522f)
        curveTo(17.2554f, 14.3552f, 17.6448f, 14.7446f, 17.8478f, 15.2346f)
        curveTo(18f, 15.6022f, 18f, 16.0681f, 18f, 17f)
        curveTo(18f, 17.9319f, 18f, 18.3978f, 17.8478f, 18.7654f)
        curveTo(17.6448f, 19.2554f, 17.2554f, 19.6448f, 16.7654f, 19.8478f)
        curveTo(16.3978f, 20f, 15.9319f, 20f, 15f, 20f)
        curveTo(14.0681f, 20f, 13.6022f, 20f, 13.2346f, 19.8478f)
        curveTo(12.7446f, 19.6448f, 12.3552f, 19.2554f, 12.1522f, 18.7654f)
        curveTo(12f, 18.3978f, 12f, 17.9319f, 12f, 17f)
        }
        }.build()

        return _filterHorizontal!!
    }

private var _filterHorizontal: ImageVector? = null
