package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = ImageVector.Builder(
            name = "Flashlight",
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
        moveTo(15f, 3f)
        horizontalLineTo(9f)
        curveTo(8.05719f, 3f, 7.58579f, 3f, 7.29289f, 3.29289f)
        curveTo(7f, 3.58579f, 7f, 4.05719f, 7f, 5f)
        verticalLineTo(6f)
        curveTo(7f, 7.04416f, 7.27249f, 8.07025f, 7.79054f, 8.97683f)
        lineTo(9f, 11f)
        verticalLineTo(18f)
        curveTo(9f, 18.9319f, 9f, 19.3978f, 9.15224f, 19.7654f)
        curveTo(9.35523f, 20.2554f, 9.74458f, 20.6448f, 10.2346f, 20.8478f)
        curveTo(10.6022f, 21f, 11.0681f, 21f, 12f, 21f)
        curveTo(12.9319f, 21f, 13.3978f, 21f, 13.7654f, 20.8478f)
        curveTo(14.2554f, 20.6448f, 14.6448f, 20.2554f, 14.8478f, 19.7654f)
        curveTo(15f, 19.3978f, 15f, 18.9319f, 15f, 18f)
        verticalLineTo(11f)
        lineTo(16.2095f, 8.97683f)
        curveTo(16.7275f, 8.07025f, 17f, 7.04416f, 17f, 6f)
        verticalLineTo(5f)
        curveTo(17f, 4.05719f, 17f, 3.58579f, 16.7071f, 3.29289f)
        curveTo(16.4142f, 3f, 15.9428f, 3f, 15f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 6f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13f)
        verticalLineTo(15f)
        }
        }.build()

        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
