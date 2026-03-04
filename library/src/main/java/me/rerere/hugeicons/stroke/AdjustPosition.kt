package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AdjustPosition: ImageVector
    get() {
        if (_adjustPosition != null) {
            return _adjustPosition!!
        }
        _adjustPosition = ImageVector.Builder(
            name = "AdjustPosition",
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
        moveTo(17f, 10f)
        horizontalLineTo(19f)
        curveTo(19.9319f, 10f, 20.3978f, 10f, 20.7654f, 9.84776f)
        curveTo(21.2554f, 9.64477f, 21.6448f, 9.25542f, 21.8478f, 8.76537f)
        curveTo(22f, 8.39782f, 22f, 7.93188f, 22f, 7f)
        curveTo(22f, 6.06812f, 22f, 5.60218f, 21.8478f, 5.23463f)
        curveTo(21.6448f, 4.74458f, 21.2554f, 4.35523f, 20.7654f, 4.15224f)
        curveTo(20.3978f, 4f, 19.9319f, 4f, 19f, 4f)
        horizontalLineTo(17f)
        curveTo(16.0681f, 4f, 15.6022f, 4f, 15.2346f, 4.15224f)
        curveTo(14.7446f, 4.35523f, 14.3552f, 4.74458f, 14.1522f, 5.23463f)
        curveTo(14f, 5.60218f, 14f, 6.06812f, 14f, 7f)
        curveTo(14f, 7.93188f, 14f, 8.39782f, 14.1522f, 8.76537f)
        curveTo(14.3552f, 9.25542f, 14.7446f, 9.64477f, 15.2346f, 9.84776f)
        curveTo(15.6022f, 10f, 16.0681f, 10f, 17f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 7f)
        horizontalLineTo(7f)
        curveTo(4.23858f, 7f, 2f, 9.23858f, 2f, 12f)
        curveTo(2f, 14.7614f, 4.23858f, 17f, 7f, 17f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.50006f, 14.5f)
        lineTo(8.80147f, 15.5858f)
        curveTo(9.60053f, 16.2525f, 10.0001f, 16.5858f, 10.0001f, 17f)
        curveTo(10.0001f, 17.4142f, 9.60053f, 17.7475f, 8.80147f, 18.4142f)
        lineTo(7.50006f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 20f)
        horizontalLineTo(19f)
        curveTo(19.9319f, 20f, 20.3978f, 20f, 20.7654f, 19.8478f)
        curveTo(21.2554f, 19.6448f, 21.6448f, 19.2554f, 21.8478f, 18.7654f)
        curveTo(22f, 18.3978f, 22f, 17.9319f, 22f, 17f)
        curveTo(22f, 16.0681f, 22f, 15.6022f, 21.8478f, 15.2346f)
        curveTo(21.6448f, 14.7446f, 21.2554f, 14.3552f, 20.7654f, 14.1522f)
        curveTo(20.3978f, 14f, 19.9319f, 14f, 19f, 14f)
        horizontalLineTo(17f)
        curveTo(16.0681f, 14f, 15.6022f, 14f, 15.2346f, 14.1522f)
        curveTo(14.7446f, 14.3552f, 14.3552f, 14.7446f, 14.1522f, 15.2346f)
        curveTo(14f, 15.6022f, 14f, 16.0681f, 14f, 17f)
        curveTo(14f, 17.9319f, 14f, 18.3978f, 14.1522f, 18.7654f)
        curveTo(14.3552f, 19.2554f, 14.7446f, 19.6448f, 15.2346f, 19.8478f)
        curveTo(15.6022f, 20f, 16.0681f, 20f, 17f, 20f)
        }
        }.build()

        return _adjustPosition!!
    }

private var _adjustPosition: ImageVector? = null
